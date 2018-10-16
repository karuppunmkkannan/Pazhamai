package com.controller;


import java.sql.*;
import java.io.*;
public class Test{
public static void main(String[] args){
    System.out.println("Insert Image Example!");
    String driverName = "com.mysql.jdbc.Driver";
    String url = "jdbc:mysql://localhost:3306/";
    String dbName = "ala";
    String userName = "root";
    String password = "DhiyaSoft@123";
    Connection con = null;
    try{
       Class.forName(driverName);
       con = DriverManager.getConnection(url+dbName,userName,password);
       Statement st = con.createStatement();
       File imgfile = new File("C:\\Users\\Bala\\Desktop\\iCQIpl5R_400x400.png");

      FileInputStream fin = new FileInputStream(imgfile);

       PreparedStatement pre =
       con.prepareStatement("insert into image values(?,?,?)");

       pre.setString(1,"test");
       pre.setInt(2,3);
       pre.setBinaryStream(3,(InputStream)fin,(int)imgfile.length());
       pre.executeUpdate();
       System.out.println("Successfully inserted the file into the database!");

       pre.close();
       con.close(); 
    }catch (Exception e1){
        System.out.println(e1.getMessage());
    }
}
    }