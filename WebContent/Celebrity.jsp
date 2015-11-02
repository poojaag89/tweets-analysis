<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Tweet Analysis</title>
<link rel="stylesheet" type="text/css" href="css/sample.css" />
</head>

<body>
	<header> <span class="positionLeft" id="leftImg"><img
		src="images/cricket.png" height="135" width="120" /></span> <span
		class="tweetHead positionLeft"><p>
			<i>ICC WORLD CUP 2015 ANALYSIS</i>
		</p></span> <span class="positionLeft" id="rightImg"><img
		src="images/cricket.png" height="135" width="120" /></span> </header>
	<div class="outerContainer" style="padding-bottom: 100px">
		<h1>
			<i>Celebrity Account V/S Non-Celebrity Account</i>
		</h1>
		<table class="tweetTable" style="width:500px">
			<tr>
				<td style="width: 60%">Celebrity Account</td>
				<td>${Celebrity}</td>
			</tr>
			<tr>
				<td>Non-Celebrity Account</td>
				<td>${NonCelebrity}</td>
			</tr>
			
		</table>
	</div>
	</div>
</body>
</html>
