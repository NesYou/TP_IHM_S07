<%--
  Created by IntelliJ IDEA.
  User: Younes
  Date: 21/09/2017
  Time: 12:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Confirmation création professeur</title>
        <jsp:useBean id="professeurCree" class="modele.Prof" scope="request"></jsp:useBean>
        <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
    </head>
    <body>
        <p>Le professeur ${professeurCree.nom}, d'identifiant ${professeurCree.id} né le <fmt:formatDate value="${professeurCree.dateDeNaissance}" pattern="dd/MM/yyyy"></fmt:formatDate> a été créé</p>
        <p><a href="/controleur?action=home">Retour</a></p>
    </body>
</html>