<%--
  Created by IntelliJ IDEA.
  User: 李之辰
  Date: 2020/6/16
  Time: 12:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>电影</title>
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="robots" content="all,follow">
    <link href="https://cdn.bootcss.com/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="css/style.default.css" id="theme-stylesheet">
    <script src="http://cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script>
    <script src="http://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<div class="page login-page">
    <div class="container d-flex align-items-center">
        <div class="form-holder has-shadow">
            <!-- Logo & Information Panel-->
            <table class="table table-bordered">
                <thead>
                <tr>
                    <td class="warning"><strong>Name</strong></td>
                    <td class="danger"><strong>Score</strong></td>
                    <td class="success"><strong>Comment</strong></td>
                    <td class="danger"><strong>Num</strong></td>
                    <td class="warning"><strong>Href</strong></td>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${movies}" var="m">
                    <tr>
                        <td class="warning">${m.name}</td>
                        <td class="danger">${m.start}</td>
                        <td class="success">${m.comment}</td>
                        <td class="danger">${m.num}</td>
                        <td class="warning">${m.href}</td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>

</body>
</html>