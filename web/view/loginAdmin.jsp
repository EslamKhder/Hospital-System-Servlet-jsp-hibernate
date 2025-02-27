<%-- 
    Document   : Administrator
    Created on : Apr 16, 2020, 3:59:41 PM
    Author     : Eng Eslam khder
--%>

<%@page import="javax.swing.JOptionPane"%>
<%@page import="Controller.AdminController"%>
<%@page import="org.hibernate.SessionFactory"%>
<%@page import="Model.Admin"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!--
Author: W3layouts
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<!DOCTYPE html>
<html>
    <head>
        <title>Slide Login Form Flat Responsive Widget Template :: w3layouts</title>

        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="keywords" content="Slide Login Form template Responsive, Login form web template, Flat Pricing tables, Flat Drop downs Sign up Web Templates, Flat Web Templates, Login sign up Responsive web template, SmartPhone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />

        <script>
            addEventListener("load", function () {
                setTimeout(hideURLbar, 0);
            }, false);

            function hideURLbar() {
                window.scrollTo(0, 1);
            }
        </script>
        <!-- Custom Theme files -->
        <link href="css/stylelog.css" rel="stylesheet" type="text/css" media="all" />
        <link href="css/font-awesome.min.css" rel="stylesheet" type="text/css" media="all" />
        <link href="css/admin.css" rel="stylesheet" type="text/css" media="all" />
        <link href="css/mediaquey.css" rel="stylesheet" type="text/css" media="all" />
        <!-- //Custom Theme files -->

        <!-- web font -->
        <link href="//fonts.googleapis.com/css?family=Hind:300,400,500,600,700" rel="stylesheet">
        <!-- //web font -->
    </head>
    <body>
        <%
            Admin admin = new Admin();
            Cookie[] cookies = request.getCookies();
            if (cookies != null) {
                for (int i = 0; i < cookies.length; i++) {
                    if (cookies[i].getName().equals("codeadmin")) {
                        admin.setCode(cookies[i].getValue());
                    }
                    if (cookies[i].getName().equals("passwordadmin")) {
                        admin.setPassword(cookies[i].getValue());
                    }
                }
                SessionFactory sessionf = (SessionFactory) application.getAttribute("factory");
                AdminController admincontroller = new AdminController(sessionf);
                admin = admincontroller.IsExist(admin);
                if (admin != null) {
                    request.getSession().setAttribute("admin", admin);
                    response.sendRedirect("MainAdmin.jsp");
                }
            }
        %>
        <!-- main -->
        <div class="w3layouts-main">

            <div class="bg-layer">
                <a href="#" class="part_line">
                    <i class="fa fa-caret-right"></i> Contact Us
                </a>
                <a href="#" class="part_line">
                    <i class="fa fa-caret-right"></i> About Us
                </a>
                <h1>Hospital Mange</h1>
                <div class="header-main">
                    <div class="main-icon">
                        <span class="fa fa-eercast"></span>
                    </div>
                    <div class="header-left-bottom">

                        <form>
                            
                            <div class="icon1 one">
                                <span class="fa fa-user"></span>
                                <input type="text" placeholder="ID" id="code" class="inputid" required pattern="[0-9]{1,}" title="must include only number"/>
                            </div>
                            <div class="icon1">
                                <span class="fa fa-lock"></span>
                                <input type="password" id="password" placeholder="Password" required/>
                            </div>
                            <div id="inv"></div>
                            <!--
                                <div class="links">
                                        <p class="right"><a href="../new user/new user.html">Create New Account</a></p>
                                        <div class="clear"></div>
                                </div>
                            -->
                        </form>
                        <div class="bottom">
                            <button class="btn" onclick="login()">Log In</button>
                        </div>
                    </div>
                </div>
                <!-- facebook and Twitter -->
                <a href="#" class="fl_fb">
                    <span class="fbicon"><i class="fa fa-facebook"></i></span>
                </a>
                <a href="#" class="fl_tw">
                    <span class="twicon"><i class="fa fa-twitter"></i></span> 
                </a>
                <!-- copyright -->
                <div class="copyright">
                    <p>© 2020 Our Team</p>
                </div>
                <!-- //copyright --> 
            </div>
        </div>	
        <!-- //main -->
        <script src="js/ad.js"></script>
    </body>
</html>
