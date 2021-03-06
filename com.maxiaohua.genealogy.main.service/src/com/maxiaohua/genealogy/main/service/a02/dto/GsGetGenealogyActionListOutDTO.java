﻿/* Genealogy
* Xiao Hua Ma personal studio 2015.
*/
package com.maxiaohua.genealogy.main.service.a02.dto;

import com.maxiaohua.genealogy.fw.core.type.Alias;
import com.maxiaohua.genealogy.main.biz.a02.dto.ViewActionDTO;

/**
 * 获得关联家族最新信息列表的OutDTO
 *
 * 变更履历
 * REV.         变更日期           变更者              变更内容
 * -------      ---------------    ----------------    ------------------
 * 1.0          2016/02/09         TOOL                初次作成
 *
 */
@com.maxiaohua.genealogy.fw.core.type.AliasKanJi("获得关联家族最新信息列表")
public class GsGetGenealogyActionListOutDTO implements java.io.Serializable, Comparable<GsGetGenealogyActionListOutDTO> {
	/**
	 * Serial ID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 活动列表  
	 */
	@Alias("活动列表")
	private ViewActionDTO[] actions = null;

	/**
	 * <code>活动列表</code>返回
	 * @return <code>活动列表</code>
	 */
	public ViewActionDTO[] getActions() {
		return this.actions;
	}

	/**
	 * <code>actions</code>设定
	 * @param actions　<code>actions</code>设定值
	 */
	public void setActions(
			ViewActionDTO[] actions) {
		this.actions = actions;
	}

	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(GsGetGenealogyActionListOutDTO compareToDTO) {
		return this.equals(compareToDTO) ? 0 : -1;
	}
}
