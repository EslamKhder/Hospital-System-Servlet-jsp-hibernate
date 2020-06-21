<%-- 
    Document   : CreateAccount
    Created on : Apr 16, 2020, 5:26:01 PM
    Author     : Eng Eslam khder
--%>

<%@page import="Controller.ClientController"%>
<%@page import="org.hibernate.SessionFactory"%>
<%@page import="Model.Client"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
        <title>Hospital</title>
        <!-- Bootstrap -->
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <!-- Flaticon -->
        <link href="css/flaticon.css" rel="stylesheet" type="text/css"/>
        <!-- Custom Style Sheet -->
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
        <!-- Custom myStyle Sheet -->
        <link href="css/mystyle.css" rel="stylesheet" type="text/css"/>
        <!-- font-awesome -->
        <link href="css/font-awesome.min.css" rel="stylesheet" type="text/css" media="all" />

    </head>
    <body id="page-top">
        <%
            Client client = new Client();
            Cookie[] cookies = request.getCookies();
            if (cookies != null) {
                for (int i = 0; i < cookies.length; i++) {
                    if (cookies[i].getName().equals("codeclient")) {
                        client.setCode(cookies[i].getValue());
                    }
                    if (cookies[i].getName().equals("passwordclient")) {
                        client.setPassword(cookies[i].getValue());
                    }
                }
                SessionFactory sessionf = (SessionFactory) getServletContext().getAttribute("factory");
                ClientController clientcontroller = new ClientController(sessionf);
                client = clientcontroller.IsExist(client);
                if (client != null) {
                    request.getSession().setAttribute("client", client);
                    response.sendRedirect("Mainclient.jsp");
                }
            }
        %>
        <!-- Loader icon -->
        <div class="se-pre-con"></div>
        <!-- Choose Us Section -->
        <section id="appointment" class="choose-form-inner">
            <div class="container">
                <div class="row">
                    <!-- Main Title -->
                    <div class="col-md-6 col-md-offset-3">
                        <div class="title-block">
                            <h3>Why Choose Us</h3>
                            <p>Our department & special service </p>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <!-- Appointment Form -->
                    <div class="col-sm-6 col-md-4">
                        <div id="form" class="form-area">  
                            <form>
                                <div class="form-padding">
                                    <h4>Create New Account </h4>
                                    <div class="form-group">
                                        <label>code :</label>
                                        <input type="text" class="form-control" id="code" placeholder="Code" >
                                    </div>
                                    <div id="Code"></div>
                                    <div class="form-group">
                                        <label>Password : </label>
                                        <input type="password" class="form-control" id="password" name="password" placeholder="Password">
                                    </div>
                                    <div id="Password"></div>
                                    <div class="form-group">
                                        <label>Name :</label>
                                        <input type="text" class="form-control" id="name" placeholder="Name" >
                                    </div>
                                    <div id="Name"></div>
                                    <div class="form-group">
                                        <label>Phone Number : </label>
                                        <input type="text" class="form-control" id="phone" placeholder="Phone Number" >
                                    </div>
                                    <div id="Phone"></div>
                                    <div class="form-group">
                                        <label>Address : </label>
                                        <input type="text" class="form-control" id="address" placeholder="Address" >
                                    </div>
                                    <div id="Address"></div>
                                    <div class="form-group">
                                        <label>Age :</label>
                                        <input type="text" class="form-control" id="age" placeholder="Age">
                                    </div>
                                    <div id="Age"></div>
                                    <div class="form-group">
                                        <label>Gender : </label><br>

                                        <input type="radio" id="male" name="gender" value="male" />
                                        <label for="male">Male</label><br>
                                        <input type="radio" id="female" name="gender" value="female">
                                        <label for="female">Female</label><br>
                                        <div id="Gender"></div>
                                    </div>
                                    <div id="Gender"></div>
                                </div>

                            </form>
                            <div class="form-footer">
                                <div class="checkbox">
                                    <div class="checkbox">
                                    </div>
                                </div>

                                <input type="submit" value="Done" class="btn thm-btn" onclick="newAccount()">
                            </div>
                        </div>
                    </div>
                    <!-- Doctor Image -->
                    <div class="col-md-4 hidden-sm">
                        <div class="doctor_img">
                            <img src="images/appointment.png" class="img-responsive" alt="">
                        </div>
                    </div>
                    <!-- Reason -->
                    <div class="col-sm-6 col-md-4">
                        <div class="choose">
                            <div class="choose-icon">
                                <i class="flaticon-telephone icon-color-3"></i>
                            </div>
                            <div class="choose-content">
                                <h4>Health Information</h4>
                                <p>Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC.</p>
                            </div>
                        </div>
                        <div class="choose">
                            <div class="choose-icon">
                                <i class="flaticon-microscope icon-color-6"></i>
                            </div>
                            <div class="choose-content">
                                <h4>Medical Education</h4>
                                <p>Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC.</p>
                            </div>
                        </div>
                        <div class="choose">
                            <div class="choose-icon">
                                <i class="flaticon-medical-2 icon-color-4 "></i>
                            </div>
                            <div class="choose-content">
                                <h4>Symptom Check</h4>
                                <p>Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC.</p>
                            </div>
                        </div>
                        <div class="choose">
                            <div class="choose-icon">
                                <i class="flaticon-people-1 icon-color-7"></i>
                            </div>
                            <div class="choose-content">
                                <h4>Qualified Doctors</h4>
                                <p>Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical.</p>
                            </div>
                        </div>
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
        </section>
        <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
        <script src="js/jquery.min.js" type="text/javascript"></script>
        <!-- Include all compiled plugins (below), or include individual files as needed -->
        <script src="js/bootstrap.min.js"></script>
        <!-- REVOLUTION JS FILES -->
        <script src="revolution/js/jquery.themepunch.revolution.min.js" type="text/javascript"></script>
        <!-- Custom Js -->
        <script src="js/custom.js" type="text/javascript"></script>
        <!-- Custom Js -->
        <script src="js/myscript.js" type="text/javascript"></script>
        <script src="js/client.js"></script>
    </body>
</html>