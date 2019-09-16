$(document).ready(function () {
    var typeid = null;//当前导航栏id
    var title = null;//当前导航栏名称
    demo.initDashboardPageCharts();
    demo.initVectorMap();

    $.notify({
        icon: 'pe-7s-bell',
        message: "欢迎查看易来客运原型文档."

    }, {
        type: 'warning',
        timer: 4000
    });
    //初始化数据
    $.ajax({
        type: "get",
        url: serverUri + "/getAllnavigation",
        dataType: "json",
        contentType: "application/json",
        success: function (data) {
            //初始化导航栏数据
            $.each(data, function (index, mesage) {
                $(".nav").append(
                    "<li class='active'>" +
                    "<a href='#' onclick=" +
                    "'changmodel(&apos;" + mesage.id + "&apos;" +
                    "," +
                    "&apos;" + mesage.navigationName + "&apos;" +
                    ")'>" +
                    "<i class='pe-7s-graph'></i>" +
                    "<p>" + mesage.navigationName + "</p> </a></li>"
                );
            });
            //导航栏管理导航栏
            $(".nav").append(
                " <li class='active'>" +
                "    <a href='service/addnavigation.html'>" +
                "      <i class='pe-7s-graph'></i>" +
                "      <p>导航栏管理</p>" +
                "    </a>" +
                "  </li>"
            )
        },
        error: function () {
            alert(error.message);
        }
    });
    //第一次加载版本研发页面
    setTimeout(function () {
        changmodel(1, "研发版本");
    }, 500);

});

//添加新模块，typeid是导航栏id
function addnewmodel() {
    var begin = $("#begintime").val();
    var end = $("#endtime").val();
    var res = $("#resouce").val();
    var name = $("#researchname").val();
    $("#researchname").val(" ")
    $("#begintime").val(" ")
    $("#endtime").val(" ")
    $("#resouce").val(" ")
    if (begin == "" || begin == null) {
        begin = null;
    }
    if (end == "" || end == null) {
        end = null;
    }
    $.ajax({
        type: "POST",
        url: serverUri + "/addmodel",
        data: {name: name, begin: begin, end: end, res: res, typeid: typeid, title: title},
        dataType: "json",
    });
    $("#myModal").modal('hide');
    //刷新当前页面
    setTimeout(function () {
        changmodel(typeid, title);
    }, 500);
}

//修改版本方法,mainId是模块id，versionId是版本id，versionDesId是版本描述id
function updatemodel() {
    var mainId = $("#changeid").val();
    var versionId = $("#updateversion").val();
    var versionDesId = $("#descriptionid").val();
    var versionDate = $("#updateontime").val();
    var versionName = $("#updatename").val();
    var versionDesName = $("#updatedes").val();
    var versionURL = $("#updaturl").val();
    if ( versionId == "请选择"){
        alert("请选择版本")
    }
    else {
        $.ajax({
            type: "POST",
            url: serverUri + "/updateVersion",
            data: {
                mainId: mainId,
                versionId: versionId,
                versionDesId: versionDesId,
                versionDate: versionDate,
                versionName: versionName,
                versionDesName: versionDesName,
                versionURL: versionURL
            },
            dataType: "json",
        });
        $("#myModal1").modal('hide');
        //刷新当前页面
        setTimeout(function () {
            changmodel(typeid, title);
        }, 500);

    }

}

//添加版本信息
function addmodel() {
    $("#myModal2").modal('hide');
    var time = $("#ontime").val()
    var des = $("#versiondes").val()
    if (time == "" || time == null) {
        time = null;
    }
    if (des == "" || des == null) {
        des = null;
    }
    $.ajax({
        type: "POST",
        url: serverUri + "/savenewversion",
        data: {
            name: $("#versionname").val(),
            time: time,
            des: des,
            mainid: $("#mainid").val(),
            resouce: $("#versionurl").val()
        },
        dataType: "json",
    });
    $("#mainid").val(" ")
    $("#versionname").val(" ")
    $("#ontime").val(" ")
    $("#versiondes").val(" ")
    $("#versionurl").val(" ")
    //setTimeout() 方法用于在指定的毫秒数后调用函数或计算表达式
    setTimeout(function () {
        changmodel(typeid, title);
    }, 500);

}

//添加模块描述
function addnewmessage() {
    $("#myModal3").modal("hide");
    var messages=JSON.stringify($("#newmessage").val().split('\n'));
    var id = $("#infoid").val();
    $("#newmessage").val(" ");
    $.ajax({
        type: "POST",
        url: serverUri + "/addnewmaessage",
        data: {id: id,messages:messages},
        dataType: "json",
    });
    //刷新当前页面
    setTimeout(function () {
        changmodel(typeid, title);
    }, 500);
}


