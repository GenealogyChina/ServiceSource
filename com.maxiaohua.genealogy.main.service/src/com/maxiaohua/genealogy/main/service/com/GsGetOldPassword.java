/*
 * Genealogy
 * Xiao Hua Ma personal studio 2015.
 */
package com.maxiaohua.genealogy.main.service.com;

import com.maxiaohua.genealogy.fw.core.service.AbstractService;
import com.maxiaohua.genealogy.main.service.com.dto.GsGetOldPasswordInDTO;
import com.maxiaohua.genealogy.main.service.com.dto.GsGetOldPasswordOutDTO;

public class GsGetOldPassword extends AbstractService<GsGetOldPasswordOutDTO, GsGetOldPasswordInDTO> {

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.maxiaohua.genealogy.fw.core.service.AbstractService#execute(java.lang.Object)
	 */
	@Override
	public GsGetOldPasswordOutDTO execute(
			GsGetOldPasswordInDTO gsGetOldPasswordInDTO) {
		GsGetOldPasswordOutDTO gsGetOldPasswordOutDTO = new GsGetOldPasswordOutDTO();
		return gsGetOldPasswordOutDTO;
	}
}
