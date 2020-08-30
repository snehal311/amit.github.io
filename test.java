/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Schedule;
import javax.ejb.Stateless;

/**
 *
 * @author DELL
 */
@Stateless
public class test {
    public void addInventory(String name,String gender,String class1,String feesmode)throws Exception
            {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con = null;
            con=DriverManager.getConnection("jdbc:derby://localhost:1527/studentdb","admin1","1234");
            PreparedStatement st = null;
            st = con.prepareStatement("insert into reservation(name,gender,class1,feesmode)values(?,?,?,?)");
            st.setString(1,name);
            st.setString(2,gender);
            st.setString(3,class1);
            st.setString(4,feesmode);
            st.execute();
            st.close();
            con.close();
                
            }

   
        
    
}
