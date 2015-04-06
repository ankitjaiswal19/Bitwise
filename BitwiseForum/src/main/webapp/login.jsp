<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
  <script type="text/javascript" src="FormValidation.js" ></script>
  <style type="text/css">
        .PostTextC {
        margin-left: 120px;
            border: 2px solid pink;
        border-radius: 20px;
        margin-right: 120px;
        height: 120px;}
         </style>
</head>
<body>
<div id="header">
    <img src="images/header.png" height="200" width="1050"/>
    </div>
    <div class="PostTextC">
<form id="myForm" method="post" action="login">

    
       
	
	<table  align= "center">
	<tr>
	<td>
	<label>User ID</label>
	</td>
	<td>
	<input type="text" name="email">
	</td>
	</tr>
	<tr>
	<td>
	<label>Password</label>
	</td>
	<td>
	<input type="password" name="password">
	</td>
	</tr>
	<tr>
	<td colspan="2">
	<input type="submit" value="Login" >
	</td>	
	</tr>
	</table>
	</form>
	</div>
</body>
</html>