/* Genealogy
* Xiao Hua Ma personal studio 2015.
*/
package com.maxiaohua.genealogy.main.service.com.dto;

import com.maxiaohua.genealogy.fw.core.type.Alias;

/**
 * 检查验证码的InDTO
 *
 * 变更履历
 * REV.         变更日期           变更者              变更内容
 * -------      ---------------    ----------------    ------------------
 * 1.0          2016/02/09         TOOL                初次作成
 *
 */
@com.maxiaohua.genealogy.fw.core.type.AliasKanJi("检查验证码")
public class GsCheckValidCodeInDTO implements java.io.Serializable, Comparable<GsCheckValidCodeInDTO> {
	/**
	 * Serial ID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 手机号  
	 */
	@Alias("手机号")
	@com.maxiaohua.genealogy.fw.core.validator.type.NotNull
	private String mobile = null;

	/**
	 * 验证码  
	 */
	@Alias("验证码")
	@com.maxiaohua.genealogy.fw.core.validator.type.NotNull
	private String validCode = null;

	/**
	 * <code>手机号</code>返回
	 * @return <code>手机号</code>
	 */
	public String getMobile() {
		return this.mobile;
	}

	/**
	 * <code>mobile</code>设定
	 * @param mobile　<code>mobile</code>设定值
	 */
	public void setMobile(
			String mobile) {
		this.mobile = mobile;
	}

	/**
	 * <code>验证码</code>返回
	 * @return <code>验证码</code>
	 */
	public String getValidCode() {
		return this.validCode;
	}

	/**
	 * <code>validCode</code>设定
	 * @param validCode　<code>validCode</code>设定值
	 */
	public void setValidCode(
			String validCode) {
		this.validCode = validCode;
	}

	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(GsCheckValidCodeInDTO compareToDTO) {
		return this.equals(compareToDTO) ? 0 : -1;
	}
}
