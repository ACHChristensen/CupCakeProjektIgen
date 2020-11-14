<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Cathrine
  Date: 06-11-2020
  Time: 08:34
  --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="text-center" style="color: white">
    <h1> Dette er, hvad du har tilføjet til kurven: </h1>
</div>

<form name="cart" action="${ShoppingCart}" method="Post">
    <table width="100%" style="color: white; text-align: center; font-size: x-large">
        <tr>
            <th>Cupcakes</th>
            <th></th>
            >
            <th>Antal</th>
            <th>Pris</th>
        </tr>


        <c:forEach var="orderline" items="${sessionScope.order}">
            <tr >
                <td> ${orderline.cupCake.toString()}</td>
                <td> x </td>
                <td>${orderline.quanitity}</td>
                <td>${orderline.price}kr.</td>
            </tr>
            <tr>
                <td> <br></td>
            </tr>
        </c:forEach>
    </table>
    <br>
    <div class="text-center">
        <h3 style="color: white">Samlet pris: ${sessionScope.orderinchart.priceTotal} kr.</h3>
        <br>
        <button type="submit" class="btn btn-light mt-3"> Bestil her!</button>
    </div>

</form>