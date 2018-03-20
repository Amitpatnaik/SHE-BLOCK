import java.io.*;  
import java.sql.*; 
import javax.servlet.*; 
import javax.servlet.ServletException;  
import javax.servlet.http.*;  
  
public class Register extends HttpServlet 
{  
	protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
	{  
  
		response.setContentType("text/html");  
		PrintWriter out = response.getWriter();  
          
		String h_name=request.getParameter("hospital_name");  
		String street=request.getParameter("street");
		String city=request.getParameter("city");
		String state=request.getParameter("state");
		long pin=Long.parseLong(request.getParameter("pin"));
		long phone1=Long.parseLong(request.getParameter("pno"));  
		String p2=request.getParameter("sno");
		long phone2=0;
		if(!p2.equals(null))
		{
			phone2=Long.parseLong(p2);
		} 
		String email=request.getParameter("email_id");
		String hr_no=request.getParameter("hr_no");
		Connection cn=null;
		PreparedStatement ps=null;
		
		ServletContext sc=getServletContext();
		String driver=sc.getInitParameter("driver");
		String url=sc.getInitParameter("url");

        try
		{  
			Class.forName(driver);
			cn=DriverManager.getConnection(url,"system","manager");
			ps=cn.prepareStatement("select * from hospital_validation where h_name=(?) and hr_no=(?)");
			ps.setString(1,h_name);
			ps.setString(2,hr_no);
			
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				ps=cn.prepareStatement("insert into hospital_details values(?,?,?,?,?,?,?,?,?)");
			
				ps.setString(1,h_name);
				ps.setString(2,hr_no);
				ps.setString(3,email);
				ps.setString(4,street);
				ps.setString(5,city);
				ps.setString(6,state);
				ps.setLong(7,pin);
			  	ps.setLong(8,phone1);
				ps.setLong(9,phone2);
				
			
				int i=ps.executeUpdate();
				if(i==0)
				{
					request.getRequestDispatcher("failed_to_insert.html").forward(request, response);
				}
				else
				{				
					HttpSession session=request.getSession();
					session.setAttribute("hr_no",hr_no); 
					request.getRequestDispatcher("page3.html").forward(request, response);
				}
			}
			else
			{
					request.getRequestDispatcher("failed_to_register.html").forward(request, response);
			}

		}catch (Exception e) 
		{
			System.out.println(e);
		}  
          
		out.close();
		
	}  
  
}  