package finalproj.beautybar.dao;

import finalproj.beautybar.action.WrapperConnector;
import finalproj.beautybar.entity.Entity;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public abstract class AbstractDAO <K, T extends Entity> {

    protected WrapperConnector connector;
    public abstract List<T> findAll();
    public abstract T findEntityById(K id);
    public abstract boolean delete(K id);
    public abstract boolean delete(T entity);
    public abstract boolean create(T entity);
    public abstract T update(T entity);

    public void close(Statement st) {
        try {
            if (st != null) {
                st.close();
            }
        } catch (SQLException e) {
            // лог о невозможности закрытия Statement
        }
    }

    public void close(Connection connection) {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
// генерация исключения, т.к. нарушается работа пула
        }
    }

    public void close() {
        connector.closeConnection();
    }
    protected void closeStatement(Statement statement) {
        connector.closeStatement(statement);
    }
}
