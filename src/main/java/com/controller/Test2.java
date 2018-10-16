package com.controller;

import java.io.*;
import java.sql.*;
public class Test2{
public static void main(String[] args){
    System.out.println("Retrive Image Example!");
    String driverName = "com.mysql.jdbc.Driver";
    String url = "jdbc:mysql://localhost:3306/";
    String dbName = "ala";
    String userName = "root";
    String password = "DhiyaSoft@123";
    Connection con = null;
    try{
        Class.forName(driverName);
        con = DriverManager.getConnection(url+dbName,userName,password);
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select image from image");
        int i = 0;
        while (rs.next()) {
            InputStream in = rs.getBinaryStream(1);
            OutputStream f = new FileOutputStream(new File("test"+i+".png"));
            i++;
            int c = 0;
            while ((c = in.read()) > -1) {
                f.write(c);
            }
            f.close();
            in.close();
        }
    }catch(Exception ex){
        System.out.println(ex.getMessage());
    }
}
  }