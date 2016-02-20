/*
 * Genealogy
 * Xiao Hua Ma personal studio 2015.
 */
package com.maxiaohua.genealogy.main.service.a01;

import com.maxiaohua.genealogy.fw.core.service.AbstractService;
import com.maxiaohua.genealogy.fw.core.type.Transactional;
import com.maxiaohua.genealogy.main.service.a01.dto.GsDeleteGenealogyEventInDTO;
import com.maxiaohua.genealogy.main.service.a01.dto.GsDeleteGenealogyEventOutDTO;

public class GsDeleteGenealogyEvent extends AbstractService<GsDeleteGenealogyEventOutDTO, GsDeleteGenealogyEventInDTO> {

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.maxiaohua.genealogy.fw.core.service.AbstractService#execute(java.lang.Object)
	 */
	@Override
	@Transactional
	public GsDeleteGenealogyEventOutDTO execute(
			GsDeleteGenealogyEventInDTO gsDeleteGenealogyEventInDTO) {
		GsDeleteGenealogyEventOutDTO gsDeleteGenealogyEventOutDTO = new GsDeleteGenealogyEventOutDTO();
		return gsDeleteGenealogyEventOutDTO;
	}
}
