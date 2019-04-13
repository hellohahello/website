<%@ page import="java.io.FileInputStream" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>后台</title>
</head>
<body>
<!--左侧菜单-->
<div class="admin-left">
    <div class="logo">
        <h1>杜小月</h1>
    </div>
   <c:import url="menu.jsp"/>
</div>

<!--头部内容-->
<div class="admin-header">
    <c:import url="header.jsp"/>

    </div>
</div>
</body>

</html>
