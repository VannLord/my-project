<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 27-Mar-19
  Time: 8:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Currency Converter</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
  </head>
  <body>
  <h2>Currency Converter</h2>
  <form action="/result" method="get">
    <label> USD: </label><br/>
    <input type="text" name="USD" placeholder="USD"/><br/>
    <input type="submit" id="submit" value="Convert">
  </form>
  </body>
</html>
