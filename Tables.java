/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;
import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author ASUS
 */
public class Tables {
    public static void main(String args[]){
        Connection con = null;
        Statement st = null;
        try
        {
            con = (Connection) ConnectionProvider.getCon();
            st = con.createStatement();
            st.executeUpdate("create table users(Name varchar(200),Email varchar(200),Password varchar(50),SequrityQuestion varchar(250),Answer varchar(200),Address varchar(200), Status varchar(20)");
            st.executeUpdate("create table room(RoomNo varchar(10),RoomType varchar(200),Bed varchar(200),Price int,Status varchar(20))");
            st.executeUpdate("create table customer(ID int,Name varchar(200),MobileNumber varchar(20),Nationality varchar(200),Gender varchar(50),Email varchar(200),IdProof varchar(200),Address varchar(500),CheckIn varchar(50),RoomNo varchar(10),Bed varchar(200),RoomType varchar(200),PricePerDay int(10),NumberOfDaysStay int(10),TotalAmount varchar(200),CheckOut varchar(50))");
            JOptionPane.showMessageDialog(null, "Table Created Successfully");
        }    
        catch(HeadlessException | SQLException e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        finally
        {
            try
            {
                con.close();
                st.close();
            }
            catch(SQLException e)
            {
                
            }
        }
    }
}
