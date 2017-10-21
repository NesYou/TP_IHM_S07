<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Younes
  Date: 19/10/2017
  Time: 11:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title><s:text name="connexion.titre"/></title>
    </head>
    <body>
        <h1><s:text name="connexion.titre"/></h1>
        <s:if test="hasActionErrors()">
            <s:actionerror/>
        </s:if>
        <s:form action="confirmationConnexion" >
            <s:textfield name="pseudo" key="connexion.pseudo"/>
            <s:submit/>
        </s:form>
        
    </body>
</html>