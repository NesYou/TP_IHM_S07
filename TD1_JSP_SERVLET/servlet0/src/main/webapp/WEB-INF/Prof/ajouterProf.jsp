<%--
  Created by IntelliJ IDEA.
  User: Younes
  Date: 21/09/2017
  Time: 11:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Ajout d'un professeur</title>
    </head>
    <body>
        <form>
            <p>Nom du professeur : <input name="nomProfesseur"></p>
            <p>Prénom du professeur : <input name="prenomProfesseur"></p>
            <p>Date de naissance : <input name="jj" size="2">/<input name="mm" size="2">/<input name="aaaa" size="4"></p>
            <p><input type="hidden" name="action" value="confirmerProf"></p>
            <p><input type="submit" name="Valider"></p>
        </form>
    </body>
</html>
