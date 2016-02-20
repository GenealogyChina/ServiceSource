/*
 * Genealogy
 * Xiao Hua Ma personal studio 2015.
 */
package com.maxiaohua.genealogy.main.service.a01;

import com.maxiaohua.genealogy.fw.core.service.AbstractService;
import com.maxiaohua.genealogy.fw.core.type.Transactional;
import com.maxiaohua.genealogy.main.service.a01.dto.GsDeletePersonalActionInDTO;
import com.maxiaohua.genealogy.main.service.a01.dto.GsDeletePersonalActionOutDTO;

public class GsDeletePersonalAction extends AbstractService<GsDeletePersonalActionOutDTO, GsDeletePersonalActionInDTO> {

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.maxiaohua.genealogy.fw.core.service.AbstractService#execute(java.lang.Object)
	 */
	@Override
	@Transactional
	public GsDeletePersonalActionOutDTO execute(
			GsDeletePersonalActionInDTO gsDeletePersonalActionInDTO) {
		GsDeletePersonalActionOutDTO gsDeletePersonalActionOutDTO = new GsDeletePersonalActionOutDTO();
		return gsDeletePersonalActionOutDTO;
	}
}
