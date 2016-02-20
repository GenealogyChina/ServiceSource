/*
 * Genealogy
 * Xiao Hua Ma personal studio 2015.
 */
package com.maxiaohua.genealogy.main.service.com;

import com.maxiaohua.genealogy.fw.core.service.AbstractService;
import com.maxiaohua.genealogy.fw.core.type.Transactional;
import com.maxiaohua.genealogy.main.service.com.dto.GsRegistInDTO;
import com.maxiaohua.genealogy.main.service.com.dto.GsRegistOutDTO;

public class GsRegist extends AbstractService<GsRegistOutDTO, GsRegistInDTO> {

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.maxiaohua.genealogy.fw.core.service.AbstractService#execute(java.lang.Object)
	 */
	@Override
	@Transactional
	public GsRegistOutDTO execute(
			GsRegistInDTO gsRegistInDTO) {
		GsRegistOutDTO gsRegistOutDTO = new GsRegistOutDTO();
		return gsRegistOutDTO;
	}
}
