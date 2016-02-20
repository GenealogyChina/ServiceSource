/* Genealogy
* Xiao Hua Ma personal studio 2015.
*/
package com.maxiaohua.genealogy.main.service.com.dto;

import com.maxiaohua.genealogy.fw.core.type.Alias;
import com.maxiaohua.genealogy.main.biz.a01.dto.GenealogyInfoDTO;
import com.maxiaohua.genealogy.main.biz.com.dto.UserInfoDTO;

/**
 * 登录的OutDTO
 *
 * 变更履历
 * REV.         变更日期           变更者              变更内容
 * -------      ---------------    ----------------    ------------------
 * 1.0          2016/02/09         TOOL                初次作成
 *
 */
@com.maxiaohua.genealogy.fw.core.type.AliasKanJi("登录")
public class GsLoginOutDTO implements java.io.Serializable, Comparable<GsLoginOutDTO> {
	/**
	 * Serial ID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 用户信息  
	 */
	@Alias("用户信息")
	private UserInfoDTO userInfo = null;

	/**
	 * 家族信息  
	 */
	@Alias("家族信息")
	private GenealogyInfoDTO[] genealogInfoArray = null;

	/**
	 * <code>用户信息</code>返回
	 * @return <code>用户信息</code>
	 */
	public UserInfoDTO getUserInfo() {
		return this.userInfo;
	}

	/**
	 * <code>userInfo</code>设定
	 * @param userInfo　<code>userInfo</code>设定值
	 */
	public void setUserInfo(
			UserInfoDTO userInfo) {
		this.userInfo = userInfo;
	}

	/**
	 * <code>家族信息</code>返回
	 * @return <code>家族信息</code>
	 */
	public GenealogyInfoDTO[] getGenealogInfoArray() {
		return this.genealogInfoArray;
	}

	/**
	 * <code>genealogInfoArray</code>设定
	 * @param genealogInfoArray　<code>genealogInfoArray</code>设定值
	 */
	public void setGenealogInfoArray(
			GenealogyInfoDTO[] genealogInfoArray) {
		this.genealogInfoArray = genealogInfoArray;
	}

	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(GsLoginOutDTO compareToDTO) {
		return this.equals(compareToDTO) ? 0 : -1;
	}
}
