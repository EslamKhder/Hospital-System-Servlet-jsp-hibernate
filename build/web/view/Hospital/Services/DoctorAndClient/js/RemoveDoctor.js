var request;
var code,password1,password2;
function Edit()
{
    code = document.getElementById("code").value;
    password1 = document.getElementById("password1").value;
    password2 = document.getElementById("password2").value;
    var url = "../../../../RemoveDoctor";
    if (window.XMLHttpRequest) {
        request = new XMLHttpRequest();
    } else if (window.ActiveXObject) {
        request = new ActiveXObject("Microsoft.XMLHTTP");
    }
    try
    {
        request.onreadystatechange = getInfo;
        request.open("POST", url, true);
        request.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
        request.send("code=" + code + "&password1=" + password1 + "&password2=" + password2);
    } catch (e)
    {
        alert("Unable to connect to server");
    }
}
var Code = document.getElementById("Code"),
    Password1 =  document.getElementById("Password1"),
    Error =  document.getElementById("Error"),
    Password2 = document.getElementById("Password2");
function getInfo() {
    if (this.readyState === 4 && this.status === 200) {
        
        var val = this.responseText;
        if (val === "code") {
            Code.innerHTML = "Invalid Code";
            clear(Code);
        } else if (val === "password1") {
            Password1.innerHTML = "Invalid Password";
            clear(Password1);
        } else if (val === "password2") {
            Password2.innerHTML = "Invalid Password";
            clear(Password2);
        } else if (val === "identical") {
            Password2.innerHTML = "Not Identical";
            clear(Password2);
        } else if (val === "codeexist") {
            Code.innerHTML = "Code Doesn't Exist";
            clear(Code);
        } else if (val === "invalid") {
            Error.innerHTML = "Invalid Password";
            clear(Error);
        } else if (val === "success") {
            location.replace("../../Main/MainAdmin.jsp");
            alert("Success Remove");
        }
    }
}
function clear(x) {
    setTimeout(function () {
        x.innerHTML = "";
    }, 2000);
}