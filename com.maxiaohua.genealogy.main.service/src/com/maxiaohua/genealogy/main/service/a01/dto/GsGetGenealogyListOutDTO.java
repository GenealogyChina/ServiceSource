/* Genealogy
* Xiao Hua Ma personal studio 2015.
*/
package com.maxiaohua.genealogy.main.service.a01.dto;

import com.maxiaohua.genealogy.fw.core.type.Alias;
import com.maxiaohua.genealogy.main.biz.a01.dto.GenealogyInfoDTO;

/**
 * 获得家族列表的OutDTO
 *
 * 变更履历
 * REV.         变更日期           变更者              变更内容
 * -------      ---------------    ----------------    ------------------
 * 1.0          2016/02/09         TOOL                初次作成
 *
 */
@com.maxiaohua.genealogy.fw.core.type.AliasKanJi("获得家族列表")
public class GsGetGenealogyListOutDTO implements java.io.Serializable, Comparable<GsGetGenealogyListOutDTO> {
	/**
	 * Serial ID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 家族列表  
	 */
	@Alias("家族列表")
	private GenealogyInfoDTO[] genealogyArray = null;

	/**
	 * <code>家族列表</code>返回
	 * @return <code>家族列表</code>
	 */
	public GenealogyInfoDTO[] getGenealogyArray() {
		return this.genealogyArray;
	}

	/**
	 * <code>genealogyArray</code>设定
	 * @param genealogyArray　<code>genealogyArray</code>设定值
	 */
	public void setGenealogyArray(
			GenealogyInfoDTO[] genealogyArray) {
		this.genealogyArray = genealogyArray;
	}

	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(GsGetGenealogyListOutDTO compareToDTO) {
		return this.equals(compareToDTO) ? 0 : -1;
	}
}
