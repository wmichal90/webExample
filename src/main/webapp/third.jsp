<%--
  Created by IntelliJ IDEA.
  User: michalw_cl
  Date: 10.03.2024
  Time: 10:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%@ include file="header.jsp" %>

<h1>a = ${empty param.a ? "BRAK" :  param.a}</h1>
<h1>b = ${empty param.b ? "BRAK" :  param.b}</h1>
<%@ include file="footer.jsp" %>
</body>
</html>
