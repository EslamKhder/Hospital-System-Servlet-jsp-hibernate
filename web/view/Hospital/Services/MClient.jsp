<%-- 
    Document   : MClient
    Created on : Apr 26, 2020, 11:36:20 PM
    Author     : Eng Eslam khder
--%>

<%@page import="org.hibernate.SessionFactory"%>
<%@page import="Controller.ClientController"%>
<%@page import="Model.Client2"%>
<%@page import="Model.Client1"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Client Service</title>
        <link rel="stylesheet" href="MClient.css" type="text/css">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.2.0/css/all.css" integrity="sha384-hWVjflwFxL6sNzntih27bfxkr27PmbbK/iSvJ+a4+0owXq79v+lsFkW54bOGbiDQ" crossorigin="anonymous">
        <link href="https://fonts.googleapis.com/css?family=Overpass:200&display=swap" rel="stylesheet">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.2.0/css/all.css" integrity="sha384-hWVjflwFxL6sNzntih27bfxkr27PmbbK/iSvJ+a4+0owXq79v+lsFkW54bOGbiDQ" crossorigin="anonymous">
        <link rel="stylesheet" href="hover.css" type="text/css">
        <link rel="stylesheet" href="css/animate.css">
        <link rel="stylesheet" href="animate.min.css" type="text/css">
        <style>
            @import url('https://fonts.googleapis.com/css?family=Quicksand|Satisfy&display=swap');
            body > sec3 > h1 {
                font-family: satisfy,cursive;
            }
            .info{
                position: absolute;
                top: 80px;
                right: 9px;
                font-size: 46px;
                background-color: white;
                padding: 20px;
                border-radius: 24%;
                border: 1px solid;
                font-family: cursive;
                color: blueviolet;
            }
        </style>
        <meta charset="UTF-8">
    </head>
    <body>
        <nav>
            <div class="info">
                <jsp:scriptlet>
                    Client1 client1 = (Client1)session.getAttribute("client");
                    ClientController clientcontroller = new ClientController();
                    Client2 client2 = clientcontroller.getClient((SessionFactory)application.getAttribute("Connect"),client1);
                    session.setAttribute("clientproperty", client2);
                </jsp:scriptlet>
                <jsp:expression>
                    client2.getName()
                </jsp:expression>
            </div>
            <div class="div1">
                <ul>
                    <li><a href="roombook.jsp">Booking</a></li>
                    <li><a href="file:///D:/computer%20science/Web/The%20project/SFC.html">C.Account</a></li>
                    <li><a href="file:///D:/computer%20science/Web/The%20project/Pharmacy2.html">Pharmacy</a></li>    
                    <li><a href="file:///D:/computer%20science/Web/The%20project/complaints.html">Com&Eva</a></li>  
                    <li><a href="https://l.facebook.com/l.php?u=https%3A%2F%2Far.wikipedia.org%2Fwiki%2F%25D8%25A5%25D8%25B3%25D8%25B9%25D8%25A7%25D9%2581_%25D8%25A3%25D9%2588%25D9%2584%25D9%258A%3Ffbclid%3DIwAR3nvxdxiDBvUp9A1-W0GwxZDbDRNFefBbiyOSiqRMrj8lYg76iWI4zKTDI&h=AT33p_TPUtztgLxWyNt5eBpqNuB-QdZqLTtmCM_f1eGhSlxwL3k9N45mvdThH3Mp0_9WwWTmVU435ngPQQapyiKVa-mR6OltK9yizUYsRcxLzsGBdYpvnO0wwOxroTN9mPd8">First Aid</a></li>  
                    <li><a href="file:///D:/computer%20science/Web/The%20project/Reservation.html">Reservations</a></li>  
                </ul>
                <div class="image"></div>
                <div class="overlay"></div>
                <div class="home">
                    <h1>Patient Service</h1>    
                    <p class="p3">Your Servive Is Restful</p>
                    <li><a href="#" class="shop">ٍLOG OUT</a></li>
                    <li><a href="file:///D:/computer%20science/Web/The%20project/Fast.html" class="shop2">ٍFAST CALL</a></li>
                </div>
                <div>
                    <div class="clearfix"></div>
                </div>
            </div>
        </nav>
    </body>
</html>

