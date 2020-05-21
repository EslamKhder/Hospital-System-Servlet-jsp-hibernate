var request;
var code, password, name, phone, gender, spec;
function newAccount()
{
    code = document.getElementById("code").value,
            password = document.getElementById("password").value,
            name = document.getElementById("name").value,
            phone = document.getElementById("phone").value,
            gender = document.getElementsByName("gender"),
            spec = document.getElementById("spec").value;
    if (gender[0].checked === true) {
        gender = gender[0].value;
    } else if (gender[1].checked === true) {
        gender = gender[1].value;
    } else {
        gender = "";
    }
    var url = "../../../NewDoctorAccount";
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
        request.send("code=" + code + "&password=" + password + "&name=" + name + "&phone=" + phone + "&gender=" + gender + "&spec=" + spec);
    } catch (e)
    {
        alert("Unable to connect to server");
    }
}
function getInfo() {
    if (this.readyState === 4 && this.status === 200) {
        var val = this.responseText,
                c = document.getElementById("Code"),
                pa = document.getElementById("Password"),
                n = document.getElementById("Name"),
                ph = document.getElementById("Phone"),
                ge = document.getElementById("Gender");
        if (val === "code") {
            c.innerHTML = "Invalid Code";
            clear(c);
        } else if (val === "password") {
            pa.innerHTML = "Invalid Password";
            clear(pa);
        } else if (val === "numpassword") {
            pa.innerHTML = "Password Must include More than 7 Char OR Digit";
            clear(pa);
        } else if (val === "name") {
            n.innerHTML = "Invalid Name";
            clear(n);
        } else if (val === "phone") {
            ph.innerHTML = "Invalid Phone";
            clear(ph);
        }else if (val === "gender") {
            ge.innerHTML = "Invalid Gender";
            clear(ge);
        } else if (val === "success") {
            location.replace("../Main/MainAdmin.jsp");
        }
    }
}
function clear(x) {
    setTimeout(function () {
        x.innerHTML = "";
    }, 2000);
}