<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>登陆界面</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    <title>Insert title here</title>
    <link rel="stylesheet" type="text/css" href="https://cdn.bootcss.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css">
</head>
<body>
<h3>用户登录</h3>
<form name='f' action='${pageContext.request.contextPath }/login'
      method='POST'>
    <table>
        <tr>
            <td>用户名:</td>
            <td><input type='text' name='username' value=''></td>
        </tr>
        <tr>
            <td>密码:</td>
            <td><input type='password' name='password'/></td>
        </tr>
        <tr>
            <td><input name="submit" type="submit"
                       value="登录"/></td>
        </tr>
    </table>
</form>
</body>
</html>