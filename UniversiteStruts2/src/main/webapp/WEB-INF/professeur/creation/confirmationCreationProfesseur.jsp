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
        <title><s:text name="confirmationProfesseur.titre"/></title>
        <sb:head/>
    </head>
    <body>
        <h1><s:text name="confirmationProfesseur.titre"/></h1>
        <!-- NOM Prenom - jj/mm/aaa, a bien été créé-->
        <p><s:property value="leProf.nom"/> <s:property value="leProf.prenom"/> <s:text name="application.hyphen"/> <s:date name="leProf.dateDeNaissance" format="dd/MM/yyyy"/><s:text name="application.comma"/> <s:text name="application.confirmationCreation"/></p>
        <p><s:a action="index"><s:text name="application.back"/></s:a></p>
    </body>
</html>
