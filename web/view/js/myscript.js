window.onload = function () {
    "use strict";
    var button = document.getElementById("submit"),
        id = document.getElementById("id"),
        password = document.getElementById("password"),
        name = document.getElementById("name"),
        phone = document.getElementById("phone"),
        address = document.getElementById("address"),
        age = document.getElementById("age"),
        checkbox = document.getElementById("checkbox");
    button.addEventListener("click", function (event) {
        if (id.value.trim() === "" || password.value.trim() === "" || name.value.trim() === "" || phone.value.trim() === "" || address.value.trim() === "" || age.value.trim() === "" || checkbox.value === "0") {
            event.preventDefault();
        }
    });
    function checked() {
        if (id.value.trim() !== "" && password.value.trim() !== "" && name.value.trim() !== "" && phone.value.trim() !== "" && address.value.trim() !== "" && age.value.trim() !== "" && checkbox.value === "1") {
            button.style.opacity = "1";
            button.style.cursor = "pointer";
        } else {
            button.style.opacity = ".5";
            button.style.cursor = "no-drop";
        }
    }
    
    id.onkeyup = function () {
        checked();
    };
    password.onkeyup = function () {
        checked();
    };
    name.onkeyup = function () {
        checked();
    };
    phone.onkeyup = function () {
        checked();
    };
    address.onkeyup = function () {
        checked();
    };
    age.onkeyup = function () {
        checked();
    };
    
    checkbox.onclick = function () {
        if (this.value === "0") {
            this.value = "1";
        } else {
            this.value = "0";
        }
        checked();
    };
};