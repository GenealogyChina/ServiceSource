/*
 * Genealogy
 * Xiao Hua Ma personal studio 2015.
 */
package com.maxiaohua.genealogy.main.service.a01;

import com.maxiaohua.genealogy.fw.core.service.AbstractService;
import com.maxiaohua.genealogy.fw.core.type.Transactional;
import com.maxiaohua.genealogy.main.service.a01.dto.GsAddGenealogyEventInDTO;
import com.maxiaohua.genealogy.main.service.a01.dto.GsAddGenealogyEventOutDTO;

public class GsAddGenealogyEvent extends AbstractService<GsAddGenealogyEventOutDTO, GsAddGenealogyEventInDTO> {

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.maxiaohua.genealogy.fw.core.service.AbstractService#execute(java.lang.Object)
	 */
	@Override
	@Transactional
	public GsAddGenealogyEventOutDTO execute(
			GsAddGenealogyEventInDTO gsAddGenealogyEventInDTO) {
		GsAddGenealogyEventOutDTO gsAddGenealogyEventOutDTO = new GsAddGenealogyEventOutDTO();
		return gsAddGenealogyEventOutDTO;
	}
}