//修改模块信息方法
function updateModelMessage(){
    var mainId = $("#changeid0").val();
    var MessageId=$("#updatemessage").val();
    var  MessageName = $("#updateMessagename").val();
    if ( MessageName == "请选择"){
        alert("请选择版本")
    }
    else {
        $.ajax({
            type: "POST",
            url: serverUri + "/updateModelMessage",
            data: {
                mainId: mainId,
                MessageId:MessageId,
                MessageName:MessageName
            },
            dataType: "json",
        });
        $("#myModal6").modal('hide');
        //刷新当前页面
        setTimeout(function () {
            changmodel(typeid, title);
        }, 500);

    }
}

//删除当前模态框的模块信息，id当前模块id,messageid,是当前模块信息id
function deleteModelMessage(){
    var messageid=$("#deleteid1").val();
    $.ajax({
        type: "get",
        url: serverUri + "/deleteModelMessage",
        data: {messageid: messageid},
        dataType: "json"
    });
    $("#myModal7").modal('hide');
    //刷新当前页面
    setTimeout(function () {
        changmodel(typeid, title);
    }, 500);

}

//根据导航栏的点击选择，生成不同的页面
function changmodel(id, name) {
    $("#maininfo").html("");
    typeid = id;//当前选中的导航栏id
    title = name;//标题名称
    $.ajax({
        type: "GET",
        url: serverUri + "/getmaininfobynavid",
        data: {typeid: typeid},
        dataType: "json",
        success: function (data) {
            $.each(data, function (index, info) {
                var verdesid = null;
                //时间转换
                var begintime = gettime(info.begingTime);
                var endtime = gettime(info.endTimes);
                //模块信息
                var mainNames=info.mainName;
                $("#headname").html(info.titleName + "原型");
                $("#maininfo").append(
                    "<div class='row'>" +
                    "<div class='col-md-12'>" +
                    "<div class='card '>" +
                    "<div class='header'>" +
                    //资源路径，模块名称
                    "<h4 class='title'>" + info.headName + "</h4>"+
                    "<input type='button' class='btn btn-primary btn-sm col-sm-offset-3' value='编辑模块' data-toggle='modal' data-target='#myModal5' onclick='updateMain(" + info.id + ")'>" +
                    //研发时间
                    "<p class='category'>研发时间：" + begintime + "至" + endtime + "</p>" +
                    "<input type='button' class='btn btn-primary btn-sm col-sm-offset-7' value='添加版本' data-toggle='modal' data-target='#myModal2' onclick='setid(" + info.id + ")'>" +
                    "<input type='button' class='btn btn-primary btn-sm col-sm-offset-8' value='修改版本' data-toggle='modal' data-target='#myModal1' onclick='initchangemodal(" + info.id + ")'style='margin-left: 11%'>" +
                    "</div>" +
                    "<div class='content'>" +
                    "<div class='row'>" +
                    "<div class='col-md-3'>" +
                    //生成动态id,根据id将不同的描述信息渲染到不同的模块下面
                    "<ul id='" + info.id + "'>" +
                    "</ul> " +

                    " </div>" +
                    "<div class='col-md-8 col-md-offset-1'>" +
                    "<div class='card'>" +
                    "<table class='table table-hover table-striped' style='text-align: center'>" +
                    "<thead>" +
                    "<tr>" +
                    "<th style='text-align: center'>版本</th>" +
                    "<th style='text-align: center'>上线时间</th>" +
                    "<th style='text-align: center'>版本描述</th>" +
                    "<th style='text-align: center'>添加描述</th>" +
                    "<th style='text-align: center'>版本删除</th>" +
                    "</tr>" +
                    "</thead>" +
                    //生成动态id，根据id将版本信息渲染到页面
                    "<tbody  id='" + info.id + "td'>" +
                    "</tbody>" +
                    "</table>" +
                    "</div>" +
                    "</div>" +
                    "</div>" +
                    "<input type='button' class='btn btn-primary btn-xs col-md-offset-0' value='信息增加' data-toggle='modal' data-target='#myModal3' onclick='setid(" + info.id + ")'>" +
                    "<input type='button' class='btn btn-primary btn-xs col-md-offset-1' value='信息编辑' data-toggle='modal' data-target='#myModal6' onclick='initChangeMessage(" + info.id + ")'>" +
                    "<input type='button' class='btn btn-primary btn-xs col-md-offset-1' value='信息删除' data-toggle='modal' data-target='#myModal7' onclick='initDeleteMessage(" + info.id + ")'>" +
                    "</div>" +
                    "</div>" +
                    "</div>" +
                    "</div>"
                );
                //在模块中添加模块描述
                $.each(info.mainName, function (i, des) {
                    $("#" + info.id).append(
                        "<li> " + des.name + " </li> "
                    );
                });
                //在模块中添加版本描述和删除版本
                $.each(info.versionEntityList, function (i, ver) {
                    verdesid = ver.id;
                    $("#" + info.id + "td").append(
                        "<tr>" +
                        "<td style='width: 195px'><a href='" + ver.url + "'>" + ver.versionName + "</a> </td>" +
                        "<td style='width: 134px'>" + gettime(ver.versionDate) + "</td>" +
                        "<td id='verdescrible" + verdesid + "' style='width: 252px'></td>" +
                        "<td><input type='button' class='btn btn-primary btn-xs'  value='添加描述' data-toggle='modal' data-target='#myModal4' onclick='setDesid(" + ver.id + ")' style='text-align: center'></td>" +
                        "<td><input type='button' class='btn btn-primary btn-xs'  value='版本删除' onclick='deleteVer(" + ver.id + ")' style='text-align: center'></td>" +
                        "</tr>"
                    );
                    //添加版本描述
                    $.each(ver.versionDescribe, function (i, describtion) {
                        $("#verdescrible" + verdesid).append(
                            "<span>" + describtion.verdes + "</span><br>"
                        )
                    })


                })

            })
        }
    });
}

