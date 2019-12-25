<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html charset=UTF-8">
    <style>
        table {
            border-collapse: collapse;
        }

        table, table tr th, table tr td {
            border: 1px solid #000000;
        }
    </style>
    <title>查询学生列表</title>
    <script type="text/javascript" src="js/jquery-2.1.1.js">

    </script>
    <script>
     /*   function query() {
            var xmlhttp;
            if (window.XMLHttpRequest) {
                // IE7+, Firefox, Chrome, Opera, Safari 浏览器执行代码
                xmlhttp = new XMLHttpRequest();
            } else {
                // IE6, IE5 浏览器执行代码
                xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
            }
            xmlhttp.onreadystatechange = function () {
                if (xmlhttp.readyState === 4 && xmlhttp.status === 200) {
                    console.log(xmlhttp.responseText)
                    alert(xmlhttp.responseText);
                    var list = eval(xmlhttp.responseText);
                    alert(list)
                    var content = "<h2>重修学生列表</h2>" +
                        "<table>\n" +
                        "        <thead>\n" +
                        "        <tr>\n" +
                        "            <th>ID</th>\n" +
                        "            <th>姓名</th>\n" +
                        "            <th>入学时间</th>\n" +
                        "            <th>学习次数</th>\n" +
                        "            <th>重修次数</th>\n" +
                        "        </tr>\n" +
                        "        </thead>\n" +
                        "        <tbody>";
                    for (var i = 0; i < list.length; i++) {
                        content = content + "<tr><td>" + list[i].id + "</td>"
                            + "<td>" + list[i].studentName + "</td>"
                            + "<td>" + list[i].cometime + "</td>"
                            + "<td>" + list[i].scount + "</td>"
                            + "<td>" + list[i].restudy + "</td></tr>"
                    }
                    content = content + "</tbody>\n" +
                        "    </table>"
                    //document.getElementById("chongxiu").innerHTML = content;
                }
            }
            xmlhttp.open("POST", "/chongxiu", true);
            xmlhttp.setRequestHeader("Content-type", "application/json");
            xmlhttp.send();
        }*/

                function query(){//{"name":"zhangsan","age":10}
                    $.get("/reBuild",{},function(result){//result 形式参数 data 实际参数 控制层返回的参数   集合  相对应
                        if(result!=null){
                            /!*append()==content*!/
                            $("#reBuild").empty();//清空
                            $("#reBuild").append( "<h2>重修学生列表</h2>\n" +
                                "<table>\n" +
                                "        <thead>\n" +
                                "        <tr>\n" +
                                "            <th>编号</th>\n" +
                                "            <th>姓名</th>\n" +
                                "            <th>入学时间</th>\n" +
                                "            <th>学习次数</th>\n" +
                                "            <th>重修次数</th>\n" +
                                "        </tr>\n" +
                                "        </thead>\n" +
                                "        <tbody class=\"context\">\n" +
                                "\n" +
                                "        </tbody>\n" +
                                "    </table>")
                            for (var i=0;i<result.length;i++) {
                                $(".context").append(" <tr><th>" + result[i].id + "</th>\n" +
                                    "            <th>"+result[i].studentName+"</th>\n" +
                                    "            <th>"+result[i].comeTimeStr+"</th>\n" +
                                    "            <th>"+result[i].scount+"</th>\n" +
                                    "            <th>"+result[i].restudy+"</th></tr>");
                            }
                        }
                    })
                }
    </script>
</head>
<body>

<h2 style="align-content: center">学生列表</h2>
<button type="button" onclick="query()">重修学生</button>

<div>
    <table>
        <thead>
        <tr>
            <th>编号</th>
            <th>姓名</th>
            <th>入学时间</th>
            <th>学习的课程</th>
            <th>学习次数</th>
            <th>重修次数</th>
            <th>操作</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${Student}" var="s">
            <tr>
                <td>${s.id}</td>
                <td>${s.studentName}</td>
                <td><fmt:formatDate value="${s.cometime}" pattern="yyyy-MM-dd"/></td>
                <td>${s.coerses[0].cName}</td>
                <td>${s.scount}</td>
                <td>${s.restudy}</td>
                <td><a href="editFindByStuId?stuId=${s.id}">升班</a><a href="updateByStuId?stuId=${s.id}">末班</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
<div id="reBuild">

</div>
</body>
</html>
