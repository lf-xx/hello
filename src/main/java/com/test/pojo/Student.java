package com.test.pojo;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Student implements Serializable {
    private static final long serialVersionUID = 4971308332242908240L;
    private Integer id;
    private String studentName;
    //@JSONField(format="yyyy-MM-dd")
    private Date cometime;
    private List<Coerse> coerses;//课程集合
    private Integer scount;//总次数
    private Integer restudy;//重修次数
    private Integer coersId;


    private Integer studyId;//学习表Id

    public Integer getStudyId() {
        return studyId;
    }

    public void setStudyId(Integer studyId) {
        this.studyId = studyId;
    }

    public Integer getCoersId() {
        return coersId;
    }

    public void setCoersId(Integer coersId) {
        this.coersId = coersId;
    }

    //中间表的集合
    //private Study studys;
    private List<Study> studys;
    //拼接字符串 :用来拼接查询到的课程集合的名称
    private String coersees;

    private String comeTimeStr;//字符串时间


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Date getCometime() {
        return cometime;
    }

    public void setCometime(Date cometime) {
        this.cometime = cometime;
    }

    public List<Coerse> getCoerses() {
        return coerses;
    }

    public void setCoerses(List<Coerse> coerses) {
        this.coerses = coerses;
    }

    public Integer getScount() {
        return scount;
    }

    public void setScount(Integer scount) {
        this.scount = scount;
    }

    public Integer getRestudy() {
        return restudy;
    }

    public void setRestudy(Integer restudy) {
        this.restudy = restudy;
    }

    public List<Study> getStudys() {
        return studys;
    }

    public void setStudys(List<Study> studys) {
        this.studys = studys;
    }

    public String getCoersees() {
        return coersees;
    }

    public void setCoersees(String coersees) {
        this.coersees = coersees;
    }

    public Student() {
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Student{");
        sb.append("id=").append(id);
        sb.append(", studentName='").append(studentName).append('\'');
        sb.append(", cometime=").append(cometime);
        sb.append(", coerses=").append(coerses);
        sb.append(", scount=").append(scount);
        sb.append(", restudy=").append(restudy);
        sb.append(", studys=").append(studys);
        sb.append(", coersees='").append(coersees).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getComeTimeStr() {
        return comeTimeStr;
    }

    public void setComeTimeStr(String comeTimeStr) {
        this.comeTimeStr = comeTimeStr;
    }
}