<%--
  Created by IntelliJ IDEA.
  User: Younes
  Date: 25/09/2017
  Time: 09:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="anneeCreee" type="modele.Annee" scope="request"/>
<html>
    <head>
        <title>Confirmation création filière</title>
        <jsp:useBean id="anneeCreee" type="modele.Annee" scope="request"/>
    </head>
    <body>
        <p>La filière ${anneeCreee.libelle} a bien été crééé. Responsable : ${anneeCreee.responsable.prenom}.</p>
        <p><a href="/controleur?action=home">Retour</a></p>
    </body>
</html>