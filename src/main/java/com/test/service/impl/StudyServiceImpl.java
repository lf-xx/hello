package com.test.service.impl;

import com.test.dao.StudyMapper;
import com.test.pojo.Study;
import com.test.service.StudyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class StudyServiceImpl implements StudyService {

    @Autowired
    private StudyMapper studyMapper;

    //修改学习状
    @Override
    public void updateByStatus(Integer stuId) {
        studyMapper.updateByStatus(stuId);
    }
    //给升班学生添加新课程
    @Override
    public void add(Study study) {
        studyMapper.add(study);
    }

    //修改末班学生的课程状态
    @Override
    public void updateByStuId(Integer stuId) {
        studyMapper.updateByStuId(stuId);
    }
}