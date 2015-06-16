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
    
    <div id="Hhead" class="PheadCss">
    </div>


    <div id="Hbody" class="PbodyC">
        <h3 align="center">REGISTRATION </h3>
    <form id="myForm" method="post" action="getRegistered" >
    <table align="center" id="tbl">
        <tr>
            <td>Name<span class="errorMsg">*</span></td>
            <td><input type="text" id="name" name="username"/></td>
            <td id="nameError" class="errorMsg"> </td></tr>
        <tr>
            <td>Email<span class="errorMsg">*</span></td>
            <td><input type="text" id="email" name="email" /></td>
            <td id="emailError" class="errorMsg"> </td></tr>
        <tr>
            <td>password (8-12 characters)<span class="errorMsg">*</span></td>
            <td><input type="password" id="password" name="password" /></td>
            <td id="passwordError" class="errorMsg"> </td></tr>
        <tr>
            <td>Verify Password<span class="errorMsg">*</span></td>
            <td><input type="password" id="pwVerified" name="confirmPass" /></td>
            <td id="pwVerifiedError" class="errorMsg"> </td></tr>
        <tr>
            <td> </td>
            <td><input type="submit" value="Submit" id="submit"/>
                <input type="reset" value="Clear" id="reset"/></td>
            <td> </td></tr>
    </table>
</form>
    </div>
</div>

</body>
</html>