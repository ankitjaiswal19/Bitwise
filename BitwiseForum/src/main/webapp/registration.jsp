<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <!DOCTYPE html>
<html>
<head>
    <title> REGISTER</title>
    <script type="text/javascript" src="FormValidation.js" ></script>
    <style type="text/css">
        .PostTextC {
        margin-left: 120px;
            border: 2px solid pink;
        border-radius: 20px;
        margin-right: 120px;
        height: 350px;}
        body{
            font-size: 1.5em;
            padding: 0px 50px;
        }

        /* for error messages */
        .errorMsg {
            color: red;
        }

        /* for the error input text fields */
        input.error {
            border: 1px inset red;
        }

        table {
            border: 0;
        }

        td {
            margin: 0;
            padding: 3px 10px 3px 3px;
        }
    </style>
</head>

<body>
<div id="header">
    <img src="images/header.png" height="200" width="1050"/>
    </div>
<div class="PostTextC">
<form id="myForm" method="post" action="Login_Reg">

    <table align= "center">
        <tr>
            <td>
            <h3>Fill up your entries for REGISTRATION</h3> </td> </tr>
        <tr>
            <td>Name<span class="errorMsg">*</span></td>
            <td><input type="text" id="name" name="name"/></td>
            <td id="nameError" class="errorMsg"> </td></tr>
        <tr>
            <td>Email<span class="errorMsg">*</span></td>
            <td><input type="text" id="email" name="email" /></td>
            <td id="emailError" class="errorMsg"> </td></tr>
        <tr>
            <td>Password (8-12 characters)<span class="errorMsg">*</span></td>
            <td><input type="password" id="password" name="password" /></td>
            <td id="passwordError" class="errorMsg"> </td></tr>
        <tr>
            <td>Verify Password<span class="errorMsg">*</span></td>
            <td><input type="password" id="pwVerified" name="pwVerified" /></td>
            <td id="pwVerifiedError" class="errorMsg"> </td></tr>
        <tr>
            <td> </td>
            <td><input type="submit" value="Submit" id="submit"/>
                <input type="reset" value="Clear" id="reset"/></td>
            <td> </td></tr>

    </table>

</form>
</div>
<script type="text/javascript">
    window.onload = init;

    //The "onload" handler. Run after the page is fully loaded
    function init() {
        document.getElementById("myForm").onsubmit = validateForm;
    }
    function validateForm() {
        return (isNotEmpty("name", "Name is not entered!")
        && isValidEmail("email", "Email is not entered!")
        && isLengthMinMax("password", "Password can not be empty & should have min 8 and max 12 characters!", 6, 12)
        && verifyPassword("password", "pwVerified", "Not matched!"));
    }

    //Return true if the input value is not empty
    function isNotEmpty(inputId, errorMsg) {
        var inputElement = document.getElementById(inputId);
        var errorElement = document.getElementById(inputId + "Error");
        var inputValue = inputElement.value.trim();
        var isValid = (inputValue.length !== 0);  // boolean
        showMessage(isValid, inputElement, errorMsg, errorElement);
        return isValid;
    }

    function showMessage(isValid, inputElement, errorMsg, errorElement) {
        if (!isValid) {
            // Put up error message on errorElement or via alert()
            if (errorElement !== null) {
                errorElement.innerHTML = errorMsg;
            } else {
                alert(errorMsg);
            }
            // Change "class" of inputElement, so that CSS displays differently
            if (inputElement !== null) {
                inputElement.className = "error";
                inputElement.focus();
            }
        }
        else {
            // Reset to normal display
            if (errorElement !== null) {
                errorElement.innerHTML = "";
            }
            if (inputElement !== null) {
                inputElement.className = "";
            }
        }
    }

    //Return true if the input length is between minLength and maxLength
    function isLengthMinMax(inputId, errorMsg, minLength, maxLength) {
        var inputElement = document.getElementById(inputId);
        var errorElement = document.getElementById(inputId + "Error");
        var inputValue = inputElement.value.trim();
        var isValid = (inputValue.length >= minLength) && (inputValue.length <= maxLength);
        showMessage(isValid, inputElement, errorMsg, errorElement);
        return isValid;
    }

    //Return true if the input value is a valid email address
    //(For illustration only. Should use regexe in production.)
    function isValidEmail(inputId, errorMsg) {
        var inputElement = document.getElementById(inputId);
        var errorElement = document.getElementById(inputId + "Error");
        var inputValue = inputElement.value;
        var atPos = inputValue.indexOf("@");
        var dotPos = inputValue.lastIndexOf(".");
        var isValid = (atPos > 0) && (dotPos > atPos + 1) && (inputValue.length > dotPos + 2);
        showMessage(isValid, inputElement, errorMsg, errorElement);
        return isValid;
    }

    //Verify password. The password is kept in element with id "pwId".
    //The verified password in id "verifiedPwId".
    function verifyPassword(pwId, verifiedPwId, errorMsg) {
        var pwElement = document.getElementById(pwId);
        var verifiedPwElement = document.getElementById(verifiedPwId);
        var errorElement = document.getElementById(verifiedPwId + "Error");
        var isTheSame = (pwElement.value === verifiedPwElement.value);
        showMessage(isTheSame, verifiedPwElement, errorMsg, errorElement);
        return isTheSame;
    }

</script>
</body>
</html>