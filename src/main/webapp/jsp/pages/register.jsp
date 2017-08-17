<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
    <title>Struts 2 Login</title>
    <s:head/>
</head>

<body>
<h1><s:text name="welcome" /></h1>
<s:if test="hasActionErrors()">
    <div id="fieldErrors">
        <s:actionerror/>
    </div>
</s:if>
<s:form action="registerAction" namespace="/" method="post" name="myForm" theme="xhtml">

    <s:textfield name="firstName" size="12" maxlength="12" key="your.firstName-label"/>
    <s:textfield name="lastName" size="12" maxlength="12" key="your.lastName-label"/>
    <s:textfield name="name" size="12" maxlength="12" key="your.name-label"/>
    <s:textfield name="password" type="password" size="12" maxlength="12" key="your.password-label"/>
    <s:textfield name="passwordConfirm" type="password" size="12" maxlength="12" key="your.passwordConfirm-label"/>
    <s:submit value="Submit" />
</s:form>
</body>
</html>