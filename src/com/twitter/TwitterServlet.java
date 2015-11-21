package com.twitter;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TwitterServlet
 */
@WebServlet("/TwitterServlet")
public class TwitterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public TwitterServlet() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Processing...");

		if (request.getParameter("button1") != null) {
			System.out.println("Most Popular Tweet");

			try {
				popularQuery(request,response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		if (request.getParameter("button2") != null) {
			System.out.println("Celebrity Account");

			try {
				celebrityDetails(request,response);

			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	private static Connection getConnection(){
		Connection conn = null;

		try{
			//Register JDBC driver
			Class.forName("org.apache.hive.jdbc.HiveDriver");
			// Open a connection
			conn = DriverManager.getConnection("jdbc:hive2://bivm.ibm.com:10000/default", "biadmin", "biadmin");
		}
		catch(Exception e){		
			System.out.println(e);		
		}
		return conn;
	}
	private void popularQuery(HttpServletRequest request,HttpServletResponse response) {
		// TODO Auto-generated method stub
		Connection con = getConnection();
		Statement stmt1;
		try {
			stmt1 = con.createStatement();
			ResultSet res1;
			String sql1 = "select a.tweetcontent,(a.retweetcount+a.favouritecount) as sum ,c.imageurl,c.username  from tweetinfo_demo a join tweetuser_demo b on a.tweetid=b.tweetid join userinfo_demo c on c.userid=b.userid order by sum desc limit 1";

			System.out.println("Query Running: " + sql1);

			res1 = stmt1.executeQuery(sql1);

			if(res1.next()) {
				String tweetContent = res1.getString(1);
				String count= res1.getString(2);
				String imageurl = res1.getString(3);
				String username= res1.getString(4);

				request.setAttribute("TweetContent", tweetContent);
				request.setAttribute("COUNT", count);
				request.setAttribute("ImgUrl", imageurl);
				request.setAttribute("UserName", username);
				System.out.println("TweetContent: " + tweetContent );

				try {
					request.getRequestDispatcher("PopularTweet.jsp").forward(request,response);
					return;
				} catch (ServletException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			res1.close();
			stmt1.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void celebrityDetails(HttpServletRequest request,HttpServletResponse response) {
		// TODO Auto-generated method stub
		Connection con = getConnection();
		Statement stmt1;
		int counter=0;
		try {
			stmt1 = con.createStatement();
			System.out.println("Processing...");

			ResultSet res1;
			String sql1 = "select isverified,count(*) from userinfo where isverified is not NULL group by isverified";
			System.out.println(" Query Running: " + sql1);

			res1 = stmt1.executeQuery(sql1);

			while(res1.next()) {

				String count = res1.getString(2);
				if(counter==1)
					request.setAttribute("Celebrity", count);
				else
					request.setAttribute("NonCelebrity", count);
				counter++;

			}
			try {
				request.getRequestDispatcher("Celebrity.jsp").forward(request,response);
				return;
			} catch (ServletException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(res1.getString(1));
			System.out.println(res1.getString(2));

			res1.close();
			stmt1.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

