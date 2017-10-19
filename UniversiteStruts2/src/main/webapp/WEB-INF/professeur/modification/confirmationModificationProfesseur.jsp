<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sb" uri="/struts-bootstrap-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Younes
  Date: 12/10/2017
  Time: 10:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <sb:head/>
        <title>Confirmation modification d'un professeur</title>
    </head>
    <body>
        <h1>Modification d'un professeur</h1>
        <div class="content row">
            <div class="col-xs-3" style="padding-right: 5px;">
                <p>Nouveau professeur <s:property value="leProf.nom"/> <s:property value="leProf.prenom"/></p>
            </div>
        </div>
    </body>
</html>