package com.stackroute.jdbc;

import java.sql.*;

public class JdbcTransactionDemo {
    public void transactionDemo()
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
            statement.executeUpdate("insert into employe values(41,'pallavi',21,'Female')");
            statement.executeUpdate("insert into employe values(71,'pranav',22,'male')");
            connection.commit();
            ResultSet resultSet=statement.executeQuery("select * from employe");
            while (resultSet.next()) {
                System.out.println("Id: " + resultSet.getInt(1) + " Name: " + resultSet.getString(2)+"age: " + resultSet.getString(3)+"gender: "+ resultSet.getString(4));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
