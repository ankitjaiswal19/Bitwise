<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="com.forum.entities.Post"%>
<%@page import="java.util.ListIterator"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
	
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Insert title here</title>
    <link rel="stylesheet" type="text/css" href="./css/UserProfileCss.css">
    <link rel="stylesheet" type="text/css" href="./css/PostviewC.css">
</head>
<body class="user-page">

<div class="container">
    <div id="ForumHome" class="HMainCss">
        <jsp:include page="Header.jsp"></jsp:include>
        <div id="Hhead" class="PheadCss">
        </div>
        <div id="content">
            <div class="subheader">
                <h2 id="user-display-name">
                </h2>

                <div id="user-profile">

                </div>
            </div>
            <div class="profile" style="float: left">
                <img src="./images/user.png" alt width="128" height="128"/></div>


            <div class="data">
                <div id="data-left" style="float: left">
                    <table>
                        <tr>
                            <td>
                                <b><i><label style="color: dodgerblue; padding:50px">USERNAME</label></i></b></td>
                            <td>
                                <div id="uname">${user.getName()}</div>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <b><i><label style="color: dodgerblue; padding:50px">EMAIL-ID</label></i></b></td>
                            <td>
                                <div id="uemail" >${user.getEmail()}</div>
                            </td>
                        </tr>
                        <tr>
                        	
                        	<td>
                        	</td>
                        </tr>
                    </table>
                </div>

            </div>
        </div>

    </div>
    <br>

    <div id="post" style="clear: both">                   		
        <label>Post Are:</label>
		<a href="./createPost"style="margin-left: 75%;">Create Post</a>
                      	<br>
                      	<br>
        <div id="PostContainer" class="PostContainerCss">
            <div id="post1" class="PostTextC">
            <c:if test="${not empty postList}">
				<c:forEach var="post" items="${postList}">
                <div id="postid" class="postidcss">
                    <div id="quesd" class="quescss">
                        <br>
                        <label id="queslabel"><a href="./viewpost?id=${post.getPostId()}">${post.getTitle()}</a></label>
                        <br>
                    </div>
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
                        <label id="timelabel">${post.getPostDate()}</label>
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