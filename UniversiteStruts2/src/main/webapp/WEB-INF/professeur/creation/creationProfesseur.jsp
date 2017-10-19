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
        <title><s:text name="creationProfesseur.titre"/></title>
        <sb:head/>
    </head>
    <body>

        <h1><s:text name="creationProfesseur.titre"/></h1>


        <div class="content row">
            <div class="col-xs-3" style="padding-right: 5px;">
                <s:form action="creerProfesseur" theme="bootstrap" class="well form-vertical">
                    <s:textfield name="nomProfesseur" key="creationProfesseur.form.prenom"/>
                    <s:textfield name="prenomProfesseur" key="creationProfesseur.form.nom"/>
                    <s:textfield name="dateNaissanceProfesseur" key="creationProfesseur.form.date"/>
                    <s:submit class="btn btn-primary"/>
                </s:form>
            </div>
        </div>


    </body>
</html>
