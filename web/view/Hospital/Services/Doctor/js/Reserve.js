var request;
var book;
function Booking(idclient)
{
    book = document.getElementById("book"+idclient);
    var url = "../../../../CancelBookingDoctor";
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
        request.send("idclient=" + idclient);
    } catch (e)
    {
        alert("Unable to connect to server");
    }
}
function getInfo() {
    if (this.readyState === 4 && this.status === 200) {
        var val = this.responseText;
        if (val === "success") {
            book.style.display = "none";
        }
    }
}