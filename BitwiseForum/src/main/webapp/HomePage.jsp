<%@page import="com.forum.entities.Post"%>
<%@page import="java.util.ListIterator"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<!-- saved from url=(0071)http://localhost:63342/JavaProgram/ForumnProject/HomePage/HomePage.html -->
<html>
<head lang="en">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta charset="UTF-8">
<title></title>
<script src="./js/jquery-1.11.2.js"></script>
<!-- <script>
        $(document).ready(function()
        {
            $("#TextComment").hide();
            $("#Comment").click(function()
            {
                $("#TextComment").show();

            });
            $("#ReplyComm").hide();
            $("#RCDate").hide();
            $("#RCTime").hide();
            $("#RComment").click(function()
            {
                $("#ReplyComm").show();
                $("#RCDate").show();
                $("#RCTime").show();

            });
        });

    </script> -->
<link rel="stylesheet" type="text/css" href="./css/Home.css">
</head>
<body>
	<div id="ForumHome" class="HMainCss">
		<div id="MenuBar" class="menu">


			<div id="menuItem3">
				<input type="search" placeholder="Search" id="search">
			</div>
			<div id="menuItem1">
				<a href="register"> Sign Up</a>
			</div>
			<div id="menuItem2">
				<a href="login">Login</a>
			</div>
			<div id="HomeP">
				<a href="home">Home</a>
			</div>
			<div id="Htitle">Bitwise Solution</div>
		</div>
		<div id="Hhead" class="PheadCss"></div>


		<div id="Hbody" class="PbodyC">

			<div id="HLeft" class="HLeftCss">
				<br>
				<h4 align="center">Categories</h4>
				<br>

				<c:if test="${not empty tagsList}">
					<c:forEach var="tag" items="${tagsList}">
						<div id="TagCategories">
							<a href="">${tag.getTagName()}</a>
						</div>
					</c:forEach>
				</c:if>
			</div>
			<div id="HRight" class=" HRightCss">
				<br> Recent Post <br> <br>

				<div id="postlist">

					<div id="topmostd" class="topmostcss">

						<!--<div id="categoryd" class="categorycss">-->
						<!--<br>-->
						<!--<label id="taglabel" >Category/Tag</label>-->
						<!--<br>-->
						<!--</div>-->

					</div>
					<%-- ${postList} --%>
					<c:if test="${not empty postList}">
						<c:forEach var="post" items="${postList}">
							<div id="postid" class="postidcss">

								<div id="quesd" class="quescss">
									<label id="queslabel"><a href="">${post.getTitle()}</a></label>
								</div>
								<br>
								<div id="tagd" class="tagcss">
									<label id="tag"> <c:if
											test="${not empty post.getTags()}">
											<span> Tags: </span>
											<c:forEach var="tag" items="${post.getTags()}">
													${tag.getTagName() }
											</c:forEach>
										</c:if>
									</label>
								</div>

								<div id="timed" class="timecss">
									<label id="timelabel"> ${post.getPostDate() }</label>
								</div>


								<div id="dated" class="datecss">
									<label id="datelabel"></label>
								</div>

								<div id="usernamed" class="usernamecss">

									<label id="username"><a href="">${post.getOwner().getName()}</a></label>
								</div>

							</div>
						</c:forEach>
					</c:if>
				</div>

			</div>


		</div>
	</div>

</body>
</html>
