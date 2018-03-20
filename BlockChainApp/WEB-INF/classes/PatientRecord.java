import java.util.*;
import java.security.*;
public class PatientRecord {
	public String firstname;
	public String lastname;
	public String aadhar;
	public String age;
	public String mobile;
	public String marital;
	public String obstatic_history;
	public String MH_LMD;
	public String MH_EDD;
	public String urine_test;
	public String ultrasound_registration_number;
	public String U_LMD;
	public String anomalies;
	public String other_investigation_report;
	public String Medical_history;
	public String Delivery_status;
	public String practitioner_name;
	public String practitioner_no;
	public String hospital_name;
	public String hospital_no;
	
	public PatientRecord( 
	 String firstname,
	 String lastname,
	 String aadhar,
	 String age,
	 String mobile,
	 String marital,
	 String obstatic_history,
	 String MH_LMD,
	 String MH_EDD,
	 String urine_test,
	 String ultrasound_registration_number,
	 String U_LMD,
	 String anomalies,
	 String other_investigation_report,
	 String Medical_history,
	 String Delivery_status,
	 String practitioner_name,
	 String practitioner_no,
	 String hospital_name,
	 String hospital_no
	) {
		this.firstname=firstname;
		this.lastname=lastname;
		this.aadhar=aadhar;
		this.age=age;
		this.mobile=mobile;
		this.marital=marital;
		this.obstatic_history=obstatic_history;
		this.MH_LMD=MH_LMD;
		this.MH_EDD=MH_EDD;
		this.urine_test=urine_test;
		this.ultrasound_registration_number=ultrasound_registration_number;
		this.U_LMD=U_LMD;
		this.anomalies=anomalies;
		this.other_investigation_report=other_investigation_report;
		this.Medical_history=Medical_history;
		this.Delivery_status=Delivery_status;
		this.practitioner_name=practitioner_name;
		this.practitioner_no=practitioner_no;
		this.hospital_name=hospital_name;
		this.hospital_no=hospital_no;
		
	}
	
	

}
