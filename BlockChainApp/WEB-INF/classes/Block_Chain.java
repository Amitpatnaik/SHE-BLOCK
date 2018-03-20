import java.io.*;  
//import java.sql.*; 
import javax.servlet.*; 
import javax.servlet.ServletException;  
import javax.servlet.http.*;
import java.util.ArrayList;
//import com.google.gson.GsonBuilder;
//@WebServlet("/Block_Chain")
public class Block_Chain extends HttpServlet
 {
	public static ArrayList<Block> blockchain = new ArrayList<Block>();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
	{  
  
		response.setContentType("text/html");  
		
		String first_name=(String)request.getAttribute("first_name");
		String last_name=(String)request.getAttribute("last_name"); 
		String aadhar=(String)(request.getAttribute("aadhar"));
		String age=(String)(request.getAttribute("age"));
		String cno=(String)(request.getAttribute("cno"));
		String marital_status=(String)request.getAttribute("marital_status");
		String obh=(String)request.getAttribute("obh");  
		String lmd=(String)request.getAttribute("lmd");
		String edd=(String)request.getAttribute("edd");
		String upt=(String)request.getAttribute("upt");
		String urn=(String)request.getAttribute("urn");
		String ulmd=(String)request.getAttribute("ulmd");
		String anomalies=(String)request.getAttribute("anomalies");
		String inv_rep=(String)request.getAttribute("inv_rep");
		String med_his=(String)request.getAttribute("med_his");
		String del_status=(String)request.getAttribute("del_status");
		String o_info=(String)request.getAttribute("o_info");
		String d_by_name=(String)request.getAttribute("d_by_name");
		String d_by_rno=(String)request.getAttribute("d_by_rno");
		String d_at_name=(String)request.getAttribute("d_at_name");
		String hrno=(String)request.getAttribute("hrno");
		
		Block block=new Block(
		first_name,
		last_name,
		aadhar,
		age,
		cno,
		marital_status,
		obh,
		lmd,
		edd,
		upt,
		urn,
		ulmd,
		anomalies,
		inv_rep,
		med_his,
		del_status,
		o_info,
		d_by_name,
		d_by_rno,
		d_at_name,
		hrno,
		checkPrevHash()
		);
		
		
		blockchain.add(block);
		/*PrintWriter out= response.getWriter();
		out.println("<html><body>Successfully Submitted</body></html>");
		out.close();*/
		ServletContext context=getServletContext();
		context.setAttribute("blockchain",blockchain);
		//System.out.println(context);
		RequestDispatcher rd=request.getRequestDispatcher("success.html");
		rd.forward(request,response);
			}
	
	public String checkPrevHash()
	{
			if(blockchain.size()==0)
				return "0";
			else if(blockchain.size()==1)
				return blockchain.get(0).hash;
			else
				return blockchain.get(blockchain.size()-2).hash;
	}
  }