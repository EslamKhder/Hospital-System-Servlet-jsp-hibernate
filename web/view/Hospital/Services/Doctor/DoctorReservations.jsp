<%-- 
    Document   : DoctorReservations
    Created on : May 18, 2020, 2:10:33 AM
    Author     : Eng Eslam khder
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="javax.swing.JOptionPane"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Controller.DoctorController"%>
<%@page import="java.util.List"%>
<%@page import="java.util.List"%>
<%@page import="org.hibernate.SessionFactory"%>
<%@page import="Model.Booking"%>
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
        <div class="myname">${sessionScope.doctor.getDoctorproperties().getName()}</div>
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
                </div>
                <jsp:useBean class="Model.Doctor" scope="session" id="doctor" />
                <%
                    DoctorController dc = new DoctorController();
                    List<Booking> booking = new ArrayList();
                    SessionFactory sessionf = (SessionFactory) application.getAttribute("factory");
                    booking = dc.myBooking(sessionf, doctor);
                    pageContext.setAttribute("BOOKING", booking);
                %>
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
                        <div class="cell">
                            Cancel Reservation
                        </div>
                        <div class="cell">
                            Accept
                        </div>
                    </div>
                    <c:forEach items="${BOOKING}" var="book" >
                        <div class="row">
                            <div class="cell" data-title="Full Name">
                                ${book.getClient().getClientproperties().getName()}
                            </div>
                            <div class="cell" data-title="Specialization">
                                ${book.getClient().getClientproperties().getAge()}
                            </div>
                            <div class="cell" data-title="Salary">
                                ${book.getClient().getClientproperties().getAddress()}
                            </div>
                            <div class="cell" data-title="Address">
                                ${book.getClient().getClientproperties().getPhone()}
                            </div>
                            <div class="cell">
                                <button>Cancel</button>
                            </div>
                            <div class="cell">
                                <button>Accept</button>
                            </div>
                        </div>
                    </c:forEach>

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