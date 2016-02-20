/* Genealogy
* Xiao Hua Ma personal studio 2015.
*/
package com.maxiaohua.genealogy.main.service.com.dto;

import com.maxiaohua.genealogy.fw.core.type.Alias;

/**
 * 获得App最新版本号的InDTO
 *
 * 变更履历
 * REV.         变更日期           变更者              变更内容
 * -------      ---------------    ----------------    ------------------
 * 1.0          2016/02/09         TOOL                初次作成
 *
 */
@com.maxiaohua.genealogy.fw.core.type.AliasKanJi("获得App最新版本号")
public class GsGetAppVersionInDTO implements java.io.Serializable, Comparable<GsGetAppVersionInDTO> {
	/**
	 * Serial ID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 版本信息  
	 */
	@Alias("版本信息")
	@com.maxiaohua.genealogy.fw.core.validator.type.NotNull
	private String version = null;

	/**
	 * 渠道号  
	 */
	@Alias("渠道号")
	@com.maxiaohua.genealogy.fw.core.validator.type.NotNull
	private String channel = null;

	/**
	 * 类型  
	 */
	@Alias("类型")
	@com.maxiaohua.genealogy.fw.core.validator.type.NotNull
	private String imsi = null;

	/**
	 * <code>版本信息</code>返回
	 * @return <code>版本信息</code>
	 */
	public String getVersion() {
		return this.version;
	}

	/**
	 * <code>version</code>设定
	 * @param version　<code>version</code>设定值
	 */
	public void setVersion(
			String version) {
		this.version = version;
	}

	/**
	 * <code>渠道号</code>返回
	 * @return <code>渠道号</code>
	 */
	public String getChannel() {
		return this.channel;
	}

	/**
	 * <code>channel</code>设定
	 * @param channel　<code>channel</code>设定值
	 */
	public void setChannel(
			String channel) {
		this.channel = channel;
	}

	/**
	 * <code>类型</code>返回
	 * @return <code>类型</code>
	 */
	public String getImsi() {
		return this.imsi;
	}

	/**
	 * <code>imsi</code>设定
	 * @param imsi　<code>imsi</code>设定值
	 */
	public void setImsi(
			String imsi) {
		this.imsi = imsi;
	}

	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(GsGetAppVersionInDTO compareToDTO) {
		return this.equals(compareToDTO) ? 0 : -1;
	}
}
