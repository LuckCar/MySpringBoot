package com.example.model;

public class Teacher {
    private Integer teaId;

    private String teaNo;

    private String teaName;

    private String teaGender;

    private String teaTitle;

    private String teaDepart;

    private String teaTel;

    public Integer getTeaId() {
        return teaId;
    }

    public void setTeaId(Integer teaId) {
        this.teaId = teaId;
    }

    public String getTeaNo() {
        return teaNo;
    }

    public void setTeaNo(String teaNo) {
        this.teaNo = teaNo == null ? null : teaNo.trim();
    }

    public String getTeaName() {
        return teaName;
    }

    public void setTeaName(String teaName) {
        this.teaName = teaName == null ? null : teaName.trim();
    }

    public String getTeaGender() {
        return teaGender;
    }

    public void setTeaGender(String teaGender) {
        this.teaGender = teaGender == null ? null : teaGender.trim();
    }

    public String getTeaTitle() {
        return teaTitle;
    }

    public void setTeaTitle(String teaTitle) {
        this.teaTitle = teaTitle == null ? null : teaTitle.trim();
    }

    public String getTeaDepart() {
        return teaDepart;
    }

    public void setTeaDepart(String teaDepart) {
        this.teaDepart = teaDepart == null ? null : teaDepart.trim();
    }

    public String getTeaTel() {
        return teaTel;
    }

    public void setTeaTel(String teaTel) {
        this.teaTel = teaTel == null ? null : teaTel.trim();
    }
}