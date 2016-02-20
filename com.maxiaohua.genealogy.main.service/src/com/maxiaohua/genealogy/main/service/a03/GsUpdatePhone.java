/*
 * Genealogy
 * Xiao Hua Ma personal studio 2015.
 */
package com.maxiaohua.genealogy.main.service.a03;

import com.maxiaohua.genealogy.fw.core.service.AbstractService;
import com.maxiaohua.genealogy.fw.core.type.Transactional;
import com.maxiaohua.genealogy.main.service.a03.dto.GsUpdatePhoneInDTO;
import com.maxiaohua.genealogy.main.service.a03.dto.GsUpdatePhoneOutDTO;

public class GsUpdatePhone extends AbstractService<GsUpdatePhoneOutDTO, GsUpdatePhoneInDTO> {

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.maxiaohua.genealogy.fw.core.service.AbstractService#execute(java.lang.Object)
	 */
	@Override
	@Transactional
	public GsUpdatePhoneOutDTO execute(
			GsUpdatePhoneInDTO gsUpdatePhoneInDTO) {
		GsUpdatePhoneOutDTO gsUpdatePhoneOutDTO = new GsUpdatePhoneOutDTO();
		return gsUpdatePhoneOutDTO;
	}
}
