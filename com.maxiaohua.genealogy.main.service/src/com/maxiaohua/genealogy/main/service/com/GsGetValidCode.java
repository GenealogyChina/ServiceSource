/*
 * Genealogy
 * Xiao Hua Ma personal studio 2015.
 */
package com.maxiaohua.genealogy.main.service.com;

import com.maxiaohua.genealogy.fw.core.service.AbstractService;
import com.maxiaohua.genealogy.main.service.com.dto.GsGetValidCodeInDTO;
import com.maxiaohua.genealogy.main.service.com.dto.GsGetValidCodeOutDTO;

public class GsGetValidCode extends AbstractService<GsGetValidCodeOutDTO, GsGetValidCodeInDTO> {

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.maxiaohua.genealogy.fw.core.service.AbstractService#execute(java.lang.Object)
	 */
	@Override
	public GsGetValidCodeOutDTO execute(
			GsGetValidCodeInDTO gsGetValidCodeInDTO) {
		GsGetValidCodeOutDTO gsGetValidCodeOutDTO = new GsGetValidCodeOutDTO();
		return gsGetValidCodeOutDTO;
	}
}
