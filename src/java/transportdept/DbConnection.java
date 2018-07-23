
package transportdept;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DbConnection 
{
    
    public static Connection getDbConnection()
    {
        Connection con = null;
        
     String USER = "root";
     String PASSWORD = "";
     String DRIVER = "com.mysql.jdbc.Driver";
    String URL = "jdbc:mysql://localhost:3306/transportdept";
    
        try
        {
            Class.forName(DRIVER);
            con = DriverManager.getConnection(URL, USER, PASSWORD);
        }
        catch(ClassNotFoundException | SQLException ex)
        {
            return null;
        }
        return con;
    }
    
}
