<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html;charset=utf-8"/>
        <title>登录页面</title>
    </head>
    <body>
        <h3>登陆页面</h3>
        <form action="login" method="POST">
            <font color="red">${requestScope.message}</font>
            <table>
                <tr>
                    <td><label>登录名：</label></td>
                    <td><input type="text" id="loginname" name="loginname" /></td>
                </tr>
                <tr>
                    <td><label>密码：</label></td>
                    <td><input type="password" id="password" name="password" /></td>
                </tr>
                <tr>
                    <td><input type="submit" value="登录" /></td>
                </tr>
            </table>
        </form>
    </body>
</html>