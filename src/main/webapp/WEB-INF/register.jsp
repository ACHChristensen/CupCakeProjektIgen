<%--
  Created by IntelliJ IDEA.
  User: Bruger
  Date: 06-11-2020
  Time: 03:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<br>
<div class="text-center">
    <H2 style="color: white">Du er ikke oprettet i systemet - endnu!</h2>
    <H3 style="color:rgb(188,50,96)">Ønsker du at oprette dig, så udfyld nedenunder</H3>
</div>
<br>
<form name="Register" id="firstname" action="${Register}" method="Post">
    <input type="hidden" name="target" value="Register">
    <div class="form-group">
        <label for="firstname">Indtast dit navn:</label>
        <input type="text" name="firstname" class="form-control tr2" id="firstname1" placeholder="Skriv fornavn her">
        <div class="text-center mt-3">
            <button type="submit" class="btn btn-light mt-3">Opret bruger</button>
        </div>
    </div>
</form>
