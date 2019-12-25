<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>升班界面</title>
</head>
<script type="text/javascript" src="js/jquery-2.1.1.js"></script>
<script type="text/javascript">

    //界面加载时间
    $(function(){
        find_all_coesees();
    })

    //查询所有课程
    function find_all_coesees(){
        $.get("findAllcoerses",{},function(data){
            if(data!=null){
                $(".update_context").empty();
                $(".update_context").append("<option value='0'>请选择</option>")
                for (var i = 0; i < data.length; i++) {
                    $(".update_context").append("<option value='"+data[i].id+"'>"+data[i].cName+"</option>");
                }
            }
        })
    }
    //function：声明方法的关键字 up**:方法名 （参数） {}:方法体
    function update_class(){
        //首先是要获取所有的参数值
        var sid = $(".sid").val();
        var cid = $(".update_context").val();
        //把参数值传到后台
       /* $.get("editStudy",{"sid":sid,"cid":cid},function(result){
            if(result=="SUCCESS"){
                Window.location.href="findAll";
            }else{
                alert("321213321321");
            }
        })*/
        //
        $.ajax({
            url:'editStudy',//地址
            dataType:'json',//数据类型
            type:'GET',//类型
            data: {"sid":sid,"cid":cid},
            async:false,
            //请求成功
            success:function(data){
                alert(111);
            }
        })
    }

</script>
<body>
    <form class="all_val_context" action="/editStudy">
        <!-- 隐藏的主键id -->
        <input type="hidden" class="sid" name="sid" value="${student.id}">
            <p>姓名：<input type="text" value="${student.studentName}"></p>
            <p>入学时间：<input type="text" value="${student.comeTimeStr}"></p>
            <p>请选择要升班的课程<select name="cid" class="update_context">
            </select></p>
        <input type="submit" value="升班"/>
    </form>
    <%--<button onclick="update_class()">升班</button>--%>
</body>
</html>