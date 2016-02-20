/**
 * Genealogy
 * Xiao Hua Ma personal studio 2015.
 */
package com.maxiaohua.genealogy.main.biz.a01.dto;

import com.maxiaohua.genealogy.fw.core.type.Alias;
import com.maxiaohua.genealogy.main.biz.com.dto.UserInfoDTO;

/**
 * GenealogyApprovalInfoDTO DTO
 *
 * History
 * REV.         Updated Date           Updater              Infomation
 * -------      ---------------        ----------------     ------------------
 * 1.0          2016/02/09             TOOL                Create
 *
 */
@com.maxiaohua.genealogy.fw.core.type.AliasKanJi("家族申请信息")
public class GenealogyApprovalInfoDTO implements java.io.Serializable, Comparable<GenealogyApprovalInfoDTO> {
	/**
	 * System ID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 申请用户信息  
	 */
	@Alias("申请用户信息")
	private UserInfoDTO userInfo = null;

	/**
	 * 申请号  
	 */
	@Alias("申请号")
	private String approvalNO = null;

	/**
	 * 提交时间  
	 */
	@Alias("提交时间")
	private java.sql.Date submitDate = null;

	/**
	 * 申请理由  
	 */
	@Alias("申请理由")
	private String reason = null;

	/**
	 * 申请状态  
	 */
	@Alias("申请状态")
	private String status = null;

	/**
	 * 回复说明  
	 */
	@Alias("回复说明")
	private String reply = null;

	/**
	 * 回复时间  
	 */
	@Alias("回复时间")
	private java.sql.Date replyDate = null;

	/**
	 * <code>申请用户信息</code>返回
	 * @return <code>申请用户信息</code>
	 */
	public UserInfoDTO getUserInfo() {
		return this.userInfo;
	}

	/**
	 * <code>userInfo</code>设定
	 * @param userInfo　<code>userInfo</code>设定值
	 */
	public void setUserInfo(
			UserInfoDTO userInfo) {
		this.userInfo = userInfo;
	}

	/**
	 * <code>申请号</code>返回
	 * @return <code>申请号</code>
	 */
	public String getApprovalNO() {
		return this.approvalNO;
	}

	/**
	 * <code>approvalNO</code>设定
	 * @param approvalNO　<code>approvalNO</code>设定值
	 */
	public void setApprovalNO(
			String approvalNO) {
		this.approvalNO = approvalNO;
	}

	/**
	 * <code>提交时间</code>返回
	 * @return <code>提交时间</code>
	 */
	public java.sql.Date getSubmitDate() {
		return this.submitDate;
	}

	/**
	 * <code>submitDate</code>设定
	 * @param submitDate　<code>submitDate</code>设定值
	 */
	public void setSubmitDate(
			java.sql.Date submitDate) {
		this.submitDate = submitDate;
	}

	/**
	 * <code>申请理由</code>返回
	 * @return <code>申请理由</code>
	 */
	public String getReason() {
		return this.reason;
	}

	/**
	 * <code>reason</code>设定
	 * @param reason　<code>reason</code>设定值
	 */
	public void setReason(
			String reason) {
		this.reason = reason;
	}

	/**
	 * <code>申请状态</code>返回
	 * @return <code>申请状态</code>
	 */
	public String getStatus() {
		return this.status;
	}

	/**
	 * <code>status</code>设定
	 * @param status　<code>status</code>设定值
	 */
	public void setStatus(
			String status) {
		this.status = status;
	}

	/**
	 * <code>回复说明</code>返回
	 * @return <code>回复说明</code>
	 */
	public String getReply() {
		return this.reply;
	}

	/**
	 * <code>reply</code>设定
	 * @param reply　<code>reply</code>设定值
	 */
	public void setReply(
			String reply) {
		this.reply = reply;
	}

	/**
	 * <code>回复时间</code>返回
	 * @return <code>回复时间</code>
	 */
	public java.sql.Date getReplyDate() {
		return this.replyDate;
	}

	/**
	 * <code>replyDate</code>设定
	 * @param replyDate　<code>replyDate</code>设定值
	 */
	public void setReplyDate(
			java.sql.Date replyDate) {
		this.replyDate = replyDate;
	}

	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(GenealogyApprovalInfoDTO compareToDTO) {
		return this.equals(compareToDTO) ? 0 : -1;
	}
}
