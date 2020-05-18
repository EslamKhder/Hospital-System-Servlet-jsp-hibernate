var request;
var spec, code, password;
function login()
{
    code = document.getElementById("code").value,
            password = document.getElementById("password").value;
    spec = document.getElementById("spec").value;
    var url = "../../../LoginDoctor";
    if (window.XMLHttpRequest) {
        request = new XMLHttpRequest();
    } else if (window.ActiveXObject) {
        request = new ActiveXObject("Microsoft.XMLHTTP");
    }
    try
    {
        request.onreadystatechange = getInfo;
        request.open("post", url, true);
        request.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
        request.send("spec=" + spec + "&code=" + code + "&password=" + password);
    } catch (e)
    {
        alert("Unable to connect to server");
    }
}
function getInfo() {
    if (this.readyState === 4 && this.status === 200) {
        var val = this.responseText;
        var error = document.getElementById("inv");
        if (val === "code") {
            error.innerHTML = "Invalid Code";
        } else if (val === "password") {
            error.innerHTML = "Invalid Password";
        } else if (val === "invalid") {
            error.innerHTML = "Invalid Code And Password";
        } else if (val === "success") {
            location.replace("../Main/MainDoctor.jsp");
        }
    }
    clear(error);
}
function clear(x) {
    setTimeout(function () {
        x.innerHTML = "";
    }, 2000);
}