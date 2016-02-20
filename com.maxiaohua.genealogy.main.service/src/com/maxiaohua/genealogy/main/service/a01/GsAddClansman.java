/*
 * Genealogy
 * Xiao Hua Ma personal studio 2015.
 */
package com.maxiaohua.genealogy.main.service.a01;

import com.maxiaohua.genealogy.fw.core.service.AbstractService;
import com.maxiaohua.genealogy.fw.core.type.Transactional;
import com.maxiaohua.genealogy.main.service.a01.dto.GsAddClansmanInDTO;
import com.maxiaohua.genealogy.main.service.a01.dto.GsAddClansmanOutDTO;

public class GsAddClansman extends AbstractService<GsAddClansmanOutDTO, GsAddClansmanInDTO> {

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.maxiaohua.genealogy.fw.core.service.AbstractService#execute(java.lang.Object)
	 */
	@Override
	@Transactional
	public GsAddClansmanOutDTO execute(
			GsAddClansmanInDTO gsAddClansmanInDTO) {
		GsAddClansmanOutDTO gsAddClansmanOutDTO = new GsAddClansmanOutDTO();
		return gsAddClansmanOutDTO;
	}
}
