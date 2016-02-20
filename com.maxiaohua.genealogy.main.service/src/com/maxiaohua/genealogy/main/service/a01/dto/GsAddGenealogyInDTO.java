/* Genealogy
* Xiao Hua Ma personal studio 2015.
*/
package com.maxiaohua.genealogy.main.service.a01.dto;

import com.maxiaohua.genealogy.fw.core.type.Alias;
import com.maxiaohua.genealogy.main.biz.a01.dto.GenealogyInfoDTO;

/**
 * 增加家族的InDTO
 *
 * 变更履历
 * REV.         变更日期           变更者              变更内容
 * -------      ---------------    ----------------    ------------------
 * 1.0          2016/02/09         TOOL                初次作成
 *
 */
@com.maxiaohua.genealogy.fw.core.type.AliasKanJi("增加家族")
public class GsAddGenealogyInDTO implements java.io.Serializable, Comparable<GsAddGenealogyInDTO> {
	/**
	 * Serial ID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 家族信息  
	 */
	@Alias("家族信息")
	@com.maxiaohua.genealogy.fw.core.validator.type.NotNull
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
	public int compareTo(GsAddGenealogyInDTO compareToDTO) {
		return this.equals(compareToDTO) ? 0 : -1;
	}
}
