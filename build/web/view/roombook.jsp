<%-- 
    Document   : roombook
    Created on : Apr 27, 2020, 11:50:48 PM
    Author     : Eng Eslam khder
--%>

<%@page import="javax.swing.JOptionPane"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.util.List"%>
<%@page import="Model.Doctor"%>
<%@page import="Controller.DoctorController"%>
<%@page import="org.hibernate.SessionFactory"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Checkup</title>
        <link rel="stylesheet" href="view/css/roombook.css" type="text/css">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.4.1/css/all.css" integrity="sha384-5sAR7xN1Nv6T6+dT2mhtzEpVJvfS3NScPQTrOxhwjIuvcA67KV2R5Jz6kr4abQsz" crossorigin="anonymous">
        <link href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700" rel="stylesheet">
        <style>
            .bu
            {
                background-color: green;
                color: white;
            }
            .bu a
            {
                color: white;
                text-decoration: none;
            }
            .cars
            {
                width: 279px;
                height: 36px;
                font-family: monospace;
                font-size: 23px;
                margin-bottom: 5px;
            }
            .sub
            {
                position: relative;
                top: 148px;
                left: -404px;
            }
            .left-part, form {
                width: 395%;
            }
            .b1 {
                position: absolute;
                right: 185px;
                top: 264px;
                width: 15%;
            }
            .b2
            {
                position: absolute;
                right: 185px;
                top: 322px;
                width: 15%;
            }
            #inv
            {
                position: absolute;
                top: 400px;
                right: 426px;
                color: white;
                font-size: 20px;
                font-family: cursive;
            }
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
        <div class="main-block">
            <div class="left-part">
                <i class="fas fa-ambulance"></i>
                <i class="fas fa-syringe"></i>
                <i class="fas fa-stethoscope"></i>
            </div>
            <form>
                <h1>CHECKUP</h1>
                <div class="info">
                    <select id="spec" class="cars">
                        
                        <c:forEach items="${DO}" var="doctor">
                            <option value="${doctor.getSpecialty()}">${doctor.getSpecialty()}</option>
                        </c:forEach>
                        
                    </select>
                </div>
            </form>
            
            <div id="inv"></div>
            <button class="sub" onclick="Booking();">SUBMIT</button>

            <div class="bu">
                <button class="b1"><a href="view/MainClient.jsp">GO TO MAIN PAGE</a></button>
                <button class="b2">LOG OUT</button>
            </div>
        </div>
        <script src="view/js/Booking.js"></script>
    </body>
</html>