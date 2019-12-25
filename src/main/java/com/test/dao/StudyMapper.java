package com.test.dao;
import com.test.pojo.Student;
import com.test.pojo.Study;

import java.util.List;

public interface StudyMapper {

    //升班（添加新学课程）
    List<Study> addCoerse();

    int deleteByPrimaryKey(Integer id);

    int insert(Study record);

    int insertSelective(Study record);

    Study selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Study record);

    int updateByPrimaryKey(Study record);


    //修改的东西
    void updateByStatus(Integer stuId);

    void add(Study study);

 /*   //查询课程ID、
    Integer queryByStuId(String stuId);

    //修改学习次数和重修次数
    void updateByScount(Integer studyId);*/



    //整合后的方法
    public void updateByStuId(Integer stuId);

}