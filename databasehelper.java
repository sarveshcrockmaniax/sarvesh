
import java.sql.Connection;
import java.sql.DriverManager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
    import java.sql.*;
public class databasehelper {
 static{
        try
        {
            System.out.println("Driver Class Loading");
            Class.forName("com.mysql.jdbc.Driver");
        }
        catch(ClassNotFoundException e)
        {
            e.printStackTrace();
        }
    }
    public static Connection getConnection()
    {
        Connection con=null;
        String url="jdbc:mysql://localhost:3306/mindit";
        try{
            con=DriverManager.getConnection(url, "root", "root");
           System.out.println("Connection Ready");
            
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return con;
    }
}
