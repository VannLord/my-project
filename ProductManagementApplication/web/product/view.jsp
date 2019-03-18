<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 17-Mar-19
  Time: 2:19 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>View product</title>
</head>
<body>
<h1>Product details</h1>
<p>
    <a href="/products">Back to product list</a>
</p>
<table>
    <tr>
        <td>Type: </td>
        <td>${requestScope["product"].getType()}</td>
    </tr>
    <tr>
        <td>Brand: </td>
        <td>${requestScope["product"].getBrand()}</td>
    </tr>
    <tr>
        <td>Price: </td>
        <td>${requestScope["product"].getPrice()}</td>
    </tr>
</table>
</body>
</html>