//添加版本描述，verid是当前选择版本id
function adddes() {
    $("#myModal4").modal('hide');
    var newMessage=JSON.stringify($("#newvermessage").val().split('\n'));
    var verid = $("#setVersionId").val();
    $("#newvermessage").val(" ");
    $.ajax({
        type: "POST",
        url: serverUri + "/addNewDesMaessage",
        data: {newMessage: newMessage, verid: verid},
        dataType: "json",
    });
    //刷新当前页面
    setTimeout(function () {
        changmodel(typeid, title);
    }, 500);
}

//初始化修改版本模态框的值，id为选中的模块
function initchangemodal(id) {
    $("#updateversion").html(" ");
    $("#updateontime").html(" ");
    $("#descriptionid").html(" ");
    $("#updatename").val(" ");
    $("#updatedes").val(" ");
    $("#updateontime").val(" ");
    $("#updaturl").val(" ");
    $("#changeid").val(id);
    $.ajax({
        type: "get",
        url: serverUri + "/getVersionsByMainId",
        data: {id: id},
        dataType: "json",
        success: function (data) {
            $("#updateversion").append(
                " <option>请选择</option>"
            );

            //给选择版本下拉框赋值
            $.each(data, function (index, message) {
                $("#updateversion").append(
                    "<option value= " + message.id + ">" + message.versionName + "</option>"
                )
            })
        },
        error: function () {
            alert("发生异常");
        }
    });
}

//根据修改版本模态框中选中的版本名称初始化选择描述下拉框值
function findversion() {
    $("#descriptionid").html(" ");
    $("#updatename").val($("#updateversion option:selected").text());
    var id = $("#updateversion option:selected").val();
    $.ajax({
        type: "get",
        url: serverUri + "/getVersionByVersionId",
        data: {id: id},
        dataType: "json",
        success: function (data) {
            var versiontime = changetime(data.versionDate);
            $("#updateontime").val(versiontime);
            $("#updaturl").val(data.url);
            //初始化选择描述下拉框的值
            $.each(data.versionDescribe, function (index, desc) {
                $("#descriptionid").append(
                    "<option value= " + desc.id + ">" + desc.verdes + "</option>"
                )
            });
            //初始化模块描述输入框的值
            $("#updatedes").val($("#descriptionid option:selected").text());
        },
        error: function () {
            alert("发生异常");
        }
    });
}

//根据模块id初始化修改模块模态框的值
function updateMain(id) {
    $("#updatemain").val(id);
    $.ajax({
        type: "get",
        url: serverUri + "/getMainInfoById",
        data: {id: id},
        dataType: "json",

        success: function (data) {
            $("#updateresearchname").val(data.headName);
            $("#updatebegintime").val(changetime(data.begingTime));
            $("#updateendtime").val(changetime(data.endTimes));
            $("#updateresouce").val(data.url);
            $("#updatenavid").val(data.navigation.id);
            $("#savetime").val(data.saveTime);
        },
        error: function () {
            alert("发生异常");
        }
    });
}

//修改模块方法
function updatemininfo() {
    $("#myModa5").modal('hide');
    var id = $("#updatemain").val();
    var name = $("#updateresearchname").val();
    var begin = $("#updatebegintime").val();
    var end = $("#updateendtime").val();
    var res = $("#updateresouce").val();
    var nid = $("#updatenavid").val();
    var time = $("#savetime").val();

    $.ajax({
        type: "POST",
        url: serverUri + "/updateMainInfo",
        //id为当前模块id，nid为当前模块所属的导航栏id，time为从数据库获取的存入数据库的时间，发送给服务器一并保存
        data: {name: name, beginTime: begin, endTime: end, nid: nid, title: title, res: res, id: id, time: time},
        dataType: "json"
    });
    $("#myModal5").modal('hide');
    setTimeout(function () {
        changmodel(typeid, title);
    }, 500);

}

