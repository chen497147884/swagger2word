<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
</head>
<body>
<h2>Swagger生成Word</h2>
<h2>参数说明：</h2>
<h3>http://172.18.216.74:32150/v2/api-docs</h3>
<form name="swagger2Word" action="getIstarWord" method="get">
    <input name="mySwaggerUrl">
    <input type="submit" value="提交" />
</form>
</body>
</html>
