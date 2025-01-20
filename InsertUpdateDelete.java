/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swing;
import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class InsertUpdateDelete {
  public static void setData(String Query,String msg)
  {
      Connection conn=null;
      Statement st=null;
      try
      {
        conn=Java_Connect.con();
        st=conn.createStatement();
        st.executeUpdate(Query);
        if(!msg.equals(""))
        JOptionPane.showMessageDialog(null, msg);    
      }
      catch(HeadlessException | SQLException e)
      {
          JOptionPane.showMessageDialog(null, e);
      }
      finally
      {
          try{}
          
          catch(Exception e)
           {
               
           }
      }
  }   
    
}
