<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sb" uri="/struts-bootstrap-tags" %>

<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
    <head>
        <meta charset="UTF-8">
        <sb:head/>
        <title><s:text name="index.titre"/></title>
    </head>

    <body>

        <h1><s:text name="index.bienvenu"/></h1>

        <div class="row">
            <div class="col-xs-3" style="padding-right: 5px;">
                <h2>Gestion des professeurs</h2>
                <s:a action="goToCreationProfesseur" class="list-group-item"><s:text name="index.creerProfesseur"/></s:a>
                <s:a action="goToGoToModifierProfesseur" class="list-group-item"><s:text name="index.modifierProfesseur"/></s:a>
            </div>
        </div>

        <div class="row">
            <div class="col-xs-3" style="padding-right: 5px;">
                <h2>Gestion des filières</h2>
                <s:a action="goToCreationFiliere" class="list-group-item"><s:text name="index.creerFiliere"/></s:a>
            </div>
        </div>

    </body>
</html>