package finalproj.beautybar;

import finalproj.beautybar.connect.ConnectorDB;
import finalproj.beautybar.entity.Role;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class SimpleJDBCRunner {

    public static void main(String[] args) {

        Connection cn = null;
        try { // 1 блок
            cn = ConnectorDB.getConnection();
            Statement st = null;
            try { // 2 блок
                st = cn.createStatement();
                ResultSet rs = null;
                try { // 3 блок
                    rs = st.executeQuery("SELECT * FROM role");
                    ArrayList<Role> lst = new ArrayList<>();
                    while (rs.next()) {
                        Long id = rs.getLong(1);
                        String roleName = rs.getString(2);
                        lst.add(new Role(id, roleName));
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

        Context envCtx = null;
//        try {
//            envCtx = (Context) (new InitialContext().lookup("java:comp/env"));
//        } catch (NamingException e) {
//            e.printStackTrace();
//        }
//        DataSource ds = null;
//        try {
//            ds = (DataSource) envCtx.lookup("jdbc/beautybar");
//        } catch (NamingException e) {
//            e.printStackTrace();
//        }
//        try {
//            cn = ds.getConnection();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
        try {
            cn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
//        RoleDAO roleDAO = new RoleDAO();
//        roleDAO.findAll().forEach(System.out::println);

    }




}
