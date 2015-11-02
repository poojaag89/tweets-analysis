package com.example.hive.udf;
 


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.hadoop.hive.ql.exec.UDF;

 
public final class DateCustomFunction extends UDF {
	
	
 
	  
	  public int evaluate(final String d) {	
			
			try
			{
			
			DateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
			
				Date date = format.parse(d);
			
				@SuppressWarnings("deprecation")
				int hour =date.getHours();
				if(hour>= 06 && hour<= 11)
				{
					return 1;
					
				}
				if(hour>= 12&& hour<=18)
				{
					return 2;
					
				}
				if(hour>= 19&& hour<=23)
				{
					return 3;
					
				}
				if(hour>= 0&& hour<=5)
				{
					return 4;
					
				}
				return 0;
			}
			catch(Exception e)
			{}
				return 0;
			}
			


	  
	
}