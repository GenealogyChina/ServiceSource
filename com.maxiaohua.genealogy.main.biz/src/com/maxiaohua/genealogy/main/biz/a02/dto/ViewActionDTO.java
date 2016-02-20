/**
 * Genealogy
 * Xiao Hua Ma personal studio 2015.
 */
package com.maxiaohua.genealogy.main.biz.a02.dto;

import com.maxiaohua.genealogy.fw.core.type.Alias;
import com.maxiaohua.genealogy.main.biz.com.dto.AddressInfoDTO;
import com.maxiaohua.genealogy.main.biz.com.dto.UserInfoDTO;

/**
 * ViewActionDTO DTO
 *
 * History
 * REV.         Updated Date           Updater              Infomation
 * -------      ---------------        ----------------     ------------------
 * 1.0          2016/02/09             TOOL                Create
 *
 */
@com.maxiaohua.genealogy.fw.core.type.AliasKanJi("家族事件数据")
public class ViewActionDTO implements java.io.Serializable, Comparable<ViewActionDTO> {
	/**
	 * System ID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 事件NO  
	 */
	@Alias("事件NO")
	private String actionNO = null;

	/**
	 * 发布人  
	 */
	@Alias("发布人")
	private UserInfoDTO userInfo = null;

	/**
	 * 事件日期  
	 */
	@Alias("事件日期")
	private java.sql.Date actionDate = null;

	/**
	 * 事件时间  
	 */
	@Alias("事件时间")
	private java.sql.Timestamp actionTime = null;

	/**
	 * 事件地点  
	 */
	@Alias("事件地点")
	private AddressInfoDTO address = null;

	/**
	 * 点赞数  
	 */
	@Alias("点赞数")
	private Integer praise = null;

	/**
	 * 事件首图  
	 */
	@Alias("事件首图")
	private String picture = null;

	/**
	 * 事件介绍  
	 */
	@Alias("事件介绍")
	private String introduction = null;

	/**
	 * 事件图片  
	 */
	@Alias("事件图片")
	private String[] pictures = null;

	/**
	 * 事件视频  
	 */
	@Alias("事件视频")
	private String[] videos = null;

	/**
	 * <code>事件NO</code>返回
	 * @return <code>事件NO</code>
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
	 * <code>发布人</code>返回
	 * @return <code>发布人</code>
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
	 * <code>事件日期</code>返回
	 * @return <code>事件日期</code>
	 */
	public java.sql.Date getActionDate() {
		return this.actionDate;
	}

	/**
	 * <code>actionDate</code>设定
	 * @param actionDate　<code>actionDate</code>设定值
	 */
	public void setActionDate(
			java.sql.Date actionDate) {
		this.actionDate = actionDate;
	}

	/**
	 * <code>事件时间</code>返回
	 * @return <code>事件时间</code>
	 */
	public java.sql.Timestamp getActionTime() {
		return this.actionTime;
	}

	/**
	 * <code>actionTime</code>设定
	 * @param actionTime　<code>actionTime</code>设定值
	 */
	public void setActionTime(
			java.sql.Timestamp actionTime) {
		this.actionTime = actionTime;
	}

	/**
	 * <code>事件地点</code>返回
	 * @return <code>事件地点</code>
	 */
	public AddressInfoDTO getAddress() {
		return this.address;
	}

	/**
	 * <code>address</code>设定
	 * @param address　<code>address</code>设定值
	 */
	public void setAddress(
			AddressInfoDTO address) {
		this.address = address;
	}

	/**
	 * <code>点赞数</code>返回
	 * @return <code>点赞数</code>
	 */
	public Integer getPraise() {
		return this.praise;
	}

	/**
	 * <code>praise</code>设定
	 * @param praise　<code>praise</code>设定值
	 */
	public void setPraise(
			Integer praise) {
		this.praise = praise;
	}

	/**
	 * <code>事件首图</code>返回
	 * @return <code>事件首图</code>
	 */
	public String getPicture() {
		return this.picture;
	}

	/**
	 * <code>picture</code>设定
	 * @param picture　<code>picture</code>设定值
	 */
	public void setPicture(
			String picture) {
		this.picture = picture;
	}

	/**
	 * <code>事件介绍</code>返回
	 * @return <code>事件介绍</code>
	 */
	public String getIntroduction() {
		return this.introduction;
	}

	/**
	 * <code>introduction</code>设定
	 * @param introduction　<code>introduction</code>设定值
	 */
	public void setIntroduction(
			String introduction) {
		this.introduction = introduction;
	}

	/**
	 * <code>事件图片</code>返回
	 * @return <code>事件图片</code>
	 */
	public String[] getPictures() {
		return this.pictures;
	}

	/**
	 * <code>pictures</code>设定
	 * @param pictures　<code>pictures</code>设定值
	 */
	public void setPictures(
			String[] pictures) {
		this.pictures = pictures;
	}

	/**
	 * <code>事件视频</code>返回
	 * @return <code>事件视频</code>
	 */
	public String[] getVideos() {
		return this.videos;
	}

	/**
	 * <code>videos</code>设定
	 * @param videos　<code>videos</code>设定值
	 */
	public void setVideos(
			String[] videos) {
		this.videos = videos;
	}

	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(ViewActionDTO compareToDTO) {
		return this.equals(compareToDTO) ? 0 : -1;
	}
}
