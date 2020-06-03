<%-- 
    Document   : AllClientProfile
    Created on : May 30, 2020, 5:26:59 PM
    Author     : Eng Eslam khder
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.util.List"%>
<%@page import="Model.Client"%>
<%@page import="Controller.ClientController"%>
<%@page import="org.hibernate.SessionFactory"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            body
            {
                background-color: brown;

            }
            .prof
            {
                width: 150px;
                height: 80px;
                background-color: #c3a5a5;
                padding: 20px;
                margin: 24px 0px 0px 24px;
                border: 2px solid white;
            }
            .name
            {
                background-color: blue;
                padding: 10px;
                padding-left: 24px;
                color: white;
                border: 1px solid brown;
                font-size: 20px;
            }
            .show
            {
                padding: 5px;
                width: 150px;
                width: 139px;
                border: 1px solid #e0cdcd;
                font-size: 20px;
                background-color: brown;
            }
            a
            {
                text-decoration: none;
                color: white;
                padding-left: 12px;
            }

        </style>
    </head>
    <body>
        <%
            SessionFactory sessionfactory = (SessionFactory) application.getAttribute("factory");
            ClientController cc = new ClientController();
            List<Client> clients = cc.Clients(sessionfactory);
            pageContext.setAttribute("CLIENTS", clients);
        %>
        <c:forEach items="${CLIENTS}" var="client">
            <div class="prof">
                <div class="name">${client.getClientproperties().getName()}</div>
                <div class="show">
                    <a href="../../../../ClientProfile?id=${client.getId()}" >Show Profile</a>
                </div>
            </div>
        </c:forEach>
    </body>
</html>
