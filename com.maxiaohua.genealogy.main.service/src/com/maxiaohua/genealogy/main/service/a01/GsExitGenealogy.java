/*
 * Genealogy
 * Xiao Hua Ma personal studio 2015.
 */
package com.maxiaohua.genealogy.main.service.a01;

import com.maxiaohua.genealogy.fw.core.service.AbstractService;
import com.maxiaohua.genealogy.fw.core.type.Transactional;
import com.maxiaohua.genealogy.main.service.a01.dto.GsExitGenealogyInDTO;
import com.maxiaohua.genealogy.main.service.a01.dto.GsExitGenealogyOutDTO;

public class GsExitGenealogy extends AbstractService<GsExitGenealogyOutDTO, GsExitGenealogyInDTO> {

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.maxiaohua.genealogy.fw.core.service.AbstractService#execute(java.lang.Object)
	 */
	@Override
	@Transactional
	public GsExitGenealogyOutDTO execute(
			GsExitGenealogyInDTO gsExitGenealogyInDTO) {
		GsExitGenealogyOutDTO gsExitGenealogyOutDTO = new GsExitGenealogyOutDTO();
		return gsExitGenealogyOutDTO;
	}
}
