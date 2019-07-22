package com.stackroute.jdbc;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;
import java.sql.SQLException;

public class RowSetDemo {

    public void getRowDetails() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        JdbcRowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet();
        rowSet.setUrl("jdbc:mysql://localhost:3306/employelist");
        rowSet.setUsername("root");
        rowSet.setPassword("Root@123");
        rowSet.setCommand("select * from employe");
        rowSet.execute();
        while (rowSet.next()) {
            // Generating cursor Moved event
            System.out.println("Id: " + rowSet.getString(1));
            System.out.println("Name: " + rowSet.getString(2));
            System.out.println("age: " + rowSet.getString(3));
            System.out.println("Gender: " + rowSet.getString(4));
        }
    }
}
