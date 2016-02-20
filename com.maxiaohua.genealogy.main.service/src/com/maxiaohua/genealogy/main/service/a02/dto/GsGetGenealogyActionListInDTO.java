/* Genealogy
* Xiao Hua Ma personal studio 2015.
*/
package com.maxiaohua.genealogy.main.service.a02.dto;

import com.maxiaohua.genealogy.fw.core.type.Alias;

/**
 * 获得关联家族最新信息列表的InDTO
 *
 * 变更履历
 * REV.         变更日期           变更者              变更内容
 * -------      ---------------    ----------------    ------------------
 * 1.0          2016/02/09         TOOL                初次作成
 *
 */
@com.maxiaohua.genealogy.fw.core.type.AliasKanJi("获得关联家族最新信息列表")
public class GsGetGenealogyActionListInDTO implements java.io.Serializable, Comparable<GsGetGenealogyActionListInDTO> {
	/**
	 * Serial ID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 页数  
	 */
	@Alias("页数")
	@com.maxiaohua.genealogy.fw.core.validator.type.NotNull
	private Integer pageIndex = null;

	/**
	 * <code>页数</code>返回
	 * @return <code>页数</code>
	 */
	public Integer getPageIndex() {
		return this.pageIndex;
	}

	/**
	 * <code>pageIndex</code>设定
	 * @param pageIndex　<code>pageIndex</code>设定值
	 */
	public void setPageIndex(
			Integer pageIndex) {
		this.pageIndex = pageIndex;
	}

	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(GsGetGenealogyActionListInDTO compareToDTO) {
		return this.equals(compareToDTO) ? 0 : -1;
	}
}
