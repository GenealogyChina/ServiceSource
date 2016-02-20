/*
 * Genealogy
 * Xiao Hua Ma personal studio 2015.
 */
package com.maxiaohua.genealogy.main.service.a01;

import com.maxiaohua.genealogy.fw.core.service.AbstractService;
import com.maxiaohua.genealogy.main.service.a01.dto.GsGetGenealogyInfoInDTO;
import com.maxiaohua.genealogy.main.service.a01.dto.GsGetGenealogyInfoOutDTO;

public class GsGetGenealogyInfo extends AbstractService<GsGetGenealogyInfoOutDTO, GsGetGenealogyInfoInDTO> {

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.maxiaohua.genealogy.fw.core.service.AbstractService#execute(java.lang.Object)
	 */
	@Override
	public GsGetGenealogyInfoOutDTO execute(
			GsGetGenealogyInfoInDTO gsGetGenealogyInfoInDTO) {
		GsGetGenealogyInfoOutDTO gsGetGenealogyInfoOutDTO = new GsGetGenealogyInfoOutDTO();
		return gsGetGenealogyInfoOutDTO;
	}
}
