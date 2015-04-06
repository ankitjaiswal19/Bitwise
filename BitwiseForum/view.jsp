<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset="UTF-8">
  <title></title>
    <link href="css/style.css" rel="stylesheet"/>
    
<script type="text/javascript" src="js/jquery-1.11.0.min.js"></script>
<script type="text/javascript" src="js/jquery.leanModal.min.js"></script>
<script type="text/javascript" src="js/jquery.leanModal11.min.js"></script>
<script type="text/javascript" src="js/jquery.leanModal12.min.js"></script>
<link rel="stylesheet" href="http://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.min.css" />
<link type="text/css" rel="stylesheet" href="css/style1.css" />
  
   
  
</head>
<body>
<div id="page">
    <div id="header">

        <div id="icon">
   <img src="./images/logo.jpg" width="95px" height="90px"/>
        </div>

     <div id="search">

         <form id="NewSearch" method="get" action="http://www.google.com">
             <input type="text" id="tfq2b" class="textInput2" name="q" size="21" maxlength="120" placeholder="Search"><input type="submit" value=">" class="tfbutton2">
         </form>

        </div>

    </div>
    <div id="menu">
        <ul  type="none">
            <li><a href="home.html" >HOME</a></li>
            <li><a href=""> FAQ</a></li>
            <li><a href="#modal" id="modal_trigger1"> REGISTER</a></li>
            <li><a  href="#modal"  id="modal_trigger2">LOGIN</a></li>

        </ul>
    </div>

 <div id="content">
		
<div class="allForum">

   all post
   
</div>

	<div id="modal" class="popupContainer" style="display:none;">
		<header class="popupHeader">
			<span class="header_title">Login</span>
			<span class="modal_close"><i class="fa fa-times"></i></span>
		</header>
		
		<section class="popupBody">
			<!-- Social Login -->
			<div class="social_login">
				<div class="">
					<a href="#" class="social_box fb">
						<span class="icon"><i class="fa fa-facebook"></i></span>
						<span class="icon_title">Connect with Facebook</span>
						
					</a>

					<a href="#" class="social_box google">
						<span class="icon"><i class="fa fa-google-plus"></i></span>
						<span class="icon_title">Connect with Google</span>
					</a>
				</div>

				<div class="centeredText">
					<span>Or use your Email address</span>
				</div>

				<div class="action_btns">
					<div class="one_half"><a href="#" id="login_form" class="btn">Login</a></div>
					<div class="one_half last"><a href="#" id="register_form" class="btn">Register</a></div>
				</div>
			</div>

			<!-- Username & Password Login form -->
			<div class="user_login">
				<form>
					<label>Email / Username</label>
					<input type="text" />
					<br />

					<label>Password</label>
					<input type="password" />
					<br />



					<div class="action_btns">
						<div class="one_half"><a href="#" class="btn back_btn"><i class="fa fa-angle-double-left"></i> Register</a></div>
						<div class="one_half last"><a href="forum.html" class="btn btn_red">Login</a></div>
					</div>
				</form>
			</div>

			<!-- Register Form -->
			<div class="user_register">
				<form>
					<label>Full Name</label>
					<input type="text" />
					<br />

					<label>Email Address</label>
					<input type="email" />
					<br />

					<label>Password</label>
					<input type="password" />
					<br />
<tr>            <label>Conform Password</label>
                    <input type="password" />
                <br />



                        <br />
                        <br />


					
                        <br />
                        <br />
                     

					<div class="action_btns">

						<div class="one_half last"><a href="#" class="btn btn_red">Register</a></div>
					</div>
				</form>
			</div>
		</section>
	</div>
            

        </div>


    <div id="footer">
        footer
    </div>

</div>
<script type="text/javascript">
	$(".modal_trigger").leanModal({top : 100, overlay : 0.6, closeButton: ".modal_close" });
	
	$(function(){
		// Calling Login Form
		$("#login_form").click(function(){
			$(".social_login").hide();
			$(".user_login").show();
			$(".user_register").hide();
			return false;
		});

		// Calling Register Form
	$("#register_form").click(function(){
			$(".social_login").hide();
			$(".user_register").show();
			$(".user_login").hide();
			$(".header_title").text('Register');
			return false;
		});

		// Going back to Social Forms
		$(".back_btn").click(function(){
			$(".user_login").hide();
			$(".user_register").hide();
			$(".social_login").show();
			$(".header_title").text('Login');
			return false;
		});
		
		
	})
	
	$("#modal_trigger1").leanModal11({top : 100, overlay : 0.6, closeButton: ".modal_close" });
	
	$(function(){
		// Calling Register Form
	$("#modal_trigger1").click(function(){
			$(".user_login").hide();
			$(".social_login").hide();
			$(".user_register").show();
			$(".header_title").text('Register');
			return false;
		});
	})
			
	$("#modal_trigger2").leanModal12({top : 100, overlay : 0.6, closeButton: ".modal_close" });
	
	$(function(){
	// Calling Login Form
		$("#modal_trigger2").click(function(){
			$(".social_login").hide();
			$(".user_login").show();
			$(".user_register").hide();
			$(".header_title").text('Login');
			return false;
		});

	})
	
</script>
</body>
</html>