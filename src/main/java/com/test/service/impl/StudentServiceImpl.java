package com.test.service.impl;

import com.test.dao.StudentMapper;
import com.test.pojo.Student;
import com.test.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    private StudentMapper studentMapper;


    //查询所有学生列表
    public List<Student> findAll() {
        return studentMapper.selectAll();
    }

    @Override
    public Student selectStuByStuId(Integer stuId) {
        Student student = studentMapper.selectStuByStuId(stuId);

        return student;
    }

   /* public List<Student> selectstudentandCoerse() {
        return null;*/

}
