<%-- 
    Document   : Register
    Created on : Jun 21, 2022, 5:19:53 PM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <!-- basic -->
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <!-- mobile metas -->
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="viewport" content="initial-scale=1, maximum-scale=1">
        <!-- site metas -->
        <title>High shop</title>
        <meta name="keywords" content="">
        <meta name="description" content="">
        <meta name="author" content="">
        <!-- bootstrap css -->
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <!-- style css -->
        <link rel="stylesheet" href="css/style.css">
        <link rel="stylesheet" href="font/themify-icons/themify-icons.css">
        <!-- Responsive-->
        <link rel="stylesheet" href="css/responsive.css">
        <!-- fevicon -->
        <link rel="icon" href="images/fevicon.png" type="image/gif" />
        <!-- Scrollbar Custom CSS -->
        <link rel="stylesheet" href="css/jquery.mCustomScrollbar.min.css">
        <!-- Tweaks for older IEs-->
        <link rel="stylesheet" href="https://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css">
        <!-- owl stylesheets -->
        <link rel="stylesheet" href="css/owl.carousel.min.css">
        <link rel="stylesheet" href="css/owl.theme.default.min.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/fancybox/2.1.5/jquery.fancybox.min.css" media="screen">
        <link rel="icon" type="image/x-icon" href="images/new4logo.jpg">
        <!--[if lt IE 9]>
          <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
          <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script><![endif]-->
    </head>
    <!-- body -->

    <body class="main-layout">
        <!-- header section start -->
        <div class="header_section header_main">
            <div class="container">
                <div class="row">
                    <div class="col-sm-3">
                        <div class="logo">
                            <a href="#"><img class="logo_header" src="images/new4logo.jpg"></a>
                        </div>
                    </div>
                    <div class="col-sm-9">
                        <nav class="navbar navbar-expand-lg navbar-light bg-light">
                            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
                                <span class="navbar-toggler-icon"></span>
                            </button>
                            <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
                                <div class="navbar-nav">
                                    <a class="nav-item nav-link " href="HomeControl">Home</a>
                                    <a class="nav-item nav-link " href="GuitarControl ">Guitar</a>
                                    <a class="nav-item nav-link " href="DrumControl">Drum</a>
                                    <a class="nav-item nav-link " href="FluteControl" style="width: 205px;">Bamboo flute</a>
                                    <a class="nav-item nav-link " href="LoginControl">Login</a>
                                    <a class="nav-item nav-link last" href="CartControl"><img src="images/shop_icon.png"></a>
                                </div>
                            </div>
                        </nav>
                    </div>
                </div>
            </div>
        </div>
        <div class="contact_text">Register</div>
        <!-- contact section start -->

        <div class="layout_padding contact_section">
            <div class="container">
                <h1 class="new_text"><strong>Create new Account</strong></h1>
            </div>
            <div class="container-fluid ram">
                <div class="row">
                    <div class="col-md-6">
                        <div class="email_box">
                            <div class="input_main">
                                <div class="container">
                                    <form action="register" method="post">
                                        <div class="form-group">
                                            <h6 style="color: white;">Personal Information</h6>
                                            <input type="text" class="email-bt" placeholder="Enter fullname" name="fullname" value="${fullname}">
                                        </div>
                                        <div class="form-group">
                                            <input type="text" class="email-bt" placeholder="Enter phonenumber" name="phoneNum" value="${phoneNum}">
                                        </div>
                                        <div class="form-group">
                                            <input type="text" class="email-bt" placeholder="Enter Adress" name="address" value="${address}">
                                        </div>
                                        <div class="form-group">
                                            <h6 style="color: white;">Account Information</h6>
                                            <input type="text" class="email-bt" placeholder="Enter username" name="user">
                                        </div>
                                        <div class="form-group">
                                            <input type="password" class="email-bt" placeholder="Enter password" name="pass">
                                        </div>
                                        <div class="form-group">
                                            <input type="password" class="email-bt" placeholder="Confirm password" name="repass">
                                        </div>
                                        <p class="text-danger">${mess}</p>
                                        <div class="form-check">
                                            <input style="padding-left: 30px;" class="form-check-input" type="checkbox" value="" id="form1Example3" checked />
                                            <label style="color: whitesmoke; font-size: 18px;" class="form-check-label" for="form1Example3"> Remember me </label>
                                            <a style="color: whitesmoke; font-size: 18px; padding-left: 250px;" href="#"></a>
                                        </div>
                                        <div class="send_btn">
                                            <button class="main_bt">Register</button>
                                        </div>
                                    </form>
                                </div>
                                <div>
                                    <p style="color: whitesmoke; font-size: 18px; padding-left: 100px;">
                                        <a href="#!" style="color: whitesmoke; font-size: 18px;" class="link-info"></a>
                                    </p>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <div class="shop_banner">
                            <div class="our_shop">
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- contact section end -->
        <!-- section footer start -->
        <jsp:include page="Footer.jsp"></jsp:include>
        <!-- section footer end -->


        <!-- Javascript files-->
        <script src="js/jquery.min.js"></script>
        <script src="js/popper.min.js"></script>
        <script src="js/bootstrap.bundle.min.js"></script>
        <script src="js/jquery-3.0.0.min.js"></script>
        <script src="js/plugin.js"></script>
        <!-- sidebar -->
        <script src="js/jquery.mCustomScrollbar.concat.min.js"></script>
        <script src="js/custom.js"></script>
        <!-- javascript -->
        <script src="js/owl.carousel.js"></script>
        <script src="https:cdnjs.cloudflare.com/ajax/libs/fancybox/2.1.5/jquery.fancybox.min.js"></script>
        <script>
            $(document).ready(function () {
                $(".fancybox").fancybox({
                    openEffect: "none",
                    closeEffect: "none"
                });
            });


            $('#myCarousel').carousel({
                interval: false
            });

            //scroll slides on swipe for touch enabled devices

            $("#myCarousel").on("touchstart", function (event) {

                var yClick = event.originalEvent.touches[0].pageY;
                $(this).one("touchmove", function (event) {

                    var yMove = event.originalEvent.touches[0].pageY;
                    if (Math.floor(yClick - yMove) > 1) {
                        $(".carousel").carousel('next');
                    } else if (Math.floor(yClick - yMove) < -1) {
                        $(".carousel").carousel('prev');
                    }
                });
                $(".carousel").on("touchend", function () {
                    $(this).off("touchmove");
                });
            });
        </script>
    </body>

</html>
