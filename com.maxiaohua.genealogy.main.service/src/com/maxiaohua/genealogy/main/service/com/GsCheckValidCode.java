/*
 * Genealogy
 * Xiao Hua Ma personal studio 2015.
 */
package com.maxiaohua.genealogy.main.service.com;

import com.maxiaohua.genealogy.fw.core.service.AbstractService;
import com.maxiaohua.genealogy.main.service.com.dto.GsCheckValidCodeInDTO;
import com.maxiaohua.genealogy.main.service.com.dto.GsCheckValidCodeOutDTO;

public class GsCheckValidCode extends AbstractService<GsCheckValidCodeOutDTO, GsCheckValidCodeInDTO> {

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.maxiaohua.genealogy.fw.core.service.AbstractService#execute(java.lang.Object)
	 */
	@Override
	public GsCheckValidCodeOutDTO execute(
			GsCheckValidCodeInDTO gsCheckValidCodeInDTO) {
		GsCheckValidCodeOutDTO gsCheckValidCodeOutDTO = new GsCheckValidCodeOutDTO();
		return gsCheckValidCodeOutDTO;
	}
}
