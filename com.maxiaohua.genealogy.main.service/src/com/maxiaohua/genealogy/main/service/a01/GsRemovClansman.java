/*
 * Genealogy
 * Xiao Hua Ma personal studio 2015.
 */
package com.maxiaohua.genealogy.main.service.a01;

import com.maxiaohua.genealogy.fw.core.service.AbstractService;
import com.maxiaohua.genealogy.fw.core.type.Transactional;
import com.maxiaohua.genealogy.main.service.a01.dto.GsRemovClansmanInDTO;
import com.maxiaohua.genealogy.main.service.a01.dto.GsRemovClansmanOutDTO;

public class GsRemovClansman extends AbstractService<GsRemovClansmanOutDTO, GsRemovClansmanInDTO> {

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.maxiaohua.genealogy.fw.core.service.AbstractService#execute(java.lang.Object)
	 */
	@Override
	@Transactional
	public GsRemovClansmanOutDTO execute(
			GsRemovClansmanInDTO gsRemovClansmanInDTO) {
		GsRemovClansmanOutDTO gsRemovClansmanOutDTO = new GsRemovClansmanOutDTO();
		return gsRemovClansmanOutDTO;
	}
}
