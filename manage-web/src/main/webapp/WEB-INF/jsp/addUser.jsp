<%--
  Created by IntelliJ IDEA.
  User: nyz
  Date: 2019/6/20
  Time: 1:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加用户</title>
</head>
<body>
    <form action="/user/addUser" method="post">
        用户名：<input type="text" name="username"/><br>
        年  龄：<input type="text" name="userage"/><br>
        <input type="submit" value="确定">
    </form>
</body>
</html>
