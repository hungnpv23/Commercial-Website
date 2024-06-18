<%-- 
    Document   : Profile
    Created on : Jul 8, 2022, 3:01:33 PM
    Author     : DELL
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
            <jsp:include page="Header.jsp"></jsp:include>
        </div>
        <!--End header-->
        <!-- New Arrivals section start -->
        <form action="EditProfile" method="post" style="background-color: #BFFAE1;">
            <div class="modal-header">
                <h4 class="modal-title font_header">Profile</h4>
                <p class="text-success">${mess}</p>
                <a href="HomeControl" type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</a>
            </div>
            <div class="dialog-body_4">
                <div>
                    <td><input type="hidden" id ="id" name="id" value="${profile.cus_id}"size="50" autofocus></td>
                </div>
                <div class="edit_name_pad">
                    <label>Name</label>
                    <input value="${profile.fullname}" name="fullname" type="text" class="form-control" required>
                </div>
                <div class="modal-body-pad">
                    <label>Phone Number</label>
                    <input value="${profile.phoneNum}" name="phone" type="text" class="form-control" required>
                </div>
                <div class="modal-body-pad">
                    <label>Address</label>
                    <input value="${profile.address}" name="address" type="text" class="form-control" required>
                </div>
                <div class="modal-body-pad">
                    <label>Type</label>
                    <input value="${profile.cus_type}" name="cus_type" type="text" class="form-control" readonly>
                </div>
                <div class="modal-body-pad">
                    <label>Accumulated points</label>
                    <input value="${profile.accumlated_points}" name="accumlated_points" class="form-control" readonly></input>
                </div>
            </div>
            <div class="modal-footer modal-footer-pad">
                <input type="submit" class="btn btn-success edit_btn" value="Edit">
            </div>
        </form>
        <!-- New Arrivals section end -->
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