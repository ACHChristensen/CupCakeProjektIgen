<%--
  Created by IntelliJ IDEA.
  User: Cahtrine
  Date: 05-11-2020
  Time: 12:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
<head>
    <!-- Required meta tags -->
    <meta http-equiv="Content-Type" charset="utf-8" content="text/html; charset=UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="despription" content>
    <meta name="viewport" content="width=device-width, initial-scale-1">
    <meta name="robots" content="all, follow">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
          integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    <link rel="stylesheet" href="vendor/bootstrap/css/bootstrap.min.css">

    <!-- Google fonts -->
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Poppins:300,400,700&amp;display=swap">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Playfair+Display:500i&amp;display=swap">
    <!-- Owl Carousel-->
    <link rel="stylesheet" href="vendor/owl.carousel2/assets/owl.carousel.min.css">
    <link rel="stylesheet" href="vendor/owl.carousel2/assets/owl.theme.default.min.css">
    <!-- theme stylesheet-->
    <link rel="stylesheet" href="css/style.default.css" id="theme-stylesheet">
    <!-- Custom stylesheet -->
    <link rel="stylesheet" type="text/css" href="css/custom.css">


    <!-- Font awesome -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

    <title>Olsker Cupcakes</title>
    <style>
        body {
            background-image: url("img/cupcakebackground.jpg");
            background-size: cover;
            height: max-content;
            background-repeat: no-repeat;
            text-align: center;
            font-family: Arial;
        }

header{
    align-content: center;
}

    </style>
</head>
<body>

<!--navbar-->
<header class="header">
    <nav class="navbar navbar-expand-lg navbar-dark position-absolute w-100">
        <div class="container"><a class="navbar-brand d-block d-lg-none" href="#home"><img src="img/cupcakeIconWhite.png"
                                                                                       alt="..." width="60"></a>
            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav ml-auto">
                    <li class="nav-item"><a class="nav-link" href="#login">Login /</a></li>
                    <li class="nav-item"><a class="nav-link" href="#cupcakes">Cupcakes /</a></li>
                    <li class="nav-item"><a class="nav-link" href="#about">Om os</a></li>

                </ul>
                <ul center class="navbar-nav d-none d-lg-block px-4">
                    <li class="nav-item m-0"><a class="navbar-brand m-0" href="#home"><img src="img/cupcakeIconWhite.png"
                                                                                       width="80"></a></li>
                </ul>
                <ul class="navbar-nav mr-auto">
                    <li class="nav-item"><a class="nav-link" href="#contact"> Kontakt /</a></li>
                    <li class="nav-item"><a class="nav-link" href="#cart">Indkøbskurv /</a></li>
                    <li class="nav-item"><a class="nav-link active" href="#user">
                        <span>${sessionScope.email}</span>
                    </a>
                    </li>
                </ul>
            </div>
        </div>
    </nav>
</header>
<!--TODO-->
<br>
<br>
<br>
<br>
<br>
<br>
<div>
    <textcentercat style align="justify">Velkommen til Olskers CupCakes! </textcentercat>
</div>



</body>
</html>
