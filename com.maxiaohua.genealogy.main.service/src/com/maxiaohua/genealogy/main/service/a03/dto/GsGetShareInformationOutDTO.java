/* Genealogy
* Xiao Hua Ma personal studio 2015.
*/
package com.maxiaohua.genealogy.main.service.a03.dto;

import com.maxiaohua.genealogy.fw.core.type.Alias;
import com.maxiaohua.genealogy.main.biz.a03.dto.ShareInfoDTO;

/**
 * 获得分享内容的OutDTO
 *
 * 变更履历
 * REV.         变更日期           变更者              变更内容
 * -------      ---------------    ----------------    ------------------
 * 1.0          2016/02/09         TOOL                初次作成
 *
 */
@com.maxiaohua.genealogy.fw.core.type.AliasKanJi("获得分享内容")
public class GsGetShareInformationOutDTO implements java.io.Serializable, Comparable<GsGetShareInformationOutDTO> {
	/**
	 * Serial ID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 分享内容  
	 */
	@Alias("分享内容")
	private ShareInfoDTO shareInfo = null;

	/**
	 * <code>分享内容</code>返回
	 * @return <code>分享内容</code>
	 */
	public ShareInfoDTO getShareInfo() {
		return this.shareInfo;
	}

	/**
	 * <code>shareInfo</code>设定
	 * @param shareInfo　<code>shareInfo</code>设定值
	 */
	public void setShareInfo(
			ShareInfoDTO shareInfo) {
		this.shareInfo = shareInfo;
	}

	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(GsGetShareInformationOutDTO compareToDTO) {
		return this.equals(compareToDTO) ? 0 : -1;
	}
}
