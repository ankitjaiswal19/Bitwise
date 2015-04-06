/**
 * Created by training on 4/4/2015.
 */

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


