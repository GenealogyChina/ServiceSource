/**
 * Genealogy
 * Xiao Hua Ma personal studio 2015.
 */
package com.maxiaohua.genealogy.main.biz.a01.dto;

import com.maxiaohua.genealogy.fw.core.type.Alias;

/**
 * PhoneNoteDTO DTO
 *
 * History
 * REV.         Updated Date           Updater              Infomation
 * -------      ---------------        ----------------     ------------------
 * 1.0          2016/02/09             TOOL                Create
 *
 */
@com.maxiaohua.genealogy.fw.core.type.AliasKanJi("电话本信息")
public class PhoneNoteDTO implements java.io.Serializable, Comparable<PhoneNoteDTO> {
	/**
	 * System ID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 用户号  
	 */
	@Alias("用户号")
	private String userNO = null;

	/**
	 * 用户名  
	 */
	@Alias("用户名")
	private String name = null;

	/**
	 * 电话号  
	 */
	@Alias("电话号")
	private String mobile = null;

	/**
	 * <code>用户号</code>返回
	 * @return <code>用户号</code>
	 */
	public String getUserNO() {
		return this.userNO;
	}

	/**
	 * <code>userNO</code>设定
	 * @param userNO　<code>userNO</code>设定值
	 */
	public void setUserNO(
			String userNO) {
		this.userNO = userNO;
	}

	/**
	 * <code>用户名</code>返回
	 * @return <code>用户名</code>
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * <code>name</code>设定
	 * @param name　<code>name</code>设定值
	 */
	public void setName(
			String name) {
		this.name = name;
	}

	/**
	 * <code>电话号</code>返回
	 * @return <code>电话号</code>
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

	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(PhoneNoteDTO compareToDTO) {
		return this.equals(compareToDTO) ? 0 : -1;
	}
}
