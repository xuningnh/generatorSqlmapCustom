package com.zmn.erp.model;

import java.util.Date;

public class LedgerOtherExpenses {
    private Long serialId;

    private Integer masterId;

    private Integer manageCompanyId;

    private Integer cityId;

    private Integer moneyType;

    private Long businessId;

    private Integer moneyAmount;

    private Integer incomeAmount;

    private Date ledgerTime;

    private Integer balanceAmount;

    private Short stateStatus;

    private String creater;

    private Date createTime;

    private String updater;

    private Date updateTime;

    private Short valid;

    private String remark;

    private Short plat;

    public Long getSerialId() {
        return serialId;
    }

    public void setSerialId(Long serialId) {
        this.serialId = serialId;
    }

    public Integer getMasterId() {
        return masterId;
    }

    public void setMasterId(Integer masterId) {
        this.masterId = masterId;
    }

    public Integer getManageCompanyId() {
        return manageCompanyId;
    }

    public void setManageCompanyId(Integer manageCompanyId) {
        this.manageCompanyId = manageCompanyId;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public Integer getMoneyType() {
        return moneyType;
    }

    public void setMoneyType(Integer moneyType) {
        this.moneyType = moneyType;
    }

    public Long getBusinessId() {
        return businessId;
    }

    public void setBusinessId(Long businessId) {
        this.businessId = businessId;
    }

    public Integer getMoneyAmount() {
        return moneyAmount;
    }

    public void setMoneyAmount(Integer moneyAmount) {
        this.moneyAmount = moneyAmount;
    }

    public Integer getIncomeAmount() {
        return incomeAmount;
    }

    public void setIncomeAmount(Integer incomeAmount) {
        this.incomeAmount = incomeAmount;
    }

    public Date getLedgerTime() {
        return ledgerTime;
    }

    public void setLedgerTime(Date ledgerTime) {
        this.ledgerTime = ledgerTime;
    }

    public Integer getBalanceAmount() {
        return balanceAmount;
    }

    public void setBalanceAmount(Integer balanceAmount) {
        this.balanceAmount = balanceAmount;
    }

    public Short getStateStatus() {
        return stateStatus;
    }

    public void setStateStatus(Short stateStatus) {
        this.stateStatus = stateStatus;
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater == null ? null : creater.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdater() {
        return updater;
    }

    public void setUpdater(String updater) {
        this.updater = updater == null ? null : updater.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Short getValid() {
        return valid;
    }

    public void setValid(Short valid) {
        this.valid = valid;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Short getPlat() {
        return plat;
    }

    public void setPlat(Short plat) {
        this.plat = plat;
    }
}