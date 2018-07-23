
package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import transportdept.LoginBean;
import transportdept.LoginDao;

@WebServlet(name = "IndexJspServlet", urlPatterns = {"/IndexJspServlet"})
public class IndexJspServlet extends HttpServlet 
{
    private static final long serialVersionUID = 1L;
    
    public IndexJspServlet()
    {
    }
 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        String reg_number = request.getParameter("reg_number");
        String password = request.getParameter("password");
        
        LoginBean loginBean = new LoginBean();
        
        loginBean.setRegNumber(reg_number);
        loginBean.setPassword(password);
        
        LoginDao loginDao = new LoginDao();
        
        try
        {
            String userValidate = loginDao.authenticateUser(loginBean);
            
            if(userValidate.equals("Admin"))
            {
                System.out.println("Admin");
                
                HttpSession session = request.getSession();
                session.setAttribute("Admin", reg_number);
                request.setAttribute("reg_number", reg_number);
                
                request.getRequestDispatcher("/JSP/admin.jsp").forward(request, response);
            }
            else if(userValidate.equals("Driver"))
            {
                System.out.println("Driver");
                
                HttpSession session = request.getSession();
                session.setMaxInactiveInterval(10*60);
                session.setAttribute("Driver", reg_number);
                request.setAttribute("reg_number", reg_number);
                
                request.getRequestDispatcher("/JSP/index.jsp").forward(request, response);
            }
            else
            {
                System.out.println("Error mesage = " +userValidate);
                request.setAttribute("errMessage",userValidate);
                
                request.getRequestDispatcher("/JSP/login.jsp").forward(request, response);
            }
        }
        catch(IOException e1)
        {
            e1.printStackTrace();
        }
        catch(Exception e2)
        {
            e2.printStackTrace();
        }
    }
    
}
