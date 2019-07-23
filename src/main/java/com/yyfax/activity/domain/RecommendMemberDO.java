package com.yyfax.activity.domain;

import java.util.Date;

public class RecommendMemberDO {
    private Long id;

    private Long infoId;

    private String userId;

    private Byte state;

    private Byte recommendState;

    private Date quitTime;

    private Date stopTime;

    private Byte joinType;

    private Date joinTime;

    private Integer inviteNum;

    private Long expectAmount;

    private Long actualAmount;

    private Byte noticeState;

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

    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
    }

    public Byte getRecommendState() {
        return recommendState;
    }

    public void setRecommendState(Byte recommendState) {
        this.recommendState = recommendState;
    }

    public Date getQuitTime() {
        return quitTime;
    }

    public void setQuitTime(Date quitTime) {
        this.quitTime = quitTime;
    }

    public Date getStopTime() {
        return stopTime;
    }

    public void setStopTime(Date stopTime) {
        this.stopTime = stopTime;
    }

    public Byte getJoinType() {
        return joinType;
    }

    public void setJoinType(Byte joinType) {
        this.joinType = joinType;
    }

    public Date getJoinTime() {
        return joinTime;
    }

    public void setJoinTime(Date joinTime) {
        this.joinTime = joinTime;
    }

    public Integer getInviteNum() {
        return inviteNum;
    }

    public void setInviteNum(Integer inviteNum) {
        this.inviteNum = inviteNum;
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

    public Byte getNoticeState() {
        return noticeState;
    }

    public void setNoticeState(Byte noticeState) {
        this.noticeState = noticeState;
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