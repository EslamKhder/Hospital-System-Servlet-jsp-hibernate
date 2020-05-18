<%-- 
    Document   : DoctorReservations
    Created on : May 18, 2020, 2:10:33 AM
    Author     : Eng Eslam khder
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Doctor Data</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <!--===============================================================================================-->	
        <link rel="icon" type="image/png" href="images/icons/favicon.ico"/>
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="vendor/bootstrap/css/bootstrap.min.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="fonts/font-awesome-4.7.0/css/font-awesome.min.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="vendor/animate/animate.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="vendor/select2/select2.min.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="vendor/perfect-scrollbar/perfect-scrollbar.css">
        <!--===============================================================================================-->
        <link rel="stylesheet" type="text/css" href="util.css">
        <link rel="stylesheet" type="text/css" href="SDData.css">
        <!--===============================================================================================-->
        <style>
            .myname
            {
                position: absolute;
                background-color: brown;
                padding: 10px;
                border: 1px solid white;
                color: cornsilk;
                margin: 20px;
                font-size: 25px;
                font-family: fantasy;
                letter-spacing: 4px;
            }
        </style>
    </head>
    <body>
        <div class="myname">${sessionScope.client.getClientproperties().getName()}</div>
        <div class="limiter">
            <div class="container-table100">
                <div class="wrap-table100">
                    <div>
                        <p style="
                           text-align: center;
                           padding-bottom: 30px;
                           font-weight: bolder;
                           font-family: cursive;
                           font-size: 60px;
                           color: white;
                           ">
                            DOCTOR DATA
                        </p>
                    </div>
                    <div class="table">

                        <div class="row header">
                            
                            <div class="cell">
                                FULL NAME
                            </div>
                            <div class="cell">
                                Age
                            </div>
                            <div class="cell">
                                ADDRESS
                            </div>
                            <div class="cell">
                                PHONE NUMBER
                            </div>
                        </div>

                    </div>
                </div>
            </div>
        </div>




        <!--===============================================================================================-->	
        <script src="vendor/jquery/jquery-3.2.1.min.js"></script>
        <!--===============================================================================================-->
        <script src="vendor/bootstrap/js/popper.js"></script>
        <script src="vendor/bootstrap/js/bootstrap.min.js"></script>
        <!--===============================================================================================-->
        <script src="vendor/select2/select2.min.js"></script>
        <!--===============================================================================================-->
        <script src="js/main.js"></script>

    </body>
</html>