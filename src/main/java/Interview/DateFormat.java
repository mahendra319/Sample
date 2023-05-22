package Interview;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class DateFormat {
	
	
	public static void main(String [] args) {
		
		
		String dob = "05/25/1989";  //its in MM/dd/yyyy
		String newDate = null;
		
		Date date = new Date(dob);
		//SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd"); - YYYYMMDD
		
		SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");// - DDMMYYYY

		newDate = sdf.format(date);

		System.out.println(newDate); //Output is 1989-05-02
	}

}
