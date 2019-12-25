package com.test.service;

import com.test.pojo.Student;
import com.test.pojo.Study;

import java.util.List;

public interface StudyService {
    //修改的东西
    void updateByStatus(Integer stuId);

    void add(Study study);

/*    //修改学习次数和重修次数
    void updateByScount(Integer studyId);

    //查询课程Id
    Integer queryByStuId(String stuId);*/

    /****
     * 整合方法
     *
     * 修改末班学生的课程信息
     */
    public void updateByStuId(Integer stuId);
}
