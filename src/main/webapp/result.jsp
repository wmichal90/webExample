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

        <tr>
            <td>${Book.title}</td>
            <td>${Book.author}</td>
            <td>${Book.isbn}</td>
        </tr>


    </tbody>


</table>
</body>
</html>
