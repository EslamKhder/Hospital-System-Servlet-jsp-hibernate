var request;
var code,password,balance;
function Edit()
{
    code = document.getElementById("code").value;
    password = document.getElementById("password").value;
    balance = document.getElementById("balance").value;
    var url = "../../../../../EditDoctorPassword";
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
        request.send("code" + code + "&password" + password + "&balance=" + balance);
    } catch (e)
    {
        alert("Unable to connect to server");
    }
}
var Code = document.getElementById("Code"),
    Password =  document.getElementById("Password"),
    Error =  document.getElementById("Error"),
    Balance = document.getElementById("Bpassword2");
function getInfo() {
    if (this.readyState === 4 && this.status === 200) {
        
        var val = this.responseText;
        if (val === "code") {
            Code.innerHTML = "Invalid Code";
            clear(Code);
        } else if (val === "password") {
            Password.innerHTML = "Invalid Password";
            clear(Password);
        } else if (val === "balance") {
            Balance.innerHTML = "Invalid Balance";
            clear(Balance);
        } else if (val === "invalid") {
            Error.innerHTML = "Invalid Password And Code";
            clear(Error);
        }  else if (val === "success") {
            location.replace("../../../Main/MainDoctor.jsp");
            alert("Success Added");
        }
    }
    
}
function clear(x) {
    setTimeout(function () {
        x.innerHTML = "";
    }, 2000);
}