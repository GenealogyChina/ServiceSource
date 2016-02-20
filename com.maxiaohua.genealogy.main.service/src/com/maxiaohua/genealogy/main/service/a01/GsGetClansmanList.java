/*
 * Genealogy
 * Xiao Hua Ma personal studio 2015.
 */
package com.maxiaohua.genealogy.main.service.a01;

import com.maxiaohua.genealogy.fw.core.service.AbstractService;
import com.maxiaohua.genealogy.main.service.a01.dto.GsGetClansmanListInDTO;
import com.maxiaohua.genealogy.main.service.a01.dto.GsGetClansmanListOutDTO;

public class GsGetClansmanList extends AbstractService<GsGetClansmanListOutDTO, GsGetClansmanListInDTO> {

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.maxiaohua.genealogy.fw.core.service.AbstractService#execute(java.lang.Object)
	 */
	@Override
	public GsGetClansmanListOutDTO execute(
			GsGetClansmanListInDTO gsGetClansmanListInDTO) {
		GsGetClansmanListOutDTO gsGetClansmanListOutDTO = new GsGetClansmanListOutDTO();
		return gsGetClansmanListOutDTO;
	}
}
