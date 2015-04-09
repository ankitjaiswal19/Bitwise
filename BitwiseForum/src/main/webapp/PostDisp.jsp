<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<!DOCTYPE html>
<html><head lang="en"><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta charset="UTF-8">
    <title></title>
    <script src="./js/jquery-1.11.2.js"></script>
    <script>
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
    <link rel="stylesheet" type="text/css" href="./css/PostviewC.css">
</head>
<body>
<div id="PostFor">
<div id="ForumHome" class="HMainCss" >
    <div id="MenuBar" class="menu">


        <div id="menuItem3">
            <input type="search" placeholder="Search" id="search">
        </div>
        <div id="menuItem1">
            <a href="signup"> Sign Up</a>
        </div>
        <div id="menuItem2">
            <a href="login">Login</a>
        </div>
        <div id="HomeP">
            <a href="HomePage.html">Home</a>
        </div>
        <div id="Htitle">
            Bitwise Solution
        </div>
    </div>

    <div id="Hbody" class="PbodyC">


<div id="Phead" class="PheadCss">

</div>
<div id="Pbody" style="margin: 20px 50px auto; " class="PbodyC">
    <div id="Ptitle" class="PtitleCss">
        <br>
        <label id="PLable" class="PlableC">Topic</label>
        <br>
        <br>
        <label id="PQues" class="PquesC">Question </label>
        <label id="PDate" class="PDateC">Date</label>
        <label id="PTime" class="PTimeC">Time</label>
        <br>
    </div>
    <br>
    <div id="PostText" class="PostTextC">
        <div id="Text" class="TextC">
            <br>
        <label id="Description" class="postdesc">Description</label>
            <br>
             <label id="Comment" class="TextComment">Comment</label>
        </div>
        <div id="TextComment" class="TextCommentC" style="display: none;">
            <input type="text" id="TextComm" class="TextCommC" placeholder="Post Comment">
            <label id="PCDate" class="PDateC">Date</label>
            <label id="PCTime" class="PTimeC">Time</label>
            <br>
            <br>
        </div>
    </div>
    <br>
    <br>
    <form name="ReplySubmit" class="ReplyFormCss">
        <br>

            Reply:
            <br>
            <textarea name="Text" id="PostReplyArea" class="ReplyText" placeholder="Enter Your Text"></textarea>
            <label id="RDate" class="PDateC">Date</label>
            <label id="RTime" class="PTimeC">Time</label>
            <br>
            <br>
        <input type="submit" value="Reply" class="btnrply">
        <br>
            <label id="RComment" class="TextComment">Comment </label>
            <br>
            <input type="text" id="ReplyComm" class="TextCommCR" placeholder="Post Comment" style="display: none;">
            <label id="RCDate" class="PDateC" style="display: none;">Date</label>
            <label id="RCTime" class="PTimeC" style="display: none;">Time</label>
        <br>
        <br>

            <br>


    </form>
    <br>
    <br>
    </div>
    <br>
    <br>
</div>
</body>
</html>