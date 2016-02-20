/**
 * Genealogy
 * Xiao Hua Ma personal studio 2015.
 */
package com.maxiaohua.genealogy.main.biz.a01.dto;

import com.maxiaohua.genealogy.fw.core.type.Alias;

/**
 * EventInfoDTO DTO
 *
 * History
 * REV.         Updated Date           Updater              Infomation
 * -------      ---------------        ----------------     ------------------
 * 1.0          2016/02/09             TOOL                Create
 *
 */
@com.maxiaohua.genealogy.fw.core.type.AliasKanJi("家族事件信息")
public class EventInfoDTO implements java.io.Serializable, Comparable<EventInfoDTO> {
	/**
	 * System ID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 事件NO  
	 */
	@Alias("事件NO")
	private String eventNO = null;

	/**
	 * 记录者号  
	 */
	@Alias("记录者号")
	private String registrarNO = null;

	/**
	 * 记录者姓名  
	 */
	@Alias("记录者姓名")
	private String registrarName = null;

	/**
	 * 记录时间  
	 */
	@Alias("记录时间")
	private java.sql.Date takeDate = null;

	/**
	 * 抬头  
	 */
	@Alias("抬头")
	private String tiltle = null;

	/**
	 * 详细信息  
	 */
	@Alias("详细信息")
	private String note = null;

	/**
	 * 图片  
	 */
	@Alias("图片")
	private String[] pictures = null;

	/**
	 * 视频  
	 */
	@Alias("视频")
	private String[] videos = null;

	/**
	 * <code>事件NO</code>返回
	 * @return <code>事件NO</code>
	 */
	public String getEventNO() {
		return this.eventNO;
	}

	/**
	 * <code>eventNO</code>设定
	 * @param eventNO　<code>eventNO</code>设定值
	 */
	public void setEventNO(
			String eventNO) {
		this.eventNO = eventNO;
	}

	/**
	 * <code>记录者号</code>返回
	 * @return <code>记录者号</code>
	 */
	public String getRegistrarNO() {
		return this.registrarNO;
	}

	/**
	 * <code>registrarNO</code>设定
	 * @param registrarNO　<code>registrarNO</code>设定值
	 */
	public void setRegistrarNO(
			String registrarNO) {
		this.registrarNO = registrarNO;
	}

	/**
	 * <code>记录者姓名</code>返回
	 * @return <code>记录者姓名</code>
	 */
	public String getRegistrarName() {
		return this.registrarName;
	}

	/**
	 * <code>registrarName</code>设定
	 * @param registrarName　<code>registrarName</code>设定值
	 */
	public void setRegistrarName(
			String registrarName) {
		this.registrarName = registrarName;
	}

	/**
	 * <code>记录时间</code>返回
	 * @return <code>记录时间</code>
	 */
	public java.sql.Date getTakeDate() {
		return this.takeDate;
	}

	/**
	 * <code>takeDate</code>设定
	 * @param takeDate　<code>takeDate</code>设定值
	 */
	public void setTakeDate(
			java.sql.Date takeDate) {
		this.takeDate = takeDate;
	}

	/**
	 * <code>抬头</code>返回
	 * @return <code>抬头</code>
	 */
	public String getTiltle() {
		return this.tiltle;
	}

	/**
	 * <code>tiltle</code>设定
	 * @param tiltle　<code>tiltle</code>设定值
	 */
	public void setTiltle(
			String tiltle) {
		this.tiltle = tiltle;
	}

	/**
	 * <code>详细信息</code>返回
	 * @return <code>详细信息</code>
	 */
	public String getNote() {
		return this.note;
	}

	/**
	 * <code>note</code>设定
	 * @param note　<code>note</code>设定值
	 */
	public void setNote(
			String note) {
		this.note = note;
	}

	/**
	 * <code>图片</code>返回
	 * @return <code>图片</code>
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
	 * <code>视频</code>返回
	 * @return <code>视频</code>
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
	public int compareTo(EventInfoDTO compareToDTO) {
		return this.equals(compareToDTO) ? 0 : -1;
	}
}
