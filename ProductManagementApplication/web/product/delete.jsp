<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 17-Mar-19
  Time: 11:56 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Deleting product</title>
</head>
<body>
<h1>Delete product</h1>
<p>
    <a href="/products">Back to product list</a>
</p>
<form method="post">
    <h3>Are u sure?</h3>
    <fieldset>
        <legend>Product information</legend>
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
            <tr>
                <td><input type="submit" value="Delete product"></td>
                <td><a href="/products">Back to product list</a> </td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>
