/* Genealogy
* Xiao Hua Ma personal studio 2015.
*/
package com.maxiaohua.genealogy.main.service.a01.dto;

import com.maxiaohua.genealogy.fw.core.type.Alias;

/**
 * 退出家族的InDTO
 *
 * 变更履历
 * REV.         变更日期           变更者              变更内容
 * -------      ---------------    ----------------    ------------------
 * 1.0          2016/02/09         TOOL                初次作成
 *
 */
@com.maxiaohua.genealogy.fw.core.type.AliasKanJi("退出家族")
public class GsExitGenealogyInDTO implements java.io.Serializable, Comparable<GsExitGenealogyInDTO> {
	/**
	 * Serial ID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 家族号  
	 */
	@Alias("家族号")
	private String genealogyInfoNO = null;

	/**
	 * <code>家族号</code>返回
	 * @return <code>家族号</code>
	 */
	public String getGenealogyInfoNO() {
		return this.genealogyInfoNO;
	}

	/**
	 * <code>genealogyInfoNO</code>设定
	 * @param genealogyInfoNO　<code>genealogyInfoNO</code>设定值
	 */
	public void setGenealogyInfoNO(
			String genealogyInfoNO) {
		this.genealogyInfoNO = genealogyInfoNO;
	}

	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(GsExitGenealogyInDTO compareToDTO) {
		return this.equals(compareToDTO) ? 0 : -1;
	}
}
