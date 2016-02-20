/**
 * Genealogy
 * Xiao Hua Ma personal studio 2015.
 */
package com.maxiaohua.genealogy.main.biz.com.dto;

import com.maxiaohua.genealogy.fw.core.type.Alias;

/**
 * UserInfoDTO DTO
 *
 * History
 * REV.         Updated Date           Updater              Infomation
 * -------      ---------------        ----------------     ------------------
 * 1.0          2016/02/09             TOOL                Create
 *
 */
@com.maxiaohua.genealogy.fw.core.type.AliasKanJi("用户信息")
public class UserInfoDTO implements java.io.Serializable, Comparable<UserInfoDTO> {
	/**
	 * System ID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 用户NO  
	 */
	@Alias("用户NO")
	private String userNO = null;

	/**
	 * 姓氏  
	 */
	@Alias("姓氏")
	private String fisrtName = null;

	/**
	 * 名称  
	 */
	@Alias("名称")
	private String lastName = null;

	/**
	 * 性别  
	 */
	@Alias("性别")
	private String sex = null;

	/**
	 * 出生年月日  
	 */
	@Alias("出生年月日")
	private java.sql.Date birthday = null;

	/**
	 * 出生时间  
	 */
	@Alias("出生时间")
	private java.sql.Timestamp birthTime = null;

	/**
	 * 手机  
	 */
	@Alias("手机")
	private String mobile = null;

	/**
	 * 背景  
	 */
	@Alias("背景")
	private String backPath = null;

	/**
	 * 头像  
	 */
	@Alias("头像")
	private String selfPath = null;

	/**
	 * 图片  
	 */
	@Alias("图片")
	private String[] picture = null;

	/**
	 * 视频  
	 */
	@Alias("视频")
	private String[] video = null;

	/**
	 * 简介  
	 */
	@Alias("简介")
	private String profile = null;

	/**
	 * 所在位置  
	 */
	@Alias("所在位置")
	private AddressInfoDTO address = null;

	/**
	 * 是否只读  
	 */
	@Alias("是否只读")
	private Boolean readOnly = null;

	/**
	 * <code>用户NO</code>返回
	 * @return <code>用户NO</code>
	 */
	public String getUserNO() {
		return this.userNO;
	}

	/**
	 * <code>userNO</code>设定
	 * @param userNO　<code>userNO</code>设定值
	 */
	public void setUserNO(
			String userNO) {
		this.userNO = userNO;
	}

	/**
	 * <code>姓氏</code>返回
	 * @return <code>姓氏</code>
	 */
	public String getFisrtName() {
		return this.fisrtName;
	}

	/**
	 * <code>fisrtName</code>设定
	 * @param fisrtName　<code>fisrtName</code>设定值
	 */
	public void setFisrtName(
			String fisrtName) {
		this.fisrtName = fisrtName;
	}

	/**
	 * <code>名称</code>返回
	 * @return <code>名称</code>
	 */
	public String getLastName() {
		return this.lastName;
	}

	/**
	 * <code>lastName</code>设定
	 * @param lastName　<code>lastName</code>设定值
	 */
	public void setLastName(
			String lastName) {
		this.lastName = lastName;
	}

	/**
	 * <code>性别</code>返回
	 * @return <code>性别</code>
	 */
	public String getSex() {
		return this.sex;
	}

	/**
	 * <code>sex</code>设定
	 * @param sex　<code>sex</code>设定值
	 */
	public void setSex(
			String sex) {
		this.sex = sex;
	}

	/**
	 * <code>出生年月日</code>返回
	 * @return <code>出生年月日</code>
	 */
	public java.sql.Date getBirthday() {
		return this.birthday;
	}

	/**
	 * <code>birthday</code>设定
	 * @param birthday　<code>birthday</code>设定值
	 */
	public void setBirthday(
			java.sql.Date birthday) {
		this.birthday = birthday;
	}

	/**
	 * <code>出生时间</code>返回
	 * @return <code>出生时间</code>
	 */
	public java.sql.Timestamp getBirthTime() {
		return this.birthTime;
	}

	/**
	 * <code>birthTime</code>设定
	 * @param birthTime　<code>birthTime</code>设定值
	 */
	public void setBirthTime(
			java.sql.Timestamp birthTime) {
		this.birthTime = birthTime;
	}

	/**
	 * <code>手机</code>返回
	 * @return <code>手机</code>
	 */
	public String getMobile() {
		return this.mobile;
	}

	/**
	 * <code>mobile</code>设定
	 * @param mobile　<code>mobile</code>设定值
	 */
	public void setMobile(
			String mobile) {
		this.mobile = mobile;
	}

	/**
	 * <code>背景</code>返回
	 * @return <code>背景</code>
	 */
	public String getBackPath() {
		return this.backPath;
	}

	/**
	 * <code>backPath</code>设定
	 * @param backPath　<code>backPath</code>设定值
	 */
	public void setBackPath(
			String backPath) {
		this.backPath = backPath;
	}

	/**
	 * <code>头像</code>返回
	 * @return <code>头像</code>
	 */
	public String getSelfPath() {
		return this.selfPath;
	}

	/**
	 * <code>selfPath</code>设定
	 * @param selfPath　<code>selfPath</code>设定值
	 */
	public void setSelfPath(
			String selfPath) {
		this.selfPath = selfPath;
	}

	/**
	 * <code>图片</code>返回
	 * @return <code>图片</code>
	 */
	public String[] getPicture() {
		return this.picture;
	}

	/**
	 * <code>picture</code>设定
	 * @param picture　<code>picture</code>设定值
	 */
	public void setPicture(
			String[] picture) {
		this.picture = picture;
	}

	/**
	 * <code>视频</code>返回
	 * @return <code>视频</code>
	 */
	public String[] getVideo() {
		return this.video;
	}

	/**
	 * <code>video</code>设定
	 * @param video　<code>video</code>设定值
	 */
	public void setVideo(
			String[] video) {
		this.video = video;
	}

	/**
	 * <code>简介</code>返回
	 * @return <code>简介</code>
	 */
	public String getProfile() {
		return this.profile;
	}

	/**
	 * <code>profile</code>设定
	 * @param profile　<code>profile</code>设定值
	 */
	public void setProfile(
			String profile) {
		this.profile = profile;
	}

	/**
	 * <code>所在位置</code>返回
	 * @return <code>所在位置</code>
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
	public int compareTo(UserInfoDTO compareToDTO) {
		return this.equals(compareToDTO) ? 0 : -1;
	}
}
