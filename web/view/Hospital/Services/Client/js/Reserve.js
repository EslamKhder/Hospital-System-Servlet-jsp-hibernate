var request;
var iddoctor,book;
function Booking(x)
{
    iddoctor = x;
    book = document.getElementById("book"+x);
    var url = "CancelBookingClient";
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
        request.send("iddoctor=" + iddoctor);
    } catch (e)
    {
        alert("Unable to connect to server");
    }
}
function getInfo() {
    if (this.readyState === 4 && this.status === 200) {
        var val = this.responseText;
        var error = document.getElementById("inv");
        if (val === "success") {
            book.style.display = "none";
        }
    }
}