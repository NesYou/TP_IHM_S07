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
        <title><s:text name="confirmationCreationFiliere.titre"/></title>
        <sb:head/>
    </head>
    <body>
        <h1><s:text name="confirmationCreationFiliere.titre"/></h1>
        <p>La filière <s:property value="anneeCreee.libelle"/>, sous la résponsabilité de <s:property value="anneeCreee.responsable.nom"/> <s:property value="anneeCreee.responsable.prenom"/> a bien été crééé.</p>
    </body>
</html>
