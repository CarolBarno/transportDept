
package transportdept;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LoginDao 
{
    public String authenticateUser(LoginBean loginBean)
    {
        String reg_number = loginBean.getRegNumber();
        String password = loginBean.getPassword();
        
        Connection con = null;
        Statement statement = null;
        ResultSet resultSet = null;
        
        String regNumber = "";
        String passwordDb = "";
        String role = "";
        
        try
        {
            con = DbConnection.getDbConnection();
            statement = con.createStatement();
            resultSet = statement.executeQuery("select reg_number, password, role from members");
            
            while(resultSet.next())
            {
                regNumber = resultSet.getString("reg_number");
                passwordDb = resultSet.getString("password");
                role = resultSet.getString("role");
                
                if(reg_number.equals(regNumber) && password.equals(passwordDb) && role.equals("admin"))
                    return "Admin";
                else if(reg_number.equals(regNumber) && password.equals(passwordDb) && role.equals("driver"))
                    return "Driver";
            }
        }
        catch(SQLException e)
        {
           e.printStackTrace();
        }
        return "Invalid credentials";
    }
    
}
