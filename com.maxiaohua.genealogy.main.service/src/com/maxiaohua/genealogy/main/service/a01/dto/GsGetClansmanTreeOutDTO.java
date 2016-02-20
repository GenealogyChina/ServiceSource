/* Genealogy
* Xiao Hua Ma personal studio 2015.
*/
package com.maxiaohua.genealogy.main.service.a01.dto;

import com.maxiaohua.genealogy.fw.core.type.Alias;
import com.maxiaohua.genealogy.main.biz.a01.dto.FamileyNoteDTO;

/**
 * 以树的形式获得家族情况的OutDTO
 *
 * 变更履历
 * REV.         变更日期           变更者              变更内容
 * -------      ---------------    ----------------    ------------------
 * 1.0          2016/02/09         TOOL                初次作成
 *
 */
@com.maxiaohua.genealogy.fw.core.type.AliasKanJi("以树的形式获得家族情况")
public class GsGetClansmanTreeOutDTO implements java.io.Serializable, Comparable<GsGetClansmanTreeOutDTO> {
	/**
	 * Serial ID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 家族树结构  
	 */
	@Alias("家族树结构")
	private FamileyNoteDTO[] genealogyTree = null;

	/**
	 * <code>家族树结构</code>返回
	 * @return <code>家族树结构</code>
	 */
	public FamileyNoteDTO[] getGenealogyTree() {
		return this.genealogyTree;
	}

	/**
	 * <code>genealogyTree</code>设定
	 * @param genealogyTree　<code>genealogyTree</code>设定值
	 */
	public void setGenealogyTree(
			FamileyNoteDTO[] genealogyTree) {
		this.genealogyTree = genealogyTree;
	}

	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(GsGetClansmanTreeOutDTO compareToDTO) {
		return this.equals(compareToDTO) ? 0 : -1;
	}
}
