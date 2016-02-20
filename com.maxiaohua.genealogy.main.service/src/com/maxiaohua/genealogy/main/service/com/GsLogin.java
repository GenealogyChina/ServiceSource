/*
 * Genealogy
 * Xiao Hua Ma personal studio 2015.
 */
package com.maxiaohua.genealogy.main.service.com;

import com.maxiaohua.genealogy.fw.core.service.AbstractService;
import com.maxiaohua.genealogy.fw.core.type.Transactional;
import com.maxiaohua.genealogy.main.service.com.dto.GsLoginInDTO;
import com.maxiaohua.genealogy.main.service.com.dto.GsLoginOutDTO;

public class GsLogin extends AbstractService<GsLoginOutDTO, GsLoginInDTO> {

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.maxiaohua.genealogy.fw.core.service.AbstractService#execute(java.lang.Object)
	 */
	@Override
	@Transactional
	public GsLoginOutDTO execute(
			GsLoginInDTO gsLoginInDTO) {
		GsLoginOutDTO gsLoginOutDTO = new GsLoginOutDTO();
		return gsLoginOutDTO;
	}
}
