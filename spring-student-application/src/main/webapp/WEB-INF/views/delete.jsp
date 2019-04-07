<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 06-Apr-19
  Time: 11:37 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Delete</title>
</head>
<body>
<h1>Delete Student</h1>
<p>
    <a href="/list">Back to the list</a>
</p>
<form:form action="delete" method="post" modelAttribute="student">
    <h3>Are you sure ?</h3>
    <fieldset>
        <legend>Student information</legend>
        <table>
            <tr>
                <form:hidden path="id"/>
            </tr>
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
            <tr>
                <td></td>
                <td><form:button>Delete</form:button> </td>
            </tr>
        </table>
    </fieldset>
</form:form>
</body>
</html>
