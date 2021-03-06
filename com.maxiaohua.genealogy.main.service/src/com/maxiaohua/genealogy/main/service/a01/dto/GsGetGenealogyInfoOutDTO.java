﻿/* Genealogy
* Xiao Hua Ma personal studio 2015.
*/
package com.maxiaohua.genealogy.main.service.a01.dto;

import com.maxiaohua.genealogy.fw.core.type.Alias;
import com.maxiaohua.genealogy.main.biz.a01.dto.GenealogyInfoDTO;

/**
 * 获得家族详细信息的OutDTO
 *
 * 变更履历
 * REV.         变更日期           变更者              变更内容
 * -------      ---------------    ----------------    ------------------
 * 1.0          2016/02/09         TOOL                初次作成
 *
 */
@com.maxiaohua.genealogy.fw.core.type.AliasKanJi("获得家族详细信息")
public class GsGetGenealogyInfoOutDTO implements java.io.Serializable, Comparable<GsGetGenealogyInfoOutDTO> {
	/**
	 * Serial ID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 家族信息  
	 */
	@Alias("家族信息")
	private GenealogyInfoDTO genealogyInfo = null;

	/**
	 * <code>家族信息</code>返回
	 * @return <code>家族信息</code>
	 */
	public GenealogyInfoDTO getGenealogyInfo() {
		return this.genealogyInfo;
	}

	/**
	 * <code>genealogyInfo</code>设定
	 * @param genealogyInfo　<code>genealogyInfo</code>设定值
	 */
	public void setGenealogyInfo(
			GenealogyInfoDTO genealogyInfo) {
		this.genealogyInfo = genealogyInfo;
	}

	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(GsGetGenealogyInfoOutDTO compareToDTO) {
		return this.equals(compareToDTO) ? 0 : -1;
	}
}
