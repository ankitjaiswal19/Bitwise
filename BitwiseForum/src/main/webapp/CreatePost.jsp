<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<!-- saved from url=(0071)http://localhost:63342/JavaProgram/ForumnProject/HomePage/HomePage.html -->
<html>
<head lang="en">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta charset="UTF-8">
<title></title>
<script src="./js/jquery-1.11.2.js"></script>
<script src="./js/CreatePostjs.js"></script>
<link rel="stylesheet" type="text/css" href="./css/CpostCss.css">
</head>
<body>
	<div id="ForumHome" class="HMainCss">
		<jsp:include page="Header.jsp"></jsp:include>
		<div id="Hhead" class="PheadCss"></div>


		<div id="Hbody" class="PbodyC">
			<br>
			<div id="postid" class="postidcss">

				<form action="addpost" method="post">
					<input type="hidden" name="email" value="${user.getEmail()}">
					<div id="quesd" class="quescss">
						<label id="queslabel">Question</label> <input id="question"
							type="text" size="52px" name="postTitle"
							placeholder="Enter your query ">

					</div>
					<br>
					<div id="tagd" class="tagcss">
						<label id="tag">Tag</label> <select id="List">
							<option value=""><h1>Select List</h1>

							</option>
							<c:if test="${not empty tagsList}">
								<c:forEach var="tag" items="${tagsList}">
									<option value="${tag.getTagName()}">${tag.getTagName()}</option>
								</c:forEach>
							</c:if>
						</select> <input id="add" type="button" value="AddMoreTagFromList"
							onclick="AddMoreTag()"> <input id="del" type="button"
							value="delete" onclick="delName()">
						<table id="nametable" border="1"
							style="margin-left: 5px; float: right">
							<tr>
								<th><label> Delete </label></th>
								<th><label id="lab"> Name </label></th>
							</tr>

						</table>
						<br> <br> <br>
					</div>

					<div id="timed" class="timecss">
						<label id="timelabel"></label>
					</div>


					<div id="dated" class="datecss">
						<label id="datelabel"><%=new Date().toString()%></label>
					</div>

					<div id="usernamed" class="usernamecss">

						<label id="username">${user.getName()}</label>
					</div>
					<br> <br>

					<div id="Description">
						<textarea id="dis" rows="15" cols="75"
							placeholder="enter your query description" name="postText"></textarea>
					</div>
					<br> <br>
					<center>
						<input type="submit" value="Post"> <input type="reset"
							value="Reset">
					</center>
				</form>
			</div>


		</div>
	</div>

</body>
</html>