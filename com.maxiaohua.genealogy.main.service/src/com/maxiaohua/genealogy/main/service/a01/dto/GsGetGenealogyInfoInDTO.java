/* Genealogy
* Xiao Hua Ma personal studio 2015.
*/
package com.maxiaohua.genealogy.main.service.a01.dto;

import com.maxiaohua.genealogy.fw.core.type.Alias;

/**
 * 获得家族详细信息的InDTO
 *
 * 变更履历
 * REV.         变更日期           变更者              变更内容
 * -------      ---------------    ----------------    ------------------
 * 1.0          2016/02/09         TOOL                初次作成
 *
 */
@com.maxiaohua.genealogy.fw.core.type.AliasKanJi("获得家族详细信息")
public class GsGetGenealogyInfoInDTO implements java.io.Serializable, Comparable<GsGetGenealogyInfoInDTO> {
	/**
	 * Serial ID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 家族号  
	 */
	@Alias("家族号")
	@com.maxiaohua.genealogy.fw.core.validator.type.NotNull
	private String genealogyNO = null;

	/**
	 * <code>家族号</code>返回
	 * @return <code>家族号</code>
	 */
	public String getGenealogyNO() {
		return this.genealogyNO;
	}

	/**
	 * <code>genealogyNO</code>设定
	 * @param genealogyNO　<code>genealogyNO</code>设定值
	 */
	public void setGenealogyNO(
			String genealogyNO) {
		this.genealogyNO = genealogyNO;
	}

	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(GsGetGenealogyInfoInDTO compareToDTO) {
		return this.equals(compareToDTO) ? 0 : -1;
	}
}
