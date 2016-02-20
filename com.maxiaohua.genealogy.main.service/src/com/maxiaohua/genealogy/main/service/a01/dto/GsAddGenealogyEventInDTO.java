/* Genealogy
* Xiao Hua Ma personal studio 2015.
*/
package com.maxiaohua.genealogy.main.service.a01.dto;

import com.maxiaohua.genealogy.fw.core.type.Alias;

/**
 * 添加家族事件的InDTO
 *
 * 变更履历
 * REV.         变更日期           变更者              变更内容
 * -------      ---------------    ----------------    ------------------
 * 1.0          2016/02/09         TOOL                初次作成
 *
 */
@com.maxiaohua.genealogy.fw.core.type.AliasKanJi("添加家族事件")
public class GsAddGenealogyEventInDTO implements java.io.Serializable, Comparable<GsAddGenealogyEventInDTO> {
	/**
	 * Serial ID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 家族号  
	 */
	@Alias("家族号")
	@com.maxiaohua.genealogy.fw.core.validator.type.NotNull
	private String genealogyInfoNO = null;

	/**
	 * 抬头  
	 */
	@Alias("抬头")
	@com.maxiaohua.genealogy.fw.core.validator.type.NotNull
	private String tiltle = null;

	/**
	 * 详细信息  
	 */
	@Alias("详细信息")
	@com.maxiaohua.genealogy.fw.core.validator.type.NotNull
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
	 * <code>家族号</code>返回
	 * @return <code>家族号</code>
	 */
	public String getGenealogyInfoNO() {
		return this.genealogyInfoNO;
	}

	/**
	 * <code>genealogyInfoNO</code>设定
	 * @param genealogyInfoNO　<code>genealogyInfoNO</code>设定值
	 */
	public void setGenealogyInfoNO(
			String genealogyInfoNO) {
		this.genealogyInfoNO = genealogyInfoNO;
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
	public int compareTo(GsAddGenealogyEventInDTO compareToDTO) {
		return this.equals(compareToDTO) ? 0 : -1;
	}
}
