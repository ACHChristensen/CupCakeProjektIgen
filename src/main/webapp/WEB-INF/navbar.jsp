<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Cathrine
  Date: 06-11-2020
  Time: 01:19
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<header class="text-white">
        <nav class="navbar navbar-expand-lg navbar-dark position-absolut w-100">

            <div class="container"><a class="navbar-brand d-block d-lg-none" alt="..." href="home">
                <img src="img/cupcakeIconWhite.png" alt="..." width="60"></a>
                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav ml-auto">
                        <li class="nav-item"><a class="nav-link" href="${navbar.findUrl("Login")}">Login /</a></li>
                        <li class="nav-item"><a class="nav-link" href="${navbar.findUrl("Cupcakes")}">Cupcakes /</a> </li>
                        <li class="nav-item"><a class="nav-link" href="${navbar.findUrl("About")}">Om os /</a></li>

                    </ul>
                    <ul center class="navbar-nav d-none d-lg-block px-4">
                        <li class="nav-item m-0"><a class="navbar-brand m-0" href="${navbar.findUrl("Index")}"><img
                                src="img/cupcakeIconWhite.png"
                                width="80"></a></li>
                    </ul>
                    <ul class="navbar-nav mr-auto">
                        <li class="nav-item"><a class="nav-link" href="${navbar.findUrl("Contact")}"> Kontakt /</a></li>
                        <li class="nav-item"><a class="nav-link" href="${navbar.findUrl("Cart")}">Indkøbskurv ( ${sessionScope.quanitity} ) /</a></li>
                        <li class="nav-item"><a class="nav-link active" href="${navbar.findUrl("User")}">${sessionScope.name}
                        </a>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>
</header>
