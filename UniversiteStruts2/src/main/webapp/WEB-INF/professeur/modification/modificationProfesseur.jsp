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
        <title>Modification d'un professeur</title>
    </head>
    <body>
        <h1>Modification d'un professeur</h1>
        <div class="content row">
            <div class="col-xs-3" style="padding-right: 5px;">
                <s:form action="modifierProfesseur" theme="bootstrap" class="well form-vertical">
                    <s:textfield name="nouveauPrenomProfesseur" key="creationProfesseur.form.prenom"/>
                    <s:textfield name="nouveauNomProfesseur" key="creationProfesseur.form.nom"/>
                    <s:textfield name="nouvelleDateDeNaissanceProfesseur" key="creationProfesseur.form.date"/>
                    <s:submit class="btn btn-primary"/>
                </s:form>
            </div>
        </div>
    </body>
</html>