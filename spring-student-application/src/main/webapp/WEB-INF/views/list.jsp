<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 01-Apr-19
  Time: 7:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student List</title>
</head>
<body>
<h1>Students</h1>

<p>
    <a href="/create">Create new student</a>
</p>

<table border="1">
    <tr>
        <td>Name</td>
        <td>Age</td>
        <td>Address</td>
        <td>Gender</td>
        <td>Classroom</td>
        <td>Edit</td>
        <td>Delete</td>
    </tr>
    <c:forEach items='${students}' var="student">
        <tr>
            <td><a href="/view?id=${student.id}">${student.name}</a></td>
            <td>${student.age}</td>
            <td>${student.address}</td>
            <td>${student.gender}</td>
            <td>${student.classroom}</td>
            <td><a href="/edit?id=${student.id}">Edit</a> </td>
            <td><a href="/delete?id=${student.id}">Delete</a> </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
