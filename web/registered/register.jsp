<%@page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="register.css">
    <script src="register.js"></script>

</head>
<body>
<div class="main">
    <div class ="head">
        <p>registered</p>
    </div>
    <s:form action="registered"  method="post">
    <div class="contentC">
        <div id="contentLeft">
            <div class="row" >
                username
            </div>
            <div class="row">
                password
            </div>
            <div class="row">
                confirm password
            </div>
        </div>


        <div id="contentRight">
            <div class="row2" >
                <input type="text/css" name="userName" class="input" placeholder="username" >
            </div>
            <div class="row2">
                <input type="password" name="passWord" class="input" placeholder="enter you password">
            </div>
            <div class="row2">
                <input type="password" name="passWord_2" class="input" placeholder="please confirm your password">
            </div>
        </div>

        <input type="submit" value="registered" class="button">
    </div>
    </s:form>
</div>

</body>
</html>