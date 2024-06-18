<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 
    Document   : Guitar
    Created on : Jun 9, 2022, 7:11:51 PM
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
        <!--[if lt IE 9]>
          <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
          <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script><![endif]-->
        <link rel="icon" type="image/x-icon" href="images/new4logo.jpg">
    </head>
    <!-- body -->

    <body class="main-layout">
        <!-- header section start -->
        <div class="header_section header_main">
            <jsp:include page="Header.jsp"></jsp:include>
            </div>
            <!-- New Arrivals section start -->
            <!--
            <div class="search">
                <form style="background-color: black;" action="search" method="post">
                    <input class="search_area" type="text" placeholder="   Search.." name="searchtxt">
                    <button style="margin-left: -53px; background-color: white;" type="submit"><i class="nav-angle-down ti-search"></i></i></button>
                    
                    <c:forEach items="${listC}" var = "o">
                        <a href="search?cid=${o.cid}">${o.cname}</a>
                        </c:forEach>
                    
            </form>
        </div> 
        -->
           
        <div class="layout_padding gallery_guitar_section search">
            <form style="margin: -30px 0px 22px 0px;" action="search" method="post">
                    <input class="search_area" type="text" placeholder="   Search.." name="searchtxt">
                    <button style="margin-left: -53px; background-color: white;" type="submit"><i class="nav-angle-down ti-search"></i></i></button>
                    <!--
                    <c:forEach items="${listC}" var = "o">
                        <a href="search?cid=${o.cid}">${o.cname}</a>
                        </c:forEach>
                    -->
            </form>
        </div>
           
        <div class="container">
            <div class="row">
                <h1 class="new_text mar_search_re"><strong>Search Results</strong></h1>
                <c:forEach var="p" items="${listPBN}">
                    <div class="col-sm-4">
                        <div class="best_shoes search_Product_re">
                            <p class="best_text">${p.name}</p>
                            <div class="shoes_icon"><img class="list_product" src="${p.image}"></div>
                            <div class="star_text center">
                                <div class="left_part ">
                                    <p style="width: 70%;" class="btn btn-danger btn-block">${p.price}$</p>
                                </div>
                                <div class="right_part addToCart_btn_listP">
                                    <a href="DetailControl?pid=${p.pro_id}" class="btn btn-success btn-block">View detail</a>
                                </div>
                            </div>
                        </div>
                    </div>
                </c:forEach>
            </div>   

        </div>
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