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
        <title>Ajout d'un étudiant</title>
    </head>
    <body>
        <form>
            <p>Nom de l'étudiant : <input name="nomEtudiant"></p>
            <p>Prénom de l'étudiant : <input name="prenomEtudiant"></p>
            <p>Numéro étudiant : <input name="numeroEtudiant"></p>
            <p>Date de naissance : <input name="jj" size="2">/<input name="mm" size="2"><input name="aaaa" size="4"></p>
            <p><input type="hidden" name="action" value="confirmerEtudiant"></p>
            <p><input type="submit" name="Valider"></p>
        </form>
    </body>
</html>