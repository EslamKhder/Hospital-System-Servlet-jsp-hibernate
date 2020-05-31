<%-- 
    Document   : DoctorProfile
    Created on : May 25, 2020, 12:30:56 AM
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
                height: 400px;
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
                        <h1>Dr: ${sessionScope.doctor.getDoctorproperties().getName()}</h1>
                        <span>${sessionScope.doctor.getDoctorproperties().getGender()}</span>
                        <p>${sessionScope.doctor.getDoctorproperties().getPhone()}</p>
                        <span class="location">${sessionScope.doctor.getSpecialty()}</span>
                    </div>

                    <div class="data">
                        <div class="inner-data">
                            <span>Balance</span>
                            <p>${sessionScope.doctor.getBalance()}</p>
                        </div>
                        <div class="inner-data">
                            <span>Code</span>
                            <p>${sessionScope.doctor.getCode()}</p>
                        </div>
                    </div>

                        <div class="btn"><a href="../../../../DoctorProfile?id=2">Main</a></div>
                </div>
            </div>
        </div>

    </body>
</html>