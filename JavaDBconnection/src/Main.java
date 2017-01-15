import Lesson22DBconnect.*;
import Lesson22DBconnect.entity.*;

import java.lang.reflect.Field;
import java.sql.*;
import java.util.*;

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

        Map<Integer, Student> students;
        Map<Integer, School> schools;
        Map<Integer, Group> groups;
        Map<Integer, Classroom> classrooms;
        Map<Integer, Subject> subjects;

        List<Connector> student_subject;

        try(Connection connection = DriverManager.getConnection(connectionString, "root", "")) {
            schools = selectAllFrom(connection, School.class);
            classrooms = selectAllFrom(connection, Classroom.class);
            groups = selectAllFrom(connection, Group.class);
            subjects = selectAllFrom(connection, Subject.class);
            students = selectAllFrom(connection, Student.class);

            student_subject = getConnectorTable(connection, "student_subject");

            for (Classroom cl : classrooms.values()) {
                cl.setSchool(schools.get(cl.getSchool_id()));
                cl.setSubject(subjects.get(cl.getSubject_id()));
                System.out.println(cl);
            }

            for(Student st : students.values()) {
                st.setGroup(groups.get(st.getGroup_id()));

                for(Connector c : student_subject) {
                    if(c.getId_1()==st.getId())
                        st.getSubjects().add(subjects.get(c.getId_2()));
                }
                System.out.println(st);
            }

            for(Group group : groups.values()) {
                group.setClassroom(classrooms.get(group.getClassroom_id()));
                System.out.println(group);
            }

            for(Subject sub : subjects.values()) {
                for(Connector c : student_subject) {
                    if(c.getId_2()==sub.getId())
                        sub.getStudents().add(students.get(c.getId_1()));
                }
            }

        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    /// Эксперементируем с рефлексией
    static <T> Map<Integer, T> selectAllFrom(Connection connection, Class<T> table) {
        Map<Integer, T> tempList = new HashMap<>();
        String query = "select * from source_it." + table.getSimpleName().toLowerCase() + ";";

        try (PreparedStatement pst = connection.prepareStatement(query)) {

            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                Object temp = table.newInstance();
                for (Field f : table.getDeclaredFields()) {
                    if (f.isAnnotationPresent(DataMember.class)) {
                        f.setAccessible(true);
                        f.set(temp, rs.getObject(f.getName()));
                        f.setAccessible(false);
                    }
                }
                tempList.put(rs.getInt("id"), (T) temp);
            }
            for(T p : tempList.values()) {
                System.out.println(p);
            }
            System.out.println();
            return tempList;
        } catch (Exception ex) {
            System.out.println("Exception in selectAllFrom:" + ex.getMessage());
        }
        return null;
    }

    static List<Connector> getConnectorTable(Connection connection, String connectorName) {
        List<Connector> tempList = new ArrayList<>();

        String query = "select * from source_it." + connectorName + ";";

        try (PreparedStatement pst = connection.prepareStatement(query)) {
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                tempList.add(new Connector(rs.getInt(1), rs.getInt(2)));
            }
            return tempList;
        } catch (Exception ex) {
            System.out.println("Exception in getConnectorTable:" + ex.getMessage());
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
