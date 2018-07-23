
package servlet;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(name = "LogoutServlet", urlPatterns = {"/LogoutServlet"})
public class LogoutServlet extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        HttpSession session = request.getSession(false); //fetch session object
        
        if(session != null)
        {
            session.invalidate();
            request.setAttribute("errMessage", "You have logged out");
            RequestDispatcher requestDispatcher= request.getRequestDispatcher("/JSP/login.jsp");
            requestDispatcher.forward(request, response);
            System.out.println("Logged out");
        }
    }

}
