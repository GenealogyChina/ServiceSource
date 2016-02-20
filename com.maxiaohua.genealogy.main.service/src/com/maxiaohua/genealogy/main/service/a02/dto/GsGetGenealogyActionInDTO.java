﻿/* Genealogy
* Xiao Hua Ma personal studio 2015.
*/
package com.maxiaohua.genealogy.main.service.a02.dto;

import com.maxiaohua.genealogy.fw.core.type.Alias;

/**
 * 获得家族信息详细的InDTO
 *
 * 变更履历
 * REV.         变更日期           变更者              变更内容
 * -------      ---------------    ----------------    ------------------
 * 1.0          2016/02/09         TOOL                初次作成
 *
 */
@com.maxiaohua.genealogy.fw.core.type.AliasKanJi("获得家族信息详细")
public class GsGetGenealogyActionInDTO implements java.io.Serializable, Comparable<GsGetGenealogyActionInDTO> {
	/**
	 * Serial ID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 活动号  
	 */
	@Alias("活动号")
	@com.maxiaohua.genealogy.fw.core.validator.type.NotNull
	private String actionNO = null;

	/**
	 * <code>活动号</code>返回
	 * @return <code>活动号</code>
	 */
	public String getActionNO() {
		return this.actionNO;
	}

	/**
	 * <code>actionNO</code>设定
	 * @param actionNO　<code>actionNO</code>设定值
	 */
	public void setActionNO(
			String actionNO) {
		this.actionNO = actionNO;
	}

	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(GsGetGenealogyActionInDTO compareToDTO) {
		return this.equals(compareToDTO) ? 0 : -1;
	}
}
