/* Genealogy
* Xiao Hua Ma personal studio 2015.
*/
package com.maxiaohua.genealogy.main.service.a01.dto;

import com.maxiaohua.genealogy.fw.core.type.Alias;
import com.maxiaohua.genealogy.main.biz.a01.dto.EventInfoDTO;

/**
 * 修改家族事件的InDTO
 *
 * 变更履历
 * REV.         变更日期           变更者              变更内容
 * -------      ---------------    ----------------    ------------------
 * 1.0          2016/02/09         TOOL                初次作成
 *
 */
@com.maxiaohua.genealogy.fw.core.type.AliasKanJi("修改家族事件")
public class GsUpdateGenealogyEventInDTO implements java.io.Serializable, Comparable<GsUpdateGenealogyEventInDTO> {
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
	 * 事件信息  
	 */
	@Alias("事件信息")
	@com.maxiaohua.genealogy.fw.core.validator.type.NotNull
	private EventInfoDTO eventInfo = null;

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
	 * <code>事件信息</code>返回
	 * @return <code>事件信息</code>
	 */
	public EventInfoDTO getEventInfo() {
		return this.eventInfo;
	}

	/**
	 * <code>eventInfo</code>设定
	 * @param eventInfo　<code>eventInfo</code>设定值
	 */
	public void setEventInfo(
			EventInfoDTO eventInfo) {
		this.eventInfo = eventInfo;
	}

	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(GsUpdateGenealogyEventInDTO compareToDTO) {
		return this.equals(compareToDTO) ? 0 : -1;
	}
}
