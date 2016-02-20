﻿/* Genealogy
* Xiao Hua Ma personal studio 2015.
*/
package com.maxiaohua.genealogy.main.service.a03.dto;

import com.maxiaohua.genealogy.fw.core.type.Alias;

/**
 * 更换密码的InDTO
 *
 * 变更履历
 * REV.         变更日期           变更者              变更内容
 * -------      ---------------    ----------------    ------------------
 * 1.0          2016/02/09         TOOL                初次作成
 *
 */
@com.maxiaohua.genealogy.fw.core.type.AliasKanJi("更换密码")
public class GsUpdatePasswordInDTO implements java.io.Serializable, Comparable<GsUpdatePasswordInDTO> {
	/**
	 * Serial ID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 旧密码  
	 */
	@Alias("旧密码")
	@com.maxiaohua.genealogy.fw.core.validator.type.NotNull
	private String oldPassword = null;

	/**
	 * 新密码  
	 */
	@Alias("新密码")
	@com.maxiaohua.genealogy.fw.core.validator.type.NotNull
	private String newPassword = null;

	/**
	 * <code>旧密码</code>返回
	 * @return <code>旧密码</code>
	 */
	public String getOldPassword() {
		return this.oldPassword;
	}

	/**
	 * <code>oldPassword</code>设定
	 * @param oldPassword　<code>oldPassword</code>设定值
	 */
	public void setOldPassword(
			String oldPassword) {
		this.oldPassword = oldPassword;
	}

	/**
	 * <code>新密码</code>返回
	 * @return <code>新密码</code>
	 */
	public String getNewPassword() {
		return this.newPassword;
	}

	/**
	 * <code>newPassword</code>设定
	 * @param newPassword　<code>newPassword</code>设定值
	 */
	public void setNewPassword(
			String newPassword) {
		this.newPassword = newPassword;
	}

	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(GsUpdatePasswordInDTO compareToDTO) {
		return this.equals(compareToDTO) ? 0 : -1;
	}
}
