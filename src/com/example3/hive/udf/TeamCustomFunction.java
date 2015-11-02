package com.example3.hive.udf;

import org.apache.hadoop.hive.ql.exec.UDF;


public final class TeamCustomFunction extends UDF{
	
	 public String evaluate(final String s) {
	  String teamval = null;
	  
  if (s == null) { return null; }   
	if(s!=null)

  if(s.toUpperCase().contains("AUS")||s.toUpperCase().contains("AUSTRALIA"))
  {
	  teamval="Australia";
  }
  else if(s.toUpperCase().contains("BAN")||s.toUpperCase().contains("BANGLADESH"))
	    {
	  teamval="Bangladesh";
	    }
  else if(s.toUpperCase().contains("IND")||s.toUpperCase().contains("INDIA"))
	    {
	  teamval="India";
	    }
	 else if(s.toUpperCase().contains("NZ")||s.toUpperCase().contains("NEW ZEALAND"))
	    {
		 teamval="New Zealand";
	    }
	 else if(s.toUpperCase().contains("PAK")||s.toUpperCase().contains("PAKISTAN"))
	    {
		 teamval="Pakistan";
	    }
	 else if(s.toUpperCase().contains("SL")||s.toUpperCase().contains("SRI LANKA"))
	    {
		 teamval="Sri Lanka";
	    }
	 else if(s.toUpperCase().contains("SA")||s.toUpperCase().contains("SOUTH AFRICA")||s.toUpperCase().contains("RSA"))
	    {
		 teamval="South Africa";
	    }
	 else if(s.toUpperCase().contains("WI")||s.toUpperCase().contains("WEST INDIES"))
	    {
		 teamval="West Indies";
	    }
		 
	return teamval;
}
}
