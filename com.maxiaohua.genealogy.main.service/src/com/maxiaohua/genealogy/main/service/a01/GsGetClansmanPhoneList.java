/*
 * Genealogy
 * Xiao Hua Ma personal studio 2015.
 */
package com.maxiaohua.genealogy.main.service.a01;

import com.maxiaohua.genealogy.fw.core.service.AbstractService;
import com.maxiaohua.genealogy.main.service.a01.dto.GsGetClansmanPhoneListInDTO;
import com.maxiaohua.genealogy.main.service.a01.dto.GsGetClansmanPhoneListOutDTO;

public class GsGetClansmanPhoneList extends AbstractService<GsGetClansmanPhoneListOutDTO, GsGetClansmanPhoneListInDTO> {

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.maxiaohua.genealogy.fw.core.service.AbstractService#execute(java.lang.Object)
	 */
	@Override
	public GsGetClansmanPhoneListOutDTO execute(
			GsGetClansmanPhoneListInDTO gsGetClansmanPhoneListInDTO) {
		GsGetClansmanPhoneListOutDTO gsGetClansmanPhoneListOutDTO = new GsGetClansmanPhoneListOutDTO();
		return gsGetClansmanPhoneListOutDTO;
	}
}
