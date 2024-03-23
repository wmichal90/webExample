<%--
  Created by IntelliJ IDEA.
  User: michalw_cl
  Date: 10.03.2024
  Time: 09:58
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>


<body>
<%@ include file="header.jsp" %>
<c:out value="<b> bold text </b>" escapeXml="false"/>
<%@ include file="footer.jsp" %>
</body>


</html>
