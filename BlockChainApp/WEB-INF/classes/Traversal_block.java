import java.io.*;  
import java.sql.*; 
import javax.servlet.*; 
import javax.servlet.ServletException;  
import javax.servlet.http.*;  
import java.util.ArrayList;  
public class Traversal_block extends HttpServlet 
{  
	protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
	{  
  
		response.setContentType("text/html");  
		PrintWriter out=response.getWriter();
		
		String aadhar=(String)request.getAttribute("aadhar");
		
		//response.sendRedirect("http://localhost:1200/BlockChainApp/traversal_block");
		ServletContext context=getServletContext();
		ArrayList<Block> blockchain=(ArrayList)context.getAttribute("blockchain");
		//System.out.println(blockchain);
		int flag=0;
		if(blockchain!=null)
		{
		int s=blockchain.size()-1;
		if(s>=0)
		{
		while((blockchain.get(s).hash)!= "0")
		{
			int s1=blockchain.get(s).patient_record.size()-1;
			for(int i=0;i<=s1;i++)
			{
				if(blockchain.get(s).patient_record.get(i).aadhar==aadhar)
				{
					out.print("<!DOCTYPE html>");
					out.print("<html>");
					out.print("<title>Patient Regisitration</title>");
					out.print("<meta name='viewport' content='width=device-width, initial-scale=1'>");
					out.print("<link rel='stylesheet' href='https://www.w3schools.com/w3css/4/w3.css'>");
					out.print("<meta charset='utf-8'>");
					out.print("<meta name='viewport' content='width=device-width, initial-scale=1'>");
					out.print("<link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css'>");
					out.print("<script src='https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js'></script>");
					out.print("<script src='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js'></script>");
					out.print("<head><style>#bb{margin:30px 100px 30px 100px;}</style>");
					out.print("</head><body>");
					out.print("<div style='float:center'>");
					out.print("<div class='w3-card-4' id='bb' ><header class='w3-container w3-center w3-teal'><h1>Patient Record</h1></header><div class='w3-container'>");				
					out.print("<p><div class='w3-row-padding'><div class='w3-row-padding'><label>Name : '"+blockchain.get(s).patient_record.get(i).firstname + " "+blockchain.get(s).patient_record.get(i).lastname+"'</label></div></div></p>");
					out.print("<p><div class='w3-row-padding'><div class='w3-row-padding'><label>Aadhar number : '"+blockchain.get(s).patient_record.get(i).aadhar+"'</label></div></div></p>");
					out.print("<p><div class='w3-row-padding'><div class='w3-row-padding'><label>Age : '"+blockchain.get(s).patient_record.get(i).age+"'</label></div></div></p>");
					out.print("<p><div class='w3-row-padding'><div class='w3-row-padding'><label>Contact No : '"+blockchain.get(s).patient_record.get(i).mobile+"'</label></div></div></p>");
					out.print("<p><div class='w3-row-padding'><div class='w3-row-padding'><label>Marital status : '"+blockchain.get(s).patient_record.get(i).marital+"'</label></div></div></p>");

					out.print("<p><div class='w3-row-padding'<div class='w3-row-padding'><label>Obstatic History(OBH): '"+blockchain.get(s).patient_record.get(i).obstatic_history+"'</label></div></div></p>");
					
					out.print("<p><div class='w3-row-padding'><div class='w3-row-padding'><label>Menstural History(M.H.)</label><br><label>Last Menstrual Date : '"+blockchain.get(s).patient_record.get(i).MH_LMD+"'</label><label>Expected Delivery Date : '"+blockchain.get(s).patient_record.get(i).MH_EDD+"'</label></div></div></p>");
					
					
					out.print("<p><div class='w3-row-padding'><div class='w3-row-padding'><label>Urine Pregnancy Test : '"+blockchain.get(s).patient_record.get(i).urine_test+"'</label></div></div></p>");
					
					out.print("<p><div class='w3-row-padding'><div class='w3-row-padding'><label>Ultrasound Report</label><br><label>Ultrasound Registration No. : '"+blockchain.get(s).patient_record.get(i).ultrasound_registration_number+"'</label><label>Ultrasound Expected Delivery Date : '"+blockchain.get(s).patient_record.get(i).U_LMD+"'</label></div></div></p>");
					out.print("<p><div class='w3-row-padding'><div class='w3-row-padding'><label>Anomalies : '"+blockchain.get(s).patient_record.get(i).anomalies+"'</label></div></div></p>");

					out.print("<p><div class='w3-row-padding'><div class='w3-row-padding'><label>Other Investigation Report : '"+blockchain.get(s).patient_record.get(i).other_investigation_report+"'</label></div></div></p>");

					out.print("<p><div class='w3-row-padding'><div class='w3-row-padding'><label>Patient Medical History : '"+blockchain.get(s).patient_record.get(i).Medical_history+"'</label></div></div></p>");


					out.print("<p><div class='w3-row-padding'><div class='w3-row-padding'><label>Delivery Status : '"+blockchain.get(s).patient_record.get(i).Delivery_status+"'</label></div></div></p>");


					out.print("<p><div class='w3-row-padding'><div class='w3-row-padding'><label>Diagnosed By</label><br><label>Name : 'Dr."+blockchain.get(s).patient_record.get(i).practitioner_name+"'</label><label>Registration No : 'Dr."+blockchain.get(s).patient_record.get(i).practitioner_no+"'</label></div></div></p>");
					out.print("<p><div class='w3-row-padding'><div class='w3-row-padding'><label>Diagnosed at</label><br><label>Name : '"+blockchain.get(s).patient_record.get(i).hospital_name+"'</label><label>Registration No. : '"+blockchain.get(s).patient_record.get(i).hospital_name+"'</label></div></div></p>");
		    out.print("</div></div></div></body></html>");


			flag++;
				}
			}
			
			System.out.println("");
		}}
		}
		if(flag==0)
			{
				RequestDispatcher rd= request.getRequestDispatcher("no_prev_record.html");
				rd.forward(request,response);
			}
		else
		{	
					out.print("<!DOCTYPE html>");
					out.print("<html>");
					out.print("<meta name='viewport' content='width=device-width, initial-scale=1'>");
					out.print("<link rel='stylesheet' href='https://www.w3schools.com/w3css/4/w3.css'>");
					out.print("<meta charset='utf-8'>");
					out.print("<meta name='viewport' content='width=device-width, initial-scale=1'>");
					out.print("<link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css'>");
					out.print("<script src='https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js'></script>");
					out.print("<script src='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js'></script>");
					out.print("<body><p><center><a href='patient_form1.html' class='w3-button w3-theme-l1 w3-round-xlarge w3-block w3-center w3-opacity-min' style='width:20%'>Add New Record</a></center></p></body></html>");
		}
	  
	}
  
}  