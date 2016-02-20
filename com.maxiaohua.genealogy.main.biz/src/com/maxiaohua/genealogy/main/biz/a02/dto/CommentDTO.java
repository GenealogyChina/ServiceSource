/**
 * Genealogy
 * Xiao Hua Ma personal studio 2015.
 */
package com.maxiaohua.genealogy.main.biz.a02.dto;

import com.maxiaohua.genealogy.fw.core.type.Alias;
import com.maxiaohua.genealogy.main.biz.com.dto.UserInfoDTO;

/**
 * CommentDTO DTO
 *
 * History
 * REV.         Updated Date           Updater              Infomation
 * -------      ---------------        ----------------     ------------------
 * 1.0          2016/02/09             TOOL                Create
 *
 */
@com.maxiaohua.genealogy.fw.core.type.AliasKanJi("评论数据")
public class CommentDTO implements java.io.Serializable, Comparable<CommentDTO> {
	/**
	 * System ID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 用户  
	 */
	@Alias("用户")
	private UserInfoDTO userInfo = null;

	/**
	 * 评论  
	 */
	@Alias("评论")
	private String comment = null;

	/**
	 * <code>用户</code>返回
	 * @return <code>用户</code>
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
	 * <code>评论</code>返回
	 * @return <code>评论</code>
	 */
	public String getComment() {
		return this.comment;
	}

	/**
	 * <code>comment</code>设定
	 * @param comment　<code>comment</code>设定值
	 */
	public void setComment(
			String comment) {
		this.comment = comment;
	}

	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(CommentDTO compareToDTO) {
		return this.equals(compareToDTO) ? 0 : -1;
	}
}
