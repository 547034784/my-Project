<%--
  Created by IntelliJ IDEA.
  User: 常
  Date: 2019/7/18
  Time: 5:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>车辆信息的添加</title>
    <link rel="stylesheet" type="text/css" href="https://cdn.bootcss.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css">
    <script type="text/javascript" src="../../js/jquery-3.3.1.js"></script>
    <script type="text/javascript">
        function up() {
            $.ajax({
                url: "${pageContext.request.contextPath}/updateCarMessageById",
                type: "POST",
                dataType: 'json',
                data: {
                    id:$("#id").val(),
                    carNumber:$("#carNumber").val(),
                    carOwner:$("#carOwner").val(),
                    carPlateColor:$("#carPlateColor").val(),
                    motorNumber:$("#motorNumber").val(),
                    carBrand:$("#carBrand").val(),
                    carFrame:$("#carFrame").val(),
                    carRegisterDate:$("#carRegisterDate").val(),
                    carModel:$("#carModel").val(),
                    carType:$("#carType").val(),
                    registerTime:$("#registerTime").val()
                    /*id:document.getElementById("id").value,
                    carNumber:document.getElementById("carNumber").value,
                    carOwner:document.getElementById("carOwner").value,
                    carPlateColor:document.getElementById("carPlateColor").value,
                    motorNumber:document.getElementById("motorNumber").value,
                    carBrand:document.getElementById("carBrand").value,
                    carFrame:document.getElementById("carFrame").value,
                    carRegisterDate:document.getElementById("carRegisterDate").value,
                    carModel:document.getElementById("carModel").value,
                    carType:document.getElementById("carType").value,
                    registerTime:document.getElementById("registerTime").value*/

                },
                success:function () {
                    location.href="carMessage";
                },
                error:function(data){
                    console.log(data)
                }
            });
        }
    </script>
</head>
<body>
<form >
    <table table table border="1" class="table table-bordered table-hover">
        <tr>
            <td style="display:none">
                <input type="text" id="id" name="id" name="id" value="${carMessage.id}">
            </td>
        </tr>
        <tr>
            <td>车牌号</td>
            <td><input type="text" id="carNumber" name="carNumber" value="${carMessage.carNumber}"></td>
            <td>车主</td>
            <td><input type="text" id="carOwner" name="carOwner" value="${carMessage.carOwner}"></td>
        </tr>
        <tr>
            <td>车身颜色</td>
            <td><input  type="text" id="carPlateColor" name="carPlateColor" value="${carMessage.carPlateColor}"></td>
            <td>发动机号</td>
            <td><input type="text" id="motorNumber" name="motorNumber" value="${carMessage.motorNumber}"></td>
        </tr>
        <tr>
            <td>车品牌</td>
            <td><input type="text" id="carBrand" name="carBrand" value="${carMessage.carBrands}"></td>
            <td>车机架</td>
            <td><input type="text" id="carFrame" name="carFrame" value="${carMessage.carFrame}"></td>
        </tr>

        <tr>
            <td>注册日期</td>
            <td><input type="text" id="carRegisterDate" name="carRegisterDate" value="${carMessage.carRegisterDate}"></td>
            <td>车型号</td>
            <td><input type="text" id="carModel" name="carModel" value="${carMessage.carModel}"></td>
        </tr>
        <tr>
            <td>车类型</td>
            <td><input type="text" id="carType" name="carType" value="${carMessage.carType}"></td>
            <td>初次登记时间</td>
            <td><input type="text" id="registerTime" name="registerTime" value="${carMessage.registerTime}"></td>
        </tr>
        <tr>

            <td colspan="10">
                <input type="button" class="submit" value="更新" onclick="up()">
                    <input type="reset" value="重置">
            </td>

        </tr>
    </table>
</form>
</body>
</html>
