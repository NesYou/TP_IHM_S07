<%--
  Created by IntelliJ IDEA.
  User: Younes
  Date: 25/09/2017
  Time: 09:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:useBean id="lesProfs" class="java.util.ArrayList" scope="request"/>
<html>
    <head>
        <title>Ajout d'une filière</title>
    </head>
    <body>

        <form>
            <p>Nom de la filière : <input name="libelleFiliere"></p>
            <p>
                <select name="idProf">
                    <c:forEach items="${lesProfs}" var="leProf">
                        <option value="${leProf.id}">${leProf.prenom}</option>
                    </c:forEach>
                </select>
            </p>
            <p><input type="hidden" name="action" value="confirmerFiliere"></p>
            <p><input type="submit" name="Valider"></p>
        </form>
    </body>
</html>