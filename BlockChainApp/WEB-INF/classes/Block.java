import java.util.Date;
import java.util.ArrayList;

public class Block 
{

	public String hash;
	public String previousHash;
	public static ArrayList<PatientRecord> patient_record = new ArrayList<PatientRecord>();
//	private long timeStamp; //as number of milliseconds since 1/1/1970.

	//Block Constructor.
	public Block(
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
	 String Other_info,
	 String practitioner_name,
	 String practitioner_no,
	 String hospital_name,
	 String hospital_no,
	 String previousHash 
	 )
	{
		PatientRecord pr=new PatientRecord(
		firstname,
		lastname,
		aadhar,
		age,
		mobile,
		marital,
		obstatic_history,
		MH_LMD,
		MH_EDD,
		urine_test,
		ultrasound_registration_number,
		U_LMD,
		anomalies,
		other_investigation_report,
		Medical_history,
		Delivery_status,
		practitioner_name,
		practitioner_no,
		hospital_name,
		hospital_no
		);
		
		patient_record.add(pr);
		this.previousHash = previousHash;
		//this.timeStamp = new Date().getTime();
		calculateHash(); //Making sure we do this after we set the other values.
	
	}
	public void calculateHash() 
	{
		StringBuilder str=new StringBuilder();
		for(PatientRecord pr:patient_record)
		{
			str.append(pr);
		}
		String data= str.toString();
		String calculatedhash = StringUtil.applySha256( 
			previousHash +
			//Long.toString(timeStamp) +
			data
			);
		hash=calculatedhash;
	}
	
}

