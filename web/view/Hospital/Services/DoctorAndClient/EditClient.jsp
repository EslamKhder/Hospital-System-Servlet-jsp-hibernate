<!DOCTYPE html>
<head>
<tittle></tittle>
<link rel="stylesheet" href="css/editdoctor.css" type="text/css">

<!--[if lt IE 9]>s    <script src="/js/html5shiv.js"></script>  <![endif]-->
<meta charset="UTF-8">
</head>
<html>
    <body>
        <div class="search">
            <h1>DATA EDITING</h1>

        </div>
        <div class="c">
            <label for="ID">Code</label>
            <input type="text" id="code" placeholder="Your Code" value="${sessionScope.client.getCode()}" disabled>

            <label for="NAME" style="padding-left: 1500px">Your NAME :</label>
            <input type="text" id="fname" value="${sessionScope.client.getClientproperties().getName()}" placeholder="Your Name..">
            <div id="Fname"></div>
            <label for="ADDRES">Your Phone</label>
            <input type="text" id="phone" value="${sessionScope.client.getClientproperties().getPhone()}" placeholder="Your Phone...">
            <div id="Phone"></div>
            
            <label for="ADDRES">Your Address</label>
            <input type="text" id="address" value="${sessionScope.client.getClientproperties().getAddress()}" placeholder="Your Address...">
            <div id="Address"></div>

            <div class="bottons">
                <button><a href="../../Main/MainClient.jsp">Main Page</a></button>
                <button onclick="EditClient()">Done</button>
            </div>
        </div>
            <script src="js/EditClient.js"></script>
    </body>
</html>