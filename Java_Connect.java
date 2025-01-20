/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swing;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Java_Connect{  
    
public static Connection con(){
  Connection conn=null;
   
  try {
      
      Class.forName("com.mysql.jdbc.Driver");
      
      conn = DriverManager.getConnection("jdbc:mysql://localhost/hotel","root","");
  }catch(ClassNotFoundException | SQLException ex){
      
      Logger.getLogger(Java_Connect.class.getName()).log(Level.SEVERE, null, ex);   
  }
      
return (conn);
}

public static void main(String[] args)
{
    Connection con=Java_Connect.con();
    System.out.println("Done"+con);
}

}