package com.app.practice;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class GetCurrentDate {

	
	
	
	public String getRequiredDate(String date , String format ,int days){
        try{
         final Calendar cal = Calendar.getInstance();
            cal.setTime(new SimpleDateFormat(format).parse(date));
            cal.add(Calendar.DATE, days);
            SimpleDateFormat sdf = new SimpleDateFormat(format);
            date = sdf.format(cal.getTime());
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return date;
    }
	
	
	public String getCurrentDate()
	{
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
	    Date date = new Date();  
	    return formatter.format(date);
	}

	
	public static void main(String[] args) {
		
		GetCurrentDate obj= new GetCurrentDate();
		String date= obj.getCurrentDate();
		String datet= obj.getRequiredDate(date, "dd/MM/yyyy", 2);
		System.out.println(datet);
		
	    
	    
	}
	
}
