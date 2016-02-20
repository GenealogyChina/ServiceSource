/* Genealogy
* Xiao Hua Ma personal studio 2015.
*/
package com.maxiaohua.genealogy.main.service.a03.dto;

import com.maxiaohua.genealogy.fw.core.type.Alias;

/**
 * 更换手机的InDTO
 *
 * 变更履历
 * REV.         变更日期           变更者              变更内容
 * -------      ---------------    ----------------    ------------------
 * 1.0          2016/02/09         TOOL                初次作成
 *
 */
@com.maxiaohua.genealogy.fw.core.type.AliasKanJi("更换手机")
public class GsUpdatePhoneInDTO implements java.io.Serializable, Comparable<GsUpdatePhoneInDTO> {
	/**
	 * Serial ID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 验证码  
	 */
	@Alias("验证码")
	@com.maxiaohua.genealogy.fw.core.validator.type.NotNull
	private String validCode = null;

	/**
	 * 新手机号  
	 */
	@Alias("新手机号")
	@com.maxiaohua.genealogy.fw.core.validator.type.NotNull
	private String newPhone = null;

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

	/**
	 * <code>新手机号</code>返回
	 * @return <code>新手机号</code>
	 */
	public String getNewPhone() {
		return this.newPhone;
	}

	/**
	 * <code>newPhone</code>设定
	 * @param newPhone　<code>newPhone</code>设定值
	 */
	public void setNewPhone(
			String newPhone) {
		this.newPhone = newPhone;
	}

	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(GsUpdatePhoneInDTO compareToDTO) {
		return this.equals(compareToDTO) ? 0 : -1;
	}
}
