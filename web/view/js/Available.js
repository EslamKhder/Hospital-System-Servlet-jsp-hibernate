var request;
var spec1,spec2,spec3,spec4;
function Done()
{
    spec1 = document.getElementById("test1"),
    spec2 = document.getElementById("test2"),
    spec3 = document.getElementById("test3"),
    spec4 = document.getElementById("test4");
    if(spec1.checked === true){
        spec1 = spec1.value;
    } else {
        spec1 = "";
    }
    if(spec2.checked === true){
        spec2 = spec2.value;
    } else {
        spec2 = "";
    }
    if(spec3.checked === true){
        spec3 = spec3.value;
    } else {
        spec3 = "";
    }
    if(spec4.checked === true){
        spec4 = spec4.value;
    } else {
        spec4 = "";
    }
    
    var url = "../AvailablePhysicians";
    if (window.XMLHttpRequest) {
        request = new XMLHttpRequest();
    } else if (window.ActiveXObject) {
        request = new ActiveXObject("Microsoft.XMLHTTP");
    }
    try
    {
        request.onreadystatechange = getIn;
        request.open("post", url, true);
        request.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
        request.send("spec1=" + spec1 + "&spec2=" + spec2 +"&spec3=" + spec3+"&spec4=" + spec4);
    } catch (e)
    {
        alert("Unable to connect to server");
    }
}
function getIn() {
    if (this.readyState === 4 && this.status === 200) {
        var val = this.responseText;
        var error = document.getElementById("inv");
        if (val === "success") {
            error.innerHTML = "Success";
        }
    }
    clear(error);
}
function clear(x) {
    setTimeout(function () {
        x.innerHTML = "";
    }, 2000);
}