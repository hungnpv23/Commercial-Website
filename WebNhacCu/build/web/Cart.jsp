<%-- 
    Document   : Cart
    Created on : Jun 21, 2022, 5:18:13 PM
    Author     : DELL
--%>


<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
        <style>
            form {
                width: 300px;
                margin: 0 auto;
                text-align: center;
                padding-top: 50px;
            }

            .value-button {
                display: inline-block;
                border: 1px solid #ddd;
                margin: 0px;
                width: 10px;
                text-align: center;
                border-radius: 10px;                
                vertical-align: middle;
                background: #eee;
                -webkit-touch-callout: none;
                -webkit-user-select: none;
                -khtml-user-select: none;
                -moz-user-select: none;
                -ms-user-select: none;
                user-select: none;
            }

            .value-button:hover {
                cursor: pointer;
            }

            form #decrease {
                margin-right: -4px;
                border-radius: 8px 0 0 8px;
            }

            form #increase {
                margin-left: -4px;
                border-radius: 0 8px 8px 0;
            }

            form #input-wrap {
                margin: 0px;
                padding: 0px;
            }

            input#number {
                text-align: center;
                border: none;
                margin: 0px;
                width: 40px;
            }

            input[type=number]::-webkit-inner-spin-button,
            input[type=number]::-webkit-outer-spin-button {
                -webkit-appearance: none;
                margin: 0;
            }




        </style>

    </head>

    <body>

        <!--start header-->
        <div class="header_section header_main">
            <jsp:include page="Header.jsp"></jsp:include>
            </div>
            <!--start header-->
            <main>
                <!--start nav-->
                <div class="basket">
                    <div class="basket-module">
                        <input placeholder="Enter a product code" id="promo-code" type="text" name="promo-code" maxlength="5" class="promo-code-field">
                        <button class="promo-code-cta">Apply</button>
                    </div>
                    <div class="basket-labels">
                        <ul>
                            <li class="item item-heading">Item</li>
                            <li class="price">Price</li>
                            <li class="quantity">Quantity</li>
                            <li class="">Subtotal</li>
                        </ul>
                    </div>

                <c:forEach items="${listP}" var="l">
                    <div class="basket-product">
                        <div class="item">
                            <div class="product-image">
                                <img class="imgRe" src="${l.image}" alt="Product image" class="product-frame">
                            </div>
                            <div class="product-details">
                                <h1><strong>${l.name}</strong></h1>
                                <p><strong>${l.material}</strong></p>
                                <p>Product Code - ${l.pro_id}</p>
                            </div>
                        </div>
                        <div class="price">${l.price}</div>

                        <div class="quantity">
                            <div class="value-button" id="increase" onclick="increaseValue()" value="Decrease Value">
                                <a href="Increase?id=${l.pro_id}">+</a>
                            </div>
                            <input type="number" id="number" value="${l.quantity}" />
                            <div style="margin-left: -65px;" class="value-button" id="decrease" onclick="decreaseValue()" value="Increase Value">
                                <a href="Decrease?id=${l.pro_id}">-</a>
                            </div>
                        </div>


                        <div class="">${l.quantity*l.price}</div>
                        <div class="remove">
                            <a href="RemoveCart?id=${l.pro_id}">REMOVE</a>
                        </div>
                    </div>
                </c:forEach>  
            </div>
            <aside>
                <div class="summary">
                    <div class="summary-total-items"><span class="total-items"></span> Items in your Bag</div>
                    <div class="summary-subtotal">
                        <div class="subtotal-title">Subtotal</div>
                        <div class="subtotal-value final-value" id="basket-subtotal"></div>
                        <div class="summary-promo hide">
                            <div class="promo-title">Promotion</div>
                            <div class="promo-value final-value" id="basket-promo"></div>
                        </div>
                    </div>
                    <div class="summary-total">
                        <div class="total-title">Total</div>
                        <p>${Total}</p>
                        <div class="total-value final-value" id="basket-total"></div>
                    </div>
                    <div class="summary-checkout">
                        <c:if test="${sessionScope.acc.isCus == 1}">
                            <a href="Pay?total=${Total}" class="checkout-cta">
                                Pay
                            </a>
                        </c:if>
                        <c:if test="${sessionScope.acc.isStaff == 1 || sessionScope.acc.isAdmin == 1}">
                            <a href="#PayForStaff" class="checkout-cta">
                                Pay
                            </a>
                        </c:if>
                    </div>
                </div>
            </aside>
        </main>

        <div class="dialog overlay" id="PayForStaff">
            <a href="#" class="overlay-close"></a>
            <div class="dialog-body">
                <form action="Pay?total=${Total}" method="post">
                    <div class="modal-header">
                        <h4 class="modal-title"></h4>
                        <a href="#" type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</a>
                    </div>
                    <div class="">
                        <div class="">
                            <label>Customer phone number</label>
                            <input name="phone" type="text" placeholder="Enter phone number" class="form-control" required>
                        </div>
                    </div>
                    <div class="modal-footer modal-footer-pad">
                        <input style="background-color: black;" type="submit" class="btn btn-success" value="Except">
                    </div>
                </form>
            </div>
        </div>

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


            function increaseValue() {
                var value = parseInt(document.getElementById('number').value, 10);
                value = isNaN(value) ? 0 : value;
                value++;
                document.getElementById('number').value = value;
            }

            function decreaseValue() {
                var value = parseInt(document.getElementById('number').value, 10);
                value = isNaN(value) ? 0 : value;
                value < 1 ? value = 1 : '';
                value--;
                document.getElementById('number').value = value;
            }
        </script>
    </body>
</html>