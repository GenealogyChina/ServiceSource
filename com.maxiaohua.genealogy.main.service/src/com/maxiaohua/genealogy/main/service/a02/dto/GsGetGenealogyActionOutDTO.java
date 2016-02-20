/* Genealogy
* Xiao Hua Ma personal studio 2015.
*/
package com.maxiaohua.genealogy.main.service.a02.dto;

import com.maxiaohua.genealogy.fw.core.type.Alias;
import com.maxiaohua.genealogy.main.biz.a02.dto.ViewActionDTO;

/**
 * 获得家族信息详细的OutDTO
 *
 * 变更履历
 * REV.         变更日期           变更者              变更内容
 * -------      ---------------    ----------------    ------------------
 * 1.0          2016/02/09         TOOL                初次作成
 *
 */
@com.maxiaohua.genealogy.fw.core.type.AliasKanJi("获得家族信息详细")
public class GsGetGenealogyActionOutDTO implements java.io.Serializable, Comparable<GsGetGenealogyActionOutDTO> {
	/**
	 * Serial ID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 活动信息  
	 */
	@Alias("活动信息")
	private ViewActionDTO actionInfo = null;

	/**
	 * <code>活动信息</code>返回
	 * @return <code>活动信息</code>
	 */
	public ViewActionDTO getActionInfo() {
		return this.actionInfo;
	}

	/**
	 * <code>actionInfo</code>设定
	 * @param actionInfo　<code>actionInfo</code>设定值
	 */
	public void setActionInfo(
			ViewActionDTO actionInfo) {
		this.actionInfo = actionInfo;
	}

	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(GsGetGenealogyActionOutDTO compareToDTO) {
		return this.equals(compareToDTO) ? 0 : -1;
	}
}
