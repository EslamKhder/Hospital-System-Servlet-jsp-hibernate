var request;
var password;
function Remove()
{
    password = document.getElementById("password").value;
    var url = "../RemoveClient";
    if (window.XMLHttpRequest) {
        request = new XMLHttpRequest();
    } else if (window.ActiveXObject) {
        request = new ActiveXObject("Microsoft.XMLHTTP");
    }
    try
    {
        request.onreadystatechange = get;
        request.open("POST", url, true);
        request.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
        request.send("password=" + password);
    } catch (e)
    {
        alert("Unable to connect to server");
    }
}
var Password =  document.getElementById("Password");
function get() {
    if (this.readyState === 4 && this.status === 200) {
        
        var val = this.responseText;
        if (val === "password") {
            Password.innerHTML = "Invalid Password";
            clear(Password);
        } else if (val === "success") {
            location.replace("loginClient.jsp");
        }
    }
}
function clear(x) {
    setTimeout(function () {
        x.innerHTML = "";
    }, 2000);
}