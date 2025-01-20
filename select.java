/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swing;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import com.swing.Java_Connect;
import java.sql.ResultSet;


/**
 *
 * @author Lenovo
 */
public class select {
    public static ResultSet getData(String query)
    {
       Connection conn=null;
      Statement st=null;
      ResultSet rs=null;
      try
      {
          
          conn =Java_Connect.con();
          st=conn.createStatement();
          rs=st.executeQuery(query);
          return rs;
      }
      catch(SQLException e)
      {
          JOptionPane.showMessageDialog(null,e);
          return null;
      }
    }
    
}
