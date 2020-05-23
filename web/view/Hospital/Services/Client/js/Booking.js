var request;
var spec;
function Booking()
{
    spec = document.getElementById("spec").value;
    var url = "../../../../ClientBooking";
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
        request.send("spec=" + spec);
    } catch (e)
    {
        alert("Unable to connect to server");
    }
}
function getInfo() {
    if (this.readyState === 4 && this.status === 200) {
        var val = this.responseText;
        var error = document.getElementById("inv");
        if (val === "ivbalance") {
            error.innerHTML = "Money is not enough";
        } else if (val === "success") {
            error.innerHTML = "Success Booking";
        } else if (val === "invalid") {
            error.innerHTML = "You Already Booked it";
        }
    }
    clear(error);
}
function clear(x) {
    setTimeout(function () {
        x.innerHTML = "";
    }, 2000);
}