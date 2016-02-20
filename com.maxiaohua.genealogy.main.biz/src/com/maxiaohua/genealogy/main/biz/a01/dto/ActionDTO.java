/**
 * Genealogy
 * Xiao Hua Ma personal studio 2015.
 */
package com.maxiaohua.genealogy.main.biz.a01.dto;

import com.maxiaohua.genealogy.fw.core.type.Alias;
import com.maxiaohua.genealogy.main.biz.com.dto.AddressInfoDTO;

/**
 * ActionDTO DTO
 *
 * History
 * REV.         Updated Date           Updater              Infomation
 * -------      ---------------        ----------------     ------------------
 * 1.0          2016/02/09             TOOL                Create
 *
 */
@com.maxiaohua.genealogy.fw.core.type.AliasKanJi("个人活动信息")
public class ActionDTO implements java.io.Serializable, Comparable<ActionDTO> {
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
	 * 事件说明  
	 */
	@Alias("事件说明")
	private String descriptions = null;

	/**
	 * 事件类型  
	 */
	@Alias("事件类型")
	private String type = null;

	/**
	 * 事件日期  
	 */
	@Alias("事件日期")
	private java.sql.Date date = null;

	/**
	 * 事件时间  
	 */
	@Alias("事件时间")
	private java.sql.Timestamp time = null;

	/**
	 * 事件地点  
	 */
	@Alias("事件地点")
	private AddressInfoDTO location = null;

	/**
	 * 封面图片  
	 */
	@Alias("封面图片")
	private String coverImage = null;

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
	 * 事件介绍  
	 */
	@Alias("事件介绍")
	private String introduction = null;

	/**
	 * 是否公开  
	 */
	@Alias("是否公开")
	private String isPublic = null;

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
	 * <code>事件说明</code>返回
	 * @return <code>事件说明</code>
	 */
	public String getDescriptions() {
		return this.descriptions;
	}

	/**
	 * <code>descriptions</code>设定
	 * @param descriptions　<code>descriptions</code>设定值
	 */
	public void setDescriptions(
			String descriptions) {
		this.descriptions = descriptions;
	}

	/**
	 * <code>事件类型</code>返回
	 * @return <code>事件类型</code>
	 */
	public String getType() {
		return this.type;
	}

	/**
	 * <code>type</code>设定
	 * @param type　<code>type</code>设定值
	 */
	public void setType(
			String type) {
		this.type = type;
	}

	/**
	 * <code>事件日期</code>返回
	 * @return <code>事件日期</code>
	 */
	public java.sql.Date getDate() {
		return this.date;
	}

	/**
	 * <code>date</code>设定
	 * @param date　<code>date</code>设定值
	 */
	public void setDate(
			java.sql.Date date) {
		this.date = date;
	}

	/**
	 * <code>事件时间</code>返回
	 * @return <code>事件时间</code>
	 */
	public java.sql.Timestamp getTime() {
		return this.time;
	}

	/**
	 * <code>time</code>设定
	 * @param time　<code>time</code>设定值
	 */
	public void setTime(
			java.sql.Timestamp time) {
		this.time = time;
	}

	/**
	 * <code>事件地点</code>返回
	 * @return <code>事件地点</code>
	 */
	public AddressInfoDTO getLocation() {
		return this.location;
	}

	/**
	 * <code>location</code>设定
	 * @param location　<code>location</code>设定值
	 */
	public void setLocation(
			AddressInfoDTO location) {
		this.location = location;
	}

	/**
	 * <code>封面图片</code>返回
	 * @return <code>封面图片</code>
	 */
	public String getCoverImage() {
		return this.coverImage;
	}

	/**
	 * <code>coverImage</code>设定
	 * @param coverImage　<code>coverImage</code>设定值
	 */
	public void setCoverImage(
			String coverImage) {
		this.coverImage = coverImage;
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
	 * <code>是否公开</code>返回
	 * @return <code>是否公开</code>
	 */
	public String getIsPublic() {
		return this.isPublic;
	}

	/**
	 * <code>isPublic</code>设定
	 * @param isPublic　<code>isPublic</code>设定值
	 */
	public void setIsPublic(
			String isPublic) {
		this.isPublic = isPublic;
	}

	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(ActionDTO compareToDTO) {
		return this.equals(compareToDTO) ? 0 : -1;
	}
}
