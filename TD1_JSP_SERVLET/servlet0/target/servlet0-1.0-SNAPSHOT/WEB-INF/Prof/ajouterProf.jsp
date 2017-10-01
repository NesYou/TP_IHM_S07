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
    <title>Ajouter un prof</title>
</head>
<body>
    <form>
        Nom prof : <input type="text">
        Prénom prof : <input type="text">
        Date de naissance : <input type="date">
        <input type="hidden" name="action" value="confirmerProf">
        <input type="submit" name="Valider">
    </form>
</body>
</html>
