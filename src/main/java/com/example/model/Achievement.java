package com.example.model;

import java.util.Date;

public class Achievement {
    private Integer achId;

    private String staffNo;

    private String curNo;

    private String achGrade;

    private Boolean delFlg;

    private Integer version;

    private String createId;

    private Date createTime;

    private String updateId;

    private Date updateTime;

    public Integer getAchId() {
        return achId;
    }

    public void setAchId(Integer achId) {
        this.achId = achId;
    }

    public String getStaffNo() {
        return staffNo;
    }

    public void setStaffNo(String staffNo) {
        this.staffNo = staffNo == null ? null : staffNo.trim();
    }

    public String getCurNo() {
        return curNo;
    }

    public void setCurNo(String curNo) {
        this.curNo = curNo == null ? null : curNo.trim();
    }

    public String getAchGrade() {
        return achGrade;
    }

    public void setAchGrade(String achGrade) {
        this.achGrade = achGrade == null ? null : achGrade.trim();
    }

    public Boolean getDelFlg() {
        return delFlg;
    }

    public void setDelFlg(Boolean delFlg) {
        this.delFlg = delFlg;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getCreateId() {
        return createId;
    }

    public void setCreateId(String createId) {
        this.createId = createId == null ? null : createId.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdateId() {
        return updateId;
    }

    public void setUpdateId(String updateId) {
        this.updateId = updateId == null ? null : updateId.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}