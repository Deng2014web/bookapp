<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
        <title>首页</title>
    </head>
    <body>
        欢迎[${sessionScope.user.username}]访问
        <br/>
        <table border="1">
            <tr>
                <th>封面</th>
                <th>书名</th>
                <th>作者</th>
                <th>价格</th>
            </tr>
            <c:forEach items = "${requestScope.book_list}" var = "book">
                <tr>
                    <td><img src="images/${book.image}" height="60" alt="${book.image}"/></td>
                    <td>${book.name}</td>
                    <td>${book.author}</td>
                    <td>${book.price}</td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>