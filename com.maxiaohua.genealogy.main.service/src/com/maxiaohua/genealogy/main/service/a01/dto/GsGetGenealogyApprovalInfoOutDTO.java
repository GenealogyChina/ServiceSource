/* Genealogy
* Xiao Hua Ma personal studio 2015.
*/
package com.maxiaohua.genealogy.main.service.a01.dto;

import com.maxiaohua.genealogy.fw.core.type.Alias;
import com.maxiaohua.genealogy.main.biz.a01.dto.GenealogyApprovalInfoDTO;

/**
 * 获得家族审批明细的OutDTO
 *
 * 变更履历
 * REV.         变更日期           变更者              变更内容
 * -------      ---------------    ----------------    ------------------
 * 1.0          2016/02/09         TOOL                初次作成
 *
 */
@com.maxiaohua.genealogy.fw.core.type.AliasKanJi("获得家族审批明细")
public class GsGetGenealogyApprovalInfoOutDTO implements java.io.Serializable, Comparable<GsGetGenealogyApprovalInfoOutDTO> {
	/**
	 * Serial ID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 家族审批列表  
	 */
	@Alias("家族审批列表")
	private GenealogyApprovalInfoDTO genealogyApprovalInfo = null;

	/**
	 * <code>家族审批列表</code>返回
	 * @return <code>家族审批列表</code>
	 */
	public GenealogyApprovalInfoDTO getGenealogyApprovalInfo() {
		return this.genealogyApprovalInfo;
	}

	/**
	 * <code>genealogyApprovalInfo</code>设定
	 * @param genealogyApprovalInfo　<code>genealogyApprovalInfo</code>设定值
	 */
	public void setGenealogyApprovalInfo(
			GenealogyApprovalInfoDTO genealogyApprovalInfo) {
		this.genealogyApprovalInfo = genealogyApprovalInfo;
	}

	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(GsGetGenealogyApprovalInfoOutDTO compareToDTO) {
		return this.equals(compareToDTO) ? 0 : -1;
	}
}
