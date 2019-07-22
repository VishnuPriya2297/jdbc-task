package com.stackroute.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcBatchDemo {
    public void Batchdemo()
    {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employelist", "root", "Root@123");
             Statement statement = connection.createStatement();
        )
        {
            connection.setAutoCommit(false);
            statement.addBatch("insert into employe values(44,'maya',33,'Female')");
            statement.addBatch("insert into employe values(54,'mayank',33,'male')");
            statement.executeBatch();
            connection.commit();
        }
        catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
