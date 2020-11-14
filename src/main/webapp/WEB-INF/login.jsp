
<%--
  Created by IntelliJ IDEA.
  User: Cathrine
  Date: 06-11-2020
  Time: 00:58
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="text-center">
<textcentercatversion>Login</textcentercatversion>
</div>
<form name="login" action="${Login}" method="Post">
    <input class="form-control border-light rounded-0" type="hidden" name="target" value="login">

    <div class="form-group">
        <input type="text" name="email1" class="form-control tr2" id="email" aria-describedby="emailHelp" placeholder="Skriv e-mail her">
    </div>

    <div class="form-group">
        <input type="password" name="password1" class="form-control tr2" id="password" placeholder="Skriv kodeord her">
    </div>

    <div class="text-center">
        <button type="submit" class="btn btn-light mt-3">Login/Opret bruger</button>
    </div>
</form>

<%--<div class="input-group">
    <input  type="search"
           placeholder="Indtast din e-mail her" aria-label="mail"
           aria-describedby="button-addon2">
    <input class="form-control border-dark text-white rounded-0" type="search"
           placeholder="Indtast dit kodeord her" aria-label="password"
           aria-describedby="button-addon2">
    <input class="form-control border-dark text-white rounded-0" type="search"
           placeholder="Skriv fornavn her" aria-label="name"
           aria-describedby="button-addon2">
    <div class="input-group-append">
        <button class="btn btn-primary px-4" id="button-addon2" type="submit"><i
                class="fas fa-paper-plane"></i></button>
    </div>
</div>--%>

