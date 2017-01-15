package Lesson22DBconnect;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Class description
 *
 * @author lobseer
 * @version 15.01.2017
 */

public class MyDBcontroller {
    private Connection connection;

    public MyDBcontroller(Connection connection) {
        this.connection = connection;
    }

    /*
    public <T> Map<Integer, T> selectAllFrom(Class<T> table) {
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
            return tempList;
        } catch (Exception ex) {
            System.out.println("Exception in safeSelectFrom:" + ex.getMessage());
        }
        return null;
    }

    public <T, E> void setReferences(Map<Integer, T> its, Map<Integer, E> with) {
        try {
            for (T elem : its.values()) {
                Class t = elem.getClass();
                for (Field f : t.getDeclaredFields()) {
                    if (f.isAnnotationPresent(DataReference.class)) {
                        f.setAccessible(true);
                        int foreignKey = Arrays.stream(t.getDeclaredFields()).filter((p)->p.isAnnotationPresent(ForeignKey.class)).filter((p)->p.getAnnotation(ForeignKey.class).value()==f.getAnnotation(DataReference.class).value()).findFirst().get().getInt(elem);
                        f.set(elem, with.get(foreignKey));
                        f.setAccessible(false);
                    }
                }
            }
        } catch (Exception ex) {
            System.out.println("In setReferences: " + ex.getMessage());
        }
    }*/
}
