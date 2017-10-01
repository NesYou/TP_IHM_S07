<%--
  Created by IntelliJ IDEA.
  User: Younes
  Date: 24/09/2017
  Time: 16:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Title</title>
    </head>
    <body>
        <p>
        <form>
            Nom de l'étudiant : <input type="text">
            Prénom de l'étudiant : <input type="text">
            Date de naissance : <input type="date">
            <input type="hidden" name="action" value="confirmerEtudiant">
            <input type="submit" name="Valider">
        </form>
        </p>
    </body>
</html>
