package com.ssm.generator.model;

import java.util.Date;

public class ChildrenInfo {
    private Integer id;

    private String uuid;

    private Integer userId;

    private String realName;

    private String logoPath;

    private Integer sex;

    private Date birthday;

    private String signature;

    private Integer followerNumber;

    private Integer zyNumner;

    private Integer reportNumber;

    private Integer signNumber;

    private Integer kqNumber;

    private Integer moodNumber;

    private Integer courseNumber;

    private Integer parentsNumber;

    private Date addDate;

    private Integer isOpen;

    private Integer createUserId;

    private String address;

    private String qrCodePath;

    private String latlngX;

    private String latlngY;

    private String cardNo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    public String getLogoPath() {
        return logoPath;
    }

    public void setLogoPath(String logoPath) {
        this.logoPath = logoPath == null ? null : logoPath.trim();
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature == null ? null : signature.trim();
    }

    public Integer getFollowerNumber() {
        return followerNumber;
    }

    public void setFollowerNumber(Integer followerNumber) {
        this.followerNumber = followerNumber;
    }

    public Integer getZyNumner() {
        return zyNumner;
    }

    public void setZyNumner(Integer zyNumner) {
        this.zyNumner = zyNumner;
    }

    public Integer getReportNumber() {
        return reportNumber;
    }

    public void setReportNumber(Integer reportNumber) {
        this.reportNumber = reportNumber;
    }

    public Integer getSignNumber() {
        return signNumber;
    }

    public void setSignNumber(Integer signNumber) {
        this.signNumber = signNumber;
    }

    public Integer getKqNumber() {
        return kqNumber;
    }

    public void setKqNumber(Integer kqNumber) {
        this.kqNumber = kqNumber;
    }

    public Integer getMoodNumber() {
        return moodNumber;
    }

    public void setMoodNumber(Integer moodNumber) {
        this.moodNumber = moodNumber;
    }

    public Integer getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(Integer courseNumber) {
        this.courseNumber = courseNumber;
    }

    public Integer getParentsNumber() {
        return parentsNumber;
    }

    public void setParentsNumber(Integer parentsNumber) {
        this.parentsNumber = parentsNumber;
    }

    public Date getAddDate() {
        return addDate;
    }

    public void setAddDate(Date addDate) {
        this.addDate = addDate;
    }

    public Integer getIsOpen() {
        return isOpen;
    }

    public void setIsOpen(Integer isOpen) {
        this.isOpen = isOpen;
    }

    public Integer getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(Integer createUserId) {
        this.createUserId = createUserId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getQrCodePath() {
        return qrCodePath;
    }

    public void setQrCodePath(String qrCodePath) {
        this.qrCodePath = qrCodePath == null ? null : qrCodePath.trim();
    }

    public String getLatlngX() {
        return latlngX;
    }

    public void setLatlngX(String latlngX) {
        this.latlngX = latlngX == null ? null : latlngX.trim();
    }

    public String getLatlngY() {
        return latlngY;
    }

    public void setLatlngY(String latlngY) {
        this.latlngY = latlngY == null ? null : latlngY.trim();
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo == null ? null : cardNo.trim();
    }
}