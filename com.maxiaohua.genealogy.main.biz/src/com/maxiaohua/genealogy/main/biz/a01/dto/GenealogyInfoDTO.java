/**
 * Genealogy
 * Xiao Hua Ma personal studio 2015.
 */
package com.maxiaohua.genealogy.main.biz.a01.dto;

import com.maxiaohua.genealogy.fw.core.type.Alias;

/**
 * GenealogyInfoDTO DTO
 *
 * History
 * REV.         Updated Date           Updater              Infomation
 * -------      ---------------        ----------------     ------------------
 * 1.0          2016/02/09             TOOL                Create
 *
 */
@com.maxiaohua.genealogy.fw.core.type.AliasKanJi("家族信息")
public class GenealogyInfoDTO implements java.io.Serializable, Comparable<GenealogyInfoDTO> {
	/**
	 * System ID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 家族号  
	 */
	@Alias("家族号")
	private String genealogyNO = null;

	/**
	 * 族徽  
	 */
	@Alias("族徽")
	private String arms = null;

	/**
	 * 族姓  
	 */
	@Alias("族姓")
	private String famileyName = null;

	/**
	 * 介绍（文字）  
	 */
	@Alias("介绍（文字）")
	private String introductionText = null;

	/**
	 * 介绍（图片）  
	 */
	@Alias("介绍（图片）")
	private String introductionPicture = null;

	/**
	 * 介绍（视频）  
	 */
	@Alias("介绍（视频）")
	private String introductionVideo = null;

	/**
	 * 大事记  
	 */
	@Alias("大事记")
	private EventInfoDTO[] eventArray = null;

	/**
	 * 是否只读  
	 */
	@Alias("是否只读")
	private Boolean readOnly = null;

	/**
	 * <code>家族号</code>返回
	 * @return <code>家族号</code>
	 */
	public String getGenealogyNO() {
		return this.genealogyNO;
	}

	/**
	 * <code>genealogyNO</code>设定
	 * @param genealogyNO　<code>genealogyNO</code>设定值
	 */
	public void setGenealogyNO(
			String genealogyNO) {
		this.genealogyNO = genealogyNO;
	}

	/**
	 * <code>族徽</code>返回
	 * @return <code>族徽</code>
	 */
	public String getArms() {
		return this.arms;
	}

	/**
	 * <code>arms</code>设定
	 * @param arms　<code>arms</code>设定值
	 */
	public void setArms(
			String arms) {
		this.arms = arms;
	}

	/**
	 * <code>族姓</code>返回
	 * @return <code>族姓</code>
	 */
	public String getFamileyName() {
		return this.famileyName;
	}

	/**
	 * <code>famileyName</code>设定
	 * @param famileyName　<code>famileyName</code>设定值
	 */
	public void setFamileyName(
			String famileyName) {
		this.famileyName = famileyName;
	}

	/**
	 * <code>介绍（文字）</code>返回
	 * @return <code>介绍（文字）</code>
	 */
	public String getIntroductionText() {
		return this.introductionText;
	}

	/**
	 * <code>IntroductionText</code>设定
	 * @param IntroductionText　<code>IntroductionText</code>设定值
	 */
	public void setIntroductionText(
			String introductionText) {
		this.introductionText = introductionText;
	}

	/**
	 * <code>介绍（图片）</code>返回
	 * @return <code>介绍（图片）</code>
	 */
	public String getIntroductionPicture() {
		return this.introductionPicture;
	}

	/**
	 * <code>IntroductionPicture</code>设定
	 * @param IntroductionPicture　<code>IntroductionPicture</code>设定值
	 */
	public void setIntroductionPicture(
			String introductionPicture) {
		this.introductionPicture = introductionPicture;
	}

	/**
	 * <code>介绍（视频）</code>返回
	 * @return <code>介绍（视频）</code>
	 */
	public String getIntroductionVideo() {
		return this.introductionVideo;
	}

	/**
	 * <code>IntroductionVideo</code>设定
	 * @param IntroductionVideo　<code>IntroductionVideo</code>设定值
	 */
	public void setIntroductionVideo(
			String introductionVideo) {
		this.introductionVideo = introductionVideo;
	}

	/**
	 * <code>大事记</code>返回
	 * @return <code>大事记</code>
	 */
	public EventInfoDTO[] getEventArray() {
		return this.eventArray;
	}

	/**
	 * <code>eventArray</code>设定
	 * @param eventArray　<code>eventArray</code>设定值
	 */
	public void setEventArray(
			EventInfoDTO[] eventArray) {
		this.eventArray = eventArray;
	}

	/**
	 * <code>是否只读</code>返回
	 * @return <code>是否只读</code>
	 */
	public Boolean getReadOnly() {
		return this.readOnly;
	}

	/**
	 * <code>readOnly</code>设定
	 * @param readOnly　<code>readOnly</code>设定值
	 */
	public void setReadOnly(
			Boolean readOnly) {
		this.readOnly = readOnly;
	}

	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(GenealogyInfoDTO compareToDTO) {
		return this.equals(compareToDTO) ? 0 : -1;
	}
}
