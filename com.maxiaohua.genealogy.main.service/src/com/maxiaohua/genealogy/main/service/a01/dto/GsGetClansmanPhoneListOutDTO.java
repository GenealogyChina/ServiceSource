/* Genealogy
* Xiao Hua Ma personal studio 2015.
*/
package com.maxiaohua.genealogy.main.service.a01.dto;

import com.maxiaohua.genealogy.fw.core.type.Alias;
import com.maxiaohua.genealogy.main.biz.a01.dto.PhoneNoteDTO;

/**
 * 获得已添加族人通讯列表的OutDTO
 *
 * 变更履历
 * REV.         变更日期           变更者              变更内容
 * -------      ---------------    ----------------    ------------------
 * 1.0          2016/02/09         TOOL                初次作成
 *
 */
@com.maxiaohua.genealogy.fw.core.type.AliasKanJi("获得已添加族人通讯列表")
public class GsGetClansmanPhoneListOutDTO implements java.io.Serializable, Comparable<GsGetClansmanPhoneListOutDTO> {
	/**
	 * Serial ID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 族人通讯列表  
	 */
	@Alias("族人通讯列表")
	private PhoneNoteDTO[] phoneNotes = null;

	/**
	 * <code>族人通讯列表</code>返回
	 * @return <code>族人通讯列表</code>
	 */
	public PhoneNoteDTO[] getPhoneNotes() {
		return this.phoneNotes;
	}

	/**
	 * <code>phoneNotes</code>设定
	 * @param phoneNotes　<code>phoneNotes</code>设定值
	 */
	public void setPhoneNotes(
			PhoneNoteDTO[] phoneNotes) {
		this.phoneNotes = phoneNotes;
	}

	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(GsGetClansmanPhoneListOutDTO compareToDTO) {
		return this.equals(compareToDTO) ? 0 : -1;
	}
}
