<%-- 
    Document   : EditPassword
    Created on : May 18, 2020, 7:25:00 AM
    Author     : Eng Eslam khder
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--
Author: W3layouts
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->

<!DOCTYPE html>
<html lang="zxx">

<head>
    <title>Master Signin Form Flat Responsive Widget Template :: W3layouts</title>
    <!-- Meta tag Keywords -->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta charset="UTF-8" />
    <meta name="keywords"
        content="Master Signin Form Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
    <!-- //Meta tag Keywords -->
    <link rel="stylesheet" href="css/style.css" type="text/css" media="all" /><!-- Style-CSS -->
    <link href="css/font-awesome.css" rel="stylesheet">
    <link rel="stylesheet" href="css/style.css" type="text/css"/>
<!-- font-awesome-icons -->
</head>
<div class="myname">Dr: ${sessionScope.doctor.getDoctorproperties().getName()}</div>

    <section class="signin-form">
        <div class="overlay">
            <div class="wrapper">
                <div class="logo text-center top-bottom-gap">
                    <a class="brand-logo">Password</a>
                    <!-- if logo is image enable this
			<a class="brand-logo" href="#index.html">
			    <img src="image-path" alt="Your logo" title="Your logo" style="height:35px;" />
			</a> -->
                </div>
                <div class="form34">
                    
                    <form>
                        <div>
                            <p class="text-head">Old Password : </p>
                            <input type="password" id="opassword" class="input" placeholder="Your Password"/>
                        </div>
                        <div id="OPassword"></div>
                        <div>
                            <p class="text-head">New Password : </p>
                            <input type="password" id="npassword1" class="input" placeholder="Your Password"/>
                        </div>
                        <div id="NPassword1"></div>
                        <div>
                            <p class="text-head">Again New Password : </p>
                            <input type="password" id="npassword2" class="input" placeholder="Your Password"/>
                        </div>
                        <div id="NPassword2"></div>
                    </form>
                    <button class="signinbutton btn" onclick="Edit();">Done</button>
                </div>
            </div>
            <!-- copyright -->
		<div class="copyright text-center">
                <p>© 2019 Eslam Khder</p>
            </div>
            <!-- //copyright --> 
        </div>
    </section>
<script src="js/EditPassword.js"></script>


</html>
