/*
 * Genealogy
 * Xiao Hua Ma personal studio 2015.
 */
package com.maxiaohua.genealogy.main.service.a02;

import com.maxiaohua.genealogy.fw.core.service.AbstractService;
import com.maxiaohua.genealogy.main.service.a02.dto.GsGetGenealogyActionInDTO;
import com.maxiaohua.genealogy.main.service.a02.dto.GsGetGenealogyActionOutDTO;

public class GsGetGenealogyAction extends AbstractService<GsGetGenealogyActionOutDTO, GsGetGenealogyActionInDTO> {

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.maxiaohua.genealogy.fw.core.service.AbstractService#execute(java.lang.Object)
	 */
	@Override
	public GsGetGenealogyActionOutDTO execute(
			GsGetGenealogyActionInDTO gsGetGenealogyActionInDTO) {
		GsGetGenealogyActionOutDTO gsGetGenealogyActionOutDTO = new GsGetGenealogyActionOutDTO();
		return gsGetGenealogyActionOutDTO;
	}
}
