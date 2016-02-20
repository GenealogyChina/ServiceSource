/* Genealogy
* Xiao Hua Ma personal studio 2015.
*/
package com.maxiaohua.genealogy.main.service.com.dto;

import com.maxiaohua.genealogy.fw.core.type.Alias;

/**
 * 登录的InDTO
 *
 * 变更履历
 * REV.         变更日期           变更者              变更内容
 * -------      ---------------    ----------------    ------------------
 * 1.0          2016/02/09         TOOL                初次作成
 *
 */
@com.maxiaohua.genealogy.fw.core.type.AliasKanJi("登录")
public class GsLoginInDTO implements java.io.Serializable, Comparable<GsLoginInDTO> {
	/**
	 * Serial ID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 手机号  
	 */
	@Alias("手机号")
	@com.maxiaohua.genealogy.fw.core.validator.type.NotNull
	private String mobile = null;

	/**
	 * 密码  
	 */
	@Alias("密码")
	@com.maxiaohua.genealogy.fw.core.validator.type.NotNull
	private String password = null;

	/**
	 * 操作系统类型  
	 */
	@Alias("操作系统类型")
	@com.maxiaohua.genealogy.fw.core.validator.type.NotNull
	private String imsi = null;

	/**
	 * 极光推送ID  
	 */
	@Alias("极光推送ID")
	private String regisitrationID = null;

	/**
	 * <code>手机号</code>返回
	 * @return <code>手机号</code>
	 */
	public String getMobile() {
		return this.mobile;
	}

	/**
	 * <code>mobile</code>设定
	 * @param mobile　<code>mobile</code>设定值
	 */
	public void setMobile(
			String mobile) {
		this.mobile = mobile;
	}

	/**
	 * <code>密码</code>返回
	 * @return <code>密码</code>
	 */
	public String getPassword() {
		return this.password;
	}

	/**
	 * <code>password</code>设定
	 * @param password　<code>password</code>设定值
	 */
	public void setPassword(
			String password) {
		this.password = password;
	}

	/**
	 * <code>操作系统类型</code>返回
	 * @return <code>操作系统类型</code>
	 */
	public String getImsi() {
		return this.imsi;
	}

	/**
	 * <code>imsi</code>设定
	 * @param imsi　<code>imsi</code>设定值
	 */
	public void setImsi(
			String imsi) {
		this.imsi = imsi;
	}

	/**
	 * <code>极光推送ID</code>返回
	 * @return <code>极光推送ID</code>
	 */
	public String getRegisitrationID() {
		return this.regisitrationID;
	}

	/**
	 * <code>regisitrationID</code>设定
	 * @param regisitrationID　<code>regisitrationID</code>设定值
	 */
	public void setRegisitrationID(
			String regisitrationID) {
		this.regisitrationID = regisitrationID;
	}

	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(GsLoginInDTO compareToDTO) {
		return this.equals(compareToDTO) ? 0 : -1;
	}
}
