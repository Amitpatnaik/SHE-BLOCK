import java.io.*;    
import javax.servlet.ServletException;  
import javax.servlet.http.*;  
 
 
public class Logout extends HttpServlet 
{  
        protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
		{  
            response.setContentType("text/html");  
            PrintWriter out=response.getWriter();  
              
            request.getRequestDispatcher("logout.html").forward(request, response);  
              
            HttpSession session=request.getSession();  
            session.invalidate();  
            
              
            out.close();  
		}  
}  