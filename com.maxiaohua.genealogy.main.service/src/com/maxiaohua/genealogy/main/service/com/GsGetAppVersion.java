/*
 * Genealogy
 * Xiao Hua Ma personal studio 2015.
 */
package com.maxiaohua.genealogy.main.service.com;

import com.maxiaohua.genealogy.fw.core.service.AbstractService;
import com.maxiaohua.genealogy.main.service.com.dto.GsGetAppVersionInDTO;
import com.maxiaohua.genealogy.main.service.com.dto.GsGetAppVersionOutDTO;

public class GsGetAppVersion extends AbstractService<GsGetAppVersionOutDTO, GsGetAppVersionInDTO> {

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.maxiaohua.genealogy.fw.core.service.AbstractService#execute(java.lang.Object)
	 */
	@Override
	public GsGetAppVersionOutDTO execute(
			GsGetAppVersionInDTO gsGetAppVersionInDTO) {
		GsGetAppVersionOutDTO gsGetAppVersionOutDTO = new GsGetAppVersionOutDTO();
		return gsGetAppVersionOutDTO;
	}
}
