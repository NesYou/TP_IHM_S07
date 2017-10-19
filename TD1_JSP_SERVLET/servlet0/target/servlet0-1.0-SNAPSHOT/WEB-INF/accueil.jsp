<%--
  Created by IntelliJ IDEA.
  User: Younes
  Date: 21/09/2017
  Time: 11:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>L'université du futur</title>
    </head>
    <body>
        <h1>L'université du futur</h1>
        <h2>Gestion des professeurs</h2>
        <ul>
            <li><a href="/controleur?action=ajouterProf">Créer un professeur</a></li>
            <li><a href="/controleur?action=modifierProf">Modifier un professeur</a></li>
        </ul>
        <h2>Gestion des étudiants</h2>
        <ul>
            <li><a href="/controleur?action=ajouterEtudiant">Créer un étudiant</a></li>
        </ul>
        <h2>Gestion des formations</h2>
        <ul>
            <li><a href="/controleur?action=ajouterFiliere">Créer une formation</a></li>
        </ul>
    </body>
</html>
