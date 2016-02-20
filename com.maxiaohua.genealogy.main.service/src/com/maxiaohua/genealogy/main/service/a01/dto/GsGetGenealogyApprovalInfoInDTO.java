/* Genealogy
* Xiao Hua Ma personal studio 2015.
*/
package com.maxiaohua.genealogy.main.service.a01.dto;

import com.maxiaohua.genealogy.fw.core.type.Alias;

/**
 * 获得家族审批明细的InDTO
 *
 * 变更履历
 * REV.         变更日期           变更者              变更内容
 * -------      ---------------    ----------------    ------------------
 * 1.0          2016/02/09         TOOL                初次作成
 *
 */
@com.maxiaohua.genealogy.fw.core.type.AliasKanJi("获得家族审批明细")
public class GsGetGenealogyApprovalInfoInDTO implements java.io.Serializable, Comparable<GsGetGenealogyApprovalInfoInDTO> {
	/**
	 * Serial ID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 审批号  
	 */
	@Alias("审批号")
	@com.maxiaohua.genealogy.fw.core.validator.type.NotNull
	private String approvalNO = null;

	/**
	 * <code>审批号</code>返回
	 * @return <code>审批号</code>
	 */
	public String getApprovalNO() {
		return this.approvalNO;
	}

	/**
	 * <code>approvalNO</code>设定
	 * @param approvalNO　<code>approvalNO</code>设定值
	 */
	public void setApprovalNO(
			String approvalNO) {
		this.approvalNO = approvalNO;
	}

	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(GsGetGenealogyApprovalInfoInDTO compareToDTO) {
		return this.equals(compareToDTO) ? 0 : -1;
	}
}
