package com.example.model;

import java.util.Date;

public class Curriculum {
    private Integer curId;

    private String curSemester;

    private String curNo;

    private String curName;

    private String curCredit;

    private String curHour;

    private String curAssessment;

    private String curAttributes;

    private String curNature;

    private String staffNo;

    private Boolean delFlg;

    private Integer version;

    private String createId;

    private Date createTime;

    private String updateId;

    private Date updateTime;

    public Integer getCurId() {
        return curId;
    }

    public void setCurId(Integer curId) {
        this.curId = curId;
    }

    public String getCurSemester() {
        return curSemester;
    }

    public void setCurSemester(String curSemester) {
        this.curSemester = curSemester == null ? null : curSemester.trim();
    }

    public String getCurNo() {
        return curNo;
    }

    public void setCurNo(String curNo) {
        this.curNo = curNo == null ? null : curNo.trim();
    }

    public String getCurName() {
        return curName;
    }

    public void setCurName(String curName) {
        this.curName = curName == null ? null : curName.trim();
    }

    public String getCurCredit() {
        return curCredit;
    }

    public void setCurCredit(String curCredit) {
        this.curCredit = curCredit == null ? null : curCredit.trim();
    }

    public String getCurHour() {
        return curHour;
    }

    public void setCurHour(String curHour) {
        this.curHour = curHour == null ? null : curHour.trim();
    }

    public String getCurAssessment() {
        return curAssessment;
    }

    public void setCurAssessment(String curAssessment) {
        this.curAssessment = curAssessment == null ? null : curAssessment.trim();
    }

    public String getCurAttributes() {
        return curAttributes;
    }

    public void setCurAttributes(String curAttributes) {
        this.curAttributes = curAttributes == null ? null : curAttributes.trim();
    }

    public String getCurNature() {
        return curNature;
    }

    public void setCurNature(String curNature) {
        this.curNature = curNature == null ? null : curNature.trim();
    }

    public String getStaffNo() {
        return staffNo;
    }

    public void setStaffNo(String staffNo) {
        this.staffNo = staffNo == null ? null : staffNo.trim();
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