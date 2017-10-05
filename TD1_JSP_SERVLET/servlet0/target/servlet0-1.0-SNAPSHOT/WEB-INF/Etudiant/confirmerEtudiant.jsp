<%--
  Created by IntelliJ IDEA.
  User: Younes
  Date: 24/09/2017
  Time: 16:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Confirmation création étudiant</title>
        <!-- Recupere un etudianCree de type Etudiant qui est dans le scope request -->
        <jsp:useBean id="etudiantCree" class="modele.Etudiant" scope="request"></jsp:useBean>
    </head>
    <body>
        <p>Etudiant ${etudiantCree.numeroEtudiant} créé</p>
        <p><a href="/controleur?action=home">Retour</a></p>
    </body>
</html>