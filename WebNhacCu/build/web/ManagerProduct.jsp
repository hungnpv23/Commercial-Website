<%-- 
    Document   : HomePage_ad
    Created on : Jun 21, 2022, 5:19:08 PM
    Author     : DELL
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
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
                        <a style="background-color: gray;" href="#addProductModal" class="btn btn-success" data-toggle="modal"><i class="material-icons"></i> <span>Add New Product</span></a>
                    </div>
                    <div class="basket-labels">
                        <ul>
                            <li class="item item-heading">Item</li>
                            <li class="price">Price</li>
                            <li class="quantity">Quantity</li>
                        </ul>
                    </div>
                <c:forEach items="${productList}" var="o">
                    <div class="basket-product">
                        <div class="item">
                            <div class="product-image">
                                <img class="imgRe" src="${o.image}" alt="Product image" class="product-frame">
                            </div>
                            <div class="product-details">
                                <h1><strong>${o.name}</strong></h1>
                                <p><strong>${o.material}</strong></p>
                                <p>Product Code - ${o.pro_id}</p>
                            </div>
                        </div>
                        <div class="price">${o.price}</div>
                        <div class="quantity">
                            ${o.quantity}
                        </div>
                        <div class="remove">
                            <a href="LoadProduct?pid=${o.pro_id}">EDIT</a>
                            <a href="Delete?pid=${o.pro_id}">DELETE</a>
                        </div>
                    </div>
                </c:forEach>
            </div>
        </main>

        <!--add new product modal-->
        <div class="dialog overlay" id="addProductModal">
            <a href="#" class="overlay-close"></a>
            <div class="dialog-body">
                <form action="AddProduct" method="post" name="addproduct" onsubmit="return validateform()">
                    <div class="modal-header">
                        <h4 class="modal-title">Add Product</h4>
                        <a href="#" type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</a>
                    </div>
                    <div class="">
                        <div class="">
                            <label>Name</label>
                            <input name="namePro" type="text" class="form-control" required value="${name}">
                        </div>
                        <div class="modal-body-pad">
                            <label>Material</label>
                            <input name="materialPro" type="text" class="form-control" required value="${material}">
                        </div>
                        <div class="modal-body-pad">
                            <label>Price</label>
                            <input name="pricePro" type="text" class="form-control" required>
                            <p class="text-danger">${mess}</p>
                        </div>
                        <div class="modal-body-pad">
                            <label>Quantity</label>
                            <input name="quantityPro" type="text" class="form-control" required value="${quantity}">
                        </div>
                        <div class="modal-body-pad">
                            <label>Year of manufacture</label>
                            <input name="yearPro" type="text" class="form-control" required value="${year}">
                        </div>
                        <div class="modal-body-pad">
                            <label>Description</label>
                            <textarea name="descriptionPro" class="form-control" required value="${description}"></textarea>
                        </div>
                        <div class="modal-body-pad">
                            <label>Image</label>
                            <input name="imagePro" type="text" class="form-control" required value="${image}">
                        </div>
                        <div class="modal-body-pad">
                            <label>Category</label>
                            <select name="categoryPro" class="form-select" aria-label="Default select example">
                                <option value="1">Guitar</option>
                                <option value="2">Drum</option>
                                <option value="3">Flute</option>
                            </select>
                        </div>
                    </div>
                    <div class="modal-footer modal-footer-pad">
                        <input style="background-color: black;" type="submit" class="btn btn-success" value="Add">
                    </div>
                </form>
                <script>
                    function validateform() {
                        var pricePro = document.addproduct.pricePro;
                        var quantityPro = document.addproduct.quantityPro;
                        var yearPro = document.addproduct.yearPro;
                        var check = /^[+-]?\d+(\.\d+)?$/;
                        if (!pricePro.value.match(check) || !quantityPro.value.match(check) || !yearPro.value.match(check))
                        {
                            alert('Please enter number!!')
                            return false;
                        }
                    }
                </script>
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

        </script>
    </body>

</html>
