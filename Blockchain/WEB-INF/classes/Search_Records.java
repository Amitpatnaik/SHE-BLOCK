import java.io.*;  
import java.sql.*; 
import javax.servlet.*; 
import javax.servlet.ServletException;  
import javax.servlet.http.*;  
  
public class Search_Records extends HttpServlet 
{  
	protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
	{  
  
		response.setContentType("text/html");  
		//PrintWriter out = response.getWriter();  
          
		/*String username=request.getParameter("uname");  
		String reg_no=request.getParameter("rno");  

		Connection cn=null;
		PreparedStatement ps=null;
		
		ServletContext sc=getServletContext();
		String driver=sc.getInitParameter("driver");
		String url=sc.getInitParameter("url");

        try
		{  
			Class.forName(driver);
			cn=DriverManager.getConnection(url,"system","manager");
			ps=cn.prepareStatement("select * from HOSPITAL_VALIDATION where H_NAME=(?) and HR_NO=(?)");
			
			ps.setString(1,username);
			ps.setString(2,reg_no);
			
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
			RequestDispatcher rd=request.getRequestDispatcher("page3.html");
			rd.forward(request,response);
			HttpSession session=request.getSession();
			session.setAttribute("user_pwd",reg_no); 
			}
			else
			{
				RequestDispatcher rd=request.getRequestDispatcher("login_failed.html");
				rd.forward(request,response); 
			}
			
			rs.close();

		}catch (Exception e) 
		{
			System.out.println(e);
		}  
          
		//out.close();
		*/
		
		String aadhar=request.getParameter("aadharno");
		request.setAttribute("aadhar", aadhar);
		
		response.sendRedirect("http://localhost:1200/BlockChainApp/traversal_block");
	}  
  
}  