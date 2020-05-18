var request;
var password;
function Delete()
{
    password = document.getElementById("password").value;
    var url = "../../EditDoctorPassword";
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
        request.send("password=" + password);
    } catch (e)
    {
        alert("Unable to connect to server");
    }
}
var Password = document.getElementById("Password");
function getInfo() {
    if (this.readyState === 4 && this.status === 200) {
        
        var val = this.responseText;
        if (val === "invalid") {
            Password.innerHTML = "Invalid ID";
        } else if (val === "success") {
            location.replace("../../view/Life Makers.html");
        }
    }
    clear(Password);
}
function clear(x) {
    setTimeout(function () {
        x.innerHTML = "";
    }, 2000);
}