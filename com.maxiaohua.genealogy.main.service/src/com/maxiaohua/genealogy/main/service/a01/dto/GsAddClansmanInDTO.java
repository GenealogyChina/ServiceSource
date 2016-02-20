/* Genealogy
* Xiao Hua Ma personal studio 2015.
*/
package com.maxiaohua.genealogy.main.service.a01.dto;

import com.maxiaohua.genealogy.fw.core.type.Alias;

/**
 * 新增族人信息的InDTO
 *
 * 变更履历
 * REV.         变更日期           变更者              变更内容
 * -------      ---------------    ----------------    ------------------
 * 1.0          2016/02/09         TOOL                初次作成
 *
 */
@com.maxiaohua.genealogy.fw.core.type.AliasKanJi("新增族人信息")
public class GsAddClansmanInDTO implements java.io.Serializable, Comparable<GsAddClansmanInDTO> {
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
	 * 被选用户号  
	 */
	@Alias("被选用户号")
	@com.maxiaohua.genealogy.fw.core.validator.type.NotNull
	private String selectedUserNO = null;

	/**
	 * 关系  
	 */
	@Alias("关系")
	@com.maxiaohua.genealogy.fw.core.validator.type.NotNull
	private String relation = null;

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

	/**
	 * <code>被选用户号</code>返回
	 * @return <code>被选用户号</code>
	 */
	public String getSelectedUserNO() {
		return this.selectedUserNO;
	}

	/**
	 * <code>selectedUserNO</code>设定
	 * @param selectedUserNO　<code>selectedUserNO</code>设定值
	 */
	public void setSelectedUserNO(
			String selectedUserNO) {
		this.selectedUserNO = selectedUserNO;
	}

	/**
	 * <code>关系</code>返回
	 * @return <code>关系</code>
	 */
	public String getRelation() {
		return this.relation;
	}

	/**
	 * <code>relation</code>设定
	 * @param relation　<code>relation</code>设定值
	 */
	public void setRelation(
			String relation) {
		this.relation = relation;
	}

	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(GsAddClansmanInDTO compareToDTO) {
		return this.equals(compareToDTO) ? 0 : -1;
	}
}
