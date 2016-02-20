/**
 * Genealogy
 * Xiao Hua Ma personal studio 2015.
 */
package com.maxiaohua.genealogy.main.biz.com.dto;

import com.maxiaohua.genealogy.fw.core.type.Alias;

/**
 * AddressInfoDTO DTO
 *
 * History
 * REV.         Updated Date           Updater              Infomation
 * -------      ---------------        ----------------     ------------------
 * 1.0          2016/02/09             TOOL                Create
 *
 */
@com.maxiaohua.genealogy.fw.core.type.AliasKanJi("地址信息")
public class AddressInfoDTO implements java.io.Serializable, Comparable<AddressInfoDTO> {
	/**
	 * System ID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 地址名称  
	 */
	@Alias("地址名称")
	private String title = null;

	/**
	 * 经度  
	 */
	@Alias("经度")
	private Double longitude = null;

	/**
	 * 纬度  
	 */
	@Alias("纬度")
	private Double latitude = null;

	/**
	 * <code>地址名称</code>返回
	 * @return <code>地址名称</code>
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
	 * <code>经度</code>返回
	 * @return <code>经度</code>
	 */
	public Double getLongitude() {
		return this.longitude;
	}

	/**
	 * <code>longitude</code>设定
	 * @param longitude　<code>longitude</code>设定值
	 */
	public void setLongitude(
			Double longitude) {
		this.longitude = longitude;
	}

	/**
	 * <code>纬度</code>返回
	 * @return <code>纬度</code>
	 */
	public Double getLatitude() {
		return this.latitude;
	}

	/**
	 * <code>latitude</code>设定
	 * @param latitude　<code>latitude</code>设定值
	 */
	public void setLatitude(
			Double latitude) {
		this.latitude = latitude;
	}

	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(AddressInfoDTO compareToDTO) {
		return this.equals(compareToDTO) ? 0 : -1;
	}
}
