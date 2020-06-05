<%-- 
    Document   : ClientReservations
    Created on : May 17, 2020, 8:34:39 PM
    Author     : Eng Eslam khder
--%>

<%@page import="javax.swing.JOptionPane"%>
<%@page import="java.util.stream.Collectors"%>
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
        <link rel="stylesheet" type="text/css" href="view/Hospital/Services/Admin/util.css">
        <link rel="stylesheet" type="text/css" href="view/Hospital/Services/Admin/SDData.css">
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
        .pass
        {
            margin-left: 100px;
            margin-top: -21px;
            border: 1px solid brown;
            width: 332px;
            display: none;
        }
        .pass input
        {
            width: 246px;
            padding: 10px;
            display: inline;
        }
        .pass button
        {
            display: inline;
            border: 1px solid brown;
            padding: 5px;
        }
        .pass div
        {
            margin-left: 100px;
            font-weight: bold;
        }
        .row .cell {
            width: 184px;
            padding-left: 40px;
            padding-left: 13px;
        }
    </style>
    <body>
        <div class="myname">Admin : ${sessionScope.admin.getName()}</div>
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
                            My Reservations
                        </p>
                    </div>
                    <div class="table">

                        <div class="row header">
                            <div class="cell">
                                NAME (Doctor)
                            </div>
                            <div class="cell">
                                Specialtion
                            </div>
                            <div class="cell">
                                NAME (Client)
                            </div>
                            <div class="cell">
                                Medicine
                            </div>
                            <div class="cell">
                                DATE
                            </div>
                            <div class="cell">
                                Services
                            </div>
                        </div>
                        <c:forEach items="${BOOKING}" var="book" >
                            <div class="row" id="book${book.getId()}">
                                <div class="cell">
                                    ${book.getDoctor().getDoctorproperties().getName()}
                                </div>
                                <div class="cell">
                                    ${book.getDoctor().getSpecialty()}
                                </div>
                                <div class="cell">
                                    ${book.getClient().getClientproperties().getName()}
                                </div>
                                <div class="cell">
                                    ${book.getPharmacy().getMedicine()}
                                </div>
                                <div class="cell">
                                    ${book.getDate()}
                                </div>

                                <div class="cell" >
                                    <button id="ac${book.getId()}" onclick="accept(${book.getId()})">Accept</button>
                                    <div class="pass" id="pass${book.getId()}">
                                        <input type="password" id="password${book.getId()}" placeholder="Password"/>
                                        <button onclick="medicine(${book.getId()},${book.getClient().getId()},'${book.getDate()}',${book.getDoctor().getId()})">Done</button>
                                        <div id="inv${book.getId()}"></div>
                                    </div>
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
        <script src="view/Hospital/Services/Admin/js/javascript.js"></script>
        <script src="view/Hospital/Services/Admin/js/Medicine.js"></script>
    </body>
</html>