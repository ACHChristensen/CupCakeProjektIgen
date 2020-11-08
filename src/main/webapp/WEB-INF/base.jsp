<%--
  Created by IntelliJ IDEA.
  User: Cahtrine
  Date: 05-11-2020
  Time: 12:03

--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
<head>
    <!--Emojies and special characters-->
    <meta charset=“UTF-8”>
    <!-- Required meta tags -->
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="despription" content>
    <meta name="viewport" content="width=device-width, initial-scale-1">
    <meta name="robots" content="all, follow">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
          integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">

    <!-- Google fonts -->
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Poppins:300,400,700&amp;display=swap">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Playfair+Display:500i&amp;display=swap">
    <!-- theme stylesheet-->
    <link rel="stylesheet" type="text/css" href="<c:url value="/css/style.pink.css"/>" id="theme-stylesheet">
    <!-- Custom stylesheet -->
    <link rel="stylesheet" type="text/css" href="<c:url value="/css/custom.css"/>"/>

    <link rel="icon" href="img/cupcakeIconWhite.png">

    <title>${requestScope.title}</title>
</head>
<body data-new-gr-c-s-check-loaded="14.983.0" ;>
<!--navbar-->
    <jsp:include page="navbar.jsp" flush="true"/>

<main role="main" class="container">

    <jsp:include page="${requestScope.content}" flush="true"/>

        <div class="container ">

        </div>
</main>
    <footer class="footer">
        <div class="container">
            <br>
            <div class="row">
                <div class="col-sm">
                    <div class="col-md-3">
                    <img class="imginfooter" class="mb-3" src="<c:url value="img/img.png"/>" alt="..." width="300%">
                    </div>
                </div>
                <div class="col-sm">
                    <div class="text-white" >
                        <h5 class="mb-4 mt-3">Åbningstider</h5>
                        <ul class="list-unstyled">
                            <li class="mb-2">
                                <h6 class="mb-1"><a class="reset-anchor text-primary">Mandag til
                                    fredag</a></h6>
                                <p class=" text-small text-fancy mb-0">Kl. 08:00 - 17.00</p>
                            </li>
                            <li class="mb-2">
                                <h6 class="mb-1"><a class="reset-anchor text-primary">Lørdage</a></h6>
                                <p class=" text-small text-fancy mb-0">Kl. 10:00 - 14:00</p>
                            </li>
                            <li class="mb-3">
                                <h6 class="mb-1"><a class="reset-anchor text-primary">Søndage og helligdage</a></h6>
                                <p class=" text-small text-fancy mb-0">Lukket</p>
                            </li>
                        </ul>
                    </div>>
                    </div>
                <div class="col-sm">

                <div class="text-white" class="col-md-4 col-sm-12">
                    <h5 class="mb-4 mt-3">Her arbejder vi</h5>
                    <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d2274.5425057619486!2d14.
                    797397500793512!3d55.243725620213134!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x465506448b
                    7ef1a7%3A0xb86e6427419df897!2sOlsker%20(Bornholm)!5e0!3m2!1sda!2sdk!4v1604616600124!5m2!1sda!2sdk"
                            width="350vw" height="50%" frameborder="0" style="border:0;" allowfullscreen="true"
                            aria-hidden=
                                    "false" tabindex="0"></iframe>
                    <h7 class="text-white"> Denne hjemmeside er version ${sessionScope.version}.00</h7>
                </div>
            </div>
        </div>
            </div>
        </div>
    </footer>

</body>
</html>

<!-- sweet pink color: rgb(219,115,149)-->