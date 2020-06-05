<%-- 
    Document   : MainClient
    Created on : May 8, 2020, 9:30:21 AM
    Author     : Eng Eslam khder
--%>

<%@page import="Model.Client"%>
<%@page import="org.hibernate.SessionFactory"%>
<%@page import="Controller.ClientController"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <!--
    
        Client client = new Client();
        client.setId((int) session.getAttribute("id"));
        ClientController cc = new ClientController();
        SessionFactory sessionfactory = (SessionFactory) application.getAttribute("factory");
        session.setAttribute("client", cc.getClientData(client, sessionfactory));
    
    -->
    <head>
        <meta charset="utf-8" />
        <meta name="description" content="" />
        <!-- IE Compatibility Meta -->
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <!-- First Mobile Meta -->
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title></title>
        <link rel="stylesheet" href="css/bootstrap.css" type="text/css" />
        <link rel="stylesheet" href="css/rtl.css" type="text/css" />
        <link rel="stylesheet" href="css/style.css" type="text/css" />
        <link rel="stylesheet" href="css/all.min.css" type="text/css" />
        <!--[if lt IE 9] -->
        <script src="js/html5shiv.min.js"></script>
        <script src="js/respond.min.js"></script>
        <!--[endif]-->
    </head>
    <body>
        <div class="doller">${sessionScope.client.getBalance()} <i class="fas fa-dollar-sign"></i></div>
        <!-- Start NavBar -->
        <nav class="navbar navbar-inverse">
            <div class="container-fluid">

                <!-- Brand and toggle get grouped for better mobile display -->
                <div class="navbar-header">

                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand">Hospital</a>
                </div>
                <!-- Collect the nav links, forms, and other content for toggling -->
                <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">

                    <ul class="nav navbar-nav">
                        <li class="active"><a>${sessionScope.client.getClientproperties().getName()} <i class="fas fa-female"></i><span class="sr-only">(current)</span></a></li>
                    </ul>
                    <ul class="nav navbar-nav navbar-right">

                        <li class="call"><a href="../Profiles/ClientProfile.jsp">My Profile<i class="fas fa-user-friends"></i></a></li>
                        <li class="dropdown">
                            <a class="dropdown-toggle up" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Control Center <span class="caret "><i class="fab fa-windows hidden-xs"></i></span></a>
                            <ul class="dropdown-menu">
                                <li><a href="../../../AvailableDoctor"><i class="fas fa-user-plus"></i> &nbsp; Detection Reservation</a></li>
                                <li><a href="../../../ClientReservationsToday"><i class="fas fa-user-edit"></i> &nbsp; My Reservations(Today)</a></li>
                                <li><a href="../../../ShowPharmacy"><i class="fas fa-laptop-medical"></i> &nbsp; pharmacy</a></li>
                                <li><a href="../Services/DoctorAndClient/ClientBalance.jsp"><i class="fas fa-dollar-sign"></i> &nbsp; Balances</a></li>
                                <li role="separator" class="divider"></li>
                                <li><a href="../../../ClientReservations"><i class="fas fa-user-plus"></i> &nbsp; All Detection Reservation</a></li>

                            </ul>
                        </li>
                    </ul>
                </div>
                <!-- /.navbar-collapse -->
            </div>
            <!-- /.container-fluid -->
        </nav>
        <!-- End NavBar -->
        <!-- Start Carousel -->
        <div class="caro-life">
            <div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
                <!-- Indicators -->
                <ol class="carousel-indicators">
                    <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
                    <li data-target="#carousel-example-generic" data-slide-to="1"></li>
                    <li data-target="#carousel-example-generic" data-slide-to="2"></li>
                    <li data-target="#carousel-example-generic" data-slide-to="3"></li>
                    <li data-target="#carousel-example-generic" data-slide-to="4"></li>
                    <li data-target="#carousel-example-generic" data-slide-to="5"></li>
                </ol>

                <!-- Wrapper for slides -->
                <div class="carousel-inner" role="listbox">
                    <div class="item active">
                        <img src="img/appointment-bg.jpg" alt="Life Makers">
                    </div>

                    <div class="item">
                        <img src="img/blog-details.jpg" alt="Life Makers">

                    </div>

                    <div class="item">
                        <img src="img/blog_1.jpg" alt="Life Makers">

                    </div>

                    <div class="item">
                        <img src="img/blog_2.jpg" alt="Life Makers">

                    </div>

                    <div class="item">
                        <img src="img/blog_3.jpg" alt="Life Makers">
                    </div>

                    <div class="item">
                        <img src="img/blog_1.jpg" alt="Life Makers">
                    </div>

                </div>

                <!-- Controls -->
                <a class="left carousel-control" href="#carousel-example-generic" role="button" data-slide="prev">
                    <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
                    <span class="sr-only">Previous</span>
                </a>
                <a class="right carousel-control" href="#carousel-example-generic" role="button" data-slide="next">
                    <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
                    <span class="sr-only">Next</span>
                </a>
            </div>
        </div>
        <!-- End Carousel -->
        <script src="js/jquery.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/plugins.js"></script>
    </body>
</html>