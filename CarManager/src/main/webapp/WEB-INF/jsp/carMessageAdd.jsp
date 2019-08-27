
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>车信息的添加</title>
    <script type="text/javascript" src="../../js/jquery-3.3.1.js"></script>
    <link href="../../css/bootstrap.min.css" rel="stylesheet">
    <!-- 2. jQuery导入，建议使用1.9以上的版本 -->
    <script src="../../js/jquery-2.1.0.min.js"></script>
    <!-- 3. 导入bootstrap的js文件 -->
    <script src="../../js/bootstrap.min.js"></script>
    <script type="text/javascript">
        function imgChange() {
            var file =document.getElementById("file");
            var imgUrl =window.URL.createObjectURL(file.files[0]);
            var img =document.getElementById('imghead');
            img.setAttribute('src',imgUrl);
        }
        function add() {
            var file=new FormData();
            formData.append("file",$("#file").files[0],
            $.ajax({
                url: "${pageContext.request.contextPath}/addCarMessage",
                type: "POST",
                dataType: 'json',
                contentType: false,// 注意：让jQuery不要处理数据
                processData: false,// 注意：让jQuery不要设置contentType
                data: {
                    /*carNumber:document.getElementById("carNumber").value,
                    carOwner:document.getElementById("carOwner").value,
                    carPlateColor:document.getElementById("carPlateColor").value,
                    motorNumber:document.getElementById("motorNumber").value,
                    carBrand:document.getElementById("carBrand").value,
                    carFrame:document.getElementById("carFrame").value,
                    carRegisterDate:document.getElementById("carRegisterDate").value,
                    carModel:document.getElementById("carModel").value,
                    carType:document.getElementById("carType").value,
                    registerTime:document.getElementById("registerTime").value*/
                    carNumber: $("#carNumber").val(),
                    carOwner: $("#carOwner").val(),
                    carPlateColor: $("#carPlateColor").val(),
                    motorNumber: $("#motorNumber").val(),
                    carBrand: $("#carBrand").val(),
                    carFrame: $("#carFrame").val(),
                    carRegisterDate: $("#carRegisterDate").val(),
                    carModel: $("#carModel").val(),
                    carType: $("#carType").val(),
                    registerTime: $("#registerTime").val(),
                    myphoto:formData
                },
                // 告诉jQuery不要去处理发送的数据
                processData: false,
                // 告诉equerry不要去设置Content-Type请求头
                contentType: false,
                success: function (data) {
                    location.href = "/carMessage";
                },
                error: function (data) {
                    alert("系统错误")
                }
        }))
        }

    </script>

</head>
<body>
<form id="registerForm" enctype="multipart/form-data" >
    <table  border="1" class="table table-bordered table-hover">
        <tr>
            <td>车牌号</td>
            <td><input type="text" id="carNumber" name="carNumber" value=""></td>
            <td>车主</td>
            <td><input type="text" id="carOwner" name="carOwner"></td>
        </tr>
        <tr>
            <td>车身颜色</td>
            <td><input type="text" id="carPlateColor" name="carPlateColor"></td>
            <td>发动机号</td>
            <td><input type="text" id="motorNumber" name="motorNumber"></td>
        </tr>
        <tr>
            <td>车品牌</td>
            <td><input type="text" id="carBrand" name="carBrand"></td>
            <td>车机架</td>
            <td><input type="text" id="carFrame" name="carFrame"></td>
        </tr>

        <tr>
            <td>注册日期</td>
            <td><input type="text" id="carRegisterDate" name="carRegisterDate"></td>
            <td>车型号</td>
            <td><input type="text" id="carModel" name="carModel"></td>
        </tr>
        <tr>
            <td>车类型</td>
            <td><input type="text" id="carType" name="carType"></td>
            <td>初次登记时间</td>
            <td><input type="text" id="registerTime" name="registerTime"></td>
        </tr>
        <tr>
            <td>
                <p>上传图片</p>
                <input type="file"name="file"id="file" accept="image/*" onchange="imgChange();"/> <!--文件上传选择按钮-->
                <div id="preview">
                <img id="imghead"src="/img/timg.jpg"width="200"height="140"/>
                </div>
            </td>
        </tr>
        <tr>
            <td colspan="10">
                <input  class="btn btn-default btn-sm" type="button" value="增加" onclick="add()">
                <input  class="btn btn-default btn-sm"type="reset" value="重置">
            </td>

        </tr>
    </table>
</form>
</body>
</html>