//工具方法，将数据库的时间戳转化为时间
function gettime(time) {
    if (time == null) {
        return "";
    }
    var _time = new Date(time);
    var year = _time.getFullYear();
    var month = _time.getMonth() + 1;
    var date = _time.getDate();
    return year + "年" + month + "月" + date + "日 ";    //这里自己按自己需要的格式拼接
}

//工具方法，将数据库的时间戳转化为时间
function changetime(time) {
    if (time == null) {
        return "";
    }
    var _time = new Date(time);
    var year = _time.getFullYear();
    var month = _time.getMonth() + 1;
    var date = _time.getDate();
    if (month > 9 && date > 9) {
        return year + "-" + month + "-" + date
    } else if (month < 10 && date > 9) {
        return year + "-0" + month + "-" + date
    } else if (month > 9 && date < 10) {
        return year + "-" + month + "-0" + date
    } else {
        return year + "-0" + month + "-0" + date
    }
}

//给模态框hidden属性的输入框赋值，id为当前模块id
function setid(id) {
    $("#infoid").val(id);
    $("#mainid").val(id);
}

//初始化修改信息模态框，id为选中的模块
function initChangeMessage(id) {
    $("#updatemessageName").html(" ");
    $("#updatemessageName").val(" ");
    $("#updatemessage").html(" ");
    $("#changeid0").val(id);
    $.ajax({
        type: "get",
        url: serverUri + "/findBymainInfoEntityId",
        data: {id: id},
        dataType: "json",
        success: function (data) {
            $("#updatemessage").append(
                " <option>请选择</option>"
            );

            //给选择信息下拉框赋值
            $.each(data, function (index, Message) {
                $("#updatemessage").append(
                    "<option value= " + Message.id + ">" + Message.name + "</option>"
                )
            })
        },
        error: function () {
            alert("发生异常");
        }
    });
}

//初始化删除信息模态框，id为选中的模块
function initDeleteMessage(id) {
    $("#deleteMessageName").html(" ");
    $("#deleteMessageName").val(" ");
    $("#deleteMessage").html(" ");
    $("#deleteid").val(id);
    $.ajax({
        type: "get",
        url: serverUri + "/findBymainInfoEntityId",
        data: {id: id},
        dataType: "json",
        success: function (data) {
            $("#deleteMessage").append(
                " <option>请选择</option>"
            );

            //给选择信息下拉框赋值
            $.each(data, function (index, Message) {
                $("#deleteMessage").append(
                    "<option value= " + Message.id + ">" + Message.name + "</option>"
                )
            })
        },
        error: function () {
            alert("发生异常");
        }
    });
}

//根据修改信息模态框中选中的模板名称初始化选择描述下拉框值
function findChangeModelMessage() {
    $("#updateMessagename").val($("#updatemessage option:selected").text());
}

//根据删除信息模态框中选中的模板名称初始化选择描述下拉框值
function findDeleteModelMessage(){
    $("#deleteMessageName").val($("#deleteMessage option:selected").text());
    $("#deleteid1").val($("#deleteMessage option:selected").val());
}

//给修改版本模态框中的模块描述输入框赋值
function findversiondes() {
    $("#updatedes").val($("#descriptionid option:selected").text());
}

//给模态框hidden属性的输入框赋值，id为当前模块id，verdesid为当前版本id
function setDesid(verdesid) {
    $("#setVersionId").val(verdesid);
}

//删除当前模态框的版本信息  id为当前模块id，verdesid为当前版本id
function deleteVer(verdesid) {
    $.ajax({
        type: "get",
        url: serverUri + "/deleteVer",
        data: {id: verdesid},
        success: function () {
            setTimeout(function () {
                changmodel(typeid, title);
            }, 500);
        },
        error: function () {
            alert("发生异常");
        }
    })
}

(function (i, s, o, g, r, a, m) {
    i['GoogleAnalyticsObject'] = r;
    i[r] = i[r] || function () {
        (i[r].q = i[r].q || []).push(arguments)
    }, i[r].l = 1 * new Date();
    a = s.createElement(o),
        m = s.getElementsByTagName(o)[0];
    a.async = 1;
    a.src = g;
    m.parentNode.insertBefore(a, m)
})(window, document, 'script', '//www.google-analytics.com/analytics.js', 'ga');

ga('create', 'UA-46172202-1', 'auto');
ga('send', 'pageview');