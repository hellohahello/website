<%--
  Created by IntelliJ IDEA.
  User: 徐邵丽
  Date: 2019-04-11
  Time: 19:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<script src="http://libs.baidu.com/jquery/1.9.1/jquery.min.js"></script>
<head>
    <title>Title</title>
</head>
<body>

<div class="container">
    <div class="row clearfix">
        <div class="divClass2">
            <ol id="olId">
            </ol>

        </div>
    </div>
</div>
</body>
<script>
    $(function () {
        $.ajax({
            url: "/user/show.action",
            data:{
                str: 1,
            },
            type: "post",
            success: function (list) {
                console.log(list)
              for(var i=0;i<list.length;i++){
                    $("#olId").html("<li>"+list[i]+"</li>");
              }

            },
            error: function (re) {
              //  console.log(re.val())
                alert(1)
            }
        })
    })

</script>
</html>
