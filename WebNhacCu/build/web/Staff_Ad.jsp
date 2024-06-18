<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 
    Document   : Staff_ad
    Created on : Jun 21, 2022, 5:20:11 PM
    Author     : DELL
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 
    Document   : Staff_ad
    Created on : Jun 21, 2022, 5:20:11 PM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html lang="en">

    <head>
        <meta charset="utf-8">
        <meta http-equiv="x-ua-compatible" content="ie=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>HighShop</title>
        <link rel="stylesheet" href="/css/style2.css">
        <script src="/js/cart.js"></script>

        <!-- bootstrap css -->
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <!-- style css -->
        <link rel="stylesheet" href="css/style.css">
        <link rel="stylesheet" href="css/style2.css">
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
    </head>

    <body>

        <!--start header-->
        <div class="header_section header_main" style="height: 135px; width: 1519px;">
            <jsp:include page="Header.jsp"></jsp:include>
            </div>
            <!--start header-->
            <main>
                <!--start nav-->
                <div class="basket">
                    <div class="basket-module">
                        <h1 class="pos">High Shop Staff</h1>
                        <a style="background-color: gray;" href="addNewStaff.jsp" class="btn btn-success" data-toggle="modal"><i class="material-icons"></i> <span>Add New Staff</span></a>
                    </div>
                    <div class="basket-labels menu_staff">
                        <ul>
                            <li style="width: 53%; padding-left: 32px;" class="item item-heading">3x4</li>
                            <li style="width: 14%; margin-right: 30px;" class="price">Code</li>
                            <li class="mar_type_menu">Type</li>
                        </ul>
                    </div>
                <c:forEach var="o" items="${listS}">
                    <div class="basket-product">
                        <div class="item">
                            <div class="product-image">
                                <img class="imgRe" src="${o.image}" alt="Placholder Image 2" class="product-frame">
                            </div>
                            <div class="product-details">
                                <h1><strong><span class="item-quantity"></span>${o.name}</strong></h1>
                                <p><strong></strong></p>
                                <p>Year of birth - 2002</p>
                            </div>
                        </div>
                        <div class="price">${o.staff_id}</div>
                        <div>
                            <div class="mar_type">${o.status}</div>
                        </div>
                        <div class="remove">
                            <a href="LoadStaff?id=${o.staff_id}">EDIT</a>
                            <a href="RemoveStaff?id=${o.staff_id}">DELETE</a>
                        </div>
                    </div>
                </c:forEach>
            </div>
        </main>
        <jsp:include page="Footer.jsp"></jsp:include>
        <!-- bootstrap css -->
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <!-- style css -->
        <link rel="stylesheet" href="css/style.css">
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