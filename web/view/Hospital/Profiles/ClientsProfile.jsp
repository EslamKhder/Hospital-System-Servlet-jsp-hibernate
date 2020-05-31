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
                        <h1>${sessionScope.CLIENT.getClientproperties().getName()}</h1>
                        <span>${sessionScope.CLIENT.getClientproperties().getGender()}</span>
                        <p>${sessionScope.CLIENT.getClientproperties().getPhone()}</p>
                        <span class="location"><i class="fa fa-map-marker" aria-hidden="true"></i>
                            ${sessionScope.CLIENT.getClientproperties().getAddress()}
                        </span>
                    </div>

                    <div class="data">
                        <div class="inner-data">
                            <span>Age </span>
                            <p>${sessionScope.CLIENT.getClientproperties().getAge()}</p>
                        </div>
                        <div class="inner-data">
                            <span>Balance</span>
                            <p>${sessionScope.CLIENT.getBalance()}</p>
                        </div>
                        <div class="inner-data">
                            <span>Code</span>
                            <p>${sessionScope.CLIENT.getCode()}</p>
                        </div>
                    </div>

                        <div class="btn"><a href="../Main/MainAdmin.jsp">Main</a></div>
                    
                </div>
            </div>
        </div>

    </body>
</html>