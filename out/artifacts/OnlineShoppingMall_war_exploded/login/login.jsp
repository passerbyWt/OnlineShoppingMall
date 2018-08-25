<%@page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html lang="en">
<head>
    <meta charset="UTF-8">

    <title>Login</title>
    <link href="/login/login.css" rel="stylesheet" type="text/css">
</head>
<body>
<div id="myBody">
    <div id="border">
        <div id="userLogin">
            <s:form action="login" method="POST">
                <label id="lab">Login</label>
                <br/>
                <div id="userName">
                    <img class="textPic" src="/login/user.png">
                    <input class="text" type="text" placeholder="user name" name="userName"/>
                </div>
                <div id="password">
                    <img class="textPic" src="/login/password.png">
                    <input class="text" type="password" placeholder="password" name="passWord"/>
                </div>
                <br/>
                <div id="button">
                    <button id="loginButton" type="submit">Login</button>
                </div>
            </s:form>
            <div id="others">
                <label id="register"><a href="/registered/register.jsp">registered now</a></label>
            </div>
        </div>
    </div>
</div>
</body>
</html>