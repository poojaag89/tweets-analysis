package com.example2.hive.udf;

import org.apache.hadoop.hive.ql.exec.UDF;


public final class PlayerCustomFunction extends UDF{

	public String evaluate(final String s) {
		String playerval = null;

		if (s == null) { return null; }   
		if(s!=null)

			if(s.toUpperCase().contains("DHONI"))
			{
				playerval="MS Dhoni";
			}
			else if(s.toUpperCase().contains("VIRAT")||s.toUpperCase().contains("KOHLI"))
			{
				playerval="Virat Kohli";
			}
			else if(s.toUpperCase().contains("SHIKHAR")||s.toUpperCase().contains("DHAWAN"))
			{
				playerval="Shikhar Dhawan";
			}
			else if(s.toUpperCase().contains("ROHIT")||s.toUpperCase().contains("SHARMA"))
			{
				playerval="Rohit Sharma";
			}
			else if(s.toUpperCase().contains("SURESH")||s.toUpperCase().contains("RAINA"))
			{
				playerval="Suresh Raina";
			}
			else if(s.toUpperCase().contains("UMESH")||s.toUpperCase().contains("YADAV"))
			{
				playerval="Umesh Yadav";
			}
			else if(s.toUpperCase().contains("MICHAEL")||s.toUpperCase().contains("CLARKE"))
			{
				playerval="Michael Clarke";
			}
			else if(s.toUpperCase().contains("GEORGE")||s.toUpperCase().contains("BAILEY"))
			{
				playerval="George Bailey";
			}
			else if(s.toUpperCase().contains("BRAD")||s.toUpperCase().contains("HADDIN"))
			{
				playerval="Brad Haddin";
			}
			else if(s.toUpperCase().contains("MITCHELL")||s.toUpperCase().contains("STARC"))
			{
				playerval="Mitchell Starc";
			}
			else if(s.toUpperCase().contains("STEVE")||s.toUpperCase().contains("SMITH"))
			{
				playerval="STEVE SMITH";
			}
			else if(s.toUpperCase().contains("DAVID")||s.toUpperCase().contains("WARNER"))
			{
				playerval="David Warner";
			}
			else if(s.toUpperCase().contains("MARTIN")||s.toUpperCase().contains("GUPTILL"))
			{
				playerval="Martin Guptill";
			}
			else if(s.toUpperCase().contains("TRENT")||s.toUpperCase().contains("BOULT"))
			{
				playerval="Trent Boult";
			}
			else if(s.toUpperCase().contains("TIM")||s.toUpperCase().contains("SOUTHEE"))
			{
				playerval="Tim Southee";
			}
			else if(s.toUpperCase().contains("DANIEL")||s.toUpperCase().contains("VETTORI"))
			{
				playerval="Daniel Vettori";
			}
			else if(s.toUpperCase().contains("STEPHEN")||s.toUpperCase().contains("FLEMING"))
			{
				playerval="Stephen Fleming";
			}
			else if(s.toUpperCase().contains("BRENDON")||s.toUpperCase().contains("MCCULLUM"))
			{
				playerval="Stephen Fleming";
			}
			else if(s.toUpperCase().contains("AB DE")||s.toUpperCase().contains("VILLIERS"))
			{
				playerval="Ab De Villiers";
			}
			else if(s.toUpperCase().contains("MORNE")||s.toUpperCase().contains("MORKEL"))
			{
				playerval="Morne Morkel";
			}
			else if(s.toUpperCase().contains("IMRAN")||s.toUpperCase().contains("TAHIR"))
			{
				playerval="Imran Tahir";
			}
			else if(s.toUpperCase().contains("ALLAN")||s.toUpperCase().contains("ANTHONY")||s.toUpperCase().contains("DONALD"))
			{
				playerval="Allan Anthony Donald";
			}
			
		return playerval;
	}
}
