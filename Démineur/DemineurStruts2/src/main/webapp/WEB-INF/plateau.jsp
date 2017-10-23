<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Younes
  Date: 19/10/2017
  Time: 12:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Title</title>
    </head>
    <body>
        <p><s:property value="lePlateau"/></p>
        <p><s:a action="deconnexion"><s:text name="plateau.deconnexion"/></s:a></p>
    </body>
</html>
