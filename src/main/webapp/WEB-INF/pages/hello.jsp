<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: liyang21
  Date: 2016/9/4
  Time: 1:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8"  language="java" %>
<html>
<head>
    <title>fuck</title>
</head>
<body>
<%
    out.println(new  java.util.Date());
%>
</br>
总数是：${listSize}

<c:forEach items="${listUser}" var="list">
   <h1>${list.name}</h1>
    <h1>${list.age}</h1>
</c:forEach>
</body>
</html>
