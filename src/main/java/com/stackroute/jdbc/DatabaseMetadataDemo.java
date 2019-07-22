package com.stackroute.jdbc;

import java.sql.*;

public class DatabaseMetadataDemo {
    public void getDataBaseDetails()
    {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employelist", "root", "Root@123");)
        {
            DatabaseMetaData databaseMetaData=connection.getMetaData();
            System.out.println("Driver Name: "+databaseMetaData.getDriverName());
            System.out.println("Driver Version: "+databaseMetaData.getDriverVersion());
            System.out.println("UserName: "+databaseMetaData.getUserName());
            System.out.println("Database Product Name: "+databaseMetaData.getDatabaseProductName());
            System.out.println("Database Product Version: "+databaseMetaData.getDatabaseProductVersion());
            String table[]={"TABLE"};
            ResultSet resultSet=databaseMetaData.getTables(null,null,null,table);
            while (resultSet.next())
                System.out.println(resultSet.getString(3));
            String table1[]={"VIEW"};
            ResultSet resultSet1=databaseMetaData.getTables(null,null,null,table1);
            while (resultSet.next())
                System.out.println(resultSet.getString(3));


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
