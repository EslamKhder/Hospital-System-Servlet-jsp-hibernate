<!DOCTYPE html>
<head>
<tittle></tittle>
<link rel="stylesheet" href="css/editdoctor.css" type="text/css">

<!--[if lt IE 9]>s    <script src="/js/html5shiv.js"></script>  <![endif]-->
<meta charset="UTF-8"/>
</head>
<html>
    <body>
        <div class="search">
            <h1>DATA EDITING</h1>
        </div>
        <div class="c">
            <label for="ID">Code</label>
            <input type="text" id="code" value="${sessionScope.doctor.getCode()}" placeholder="Your Code" disabled>

            <label for="NAME" style="padding-left: 1500px">Your NAME :</label>
            <input type="text" id="fname" value="${sessionScope.doctor.getDoctorproperties().getName()}" placeholder="Your Name..">
            <div id="Fname"></div>
            <label for="ADDRES">Your Phone</label>
            <input type="text" id="phone" value="${sessionScope.doctor.getDoctorproperties().getPhone()}" placeholder="Your Phone...">
            <div id="Phone"></div>


            <div class="bottons">
                <button><a href="../../Main/MainDoctor.jsp"></a>Main Page</button>
                <button onclick="EditDoctor()">Done</button>
            </div>
        </div>
            <script src="js/EditDoctor.js"></script>
</body>
</html>