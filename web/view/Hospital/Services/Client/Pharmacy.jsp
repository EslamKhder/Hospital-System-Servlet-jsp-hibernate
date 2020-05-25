<%-- 
    Document   : ClientReservations
    Created on : May 17, 2020, 8:34:39 PM
    Author     : Eng Eslam khder
--%>

<%@page import="java.util.stream.Collectors"%>
<%@page import="java.util.stream.Collector"%>
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
    </style>
    <body>
        <div class="myname">${sessionScope.client.getClientproperties().getName()}</div>
        <jsp:useBean class="Model.Client" scope="session" id="client" />
        <%
            ClientController cc = new ClientController();
            List<Booking> booking = new ArrayList();
            SessionFactory sessionf = (SessionFactory) application.getAttribute("factory");
            booking = cc.allBooking(sessionf);
            if (booking != null) {
                booking = booking.parallelStream().filter(x -> x.getAcceptmedicine() == 1).collect(Collectors.toList());
                pageContext.setAttribute("BOOKING", booking);
            }

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
                            My Reservations
                        </p>
                    </div>
                    <div class="table">

                        <div class="row header">
                            <div class="cell">
                                Medicine Name
                            </div>
                            <div class="cell">
                                Doctor Name
                            </div>
                            <div class="cell">
                                SPECIALIZATION
                            </div>
                            <div class="cell">
                                Date
                            </div>
                        </div>
                        <c:forEach items="${BOOKING}" var="book" >
                            <div class="row" id="book${book.getDoctor().getId()}">
                                <div class="cell" data-title="Full Name">
                                    ${book.getPharmacy().getMedicine()}
                                </div>
                                <div class="cell" data-title="Address">
                                    ${book.getDoctor().getDoctorproperties().getName()}
                                </div>
                                <div class="cell" data-title="Address">
                                    ${book.getDoctor().getSpecialty()}
                                </div>
                                <div class="cell" data-title="Phone Number">
                                    ${book.getDate()}
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

    </body>
</html>