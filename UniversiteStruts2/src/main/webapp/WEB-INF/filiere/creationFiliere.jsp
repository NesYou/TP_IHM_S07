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
        <title><s:text name="creationFiliere.titre"/></title>
    </head>
    <body>
        <h1><s:text name="creationFiliere.titre"/></h1>
        <div class="content row">
            <div class="col-xs-3" style="padding-right: 5px;">
                <s:form action="creerFiliere" theme="bootstrap" class="well form-vertical">
                    <s:textfield name="libelle" key="creationFiliere.libelleFiliere"/>
                    <s:select key="creationFiliere.selectResponsable" name="responsable" list="lesProfs" listKey="id" listValue="nom+' '+prenom"/>
                    <s:submit class="btn btn-primary"/>
                </s:form>
            </div>
        </div>
    </body>
</html>