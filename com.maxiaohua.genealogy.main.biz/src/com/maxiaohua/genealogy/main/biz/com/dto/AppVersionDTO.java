package com.maxiaohua.genealogy.main.biz.com.dto;

import com.maxiaohua.genealogy.fw.core.type.Alias;

/**
 * AppVersionDTO DTO
 *
 * History
 * REV.         Updated Date           Updater              Infomation
 * -------      ---------------        ----------------     ------------------
 * 1.0          2016/01/08             TOOL                Create
 *
 */
@com.maxiaohua.genealogy.fw.core.type.AliasKanJi("获得App最新版本号")
public class AppVersionDTO implements java.io.Serializable, Comparable<AppVersionDTO> {
	/**
	 * System ID
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * 是否更新  
	 */
	@Alias("是否更新")
	private Boolean update = null;

	/**
	 * 提示描述  
	 */
	@Alias("提示描述")
	private String descrip = null;

	/**
	 * 下载地址  
	 */
	@Alias("下载地址")
	private String downloadUrl = null;

	/**
	 * 强制更新  
	 */
	@Alias("强制更新")
	private Boolean isRequireUpdate = null;

	/**
	 * <code>是否更新</code>返回
	 * @return <code>是否更新</code>
	 */
	public Boolean getUpdate() {
		return this.update;
	}

	/**
	 * <code>update</code>设定
	 * @param update　<code>update</code>设定值
	 */
	public void setUpdate(
			Boolean update) {
		this.update = update;
	}

	/**
	 * <code>提示描述</code>返回
	 * @return <code>提示描述</code>
	 */
	public String getDescrip() {
		return this.descrip;
	}

	/**
	 * <code>descrip</code>设定
	 * @param descrip　<code>descrip</code>设定值
	 */
	public void setDescrip(
			String descrip) {
		this.descrip = descrip;
	}

	/**
	 * <code>下载地址</code>返回
	 * @return <code>下载地址</code>
	 */
	public String getDownloadUrl() {
		return this.downloadUrl;
	}

	/**
	 * <code>downloadUrl</code>设定
	 * @param downloadUrl　<code>downloadUrl</code>设定值
	 */
	public void setDownloadUrl(
			String downloadUrl) {
		this.downloadUrl = downloadUrl;
	}

	/**
	 * <code>强制更新</code>返回
	 * @return <code>强制更新</code>
	 */
	public Boolean getIsRequireUpdate() {
		return this.isRequireUpdate;
	}

	/**
	 * <code>isRequireUpdate</code>设定
	 * @param isRequireUpdate　<code>isRequireUpdate</code>设定值
	 */
	public void setIsRequireUpdate(
			Boolean isRequireUpdate) {
		this.isRequireUpdate = isRequireUpdate;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(AppVersionDTO compareToDTO) {
		return this.equals(compareToDTO) ? 0 : -1;
	}
}
