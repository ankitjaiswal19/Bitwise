<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Insert title here</title>
    
    <link rel="stylesheet" type="text/css" href="./css/PostviewC.css">
</head>
<body class="user-page">

<div class="container">
    <div id="header">
        <img src="./images/circle.png" height="200" width="1024" style="height: 235px ;
    background-repeat: no-repeat;
    background-position: center;
    background-size: 100%;"/>

        <div id="logo"></div>
    </div>
    <div id="content">
        <div class="subheader">
            <h2 id="user-display-name">
            </h2>

            <div id="user-profile">

            </div>
        </div>
        <div class="profile" style="float: left">
            <img src="./images/userimg.jpg" alt width="128" height="128"/></div>


        <div class="data">
            <div id="data-left" style="float: left">
                <b><i><label style="color: dodgerblue">USERNAME</label></i></b>&nbsp;&nbsp;
                <div id="uname"></div>
                <br><br>
                <b><i><label style="color: dodgerblue">EMAIL-ID</label></i></b>&nbsp;&nbsp;
                <div id="uemail"></div>
            </div>

        </div>
    </div>

</div>
<br>

<div ID="post" style="clear: both"><br>
    <b>POSTS ARE:-</b></br></br>

    <div id="post1" class="PostTextC" style="float: left">
        <div id="postlist">

            <div id="pheader" class="headercss">
            </div>

            <div id="postid" class="postidcss">
                <div id="quesd" class="quescss">
                    <br>
                    <label id="queslabel" >Question</label>
                    <br>
                </div>
                <div id="tagd" class="tagcss">
                    <br>
                    <label id="tag" >Tag</label>
                    <br>
                </div>
                <div id="timed" class="timecss">
                    <label id="timelabel" >Time</label>
                </div>
                <div id="dated" class="datecss">
                    <label id="datelabel" >Date</label>
                </div>
                <div id="usernamed" class="usernamecss">
                    <label id="username" >User Name</label>
                </div>
            </div>

        </div>
    </div>
</div>
</body>
</html>