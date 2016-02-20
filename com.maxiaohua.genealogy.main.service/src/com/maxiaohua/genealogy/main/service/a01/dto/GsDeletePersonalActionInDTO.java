/* Genealogy
* Xiao Hua Ma personal studio 2015.
*/
package com.maxiaohua.genealogy.main.service.a01.dto;

import com.maxiaohua.genealogy.fw.core.type.Alias;

/**
 * 删除个人事件的InDTO
 *
 * 变更履历
 * REV.         变更日期           变更者              变更内容
 * -------      ---------------    ----------------    ------------------
 * 1.0          2016/02/09         TOOL                初次作成
 *
 */
@com.maxiaohua.genealogy.fw.core.type.AliasKanJi("删除个人事件")
public class GsDeletePersonalActionInDTO implements java.io.Serializable, Comparable<GsDeletePersonalActionInDTO> {
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
	 * 事件号  
	 */
	@Alias("事件号")
	@com.maxiaohua.genealogy.fw.core.validator.type.NotNull
	private String actionNO = null;

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

	/**
	 * <code>事件号</code>返回
	 * @return <code>事件号</code>
	 */
	public String getActionNO() {
		return this.actionNO;
	}

	/**
	 * <code>actionNO</code>设定
	 * @param actionNO　<code>actionNO</code>设定值
	 */
	public void setActionNO(
			String actionNO) {
		this.actionNO = actionNO;
	}

	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(GsDeletePersonalActionInDTO compareToDTO) {
		return this.equals(compareToDTO) ? 0 : -1;
	}
}
