package utils.job.journal;

import java.util.Date;

/**
 * DEC
 *
 * @auther chengshaojin
 * @since 2016/12/30
 */
public class JournalQueryVo {

    /**
     * 左端流水号
     */
    private String lVouchNo;

    /**
     * 清算开始日期
     */
    private Date clearBeginDate;

    /**
     * 清算结束日期
     */
    private Date clearEndDate;

    /**
     * 交易开始时间
     */
    private Date tradeBeginDate;

    /**
     * 交易结束日期时间
     */
    private Date tradeEndDate;

    /**
     * 交易额范围-最小交易额
     */
    private String amountMin;

    /**
     * 交易额范围-最大交易额
     */
    private String amountMax;

    /**
     * 打印商户号
     */
    private String printMerchantNo;

    /**
     * mcc
     */
    private String mcc;

    /**
     * 左端商户号
     */
    private String lMerchantNo;

    /**
     * 右端商户号
     */
    private String rMerchantNo;

    /**
     * 左端商户名称
     */
    private String lMerchantName;

    /**
     * 右端商户名称
     */
    private String rMerchantName;

    /**
     * 左端终端号
     */
    private String lTerminalNo;

    /**
     * 右端终端号
     */
    private String rTerminalNo;

    /**
     * 代理商
     */
    private String agent;

    /**
     * 银行卡号
     */
    private String cardNo;

    /**
     * 交易类型（左端交易类型）
     */
    private String[] tradeType;

    /**
     * F_L_RESP_CODE 左端返回码，成功为00，其他情况为失败
     */
    private String lRespCode;

    /**
     * 服务ID
     */
    private String serviceId;

    /**
     * 是否使用缓存
     */
    private Boolean useCache;

    /**
     * 开始行
     */
    private Integer start;

    /**
     * 总查询行数
     */
    private Integer rows;

    /**
     * 查询表名
     */
    private String tableName;

    public String getlVouchNo() {
        return lVouchNo;
    }

    public void setlVouchNo(String lVouchNo) {
        this.lVouchNo = lVouchNo;
    }

    public Date getClearBeginDate() {
        return clearBeginDate;
    }

    public void setClearBeginDate(Date clearBeginDate) {
        this.clearBeginDate = clearBeginDate;
    }

    public Date getClearEndDate() {
        return clearEndDate;
    }

    public void setClearEndDate(Date clearEndDate) {
        this.clearEndDate = clearEndDate;
    }

    public Date getTradeBeginDate() {
        return tradeBeginDate;
    }

    public void setTradeBeginDate(Date tradeBeginDate) {
        this.tradeBeginDate = tradeBeginDate;
    }

    public Date getTradeEndDate() {
        return tradeEndDate;
    }

    public void setTradeEndDate(Date tradeEndDate) {
        this.tradeEndDate = tradeEndDate;
    }

    public String getAmountMin() {
        return amountMin;
    }

    public void setAmountMin(String amountMin) {
        this.amountMin = amountMin;
    }

    public String getAmountMax() {
        return amountMax;
    }

    public void setAmountMax(String amountMax) {
        this.amountMax = amountMax;
    }

    public String getPrintMerchantNo() {
        return printMerchantNo;
    }

    public void setPrintMerchantNo(String printMerchantNo) {
        this.printMerchantNo = printMerchantNo;
    }

    public String getMcc() {
        return mcc;
    }

    public void setMcc(String mcc) {
        this.mcc = mcc;
    }

    public String getlMerchantNo() {
        return lMerchantNo;
    }

    public void setlMerchantNo(String lMerchantNo) {
        this.lMerchantNo = lMerchantNo;
    }

    public String getrMerchantNo() {
        return rMerchantNo;
    }

    public void setrMerchantNo(String rMerchantNo) {
        this.rMerchantNo = rMerchantNo;
    }

    public String getlMerchantName() {
        return lMerchantName;
    }

    public void setlMerchantName(String lMerchantName) {
        this.lMerchantName = lMerchantName;
    }

    public String getrMerchantName() {
        return rMerchantName;
    }

    public void setrMerchantName(String rMerchantName) {
        this.rMerchantName = rMerchantName;
    }

    public String getlTerminalNo() {
        return lTerminalNo;
    }

    public void setlTerminalNo(String lTerminalNo) {
        this.lTerminalNo = lTerminalNo;
    }

    public String getrTerminalNo() {
        return rTerminalNo;
    }

    public void setrTerminalNo(String rTerminalNo) {
        this.rTerminalNo = rTerminalNo;
    }

    public String getAgent() {
        return agent;
    }

    public void setAgent(String agent) {
        this.agent = agent;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getlRespCode() {
        return lRespCode;
    }

    public void setlRespCode(String lRespCode) {
        this.lRespCode = lRespCode;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public Boolean getUseCache() {
        return useCache;
    }

    public void setUseCache(Boolean useCache) {
        this.useCache = useCache;
    }

    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String[] getTradeType() {
        return tradeType;
    }

    public void setTradeType(String[] tradeType) {
        this.tradeType = tradeType;
    }
}
