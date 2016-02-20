/**
 * Genealogy
 * Xiao Hua Ma personal studio 2015.
 */
package com.maxiaohua.genealogy.main.biz.a03.dto;

import com.maxiaohua.genealogy.fw.core.type.Alias;

/**
 * ShareInfoDTO DTO
 *
 * History
 * REV.         Updated Date           Updater              Infomation
 * -------      ---------------        ----------------     ------------------
 * 1.0          2016/02/09             TOOL                Create
 *
 */
@com.maxiaohua.genealogy.fw.core.type.AliasKanJi("分享内容")
public class ShareInfoDTO implements java.io.Serializable, Comparable<ShareInfoDTO> {
	/**
	 * System ID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 抬头  
	 */
	@Alias("抬头")
	private String title = null;

	/**
	 * 分享此内容的网站地址  
	 */
	@Alias("分享此内容的网站地址")
	private String siteUrl = null;

	/**
	 * 标题的网络链接  
	 */
	@Alias("标题的网络链接")
	private String titleUrl = null;

	/**
	 * 分享文本  
	 */
	@Alias("分享文本")
	private String text = null;

	/**
	 * 网络图片地址  
	 */
	@Alias("网络图片地址")
	private String imageUrl = null;

	/**
	 * url仅在微信（包括好友和朋友圈）中使用  
	 */
	@Alias("url仅在微信（包括好友和朋友圈）中使用")
	private String url = null;

	/**
	 * 这条分享的评论  
	 */
	@Alias("这条分享的评论")
	private String comment = null;

	/**
	 * 分享此内容的网站名称  
	 */
	@Alias("分享此内容的网站名称")
	private String site = null;

	/**
	 * <code>抬头</code>返回
	 * @return <code>抬头</code>
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

	/**
	 * <code>分享此内容的网站地址</code>返回
	 * @return <code>分享此内容的网站地址</code>
	 */
	public String getSiteUrl() {
		return this.siteUrl;
	}

	/**
	 * <code>siteUrl</code>设定
	 * @param siteUrl　<code>siteUrl</code>设定值
	 */
	public void setSiteUrl(
			String siteUrl) {
		this.siteUrl = siteUrl;
	}

	/**
	 * <code>标题的网络链接</code>返回
	 * @return <code>标题的网络链接</code>
	 */
	public String getTitleUrl() {
		return this.titleUrl;
	}

	/**
	 * <code>titleUrl</code>设定
	 * @param titleUrl　<code>titleUrl</code>设定值
	 */
	public void setTitleUrl(
			String titleUrl) {
		this.titleUrl = titleUrl;
	}

	/**
	 * <code>分享文本</code>返回
	 * @return <code>分享文本</code>
	 */
	public String getText() {
		return this.text;
	}

	/**
	 * <code>text</code>设定
	 * @param text　<code>text</code>设定值
	 */
	public void setText(
			String text) {
		this.text = text;
	}

	/**
	 * <code>网络图片地址</code>返回
	 * @return <code>网络图片地址</code>
	 */
	public String getImageUrl() {
		return this.imageUrl;
	}

	/**
	 * <code>imageUrl</code>设定
	 * @param imageUrl　<code>imageUrl</code>设定值
	 */
	public void setImageUrl(
			String imageUrl) {
		this.imageUrl = imageUrl;
	}

	/**
	 * <code>url仅在微信（包括好友和朋友圈）中使用</code>返回
	 * @return <code>url仅在微信（包括好友和朋友圈）中使用</code>
	 */
	public String getUrl() {
		return this.url;
	}

	/**
	 * <code>url</code>设定
	 * @param url　<code>url</code>设定值
	 */
	public void setUrl(
			String url) {
		this.url = url;
	}

	/**
	 * <code>这条分享的评论</code>返回
	 * @return <code>这条分享的评论</code>
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

	/**
	 * <code>分享此内容的网站名称</code>返回
	 * @return <code>分享此内容的网站名称</code>
	 */
	public String getSite() {
		return this.site;
	}

	/**
	 * <code>site</code>设定
	 * @param site　<code>site</code>设定值
	 */
	public void setSite(
			String site) {
		this.site = site;
	}

	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(ShareInfoDTO compareToDTO) {
		return this.equals(compareToDTO) ? 0 : -1;
	}
}
