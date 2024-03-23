<%--
  Created by IntelliJ IDEA.
  User: michalw_cl
  Date: 10.03.2024
  Time: 12:22
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Liczby od ${param.start} do ${param.end}</title>

</head>
<body>

<c:forEach begin="${param.start}" end="${param.end}" var="liczba">
    ${liczba}
</c:forEach>
</body>
</html>
<%--od wykladowcy--%>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JSP 2</title>
</head>
<body>
    <c:forEach begin="${start}" end="${end}" var="idx">
        ${idx}
    </c:forEach>
</body>
</html>--%>