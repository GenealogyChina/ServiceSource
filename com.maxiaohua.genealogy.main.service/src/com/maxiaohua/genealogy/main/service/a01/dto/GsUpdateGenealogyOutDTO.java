﻿/* Genealogy
* Xiao Hua Ma personal studio 2015.
*/
package com.maxiaohua.genealogy.main.service.a01.dto;


/**
 * 更改家族情况的OutDTO
 *
 * 变更履历
 * REV.         变更日期           变更者              变更内容
 * -------      ---------------    ----------------    ------------------
 * 1.0          2016/02/09         TOOL                初次作成
 *
 */
@com.maxiaohua.genealogy.fw.core.type.AliasKanJi("更改家族情况")
public class GsUpdateGenealogyOutDTO implements java.io.Serializable, Comparable<GsUpdateGenealogyOutDTO> {
	/**
	 * Serial ID
	 */
	private static final long serialVersionUID = 1L;

	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(GsUpdateGenealogyOutDTO compareToDTO) {
		return this.equals(compareToDTO) ? 0 : -1;
	}
}
