package com.yyfax.activity.domain;

import java.util.Date;

public class RecommendRecordDO {
    private Long id;

    private Long infoId;

    private String userId;

    private String inviteId;

    private Date registerTime;

    private Byte recommendState;

    private Date stopTime;

    private Long investAmount;

    private Long expectAmount;

    private Long actualAmount;

    private Date createTime;

    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getInfoId() {
        return infoId;
    }

    public void setInfoId(Long infoId) {
        this.infoId = infoId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getInviteId() {
        return inviteId;
    }

    public void setInviteId(String inviteId) {
        this.inviteId = inviteId == null ? null : inviteId.trim();
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    public Byte getRecommendState() {
        return recommendState;
    }

    public void setRecommendState(Byte recommendState) {
        this.recommendState = recommendState;
    }

    public Date getStopTime() {
        return stopTime;
    }

    public void setStopTime(Date stopTime) {
        this.stopTime = stopTime;
    }

    public Long getInvestAmount() {
        return investAmount;
    }

    public void setInvestAmount(Long investAmount) {
        this.investAmount = investAmount;
    }

    public Long getExpectAmount() {
        return expectAmount;
    }

    public void setExpectAmount(Long expectAmount) {
        this.expectAmount = expectAmount;
    }

    public Long getActualAmount() {
        return actualAmount;
    }

    public void setActualAmount(Long actualAmount) {
        this.actualAmount = actualAmount;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}