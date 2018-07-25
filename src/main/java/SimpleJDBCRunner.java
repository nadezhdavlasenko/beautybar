//package by.bsu.data.main;
import entity.ServiceType;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;
//import by.bsu.data.subject.Abonent;

public class SimpleJDBCRunner {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/beautybar";
        Properties prop = new Properties();
        prop.put("user", "root");
        prop.put("password", "sXG>lcli*8w<");
        prop.put("autoReconnect", "true");
        prop.put("characterEncoding", "UTF-8");
        prop.put("useUnicode", "true");
        Connection cn = null;
//        try {
//            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
        try { // 1 блок
            cn = DriverManager.getConnection(url, prop);
            Statement st = null;
            try { // 2 блок
                st = cn.createStatement();
                ResultSet rs = null;
                try { // 3 блок
                    rs = st.executeQuery("SELECT * FROM service_type");
                    ArrayList<ServiceType> lst = new ArrayList<>();
                    while (rs.next()) {
                        int id = rs.getInt(1);
                        String type = rs.getString(2);
                        lst.add(new ServiceType(id, type));
                    }
                    if (lst.size() > 0) {
                        System.out.println(lst);
                    } else {
                        System.out.println("Not found");
                    }
                } finally { // для 3-го блока try
 /*
 * закрыть ResultSet, если он был открыт
 * или ошибка произошла во время
 * чтения из него данных
 */
                    if (rs != null) { // был ли создан ResultSet
                        rs.close();
                    } else {
                        System.err.println(
                                "ошибка во время чтения из БД");
                    }
                }
            } finally {
 /*
 * закрыть Statement, если он был открыт или ошибка
 * произошла во время создания Statement
 */
                if (st != null) { // для 2-го блока try
                    st.close();
                } else {
                    System.err.println("Statement не создан");
                }
            }
        } catch (SQLException e) { // для 1-го блока try
            System.err.println("DB connection error: " + e);
 /*
 * вывод сообщения о всех SQLException
 */
        } finally {
 /*
 * закрыть Connection, если он был открыт
 */
            if (cn != null) {
                try {
                    cn.close();
                } catch (SQLException e) {
                    System.err.println("Сonnection close error: " + e);
                }
            }
        }
    }

}
