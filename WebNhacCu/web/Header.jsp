<%-- 
    Document   : Header
    Created on : Jul 1, 2022, 1:22:53 PM
    Author     : DELL
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="container" style="height: 12%; margin-right: 400px">
    <div class="row">
        <div class="col-sm-2">
            <div class="logo">
                <a href=" # "><img class="logo_header " src="images/new5logo.jpg "></a>
            </div>
        </div>
        <div class="col-sm-10 ">
            <nav class="navbar navbar-expand-lg navbar-light bg-light header_element">
                <button class="navbar-toggler " type="button " data-toggle="collapse " data-target="#navbarNavAltMarkup " aria-controls="navbarNavAltMarkup " aria-expanded="false " aria-label="Toggle navigation ">
                    <span class="navbar-toggler-icon "></span>
                </button>
                <div class="collapse navbar-collapse " id="navbarNavAltMarkup ">
                    <div class="navbar-nav ">
                        <a class="nav-item nav-link " href="HomeControl">Home</a>
                        <li id="nav" class="nav-item">
                                    <a href="" class="navProduct">
                                        Products
                                        <i class="nav-angle-down ti-angle-down"></i>
                                    </a>
                                    <ul class="subnav">
                                        <li><a class="" href="GuitarControl">Guitar</a></li>
                                        <li><a class="" href="DrumControl">Drum</a></li>
                                        <li><a class="" href="FluteControl">Bamboo flute</a></li>
                                    </ul>
                                </li>
                        <c:if test="${sessionScope.acc.isAdmin == 1}">
                            <a class="nav-item nav-link " href="ManagerProduct" style="width: 240px;">Manager Product</a>
                            <a class="nav-item nav-link" href="BillControl">Bill</a>
                            <a class="nav-item nav-link" href="staff">Staff</a>
                            <a class="nav-item nav-link last " href="CartControl"><img src="images/cart.jpg "></a>
                            <a class="nav-item nav-link last " href="LogoutControl"><img src="images/logout.png"></a>
                            </c:if>
                            <c:if test="${sessionScope.acc.isStaff == 1}">
                            <a class="nav-item nav-link last " href="CartControl"><img src="images/cart.jpg "></a>
                            <a class="nav-item nav-link last " href="LogoutControl"><img src="images/logout.png"></a>
                            </c:if>
                            <c:if test="${sessionScope.acc.isCus == 1}">
                            <a class="nav-item nav-link last " href="CartControl"><img src="images/cart.jpg "></a>
                            <a class="nav-item nav-link last" href="ProfileControl"><img src="images/icon_user.jpg"></a>
                            <a class="nav-item nav-link last " href="LogoutControl"><img src="images/logout.png"></a>
                            </c:if>
                            <c:if test="${sessionScope.acc != null}">
                            </c:if>
                            <c:if test="${sessionScope.acc == null}">
                            <a class="nav-item nav-link " href="LoginControl">Login</a>
                            <a class="nav-item nav-link last " href="LoginControl"><img src="images/cart.jpg "></a>
                            </c:if>
                            <a class="nav-item nav-link last " href="search"><img src="images/search_icon.png"></a>
                    </div>
                </div>
            </nav>
        </div>
    </div>
</div>