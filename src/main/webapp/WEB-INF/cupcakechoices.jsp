
<%--
  Created by IntelliJ IDEA.
  User: Cathrine
  Date: 05-11-2020
  Time: 16:50
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="text-center">
    <textcentercatversion>
        <h1>Vælg topping og bund</h1>
            <h3>- samt ønskede antal cupcakes !</h3>
    </textcentercatversion>
</div>
<div style="color: black;">
    <form name="cupcakes" action="${CupcakeChoices}" method="Post">
        <input  type="hidden" name="target" value="cupcakes">
        <label class="mt-3" for="bot"> Vælg bund-smag:</label>
        <select class="form-control mt-3" name="bottom" id="bot">
            <c:forEach var="bottom1" items="${requestScope.bots}">
                <option value="${bottom1.flavor}">${bottom1.toString()}</option>
            </c:forEach>
        </select>

        <label class="mt-3" for="top"> Vælg topping-smag:</label>
        <select class="form-control mt-3" name="topping" id="top">
            <c:forEach var="topping1" items="${requestScope.tops}">
                <option value="${topping1.flavor}">${topping1.toString()}</option>
            </c:forEach>
        </select>

        <div class="form-group">
            <label for="quantity" class="mt-3" >Vælg antal af denne slags cupcake:</label>
            <input type="text" name="quantitycupcakes" class="form-control tr3" id="quantity" placeholder="Skriv antal">
        </div>

        <div class="text-center">
            <button type="submit" class="btn btn-light mt-3">Bekræft bestilling</button>
        </div>
    </form>
</div>
</div>
