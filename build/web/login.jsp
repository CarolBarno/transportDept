<%-- 
    Document   : login
    Created on : 20-Jun-2018, 16:42:40
    Author     : Barno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <link href="styles.css" rel="stylesheet">
        <title>Login</title>
    </head>
    <body>
        <div class="container form-signin">
             <form class="form-signin" role="form"
                  action="" method="post">
                <h4 class="form-signin-heading"></h4>
                <table>
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
                            <td>
                                <input type="button" name="login" value="Login" >
                            </td>
                            </tr>
                </table>
             
            </form>
        </div>
        
    </body>
</html>
