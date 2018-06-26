<%-- 
    Document   : register
    Created on : 20-Jun-2018, 16:41:56
    Author     : Barno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       
        <link href="styles.css" rel="stylesheet">
        <title>REGISTER</title>
    </head>
    <body >
        <div class="container form-signin">
             <form class="form-signin" role="form"
                  action="" method="post">
       
            <table>
                <tr>
                    <td>Name:</td>
                    <td><input type="text" name="name" size="20" required>
                    </td>
                </tr>
                
                <tr>
                    <td>Phone number:</td>
                    <td><input type="number" name="phone" size="20" required>
                    </td>
                </tr>
                
                <tr>
                    <td>Email:</td>
                    <td><input type="text" name="email" size="20" required>
                    </td>
                </tr>
                
                <tr>
                    <td>Password:</td>
                    <td><input type="password" name="password" size="20" required>
                    </td>
                </tr>
                
                <tr>
                    <td>Reg Number:</td>
                    <td><input type="text" name="regNumber" required size="20">
                    </td>
                </tr>
                
                    <tr>
                        <td>Category:</td>
                        <td>
                            <select name="category" >
                            <option value="" >Select: </option>
                <option value="1">Transport officer</option>
                <option value="2">School Official</option>
                <option value="3">TTDepartment Secretary</option>
                <option value="4">Driver </option>
                <option value="5">Mechanic </option>
                    </select>
                            </td>
                        </tr>
                        
                        
                        <tr>
                            <td>
                                <input type="submit" name="submit" value="Register" >
                            </td>
                            </tr>
                   
                </table>
            </form>
        </div>
        
    </body>
</html>
