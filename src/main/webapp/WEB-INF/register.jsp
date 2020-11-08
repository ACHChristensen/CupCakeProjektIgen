<%--
  Created by IntelliJ IDEA.
  User: Bruger
  Date: 06-11-2020
  Time: 03:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<H2>Du er ikke oprettet i systemet - endnu!</h2>
<H3>Ønsker du at oprette dig, så udfyld nedenunder</H3>
<div class="form-group">
    <label for="firstname">Indtast dit fornavn:</label>
    <input type="text" name="firstname" class="form-control tr2" id="firstname" placeholder="Skriv fornavn her">
    <button type="submit" class="btn btn-light mt-3">Opret bruger</button>
</div>
<div class="text-center mt-3">
    <a class="btn btn-outline-light" href="/Login" role="button">Tilbage til login</a>
</div>
