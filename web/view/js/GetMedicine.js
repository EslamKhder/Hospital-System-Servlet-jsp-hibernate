var request;
var book,medicine,el;
function getMedicine(idclient)
{
    el = document.getElementById("ph"+idclient);
    book = document.getElementById("book"+idclient),
    medicine = document.getElementById("medicine"+idclient).value;
    var url = "GetMedicine";
    if (window.XMLHttpRequest) {
        request = new XMLHttpRequest();
    } else if (window.ActiveXObject) {
        request = new ActiveXObject("Microsoft.XMLHTTP");
    }
    try
    {
        request.onreadystatechange = getInfoo;
        request.open("post", url, true);
        request.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
        request.send("idclient=" + idclient + "&medicine=" + medicine);
    } catch (e)
    {
        alert("Unable to connect to server");
    }
}

function getInfoo() {
    if (this.readyState === 4 && this.status === 200) {
        var val = this.responseText;
        if (val === "success") {            
            el.style.display = "block";
            book.style.display = "block";
            el.remove();
            book.remove();
        }
    }
}