package com.test.pojo;

public class Coerse {
    private Integer id;

    private String cName;

    private String prevCid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName == null ? null : cName.trim();
    }

    public String getPrevCid() {
        return prevCid;
    }

    public void setPrevCid(String prevCid) {
        this.prevCid = prevCid == null ? null : prevCid.trim();
    }
}