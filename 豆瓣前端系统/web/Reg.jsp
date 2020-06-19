<%--
  Created by IntelliJ IDEA.
  User: 李之辰
  Date: 2020/6/17
  Time: 16:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>注册</title>
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="robots" content="all,follow">
    <!-- Bootstrap CSS-->
    <link rel="stylesheet" href="https://ajax.aspnetcdn.com/ajax/bootstrap/4.2.1/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Poppins:300,400,700">
    <link rel="stylesheet" href="css/style.default.css" id="theme-stylesheet">
</head>
<body>
<div class="page login-page">
    <div class="container d-flex align-items-center">
        <div class="form-holder has-shadow">
            <div class="row">
                <div class="col-lg-6">
                    <div class="info d-flex align-items-center">
                        <div class="content">
                            <div class="logo">
                                <h1>注册</h1>
                            </div>
                            <p>豆瓣爬虫管理系统</p>
                        </div>
                    </div>
                </div>
                <div class="col-lg-6 bg-white">
                    <div class="form d-flex align-items-center">
                        <div class="content">
                            <form action="/regs" method="post">
                                <div class="form-group">
                                    <input id="register-username" class="input-material" type="text" name="username" placeholder="请输入用户名" >
                                </div>
                                <div class="form-group">
                                    <input id="register-password" class="input-material" type="password" name="password0" placeholder="请输入密码"   >
                                </div>
                                <div class="form-group">
                                    <input id="register-passwords" class="input-material" type="password" name="password1" placeholder="确认密码"   >
                                </div>
                                <div class="form-group">
                                    <button id="regbtn" type="submit" name="registerSubmit" class="btn btn-primary">注册</button>
                                </div>
                                <small>已有账号?</small><a href="index.jsp" class="signup">&nbsp;登录</a>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<script src="https://libs.baidu.com/jquery/1.10.2/jquery.min.js"></script>
<script src="https://ajax.aspnetcdn.com/ajax/bootstrap/4.2.1/bootstrap.min.js"></script>
</body>
</html>