<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 03-Apr-19
  Time: 7:07 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create new student</title>
</head>
<body>
<h1>Create new student</h1>
<p>
    <c:if test= '${message!= null}'>
        <span class="message">${message}</span>
    </c:if>
</p>
<p>
    <a href="/list">Back to the list</a>
</p>
<form:form action="create" method="post" modelAttribute="student">
    <fieldset>
        <legend>Student Information</legend>
        <table>
            <tr>
                <form:hidden path="id"/>
            </tr>
            <tr>
                <td><form:label path="name">Name</form:label> </td>
                <td><form:input path="name"/></td>
            </tr>
            <tr>
                <td><form:label path="address">Address</form:label></td>
                <td><form:input path="address"/></td>
            </tr>
            <tr>
                <td><form:label path="age">Age</form:label></td>
                <td><form:input path="age"/></td>
            </tr>
            <tr>
                <td><form:label path="gender">Gender</form:label></td>
                <td><form:input path="gender"/></td>
            </tr>
            <tr>
                <td><form:label path="classroom">Classroom</form:label></td>
                <td><form:input path="classroom"/></td>
            </tr>
            <tr>
                <td></td>
                <td><form:button>Create</form:button></td>
            </tr>
        </table>
    </fieldset>
</form:form>
</body>
</html>
