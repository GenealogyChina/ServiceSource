/* Genealogy
* Xiao Hua Ma personal studio 2015.
*/
package com.maxiaohua.genealogy.main.service.a03.dto;

import com.maxiaohua.genealogy.fw.core.type.Alias;

/**
 * 建议反馈的InDTO
 *
 * 变更履历
 * REV.         变更日期           变更者              变更内容
 * -------      ---------------    ----------------    ------------------
 * 1.0          2016/02/09         TOOL                初次作成
 *
 */
@com.maxiaohua.genealogy.fw.core.type.AliasKanJi("建议反馈")
public class GsAddFeedBackInDTO implements java.io.Serializable, Comparable<GsAddFeedBackInDTO> {
	/**
	 * Serial ID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 建议反馈  
	 */
	@Alias("建议反馈")
	@com.maxiaohua.genealogy.fw.core.validator.type.NotNull
	private String feedBack = null;

	/**
	 * <code>建议反馈</code>返回
	 * @return <code>建议反馈</code>
	 */
	public String getFeedBack() {
		return this.feedBack;
	}

	/**
	 * <code>feedBack</code>设定
	 * @param feedBack　<code>feedBack</code>设定值
	 */
	public void setFeedBack(
			String feedBack) {
		this.feedBack = feedBack;
	}

	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(GsAddFeedBackInDTO compareToDTO) {
		return this.equals(compareToDTO) ? 0 : -1;
	}
}
