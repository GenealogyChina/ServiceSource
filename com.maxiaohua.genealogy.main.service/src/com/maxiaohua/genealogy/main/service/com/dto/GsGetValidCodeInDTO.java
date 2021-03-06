﻿/* Genealogy
* Xiao Hua Ma personal studio 2015.
*/
package com.maxiaohua.genealogy.main.service.com.dto;

import com.maxiaohua.genealogy.fw.core.type.Alias;

/**
 * 发送验证码的InDTO
 *
 * 变更履历
 * REV.         变更日期           变更者              变更内容
 * -------      ---------------    ----------------    ------------------
 * 1.0          2016/02/09         TOOL                初次作成
 *
 */
@com.maxiaohua.genealogy.fw.core.type.AliasKanJi("发送验证码")
public class GsGetValidCodeInDTO implements java.io.Serializable, Comparable<GsGetValidCodeInDTO> {
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

	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(GsGetValidCodeInDTO compareToDTO) {
		return this.equals(compareToDTO) ? 0 : -1;
	}
}
