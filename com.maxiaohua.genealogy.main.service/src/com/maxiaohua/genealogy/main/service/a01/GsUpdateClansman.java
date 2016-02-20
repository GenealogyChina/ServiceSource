/*
 * Genealogy
 * Xiao Hua Ma personal studio 2015.
 */
package com.maxiaohua.genealogy.main.service.a01;

import com.maxiaohua.genealogy.fw.core.service.AbstractService;
import com.maxiaohua.genealogy.fw.core.type.Transactional;
import com.maxiaohua.genealogy.main.service.a01.dto.GsUpdateClansmanInDTO;
import com.maxiaohua.genealogy.main.service.a01.dto.GsUpdateClansmanOutDTO;

public class GsUpdateClansman extends AbstractService<GsUpdateClansmanOutDTO, GsUpdateClansmanInDTO> {

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.maxiaohua.genealogy.fw.core.service.AbstractService#execute(java.lang.Object)
	 */
	@Override
	@Transactional
	public GsUpdateClansmanOutDTO execute(
			GsUpdateClansmanInDTO gsUpdateClansmanInDTO) {
		GsUpdateClansmanOutDTO gsUpdateClansmanOutDTO = new GsUpdateClansmanOutDTO();
		return gsUpdateClansmanOutDTO;
	}
}
