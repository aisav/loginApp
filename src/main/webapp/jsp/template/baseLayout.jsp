<%--
  Created by IntelliJ IDEA.
  User: htdev201701
  Date: 8/17/2017
  Time: 9:47 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title><tiles:insertAttribute name="title" ignore="true" />
    </title>
</head>

<body>

<%--<s:set var="test" value="7asdasd"/>
Test is <s:property value="test"/>--%>

<tiles:insertAttribute name="banner" /><br/>
<hr/>
<tiles:insertAttribute name="menu" /><br/>
<hr/>
<tiles:insertAttribute name="body" /><br/>
<hr/>
<tiles:insertAttribute name="footer" /><br/>
</body>
</html>
