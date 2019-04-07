<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 07-Apr-19
  Time: 9:07 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student View</title>
</head>
<body>
<h1>Student View</h1>
<p>
    <a href="/list">Back to the list</a>
</p>
<form:form method="post" modelAttribute="student">
    <fieldset>
        <legend>Student Information</legend>
        <table>
            <tr>
                <td>Name : </td>
                <td>${student.name}</td>
            </tr>
            <tr>
                <td>Age : </td>
                <td>${student.age}</td>
            </tr>
            <tr>
                <td>Gender : </td>
                <td>${student.gender}</td>
            </tr>
            <tr>
                <td>Address : </td>
                <td>${student.address}</td>
            </tr>
            <tr>
                <td>Classroom : </td>
                <td>${student.classroom}</td>
            </tr>
        </table>
    </fieldset>
</form:form>
</body>
</html>
