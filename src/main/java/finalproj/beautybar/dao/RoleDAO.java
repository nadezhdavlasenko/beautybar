package finalproj.beautybar.dao;

import finalproj.beautybar.entity.Role;
import finalproj.beautybar.pool.ConnectionPool;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
import java.util.List;

public class RoleDAO extends AbstractDAO<Integer, Role> {

    public static final String SQL_SELECT_ALL_ROLES = "SELECT * FROM role";

    @Override
    public List<Role> findAll() {
        List<Role> roles = new ArrayList<>();
        Connection cn = null;
        Statement st = null;
        try {
            cn = ConnectionPool.getConnection();
            st = cn.createStatement();
            ResultSet resultSet =
                    st.executeQuery(SQL_SELECT_ALL_ROLES);
            while (resultSet.next()) {
                Role role = new Role(resultSet.getLong("id"), resultSet.getString("name"));
                roles.add(role);
            }
        } catch (SQLException e) {
            System.err.println("SQL exception (request or table failed): " + e);
        } finally {
            close(st);
            // код возвращения экземпляра Connection в пул
        }
        return roles;
    }

    @Override
    public Role findEntityById(Integer id) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean delete(Integer id) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean delete(Role entity) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean create(Role entity) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Role update(Role entity) {
        throw new UnsupportedOperationException();
    }
}
