var request;
var opassword,npassword1,npassword2;
function Edit()
{
    opassword = document.getElementById("opassword").value;
    npassword1 = document.getElementById("npassword1").value;
    npassword2 = document.getElementById("npassword2").value;
    var url = "../EditDoctorPassword";
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
        request.send("opassword=" + opassword + "&npassword1=" + npassword1 + "&npassword2=" + npassword2);
    } catch (e)
    {
        alert("Unable to connect to server");
    }
}
var OPassword = document.getElementById("OPassword"),
    NPassword1 =  document.getElementById("NPassword1"),
    NPassword2 = document.getElementById("NPassword2");
function getInfo() {
    if (this.readyState === 4 && this.status === 200) {
        
        var val = this.responseText;
        if (val === "opassword") {
            OPassword.innerHTML = "Invalid Password";
            clear(OPassword);
        } else if (val === "npassword1") {
            NPassword1.innerHTML = "Invalid Password";
            clear(NPassword1);
        } else if (val === "npassword1num") {
            NPassword1.innerHTML = "Password Must Be More than 7 Char Or DigIt";
            clear(NPassword1);
        } else if (val === "npassword2") {
            NPassword2.innerHTML = "Invalid Password";
            clear(NPassword2);
        } else if (val === "invalid") {
            NPassword2.innerHTML = "Not Identical";
            clear(NPassword2);
        } else if (val === "opasswordinvalid") {
            OPassword.innerHTML = "Old Password Not Right";
            clear(OPassword);
        } else if (val === "success") {
            location.replace("MainDoctor.jsp");
            alert("Success UP_DATE");
        }
    }
}
function clear(x) {
    setTimeout(function () {
        x.innerHTML = "";
    }, 2000);
}