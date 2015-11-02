<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Tweet Analysis</title>
<link rel="stylesheet" type="text/css" href="css/sample.css"/> 
</head>

<body>
<header>
<span class="positionLeft" id="leftImg"><img src="images/cricket.png" height="135" width="120"/></span>
<span class="tweetHead positionLeft"><p><i>ICC WORLD CUP 2015 ANALYSIS</i></p></span>
<span class="positionLeft" id="rightImg"><img src="images/cricket.png" height="135" width="120"/></span>
</header>
<form action="${pageContext.request.contextPath}/TwitterServlet" method="post">
<div class="outerContainer" style="padding-bottom:100px">
	<div class="positionLeft"> 
	  <div class="buttonOuterContainer">
     	<a href="#">
        	<input type="submit" name="button1" value=""/>
            <p class="alignCenter">Most popular Tweet</p>
        </a>
        </div>
     </div> 
     <div class="positionLeft marginLefta">
     	<a href="http://bivm:8080/bigsheets/client/collection/view?id=44" target="_blank">
        	<img src="images/dayAnalysis.png" width="200px" height="200px"/>
            <p class="alignCenter">Frequency Analysis</p>
        </a>
     </div>
     <div class="positionLeft marginLefta">
     	<a href="http://bivm:8080/bigsheets/client/collection/view?id=28" target="_blank" >
        	<img src="images/schedule.png" width="200px" height="200px"/>
            <p class="alignCenter">Time Analysis</p>
        </a>
     </div>
     <div class="positionLeft marginLefta">
     	<a href="http://bivm:8080/bigsheets/client/collection/view?id=43" target="_blank">
        	<img src="images/teamAnalysis.png" width="200px" height="200px"/>
            <p class="alignCenter">Team Analysis</p>
        </a>
     </div>
     <div class="positionLeft marginTopa marginLeftb">
     	<a href="http://bivm:8080/bigsheets/client/collection/view?id=29" target="_blank">
        	<img src="images/topPlayers.png" width="200px" height="200px"/>
            <p class="alignCenter">Top 5 Players</p>
        </a>
     </div>
	 <div class="positionLeft marginLeftb marginTopa">
	 <div class="buttonOuterContainer celebrity">
     	<a href="#">
        	<input type= "submit" name="button2" value=""/>
            <p class="alignCenter">Celebrity Account</p>
        </a>
        </div>
     </div>
     <div class="positionLeft marginLeftb marginTopa">
     	<a href="http://bivm:8080/bigsheets/client/collection/view?id=31" target="_blank">
        	<img src="images/location.png" width="200px" height="200px"/>
            <p class="alignCenter">Location</p>
        </a>
     </div>
     
</div>
</form>
</body>
</html>
