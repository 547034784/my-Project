<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>所有车辆信息展示</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Insert title here</title>
    <script type="text/javascript" src="../../js/jquery-3.3.1.js"></script>
    <!-- Latest compiled and minified JavaScript -->
    <!-- 1. 导入CSS的全局样式 -->
    <link href="../../css/bootstrap.min.css" rel="stylesheet">
    <!-- 2. jQuery导入，建议使用1.9以上的版本 -->
    <script src="../../js/jquery-2.1.0.min.js"></script>
    <!-- 3. 导入bootstrap的js文件 -->
    <script src="../../js/bootstrap.min.js"></script>
    <style type="text/css">
        tr,td, th {
            text-align: center;
        }
    </style>
    <script type="text/javascript">
       $(function () {
            $.ajax({
            url:"${pageContext.request.contextPath}/carMessageList",
            type:"Post",
            dataType:"json",
            contentType: "application/json;charset=utf-8;",
            success:function (data) {
                for(var i=0;i<data.length;i++){
                    var id=data[i].id;
                    var carNumber=data[i].carNumber;
                    var carOwner=data[i].carOwner;
                    var carPlateColor=data[i].carPlateColor;
                    var motorNumber=data[i].motorNumber;
                    var carBrands=data[i].carBrands;
                    var carFrame=data[i].carFrame;
                    var carModel=data[i].carModel;
                    var carRegisterDate=data[i].carRegisterDate;
                    var carType=data[i].carType;
                    var registerTime=data[i].registerTime;

                    var tr;
                    var bu='<td>'+'<a class="btn btn-default btn-sm" href="${pageContext.request.contextPath}/deleteCarMessage?id='+id+'">'+'删除';
                    var bt='<td>'+'<a class="btn btn-default btn-sm" href="${pageContext.request.contextPath}/byIdUpdateCarMessage?id='+id+'">'+'修改';
                    $("#tabletest").append('<tr>'+'<td >'+'<input type="checkbox" name="uid" value='+id+'>'+'</td>'+'<td>'+carNumber+'</td>'
                        +'<td>'+carOwner+'</td>'+'<td>'+carPlateColor+'</td>'+'<td>'+motorNumber+'</td>'
                        +'<td>'+carBrands+'</td>'+'<td>'+carFrame+'</td>'+'<td>'+carModel+'</td>'
                        +'<td>'+carRegisterDate+'</td>'+'<td>'+carType+'</td>'+'<td>'+registerTime+'</td>'+bu+bt+'</tr>');
                }
            },
            error:function () {
                alert("系统错误");
            }
        })
    })

    </script>

</head>
<body>
<table id="tabletest" border="1" class="table table-bordered table-hover">
    <tr>
        <th>${powerMessage}</th>
    </tr>
    <tr class="success">
        <th><input type="checkbox" id="firstCb"></th>
        <th>车牌号</th>
        <th>车主</th>
        <th>车牌颜色</th>
        <th>发动机号</th>
        <th>车品牌</th>
        <th>车机架</th>
        <th>车型号</th>
        <th>注册日期</th>
        <th>车类型</th>
        <th>初次登记时间</th>
        <th><button onclick="Page0()">增加</button></th>
    </tr>

    <%--<c:forEach items="${requestScope.carMessageList}" var="carMessage">
        <tr>
            <td><input type="checkbox" name="uid" value="${carMessage.id}"></td>
            <td>${carMessage.carNumber}</td>
            <td>${carMessage.carOwner}</td>
            <td>${carMessage.carPlateColor}</td>
            <td>${carMessage.motorNumber}</td>
            <td>${carMessage.carBrands}</td>
            <td>${carMessage.carFrame}</td>
            <td>${carMessage.carModel}</td>
            <td>${carMessage.carRegisterDate}</td>
            <td>${carMessage.carType}</td>
            <td>${carMessage.registerTime}</td>
            <td><a class="btn btn-default btn-sm" href="${pageContext.request.contextPath}/DeleteCarMessage?id=${carMessage.id}">删除</a></td>
            <td><a class="btn btn-default btn-sm" href="${pageContext.request.contextPath}/ByIdUpdateCarMessage?id=${carMessage.id}">修改</a></td>
        </tr>
    </c:forEach>--%>
    <%--<td><a class="btn btn-default btn-sm" href="${pageContext.request.contextPath}/DeleteCarMessage?id=${carMessage.id}">删除</a></td>
    <td><a class="btn btn-default btn-sm" href="${pageContext.request.contextPath}/ByIdUpdateCarMessage?id=${carMessage.id}">修改</a></td>--%>

</table>

<script type="text/javascript">
    function Page0() {
        location.href = "${pageContext.request.contextPath}/carMessageAdd";
    }
</script>

</body>
</html>