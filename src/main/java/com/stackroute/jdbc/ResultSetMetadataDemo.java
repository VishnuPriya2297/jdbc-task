package com.stackroute.jdbc;

import java.sql.*;

public class ResultSetMetadataDemo
{
public  void getResultSetDetails()
{
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
    } catch (ClassNotFoundException e) {
        e.printStackTrace();
    }
    try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employelist", "root", "Root@123");
         Statement statement = connection.createStatement();
         ResultSet resultSet = statement.executeQuery("Select * from employe");)
    {

        ResultSetMetaData resultSetMetaData=resultSet.getMetaData();
        System.out.println("Total columns: "+resultSetMetaData.getColumnCount());

        int columnCount = resultSetMetaData.getColumnCount();
        for (int i = 1; i <= columnCount; ++i) {
            System.out.println("***************");
            System.out.print("Column Name : " + resultSetMetaData.getColumnLabel(i) + " \n");
            System.out.print("Column Type : " + resultSetMetaData.getColumnType(i) + " \n");
            System.out.print("Column Class Name : " + resultSetMetaData.getColumnClassName(i) + " \n");
            System.out.print("Column Type Name :" + resultSetMetaData.getColumnTypeName(i) + " \n");
            System.out.println("Table name: " +resultSetMetaData.getTableName(1)+"\n");
            System.out.println("Database name: " +resultSetMetaData.getCatalogName(1)+"\n");

        }

    }
    catch (SQLException e)
    {
        e.printStackTrace();
    }
    catch (Exception ex)
    {
        ex.printStackTrace();
    }
}

}
