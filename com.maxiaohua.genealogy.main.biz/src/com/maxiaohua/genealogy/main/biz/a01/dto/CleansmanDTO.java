/**
 * Genealogy
 * Xiao Hua Ma personal studio 2015.
 */
package com.maxiaohua.genealogy.main.biz.a01.dto;

import com.maxiaohua.genealogy.fw.core.type.Alias;
import com.maxiaohua.genealogy.main.biz.com.dto.UserInfoDTO;

/**
 * CleansmanDTO DTO
 *
 * History
 * REV.         Updated Date           Updater              Infomation
 * -------      ---------------        ----------------     ------------------
 * 1.0          2016/02/09             TOOL                Create
 *
 */
@com.maxiaohua.genealogy.fw.core.type.AliasKanJi("家族用户单点信息")
public class CleansmanDTO implements java.io.Serializable, Comparable<CleansmanDTO> {
	/**
	 * System ID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 用户信息  
	 */
	@Alias("用户信息")
	private UserInfoDTO[] userArray = null;

	/**
	 * 名称分组  
	 */
	@Alias("名称分组")
	private String title = null;

	/**
	 * <code>用户信息</code>返回
	 * @return <code>用户信息</code>
	 */
	public UserInfoDTO[] getUserArray() {
		return this.userArray;
	}

	/**
	 * <code>userArray</code>设定
	 * @param userArray　<code>userArray</code>设定值
	 */
	public void setUserArray(
			UserInfoDTO[] userArray) {
		this.userArray = userArray;
	}

	/**
	 * <code>名称分组</code>返回
	 * @return <code>名称分组</code>
	 */
	public String getTitle() {
		return this.title;
	}

	/**
	 * <code>title</code>设定
	 * @param title　<code>title</code>设定值
	 */
	public void setTitle(
			String title) {
		this.title = title;
	}

	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(CleansmanDTO compareToDTO) {
		return this.equals(compareToDTO) ? 0 : -1;
	}
}
