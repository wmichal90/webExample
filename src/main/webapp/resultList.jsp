<%--
  Created by IntelliJ IDEA.
  User: michalw_cl
  Date: 10.03.2024
  Time: 12:56
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Books</title>
</head>
<body>
<table>

    <thead>
    <tr>
        <td>
            Title
        </td>
        <td>
            Author
        </td>
        <td>
            ISBN
        </td>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${bookList}" var="book">
    <tr>
        <td>${book.title}</td>
        <td>${book.author}</td>
        <td>${book.isbn}</td>
    </tr>
    </c:forEach>


    </tbody>


</table>
<a href="/jsp4.jsp">Home</a>
</body>
</html>
