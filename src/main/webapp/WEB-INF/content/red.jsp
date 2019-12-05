<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/11/15
  Time: 20:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
    <title>参数</title>
    <script src="${pageContext.request.contextPath}/static/jquery-3.4.1.min.js" type="text/javascript"></script>
    <script type="text/javascript">
        $(document).ready(function () {
            var max = 30000;
            for(var i = 1; i <= max; i++){
                //jquery的post请求,异步的
                $.post({
                    //请求抢ID为1的红包
                    url:"./userRedPacket/grapRedPacketByRedis.do?redPacketId=1&userId=" + i,
                    //成功后的方法
                    success:function (result) {

                    }
                })
            }

        })
    </script>
</head>
<body>

</body>
</html>
