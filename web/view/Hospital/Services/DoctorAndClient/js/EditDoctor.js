var request;
var fname, phone, address;
function EditDoctor()
{
    fname = document.getElementById("fname").value;
    phone = document.getElementById("phone").value;
    var url = "../../../../EditDoctor";
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
        request.send("fname=" + fname + "&phone=" + phone);
    } catch (e) {
        alert("Unable to connect to server");
    }
}
var Fname = document.getElementById("Fname"),
        Phone = document.getElementById("Phone");
function get() {
    if (this.readyState === 4 && this.status === 200) {
        var val = this.responseText;
        if (val === "name") {
            Fname.innerHTML = "Invalid Name";
            clear(Fname);
        } else if (val === "phone") {
            Phone.innerHTML = "Invalid Phone";
            clear(Phone);
        } else if (val === "success") {
            location.replace("../../Main/MainDoctor.jsp");
        }
    }
}
function clear(x) {
    setTimeout(function () {
        x.innerHTML = "";
    }, 2000);
}