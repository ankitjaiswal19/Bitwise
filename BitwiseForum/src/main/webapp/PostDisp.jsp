<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head lang="en">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta charset="UTF-8">
<title></title>
<script src="./js/jquery-1.11.2.js"></script>
<!--   <script>
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

    </script>
 -->
<link rel="stylesheet" type="text/css" href="./css/PostviewC.css">
</head>
<body>
	<div id="PostFor">
		<div id="ForumHome" class="HMainCss">
			<jsp:include page="Header.jsp"></jsp:include>

			<div id="Hbody" class="PbodyC">


				<div id="Phead" class="PheadCss"></div>
				<div id="Pbody" style="margin: 20px 50px auto;" class="PbodyC">
					<div id="Ptitle" class="PtitleCss">
						<br> <label id="PLable" class="PlableC">Title: </label><br><br><br>
						 <label id="PQues" class="PquesC">${post.getTitle()}
						</label>    
						&nbsp;&nbsp;<label>By User: ${post.getOwner().getName()} on</label>
						 <label id="PDate" class="PDateC">Date: <fmt:formatDate value="${post.getPostDate()}" pattern="dd-MM-yyyy" /> Time: <fmt:formatDate value="${post.getPostDate()}" pattern="HH:mm" />  </label>
						 
						  <br>
					</div>
					<br>
					<div id="PostText" class="PostTextC">
						<div id="Text" class="postdesc" style="height: auto; ">
							<br><label id="Description">Description:<br>${post.getPostText() }</label>
							<br><br>

						</div>
						<br>
						<c:if test="${not empty postComments}">
							<c:forEach var="comment" items="${postComments}">
								<div id="TextComment" class="TextCommentC">
								<label> Comment : </label>	<label id="Comment" class="TextComment">${comment.getText()}</label>
									<br>&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
									<label id="PCDate" class="PDateC">
									
									
									Date: <fmt:formatDate value="${comment.getCommentDate()}" pattern="dd-MM-yyyy" /> Time: <fmt:formatDate value="${comment.getCommentDate()}" pattern="HH:mm" />
									
									</label>
								</div>
							</c:forEach>
						</c:if>
					</div>
					<br> <br>
					<form name="ReplySubmit" action="addreply" class="ReplyFormCss">
						<br> Reply: <br> <input name="Text" id="PostReplyArea"
							class="ReplyText" placeholder="Enter Your Reply" name="reply">
						<input type="hidden" name="post_id" value="${post.getPostId()}">
						<input type="submit" value="Reply" class="btnrply">
					</form><br><br>
					<form action="addcmt" class="ReplyFormCss" method="post">
					<br><br>
					Comment:
					<br>
						<input type="text" name="text" id="TextComm" class="ReplyText"
							placeholder="Enter Your Comment"> <input type="hidden"
							name="post_id" value="${post.getPostId()}"> 
							<input type="submit" id="btnComment" class="btnrply" value="Comment">
					</form>

				</div>

			</div>
		</div>
	</div>
</body>
</html>