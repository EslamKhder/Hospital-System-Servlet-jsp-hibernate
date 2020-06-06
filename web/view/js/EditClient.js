var request;
var fname, phone, address;
function EditClient()
{
    fname = document.getElementById("fname").value;
    phone = document.getElementById("phone").value;
    address = document.getElementById("address").value;
    var url = "../EditClient";
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
        request.send("fname=" + fname + "&phone=" + phone + "&address=" + address);
    } catch (e) {
        alert("Unable to connect to server");
    }
}
var Fname = document.getElementById("Fname"),
        Phone = document.getElementById("Phone"),
        Address = document.getElementById("Address");
function get() {
    if (this.readyState === 4 && this.status === 200) {
        var val = this.responseText;
        if (val === "name") {
            Fname.innerHTML = "Invalid Name";
            clear(Fname);
        } else if (val === "phone") {
            Phone.innerHTML = "Invalid Phone";
            clear(Phone);
        } else if (val === "address") {
            Address.innerHTML = "Invalid Address";
            clear(Address);
        } else if (val === "success") {
            location.replace("MainClient.jsp");
        }
    }
}
function clear(x) {
    setTimeout(function () {
        x.innerHTML = "";
    }, 2000);
}