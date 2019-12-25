package com.test.service;

import com.test.pojo.Student;

import java.util.List;

public interface StudentService {
    //查询学生列表
    List<Student> findAll();


    //修改的查询方法
    public Student selectStuByStuId(Integer stuId);
}
