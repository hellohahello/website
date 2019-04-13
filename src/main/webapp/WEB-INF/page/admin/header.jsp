<%--
  Created by IntelliJ IDEA.
  User: 徐邵丽
  Date: 2019-04-11
  Time: 11:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<!--字体图标-->
<link href="/static/javaex/pc/css/icomoon.css" rel="stylesheet" />
<!--动画-->
<link href="/static/javaex/pc/css/animate.css" rel="stylesheet" />
<!--骨架样式-->
<link href="/static/javaex/pc/css/common.css" rel="stylesheet" />
<!--皮肤（缇娜）-->
<link href="/static/javaex/pc/css/skin/tina.css" rel="stylesheet" />
<!--jquery，不可修改版本-->
<script src="/static/javaex/pc/lib/jquery-1.7.2.min.js"></script>
<!--全局动态修改-->
<script src="/static/javaex/pc/js/common.js"></script>
<!--核心组件-->
<script src="/static/javaex/pc/js/javaex.min.js"></script>
<!--表单验证-->
<script src="/static/javaex/pc/js/javaex-formVerify.js"></script>

<head>
    <title>Title</title>
</head>
<body>
<!--顶部-->
<div class="admin-header">
    <ul class="header-right">
        <li>
            <label class="margin-left-10 margin-right-10">|</label>
            <a href="${pageContext.request.contextPath}/user/loginout.action">退出</a>
        </li>
        <li>
            <a href="#">
						<span class="icon-commenting-o" style="font-size: 20px;position: relative;top:2px;">
							<i style=""><span>31</span></i>
						</span>
            </a>
        </li>
        <li>
            <a href="#">关于我</a>
        </li>
    </ul>
</div>
</body>
</html>
