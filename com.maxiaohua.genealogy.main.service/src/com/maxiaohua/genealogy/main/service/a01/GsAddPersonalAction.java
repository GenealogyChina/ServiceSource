/*
 * Genealogy
 * Xiao Hua Ma personal studio 2015.
 */
package com.maxiaohua.genealogy.main.service.a01;

import com.maxiaohua.genealogy.fw.core.service.AbstractService;
import com.maxiaohua.genealogy.fw.core.type.Transactional;
import com.maxiaohua.genealogy.main.service.a01.dto.GsAddPersonalActionInDTO;
import com.maxiaohua.genealogy.main.service.a01.dto.GsAddPersonalActionOutDTO;

public class GsAddPersonalAction extends AbstractService<GsAddPersonalActionOutDTO, GsAddPersonalActionInDTO> {

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.maxiaohua.genealogy.fw.core.service.AbstractService#execute(java.lang.Object)
	 */
	@Override
	@Transactional
	public GsAddPersonalActionOutDTO execute(
			GsAddPersonalActionInDTO gsAddPersonalActionInDTO) {
		GsAddPersonalActionOutDTO gsAddPersonalActionOutDTO = new GsAddPersonalActionOutDTO();
		return gsAddPersonalActionOutDTO;
	}
}
