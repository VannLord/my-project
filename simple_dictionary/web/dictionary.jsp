<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 07-Mar-19
  Time: 10:05 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Simple Dictionary</title>
</head>
<body>
<%!
    Map<String, String> dic = new HashMap<>();
%>

<%
    dic.put("Hello", "Xin chào");
    dic.put("Dung", "Phân thú");
    dic.put("Son","Con trai cưng của mẹ");
    dic.put("Vane","Cánh quạt");
    dic.put("Sang","Hát (V2)");

    String search = request.getParameter("search");

    String result = dic.get(search);
    if(result != null){
        out.println("Word: \t         "+search);
        out.println("\t          Result: "+result);
    }else{
        out.println("Not Found!!");
    }
%>
</body>
</html>
