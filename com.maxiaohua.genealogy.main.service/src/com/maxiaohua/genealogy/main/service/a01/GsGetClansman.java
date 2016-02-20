/*
 * Genealogy
 * Xiao Hua Ma personal studio 2015.
 */
package com.maxiaohua.genealogy.main.service.a01;

import com.maxiaohua.genealogy.fw.core.service.AbstractService;
import com.maxiaohua.genealogy.main.service.a01.dto.GsGetClansmanInDTO;
import com.maxiaohua.genealogy.main.service.a01.dto.GsGetClansmanOutDTO;

public class GsGetClansman extends AbstractService<GsGetClansmanOutDTO, GsGetClansmanInDTO> {

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.maxiaohua.genealogy.fw.core.service.AbstractService#execute(java.lang.Object)
	 */
	@Override
	public GsGetClansmanOutDTO execute(
			GsGetClansmanInDTO gsGetClansmanInDTO) {
		GsGetClansmanOutDTO gsGetClansmanOutDTO = new GsGetClansmanOutDTO();
		return gsGetClansmanOutDTO;
	}
}
