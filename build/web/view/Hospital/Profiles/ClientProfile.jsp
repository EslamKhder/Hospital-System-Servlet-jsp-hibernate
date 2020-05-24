<%-- 
    Document   : MainAdmin
    Created on : May 8, 2020, 9:22:48 AM
    Author     : Eng Eslam khder
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>UI Profile Card Design</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="css/style.css">
        <style>
            .container{
                height: 415px;
            }
            .btn a{
                text-decoration: none;
            }
        </style>
    </head>
    <body>



        <div class="wrapper">
            <div class="container">
                <img src="p4.jpg" alt="" class="profile-img">

                <div class="content">
                    <div class="sub-content">
                        <h1>${sessionScope.client.getClientproperties().getName()}</h1>
                        <span>${sessionScope.client.getClientproperties().getGender()}</span>
                        <p>${sessionScope.client.getClientproperties().getPhone()}</p>
                        <span class="location"><i class="fa fa-map-marker" aria-hidden="true"></i>
                            ${sessionScope.client.getClientproperties().getAddress()}
                        </span>
                    </div>

                    <div class="data">
                        <div class="inner-data">
                            <span>Age </span>
                            <p>${sessionScope.client.getClientproperties().getAge()}</p>
                        </div>
                        <div class="inner-data">
                            <span>Balance</span>
                            <p>${sessionScope.client.getBalance()}</p>
                        </div>
                        <div class="inner-data">
                            <span>Code</span>
                            <p>${sessionScope.client.getCode()}</p>
                        </div>
                    </div>

                    <div class="btn"><a href="../Main/MainClient.jsp">Main</a></div>
                    <div class="btn"><a href="">UP_Date</a></div>
                    <div class="btn"><a href="">Delete</a></div>
                </div>
            </div>
        </div>

    </body>
</html>