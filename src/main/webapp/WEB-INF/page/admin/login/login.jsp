<%--
  Created by IntelliJ IDEA.
  User: 徐邵丽
  Date: 2019-04-11
  Time: 16:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html>
<head>
    <meta charset="utf-8">
    <title>登录</title>
</head>
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

<!--css样式-->
<link rel="stylesheet" href="/static/css/style.css">
<body>
<div class="bg-wrap">
    <div class="main-cont-wrap login-model">
        <form id="form">
            <div class="form-title">
                <span>后台登录</span>
            </div>
            <div class="form-item">
                <span class="form-txt">账号：</span>
                <input type="text" class="form-input original" id="login_name" name="loginName" placeholder="请输入账号" data-type="必填" error-pos="32" />
            </div>
            <div class="form-item">
                <span class="form-txt">密码：</span>
                <input type="password" class="form-input original" name="password" placeholder="请输入密码" data-type="必填" error-pos="32" />
            </div>
            <div class="form-btn">
                <input type="button" class="ui-button" id="submit" value="登录" />
            </div>
        </form>
    </div>
</div>
</body>
<!--ajax表单提交-->
<script type="text/javascript">

    $("#submit").click(function(){
        //前台校验(是否有东西没填)
    if(javaexVerify()){
        $.ajax({
            url: "/user/login.json",
            type: "post",
            dataType: "json",
            data: $("#form").serialize(),
            success: function (result) {
                //在浏览器控制台打印
                console.log(result)
                //如果登录成功,跳转到后台首页
                if(result.code=="0"){
                    window.location.href="${pageContext.request.contextPath}/user/index.action";
                }
                else{
                    //在用户名处显示错误信息
                    addErrorMsg("login_name",result.message);
                }
            },
            error: function (res) {
               console.log(res)
            }
        })

    }


    })
</script>
</html>
