<%-- 
    Document   : HomePage
    Created on : Jun 9, 2022, 7:12:35 PM
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
        <div class="header_section">
            <jsp:include page="Header.jsp"></jsp:include>
                <div class="banner_section ">
                    <div class="container-fluid ">
                        <section class="slide-wrapper ">
                            <div class="container-fluid " style="padding-top: 80px;">
                                <div id="myCarousel " class="carousel slide " data-ride="carousel ">
                                    <!-- Wrapper for slides -->
                                    <div class="carousel-inner ">
                                        <div class="carousel-item active ">
                                            <div class="row ">
                                                <div class="col-sm-2 padding_0 ">
                                                    <p class="mens_taital ">Musical instrument</p>
                                                </div>
                                                <div class="col-sm-5 ">
                                                    <div class="banner_taital ">
                                                        <h1 class="banner_text ">New Guitar</h1>
                                                        <h1 class="mens_text "><strong>${lastGuitar.name}</strong></h1>
                                                    <p class="lorem_text ">If you can't explain it simply, you don't understand it well enough.</p>
                                                    <button class="buy_bt "><a href="DetailControl?pid=${lastGuitar.pro_id}">View detail</a></button>
                                                </div>
                                            </div>
                                            <div class="col-sm-5 ">
                                                <div class="shoes_img "><img class="guitar_img " src="images/guitar_banner-removebg-preview.png"></div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </section>
                </div>
            </div>
        </div>
        <!-- header section end -->
        <!-- new collection section start -->
        <div style="background-color: #F5EEDC;" class="layout_padding collection_section ">
            <div class="container ">
                <div style="background-color: #ff4e5b;">
                    <h1 class="new_text "><strong>New Product</strong></h1>
                    <p class="consectetur_text ">Some of our new products this season</p>
                </div>
                <div class="collection_section_2 ">
                    <div class="row ">
                        <div class="col-md-6 ">
                            <div class="about-img ">
                                <button class="new_bt ">New</button>
                                <div class="shoes-img "><img class="guitar_img " src="${lastGuitar.image}"></div>
                                <p class="sport_text ">${lastGuitar.name}</p>

                                <div class="row center">
                                    <div class="col">
                                        <p class="btn btn-danger btn-block">${lastGuitar.price}$</p>
                                    </div>
                                    <div class="col addToCart_btn">
                                        <a href="DetailControl?pid=${lastGuitar.pro_id}" class="btn btn-success btn-block">View detail</a>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col-md-6 ">
                            <div class="about-img2 " style="margin-top: -1px;">
                                <div class="shoes-img2 "><img class="guitar_img " src="${lastDrum.image}"></div>
                                <p class="sport_text ">${lastDrum.name}</p>
                                <div class="row center">
                                    <div class="col">
                                        <p class="btn btn-danger btn-block">${lastDrum.price}$</p>
                                    </div>
                                    <div class="col addToCart_btn">
                                        <a href="DetailControl?pid=${lastDrum.pro_id}" class="btn btn-success btn-block">View detail</a>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div style="background-color: #ECB390;" class="collection_section ">
            <div class="container ">
                <h1 class="new_text "><strong>Electric Guitar</strong></h1>
                <p class="consectetur_text ">Introduce to you a new electric musical instrument</p>
            </div>
        </div>
        <div style="background-color: #ECB390;" class="collectipn_section_3 layuot_padding ">
            <div class="container ">
                <div class="racing_shoes ">
                    <div class="row ">
                        <div class="col-md-8 ">
                            <div class="shoes-img3 "><img src="${electricGuitar.image}"></div>
                        </div>
                        <div class="col-md-4 ">
                            <div class="sale_text "><strong>Sale <br><span style="color: #0a0506; ">Electric</span> <br>GUITAR</strong></div>
                            <div class="number_text "><strong>$ <span style="color: #0a0506 ">${electricGuitar.price}</span></strong></div>
                            <button class="seemore "><a href="DetailControl?pid=${electricGuitar.pro_id}">See more</a></button>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div style="background-color: #B3541E" class="collection_section layout_padding ">
            <div class="container ">
                <h1 class="new_text "><strong>New Coming</strong></h1>
                <p class="consectetur_text ">New instruments with new technologies will give you a better experience</p>
            </div>
        </div>
        <!-- new collection section end -->
        <!-- New Arrivals section start -->
        <div style="background-color: #B3541E;" class="layout_padding gallery_section ">
            <div class="container ">
                <div class="row ">
                    <div class="col-sm-4 ">
                        <div class="best_shoes ">
                            <p class="best_text ">${lastGuitar.name}</p>
                            <div class="shoes_icon "><img class="list_product " src="${lastGuitar.image}"></div>
                            <div class="star_text center">
                                <div class="left_part ">
                                    <p style="width: 70%;" class="btn btn-danger btn-block">${lastGuitar.price}$</p>
                                </div>
                                <div class="right_part addToCart_btn_listP">
                                    <a href="DetailControl?pid=${lastGuitar.pro_id}" class="btn btn-success btn-block">View detail</a>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-sm-4 ">
                        <div class="best_shoes ">
                            <p class="best_text ">${lastDrum.name}</p>
                            <div class="shoes_icon "><img class="list_product " src="${lastDrum.image}"></div>
                            <div class="star_text center">
                                <div class="left_part ">
                                    <p style="width: 70%;" class="btn btn-danger btn-block">${lastDrum.price}$</p>
                                </div>
                                <div class="right_part addToCart_btn_listP">
                                    <a href="DetailControl?pid=${lastDrum.pro_id}" class="btn btn-success btn-block">View detail</a>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-sm-4 ">
                        <div class="best_shoes ">
                            <p class="best_text ">${lastFlute.name}</p>
                            <div class="shoes_icon "><img class="list_product " src="${lastFlute.image}"></div>
                            <div class="star_text center">
                                <div class="left_part ">
                                    <p style="width: 70%;" class="btn btn-danger btn-block">${lastFlute.price}$</p>
                                </div>
                                <div class="right_part addToCart_btn_listP">
                                    <a href="DetailControl?pid=${lastFlute.pro_id}" class="btn btn-success btn-block">View detail</a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- New Arrivals section end -->
        <!-- section footer start -->
        <jsp:include page="Footer.jsp"></jsp:include>
        <!-- section footer end -->
        <!-- Javascript files-->
        <script src="js/jquery.min.js "></script>
        <script src="js/popper.min.js "></script>
        <script src="js/bootstrap.bundle.min.js "></script>
        <script src="js/jquery-3.0.0.min.js "></script>
        <script src="js/plugin.js "></script>
        <!-- sidebar -->
        <script src="js/jquery.mCustomScrollbar.concat.min.js "></script>
        <script src="js/custom.js "></script>
        <!-- javascript -->
        <script src="js/owl.carousel.js "></script>
        <script src="https:cdnjs.cloudflare.com/ajax/libs/fancybox/2.1.5/jquery.fancybox.min.js "></script>
        <script>
            $(document).ready(function () {
                $(".fancybox ").fancybox({
                    openEffect: "none ",
                    closeEffect: "none "
                });
            });


            $('#myCarousel').carousel({
                interval: false
            });

            //scroll slides on swipe for touch enabled devices

            $("#myCarousel ").on("touchstart ", function (event) {

                var yClick = event.originalEvent.touches[0].pageY;
                $(this).one("touchmove ", function (event) {

                    var yMove = event.originalEvent.touches[0].pageY;
                    if (Math.floor(yClick - yMove) > 1) {
                        $(".carousel ").carousel('next');
                    } else if (Math.floor(yClick - yMove) < -1) {
                        $(".carousel ").carousel('prev');
                    }
                });
                $(".carousel ").on("touchend ", function () {
                    $(this).off("touchmove ");
                });
            });

        </script>
    </body>

</html>