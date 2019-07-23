package com.yyfax.activity.domain;

import java.util.Date;

public class RecommendCommissionRuleDO {
    private Long id;

    private Long infoId;

    private Long beginAmount;

    private Long endAmount;

    private Long commissionAmount;

    private Byte state;

    private String createBy;

    private Date createTime;

    private String updateBy;

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

    public Long getBeginAmount() {
        return beginAmount;
    }

    public void setBeginAmount(Long beginAmount) {
        this.beginAmount = beginAmount;
    }

    public Long getEndAmount() {
        return endAmount;
    }

    public void setEndAmount(Long endAmount) {
        this.endAmount = endAmount;
    }

    public Long getCommissionAmount() {
        return commissionAmount;
    }

    public void setCommissionAmount(Long commissionAmount) {
        this.commissionAmount = commissionAmount;
    }

    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}