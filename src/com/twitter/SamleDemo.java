package com.twitter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SamleDemo {
	  private static Connection getConnection(){
		  			Connection conn = null;

						try{
						//Register JDBC driver
							System.out.println("hihihihihihihihihihih");
						Class.forName("org.apache.hive.jdbc.HiveDriver");

						System.out.println("heeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
						// Open a connection
						
						conn = DriverManager.getConnection("jdbc:hive2://bivm.ibm.com:10000/default", "biadmin", "biadmin");
						}
						catch(Exception e){
					
							System.out.println("beforeexceptn");
								
						System.out.println(e);
						System.out.println("afterexception");
						
						}
						return conn;
	  }
	
public void sayHi() throws Exception{
	

System.out.println("hihhi3");
//Connection con = DriverManager.getConnection("jdbc:hive2://bivm.ibm.com:10000/default", "biadmin", "biadmin");
Connection con = getConnection();

System.out.println("hihhi4");
Statement stmt1 = con.createStatement();
System.out.println("hihhi5");

System.out.println("hihhi6");
ResultSet res1;
String sql1 = "select a.tweetcontent,c.imageurl,(a.retweetcount+a.favouritecount) as sum from tweetinfo a join tweetuser b on a.tweetid=b.tweetid join userinfo c on b.userid=c.userid order by sum desc limit 1";

System.out.println("Running: " + sql1);

res1 = stmt1.executeQuery(sql1);

if(res1.next()) {
String tweetContent = res1.getString(1);
String imageurl = res1.getString(2);
  System.out.println(res1.getString(1));
  System.out.println(res1.getString(2));
 
}
res1.close();
stmt1.close();

}
	}

