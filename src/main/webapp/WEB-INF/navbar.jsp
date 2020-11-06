<%--
  Created by IntelliJ IDEA.
  User: Cathrine
  Date: 06-11-2020
  Time: 01:19
--%>
<header class="header">
        <nav class="navbar navbar-expand-lg navbar-dark position-absolute w-100">
            <div class="container"><a class="navbar-brand d-block d-lg-none" alt="..." href="home">
                <img src="img/cupcakeIconWhite.png" alt="..." width="60"></a>
                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav ml-auto">
                        <li class="nav-item"><a class="nav-link" href="Login">Login /</a></li>
                        <li class="nav-item"><a class="nav-link" href="Cupcakes">Cupcakes /</a></li>
                        <li class="nav-item"><a class="nav-link" href="About">Om os</a></li>

                    </ul>
                    <ul center class="navbar-nav d-none d-lg-block px-4">
                        <li class="nav-item m-0"><a class="navbar-brand m-0" href=""><img
                                src="img/cupcakeIconWhite.png"
                                width="80"></a></li>
                    </ul>
                    <ul class="navbar-nav mr-auto">
                        <li class="nav-item"><a class="nav-link" href="Contact"> Kontakt /</a></li>
                        <li class="nav-item"><a class="nav-link" href="Cart">Indkøbskurv /</a></li>
                        <li class="nav-item"><a class="nav-link active" href="User">${sessionScope.name}
                        </a>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>
</header>
