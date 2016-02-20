/*
 * Genealogy
 * Xiao Hua Ma personal studio 2015.
 */
package com.maxiaohua.genealogy.main.service.a03;

import com.maxiaohua.genealogy.fw.core.service.AbstractService;
import com.maxiaohua.genealogy.fw.core.type.Transactional;
import com.maxiaohua.genealogy.main.service.a03.dto.GsLogOutInDTO;
import com.maxiaohua.genealogy.main.service.a03.dto.GsLogOutOutDTO;

public class GsLogOut extends AbstractService<GsLogOutOutDTO, GsLogOutInDTO> {

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.maxiaohua.genealogy.fw.core.service.AbstractService#execute(java.lang.Object)
	 */
	@Override
	@Transactional
	public GsLogOutOutDTO execute(
			GsLogOutInDTO gsLogOutInDTO) {
		GsLogOutOutDTO gsLogOutOutDTO = new GsLogOutOutDTO();
		return gsLogOutOutDTO;
	}
}
