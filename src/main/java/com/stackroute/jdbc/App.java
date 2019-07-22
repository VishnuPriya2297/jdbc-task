package com.stackroute.jdbc;

import java.sql.SQLException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SQLException {
       /* SimpleJdbcDemo simpleJdbcDemo = new SimpleJdbcDemo();
       simpleJdbcDemo.getEmployeeDetails();
        simpleJdbcDemo.getEmployeeDetailsInReverse();
        simpleJdbcDemo.getEmployeeDetailsFromSecondRowInReverse();
        simpleJdbcDemo.getEmployeeDetailsByNameAndGender("Priya", "Female");*/

      /* DatabaseMetadataDemo databaseMetadataDemo=new DatabaseMetadataDemo();
       databaseMetadataDemo.getDataBaseDetails();*/

     /* ResultSetMetadataDemo resultSetMetadataDemo=new ResultSetMetadataDemo();
      resultSetMetadataDemo.getResultSetDetails();*/

     RowSetDemo rowSetDemo=new RowSetDemo();
     rowSetDemo.getRowDetails();

   /*  JdbcTransactionDemo jdbcTransactionDemo=new JdbcTransactionDemo();
     jdbcTransactionDemo.transactionDemo();*/

  /* JdbcBatchDemo jdbcBatchDemo=new JdbcBatchDemo();
   jdbcBatchDemo.Batchdemo();*/
    }
}
