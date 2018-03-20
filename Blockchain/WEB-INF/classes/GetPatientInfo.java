import java.io.*;  
import java.sql.*; 
import javax.servlet.*; 
import javax.servlet.ServletException;  
import javax.servlet.http.*;
import java.util.ArrayList;
public class GetPatientInfo extends HttpServlet
 {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
	{  
  
	//	response.setContentType("text/html");  
		 
		String first_name=request.getParameter("first_name");
		String last_name=request.getParameter("last_name"); 
		String aadhar=request.getParameter("aadhar");
		String age=request.getParameter("age");
		String cno=request.getParameter("cno");
		String marital_status=request.getParameter("marital_status");
		String obh=request.getParameter("obh");  
		String lmd=request.getParameter("lmd");
		String edd=request.getParameter("edd");
		String upt=request.getParameter("upt");
		String urn=request.getParameter("urn");
		String ulmd=request.getParameter("ulmd");
		String anomalies=request.getParameter("anomalies");
		String inv_rep=request.getParameter("inv_rep");
		String med_his=request.getParameter("med_his");
		String del_status=request.getParameter("del_status");
		String o_info=request.getParameter("o_info");
		String d_by_name=request.getParameter("d_by_name");
		String d_by_rno=request.getParameter("d_by_rno");
		String d_at_name=request.getParameter("d_at_name");
		String hrno=request.getParameter("hrno");
		
		request.setAttribute("first_name", (Object)first_name);
		request.setAttribute("last_name", (Object)last_name);
		request.setAttribute("aadhar", (Object)aadhar);
		request.setAttribute("age", (Object)age);
		request.setAttribute("cno",(Object) cno);
		request.setAttribute("marital_status", (Object)marital_status);
		request.setAttribute("obh",(Object) obh);
		request.setAttribute("lmd", (Object)lmd);
		request.setAttribute("edd",(Object) edd);
		request.setAttribute("upt",(Object) upt);
		request.setAttribute("urn", (Object)urn);
		request.setAttribute("ulmd", (Object)ulmd);
		request.setAttribute("anomalies", (Object)anomalies);
		request.setAttribute("inv_rep", (Object)inv_rep);
		request.setAttribute("med_his",(Object) med_his);
		request.setAttribute("del_status", (Object)del_status);
		request.setAttribute("o_info",(Object) o_info);
		request.setAttribute("d_by_name", (Object)d_by_name);
		request.setAttribute("d_by_rno", (Object)d_by_rno);
		request.setAttribute("d_at_name",(Object) d_at_name);
		request.setAttribute("hrno",(Object) hrno);

       /* ServletContext context = getServletContext().getContext("http://localhost:1200/BlockChainApp");
		System.out.println(context);
        RequestDispatcher rd = context.getRequestDispatcher("http://localhost:1200/BlockChainApp/patient_block_chain");
        rd.forward(request, response);*/
		response.sendRedirect("http://localhost:1200/BlockChainApp/patient_block_chain");
		
	}
  }