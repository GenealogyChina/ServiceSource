/*
 * Genealogy
 * Xiao Hua Ma personal studio 2015.
 */
package com.maxiaohua.genealogy.main.service.a01;

import com.maxiaohua.genealogy.fw.core.service.AbstractService;
import com.maxiaohua.genealogy.fw.core.type.Transactional;
import com.maxiaohua.genealogy.main.service.a01.dto.GsUpdateGenealogyEventInDTO;
import com.maxiaohua.genealogy.main.service.a01.dto.GsUpdateGenealogyEventOutDTO;

public class GsUpdateGenealogyEvent extends AbstractService<GsUpdateGenealogyEventOutDTO, GsUpdateGenealogyEventInDTO> {

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.maxiaohua.genealogy.fw.core.service.AbstractService#execute(java.lang.Object)
	 */
	@Override
	@Transactional
	public GsUpdateGenealogyEventOutDTO execute(
			GsUpdateGenealogyEventInDTO gsUpdateGenealogyEventInDTO) {
		GsUpdateGenealogyEventOutDTO gsUpdateGenealogyEventOutDTO = new GsUpdateGenealogyEventOutDTO();
		return gsUpdateGenealogyEventOutDTO;
	}
}
