package com.test.dao;
import com.test.pojo.Student;
import com.test.pojo.Study;

import java.util.List;

public interface StudentMapper {

    /*   List<Student> selectstudentandCoerse();*/
    //查询列表
    List<Student> selectAll();


    //升班操作=========start

    //先查询
    public Student selectStuByStuId(Integer stuId);
    //在修改
    public void updateCalss(Study study);
    //升班操作=========end

    //先查询


}