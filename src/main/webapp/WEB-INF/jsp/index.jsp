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

<ul>
        <li><a href="<s:url action="registerForm"/>">Registration</a></li>
        <li><a href="<s:url action="loginForm"/>">Log-In</a></li>
</ul>

</body>
</html>