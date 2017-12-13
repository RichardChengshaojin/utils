package com.xgd.tms.db.entity;

import java.math.BigDecimal;
import java.util.Date;

public class WfPosOrder {
    private BigDecimal id;

    private String procId;

    private String posOrderId;

    private String applyManId;

    private String jlAudit;

    private String jlRemark;

    private String xgdAudit;

    private String xgdRemark;

    private String expressCompany;

    private String expressNo;

    private Date applyTime;

    private Date jlTime;

    private Date xgdTime;

    private Date expressTime;

    public WfPosOrder(BigDecimal id, String procId, String posOrderId, String applyManId, String jlAudit, String jlRemark, String xgdAudit, String xgdRemark, String expressCompany, String expressNo, Date applyTime, Date jlTime, Date xgdTime, Date expressTime) {
        this.id = id;
        this.procId = procId;
        this.posOrderId = posOrderId;
        this.applyManId = applyManId;
        this.jlAudit = jlAudit;
        this.jlRemark = jlRemark;
        this.xgdAudit = xgdAudit;
        this.xgdRemark = xgdRemark;
        this.expressCompany = expressCompany;
        this.expressNo = expressNo;
        this.applyTime = applyTime;
        this.jlTime = jlTime;
        this.xgdTime = xgdTime;
        this.expressTime = expressTime;
    }

    public WfPosOrder() {
        super();
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getProcId() {
        return procId;
    }

    public void setProcId(String procId) {
        this.procId = procId == null ? null : procId.trim();
    }

    public String getPosOrderId() {
        return posOrderId;
    }

    public void setPosOrderId(String posOrderId) {
        this.posOrderId = posOrderId == null ? null : posOrderId.trim();
    }

    public String getApplyManId() {
        return applyManId;
    }

    public void setApplyManId(String applyManId) {
        this.applyManId = applyManId == null ? null : applyManId.trim();
    }

    public String getJlAudit() {
        return jlAudit;
    }

    public void setJlAudit(String jlAudit) {
        this.jlAudit = jlAudit == null ? null : jlAudit.trim();
    }

    public String getJlRemark() {
        return jlRemark;
    }

    public void setJlRemark(String jlRemark) {
        this.jlRemark = jlRemark == null ? null : jlRemark.trim();
    }

    public String getXgdAudit() {
        return xgdAudit;
    }

    public void setXgdAudit(String xgdAudit) {
        this.xgdAudit = xgdAudit == null ? null : xgdAudit.trim();
    }

    public String getXgdRemark() {
        return xgdRemark;
    }

    public void setXgdRemark(String xgdRemark) {
        this.xgdRemark = xgdRemark == null ? null : xgdRemark.trim();
    }

    public String getExpressCompany() {
        return expressCompany;
    }

    public void setExpressCompany(String expressCompany) {
        this.expressCompany = expressCompany == null ? null : expressCompany.trim();
    }

    public String getExpressNo() {
        return expressNo;
    }

    public void setExpressNo(String expressNo) {
        this.expressNo = expressNo == null ? null : expressNo.trim();
    }

    public Date getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
    }

    public Date getJlTime() {
        return jlTime;
    }

    public void setJlTime(Date jlTime) {
        this.jlTime = jlTime;
    }

    public Date getXgdTime() {
        return xgdTime;
    }

    public void setXgdTime(Date xgdTime) {
        this.xgdTime = xgdTime;
    }

    public Date getExpressTime() {
        return expressTime;
    }

    public void setExpressTime(Date expressTime) {
        this.expressTime = expressTime;
    }
}