<%--
  Created by IntelliJ IDEA.
  User: michalw_cl
  Date: 10.03.2024
  Time: 13:04
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/mvc14" method="GET">
    <label>
        Autor
        <input type="text" name="author" required/>
    </label>
    <label>
        Tytul
        <input type="text" name="title" required/>
    </label>
    <label>
        isbn
        <input type="number" name="isbn"/>
    </label>
    <input type="submit" name="Zatwierdz" value="Zatwierdz">
</form>

</body>
</html>
