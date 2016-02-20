/*
 * Genealogy
 * Xiao Hua Ma personal studio 2015.
 */
package com.maxiaohua.genealogy.main.service.a01;

import com.maxiaohua.genealogy.fw.core.service.AbstractService;
import com.maxiaohua.genealogy.fw.core.type.Transactional;
import com.maxiaohua.genealogy.main.service.a01.dto.GsUpdatePersonalActionInDTO;
import com.maxiaohua.genealogy.main.service.a01.dto.GsUpdatePersonalActionOutDTO;

public class GsUpdatePersonalAction extends AbstractService<GsUpdatePersonalActionOutDTO, GsUpdatePersonalActionInDTO> {

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.maxiaohua.genealogy.fw.core.service.AbstractService#execute(java.lang.Object)
	 */
	@Override
	@Transactional
	public GsUpdatePersonalActionOutDTO execute(
			GsUpdatePersonalActionInDTO gsUpdatePersonalActionInDTO) {
		GsUpdatePersonalActionOutDTO gsUpdatePersonalActionOutDTO = new GsUpdatePersonalActionOutDTO();
		return gsUpdatePersonalActionOutDTO;
	}
}
