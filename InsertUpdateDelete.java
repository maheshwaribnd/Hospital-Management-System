/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;

import java.sql.*;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class InsertUpdateDelete {
    public static void setData(String Query, String msg){
        Connection con = null;
        Statement st = null;
        try
        {
            con =  ConnectionProvider.getCon();
            st =   con.createStatement();
            st.executeUpdate(Query);
            if(!msg.equals(""))
                JOptionPane.showMessageDialog(null, msg);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, msg);
        }
        finally
        {
            try
            {
            
            }
            catch(Exception e)
            {
            
            }
        }
    }
}
