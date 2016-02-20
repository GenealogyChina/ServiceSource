/* Genealogy
* Xiao Hua Ma personal studio 2015.
*/
package com.maxiaohua.genealogy.main.service.com.dto;


/**
 * 检查验证码的OutDTO
 *
 * 变更履历
 * REV.         变更日期           变更者              变更内容
 * -------      ---------------    ----------------    ------------------
 * 1.0          2016/02/09         TOOL                初次作成
 *
 */
@com.maxiaohua.genealogy.fw.core.type.AliasKanJi("检查验证码")
public class GsCheckValidCodeOutDTO implements java.io.Serializable, Comparable<GsCheckValidCodeOutDTO> {
	/**
	 * Serial ID
	 */
	private static final long serialVersionUID = 1L;

	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(GsCheckValidCodeOutDTO compareToDTO) {
		return this.equals(compareToDTO) ? 0 : -1;
	}
}
