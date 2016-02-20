/*
 * Genealogy
 * Xiao Hua Ma personal studio 2015.
 */
package com.maxiaohua.genealogy.main.service.a03;

import com.maxiaohua.genealogy.fw.core.service.AbstractService;
import com.maxiaohua.genealogy.fw.core.type.Transactional;
import com.maxiaohua.genealogy.main.service.a03.dto.GsUpdatePasswordInDTO;
import com.maxiaohua.genealogy.main.service.a03.dto.GsUpdatePasswordOutDTO;

public class GsUpdatePassword extends AbstractService<GsUpdatePasswordOutDTO, GsUpdatePasswordInDTO> {

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.maxiaohua.genealogy.fw.core.service.AbstractService#execute(java.lang.Object)
	 */
	@Override
	@Transactional
	public GsUpdatePasswordOutDTO execute(
			GsUpdatePasswordInDTO gsUpdatePasswordInDTO) {
		GsUpdatePasswordOutDTO gsUpdatePasswordOutDTO = new GsUpdatePasswordOutDTO();
		return gsUpdatePasswordOutDTO;
	}
}
