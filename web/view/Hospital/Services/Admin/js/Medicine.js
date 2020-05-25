var request;
var password, book, inv;
function medicine(idbook,idclient, date,iddoctor)
{
    password = document.getElementById("password" + idbook).value,
            book = document.getElementById("book" + idbook),
            inv = document.getElementById("inv" + idbook);
    var url = "../../../../AcceptMedicine";
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
        request.send("idclient=" + idclient + "&password=" + password + "&date=" + date +"&iddoctor=" + iddoctor);
    } catch (e)
    {
        alert("Unable to connect to server");
    }
}
function getInfo() {
    if (this.readyState === 4 && this.status === 200) {
        var val = this.responseText;
        if (val === "password") {
            inv.innerHTML = "Invalid Password";
        } else if (val === "success") {
            book.style.display = "none";
            book.remove();
        }
    }
    clear(inv);
}
function clear(x) {
    setTimeout(function () {
        x.innerHTML = "";
    }, 2000);
}