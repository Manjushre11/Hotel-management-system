/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swing;

/**
 *
 * @author Lenovo
 */
import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JOptionPane;
 import java.sql.Connection;
import java.sql.Statement;
import com.swing.Java_Connect;

public class table {
     public static void main(String[] args)
  {
      Connection conn=null;
      Statement st=null;
      
      try
      { 
          conn =Java_Connect.con();
          st=conn.createStatement();
         // st.executeUpdate("create table users(name varchar(200),email varchar(50),user_password varchar(50),securityQuestion varchar(500),answer varchar(200),address varchar(100),status varchar(20))");
        // st.executeUpdate("create table room (roomno varchar(10),rooomtype varchar(200),bed varchar(200),price int,status varchar(20))");
         st.executeUpdate("create table customer (id int,name varchar(200),mobilenumber varchar(10),nationalitlty varchar(30),gender varchar(20),email varchar(100),idproof varchar(200),address varchar(500),checkin varchar(50),roomno varchar(10),bed varchar(200),roomtype varchar(200),priceperday int(10),numberofdaysStay int(10),totalamount int,checkout varchar(100))");
         JOptionPane.showMessageDialog(null,"table create successfully ");
      }
      catch(HeadlessException | SQLException e)
      { 
          JOptionPane.showMessageDialog(null, e);
      }
      finally
      {
        try
      {
          conn.close();
          st.close();
      }
      
      catch(SQLException e)
      {JOptionPane.showMessageDialog(null, e);}  
      }
  }
}
