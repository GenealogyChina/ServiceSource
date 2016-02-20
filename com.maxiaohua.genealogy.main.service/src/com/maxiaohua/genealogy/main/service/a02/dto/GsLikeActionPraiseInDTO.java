/* Genealogy
* Xiao Hua Ma personal studio 2015.
*/
package com.maxiaohua.genealogy.main.service.a02.dto;

import com.maxiaohua.genealogy.fw.core.type.Alias;

/**
 * 给事件点赞的InDTO
 *
 * 变更履历
 * REV.         变更日期           变更者              变更内容
 * -------      ---------------    ----------------    ------------------
 * 1.0          2016/02/09         TOOL                初次作成
 *
 */
@com.maxiaohua.genealogy.fw.core.type.AliasKanJi("给事件点赞")
public class GsLikeActionPraiseInDTO implements java.io.Serializable, Comparable<GsLikeActionPraiseInDTO> {
	/**
	 * Serial ID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 活动号  
	 */
	@Alias("活动号")
	@com.maxiaohua.genealogy.fw.core.validator.type.NotNull
	private String actionNO = null;

	/**
	 * 点赞  
	 */
	@Alias("点赞")
	@com.maxiaohua.genealogy.fw.core.validator.type.NotNull
	private Boolean praise = null;

	/**
	 * <code>活动号</code>返回
	 * @return <code>活动号</code>
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

	/**
	 * <code>点赞</code>返回
	 * @return <code>点赞</code>
	 */
	public Boolean getPraise() {
		return this.praise;
	}

	/**
	 * <code>praise</code>设定
	 * @param praise　<code>praise</code>设定值
	 */
	public void setPraise(
			Boolean praise) {
		this.praise = praise;
	}

	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(GsLikeActionPraiseInDTO compareToDTO) {
		return this.equals(compareToDTO) ? 0 : -1;
	}
}
