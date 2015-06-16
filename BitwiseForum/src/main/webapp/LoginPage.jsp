<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<!DOCTYPE html>
<html>
<head>
    <title> REGISTER</title>
    <script type="text/javascript" src="./js/FormValidation.js" ></script>
    <link rel="stylesheet" type="text/css" href="./css/Register.css">
</head>

<body>

<div id="ForumHome" class="HMainCss" >
	<jsp:include page="Header.jsp"></jsp:include>
    </div>
    <div id="Hhead" class="PheadCss">
    </div>


    <div id="Hbody" class="PbodyC">
        <h3 align="center">Login Page </h3>
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
</div>

</body>
</html>