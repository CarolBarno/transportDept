
<%@page contentType="text/html" language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="style.css" >
    </head>
    <body>
        <div class="box" >
            <h2>Egerton Transport System</h2>
            <form action="<%=request.getContextPath()%>/IndexJspServlet" method="post">
                <div class="inputBox">
                    <input type="text" name="reg_number" required="" >
                    <label>Reg Number </label>
                </div>
                <div class="inputBox">
                    <input type="password" name="password" required="" >
                    <label>Password </label>
                </div>
                <input type="submit" name="login" value="Login" >
                <br>
                <input type="checkbox" style="margin: 20px 30px;" >Remember me
                <a href="a" style="text-decoration: none; float: right; color: white; margin-right: 34px; margin-top: 26px;">Forgot Password? </a>
            </form>
        </div>
  
        </body>
</html>
