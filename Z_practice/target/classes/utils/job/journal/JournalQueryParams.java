package utils.job.journal;

import java.io.Serializable;
import java.util.Date;

/**
 * 流水查询参数-前后端参数传输实体类
 * 
 * @author chengshaojin
 * @since 2016-10-17
 * 
 */
public class JournalQueryParams implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3417463757085559924L;

	/** 清算开始日期 */
	private Date clearBeginDate;
	
	/** 清算结束日期 */
	private Date clearEndDate;
	
	/** 交易开始时间 */
	private Date beginDate;

	/** 交易结束日期时间 */
	private Date endDate;

	/** 交易额范围-最小交易额 */
	private String amountMin;

	/** 交易额范围-最大交易额 */
	private String amountMax;

	/** 打印商户号 */
	private String printMerchantNo;

	/** mcc */
	private String mcc;

	/** 端类型 */
	private Integer endType;

	/** 商户号 */
	private String merchantNo;

	/** 商户名称 */
	private String merchantName;

	/** 终端号 */
	private String terminalNo;

	/** 代理商 */
	private String agent;

	/** 银行卡号 */
	private String cardNo;
	
	/** 交易类型（左端交易类型）*/
	private String tradeType;
	
	/** 右端交易状态 */
	private String rTradeStatus;
	
	/** 左端交易状态 */
	private String lTradeStatus;
	
	/** F_L_RESP_CODE 左端返回码，成功为00，其他情况为失败*/
	private String lRespCode;
	
	/** 分页-页容量 */
	private Integer numPerPage;
	
	/** 分页-页码 */
	private Integer pageNum;
	
	/** 分页-总数 */
	private Integer total;
	
	/**左端流水号*/
	private String lVouchNo;

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

	public Date getBeginDate() {
		return beginDate;
	}

	public void setBeginDate(Date beginDate) {
		this.beginDate = beginDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
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

	public Integer getEndType() {
		return endType;
	}

	public void setEndType(Integer endType) {
		this.endType = endType;
	}

	public String getMerchantNo() {
		return merchantNo;
	}

	public void setMerchantNo(String merchantNo) {
		this.merchantNo = merchantNo;
	}

	public String getMerchantName() {
		return merchantName;
	}

	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

	public String getTerminalNo() {
		return terminalNo;
	}

	public void setTerminalNo(String terminalNo) {
		this.terminalNo = terminalNo;
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

	public String getTradeType() {
		return tradeType;
	}

	public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}

	public String getrTradeStatus() {
		return rTradeStatus;
	}

	public void setrTradeStatus(String rTradeStatus) {
		this.rTradeStatus = rTradeStatus;
	}

	public String getlTradeStatus() {
		return lTradeStatus;
	}

	public void setlTradeStatus(String lTradeStatus) {
		this.lTradeStatus = lTradeStatus;
	}

	public String getlRespCode() {
		return lRespCode;
	}

	public void setlRespCode(String lRespCode) {
		this.lRespCode = lRespCode;
	}

	public Integer getNumPerPage() {
		return numPerPage;
	}

	public void setNumPerPage(Integer numPerPage) {
		this.numPerPage = numPerPage;
	}

	public Integer getPageNum() {
		return pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public String getlVouchNo() {
		return lVouchNo;
	}

	public void setlVouchNo(String lVouchNo) {
		this.lVouchNo = lVouchNo;
	}

	@Override
	public String toString() {
		return "JournalQueryParams{" +
				"clearBeginDate=" + clearBeginDate +
				", clearEndDate=" + clearEndDate +
				", beginDate=" + beginDate +
				", endDate=" + endDate +
				", amountMin='" + amountMin + '\'' +
				", amountMax='" + amountMax + '\'' +
				", printMerchantNo='" + printMerchantNo + '\'' +
				", mcc='" + mcc + '\'' +
				", endType=" + endType +
				", merchantNo='" + merchantNo + '\'' +
				", merchantName='" + merchantName + '\'' +
				", terminalNo='" + terminalNo + '\'' +
				", agent='" + agent + '\'' +
				", cardNo='" + cardNo + '\'' +
				", tradeType='" + tradeType + '\'' +
				", rTradeStatus='" + rTradeStatus + '\'' +
				", lTradeStatus='" + lTradeStatus + '\'' +
				", lRespCode='" + lRespCode + '\'' +
				", numPerPage=" + numPerPage +
				", pageNum=" + pageNum +
				", total=" + total +
				", lVouchNo='" + lVouchNo + '\'' +
				'}';
	}
}