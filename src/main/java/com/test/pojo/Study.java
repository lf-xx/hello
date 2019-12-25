package com.test.pojo;

public class Study {
    private Integer studyId;
    private String sid;//学生id
    private Integer cid;//课程id
    private Integer scount;//总次数
    private Integer restudy;//重修次数
    private Integer studying;//学习状态


    public Study(Integer studyId, String sid, Integer cid, Integer scount, Integer studying, Integer restudy) {
        this.studyId = studyId;
        this.sid = sid;
        this.cid = cid;
        this.scount = scount;
        this.studying = studying;
        this.restudy = restudy;
    }

    public Study() {
    }

    public Integer getStudyId() {
        return studyId;
    }

    public void setStudyId(Integer id) {
        this.studyId = studyId;
    }

    @Override
    public String toString() {
        return "Study{" +
                "studyId=" + studyId +
                ", sid='" + sid + '\'' +
                ", cid=" + cid +
                ", scount=" + scount +
                ", studying=" + studying +
                ", restudy=" + restudy +
                '}';
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getScount() {
        return scount;
    }

    public void setScount(Integer scount) {
        this.scount = scount;
    }

    public Integer getStudying() {
        return studying;
    }

    public void setStudying(Integer studying) {
        this.studying = studying;
    }

    public Integer getRestudy() {
        return restudy;
    }

    public void setRestudy(Integer restudy) {
        this.restudy = restudy;
    }
}