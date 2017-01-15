package Lesson22DBconnect;

import java.lang.reflect.Field;
import java.sql.*;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Class description
 *
 * @author lobseer
 * @version 13.01.2017
 */

public class Main {
    public static void main(String[] args) throws Exception {
        String jdbcDriverName = "com.mysql.jdbc.Driver";
        String connectionString = "jdbc:mysql://localhost:3306/source_it";
        Class.forName(jdbcDriverName);

        String query = "select * from source_it.student";

        Map<Integer, Student> students;
        Map<Integer, School> schools;
        Map<Integer, Group> groups;
        Map<Integer, Classroom> classrooms;
        Map<Integer, Subject> subjects;

        try(Connection conn = DriverManager.getConnection(connectionString, "root", "")) {
            schools = safeSelectingFrom(conn, School.class);
            classrooms = safeSelectingFrom(conn, Classroom.class);
            groups = safeSelectingFrom(conn, Group.class);
            subjects = safeSelectingFrom(conn, Subject.class);
            students = safeSelectingFrom(conn, Student.class);
            //safeSelectingFromId(conn, 3);
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    static <T> Map<Integer, T> safeSelectingFrom(Connection conn, Class<T> t) {
        Map<Integer, T> tempList = new HashMap<Integer, T>();
        String query = "select * from source_it."+t.getSimpleName().toLowerCase()+";";

        try(PreparedStatement pst = conn.prepareStatement(query)) {

            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                Object temp = t.newInstance();
                for(Field f : t.getFields()) {
                    f.set(temp, rs.getObject(f.getName()));
                }

                tempList.put(rs.getInt("id"), (T)temp);
            }
            for(T p : tempList.values()) {
                System.out.println(p);
            }
            return tempList;
        }
        catch (Exception ex) {
            System.out.println("Exception in safeSelectFrom:" + ex.getMessage());
        }
        return null;
    }

    static void safeSelectingFromId(Connection conn, int id) {
        Student student;
        String query = "select * from source_it.student" +
                " where id = ?";

        try( PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, id);
            ResultSet table = stmt.executeQuery();
            ResultSetMetaData meta = table.getMetaData();

            table.next();
            student = new Student(table.getInt("id"), table.getString("name"), table.getInt("age"));
            System.out.println(student);
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    static void selecting(Connection conn, String query) {
        List<Student> studentList = new LinkedList<>();
        try( Statement stmt = conn.createStatement()) {

            ResultSet table = stmt.executeQuery(query);

            while(table.next()) {
                int id = table.getInt("id");
                String name = table.getString("name");
                int age = table.getInt("age");
                studentList.add(new Student(id, name, age));
            }

            for(Student p : studentList) {
                System.out.println(p);
            }
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

}
