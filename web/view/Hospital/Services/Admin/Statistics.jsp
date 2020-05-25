<%-- 
    Document   : ClientReservations
    Created on : May 17, 2020, 8:34:39 PM
    Author     : Eng Eslam khder
--%>

<%@page import="Model.Client"%>
<%@page import="Controller.DoctorController"%>
<%@page import="Model.Doctor"%>
<%@page import="javax.print.Doc"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="org.hibernate.SessionFactory"%>
<%@page import="java.util.List"%>
<%@page import="Model.Booking"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Controller.ClientController"%>
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
    </head>
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
        .pharmacy
        {
            background-color: #c4d3f6;
            width: 40%;
            height: 292px;
            padding: 35px;
            position: absolute;
            top: 149px;
            left: 414px;
            border: 1px solid brown;
            display: none;
        }
        .pharmacy label
        {
            font-size: 20px;
            color: brown;
        }
        .pharmacy textarea
        {
            margin: 32px 0px;
            border: 1px solid brown;
            width: 288px;
            height: 116px;
            resize: none;
            font-size: 17px;
            font-weight: bold;
        }
        .pharmacy button
        {
            position: relative;
            left: 400px;
            font-size: 20px;
            border: 1px solid brown;
            padding: 5px;
            width: 87px;
        }
    </style>
    <body>
        <div class="myname">${sessionScope.admin.getName()}</div>
        <%
            int i = 0;
            ClientController cc = new ClientController();
            List<Booking> booking = new ArrayList();
            SessionFactory sessionf = (SessionFactory) application.getAttribute("factory");
            booking = cc.allBooking(sessionf);
            pageContext.setAttribute("BOOKING", booking);
        %>
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
                            Statistics
                        </p>
                    </div>

                    <div class="table">

                        <div class="row header">
                            <div class="cell">
                                Name (Doctor)
                            </div>
                            <div class="cell">
                                Name (Client)
                            </div>
                            <div class="cell">
                                Specialtion
                            </div>
                            <div class="cell">
                                DATE
                            </div>
                            <div class="cell">
                                Address (Client)
                            </div>
                            <div class="cell">
                                PHONE NUMBER (Client)
                            </div>
                            <div class="cell">
                                PHONE NUMBER (Doctor)
                            </div>
                            
                            <div class="cell">
                                Age (Client)
                            </div>
                        </div>

                        <c:forEach items="${BOOKING}" var="book" >
                            <div class="row">
                                <div class="cell">
                                    ${book.getDoctor().getDoctorproperties().getName()}
                                </div>
                                <div class="cell">
                                    ${book.getClient().getClientproperties().getName()}
                                </div>
                                <div class="cell">
                                    ${book.getDoctor().getSpecialty()}
                                </div>
                                <div class="cell">
                                    ${book.getDate()}
                                </div>
                                <div class="cell">
                                    ${book.getClient().getClientproperties().getAddress()}
                                </div>
                                <div class="cell">
                                    ${book.getClient().getClientproperties().getPhone()}
                                </div>
                                <div class="cell">
                                    ${book.getDoctor().getDoctorproperties().getPhone()}
                                </div>
                                
                                <div class="cell">
                                    ${book.getClient().getClientproperties().getAge()}
                                </div>
                            </div>
                        </c:forEach>
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
        <script src="js/Reserve.js"></script>
        <script src="js/script.js"></script>

    </body>
</html>