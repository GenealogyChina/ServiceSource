/*
 * Genealogy
 * Xiao Hua Ma personal studio 2015.
 */
package com.maxiaohua.genealogy.main.service.a01;

import com.maxiaohua.genealogy.fw.core.service.AbstractService;
import com.maxiaohua.genealogy.fw.core.type.Transactional;
import com.maxiaohua.genealogy.main.service.a01.dto.GsAddGenealogyInDTO;
import com.maxiaohua.genealogy.main.service.a01.dto.GsAddGenealogyOutDTO;

public class GsAddGenealogy extends AbstractService<GsAddGenealogyOutDTO, GsAddGenealogyInDTO> {

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.maxiaohua.genealogy.fw.core.service.AbstractService#execute(java.lang.Object)
	 */
	@Override
	@Transactional
	public GsAddGenealogyOutDTO execute(
			GsAddGenealogyInDTO gsAddGenealogyInDTO) {
		GsAddGenealogyOutDTO gsAddGenealogyOutDTO = new GsAddGenealogyOutDTO();
		return gsAddGenealogyOutDTO;
	}
}
