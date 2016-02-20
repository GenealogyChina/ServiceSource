/* Genealogy
* Xiao Hua Ma personal studio 2015.
*/
package com.maxiaohua.genealogy.main.service.a01.dto;

import com.maxiaohua.genealogy.fw.core.type.Alias;

/**
 * 获得用户族人详细的InDTO
 *
 * 变更履历
 * REV.         变更日期           变更者              变更内容
 * -------      ---------------    ----------------    ------------------
 * 1.0          2016/02/09         TOOL                初次作成
 *
 */
@com.maxiaohua.genealogy.fw.core.type.AliasKanJi("获得用户族人详细")
public class GsGetClansmanInDTO implements java.io.Serializable, Comparable<GsGetClansmanInDTO> {
	/**
	 * Serial ID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 族人号  
	 */
	@Alias("族人号")
	@com.maxiaohua.genealogy.fw.core.validator.type.NotNull
	private String clansmanNO = null;

	/**
	 * <code>族人号</code>返回
	 * @return <code>族人号</code>
	 */
	public String getClansmanNO() {
		return this.clansmanNO;
	}

	/**
	 * <code>clansmanNO</code>设定
	 * @param clansmanNO　<code>clansmanNO</code>设定值
	 */
	public void setClansmanNO(
			String clansmanNO) {
		this.clansmanNO = clansmanNO;
	}

	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(GsGetClansmanInDTO compareToDTO) {
		return this.equals(compareToDTO) ? 0 : -1;
	}
}
