<%--
  Created by IntelliJ IDEA.
  User: Younes
  Date: 10/10/2017
  Time: 13:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:useBean id="lesProfs" class="java.util.ArrayList" scope="request"/>
<html>
    <head>
        <title>Modification d'un professeur</title>
    </head>
    <body>
        <h1>Modification d'un professeur</h1>
        <h2>Séléctionner le professeur à modifier</h2>
        <P>
        <ul>
            <c:forEach items="${lesProfs}" var="leProf">
            <li>${leProf.prenom} ${leProf.nom}</li>
            </c:forEach>
        </ul>
        </P>
    </body>
</html>
