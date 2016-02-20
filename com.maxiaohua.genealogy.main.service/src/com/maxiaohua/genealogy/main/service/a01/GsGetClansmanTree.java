/*
 * Genealogy
 * Xiao Hua Ma personal studio 2015.
 */
package com.maxiaohua.genealogy.main.service.a01;

import com.maxiaohua.genealogy.fw.core.service.AbstractService;
import com.maxiaohua.genealogy.main.service.a01.dto.GsGetClansmanTreeInDTO;
import com.maxiaohua.genealogy.main.service.a01.dto.GsGetClansmanTreeOutDTO;

public class GsGetClansmanTree extends AbstractService<GsGetClansmanTreeOutDTO, GsGetClansmanTreeInDTO> {

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.maxiaohua.genealogy.fw.core.service.AbstractService#execute(java.lang.Object)
	 */
	@Override
	public GsGetClansmanTreeOutDTO execute(
			GsGetClansmanTreeInDTO gsGetClansmanTreeInDTO) {
		GsGetClansmanTreeOutDTO gsGetClansmanTreeOutDTO = new GsGetClansmanTreeOutDTO();
		return gsGetClansmanTreeOutDTO;
	}
}
