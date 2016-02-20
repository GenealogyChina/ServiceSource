/*
 * Genealogy
 * Xiao Hua Ma personal studio 2015.
 */
package com.maxiaohua.genealogy.main.service.a01;

import com.maxiaohua.genealogy.fw.core.service.AbstractService;
import com.maxiaohua.genealogy.main.service.a01.dto.GsSearchGenealogyInDTO;
import com.maxiaohua.genealogy.main.service.a01.dto.GsSearchGenealogyOutDTO;

public class GsSearchGenealogy extends AbstractService<GsSearchGenealogyOutDTO, GsSearchGenealogyInDTO> {

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.maxiaohua.genealogy.fw.core.service.AbstractService#execute(java.lang.Object)
	 */
	@Override
	public GsSearchGenealogyOutDTO execute(
			GsSearchGenealogyInDTO gsSearchGenealogyInDTO) {
		GsSearchGenealogyOutDTO gsSearchGenealogyOutDTO = new GsSearchGenealogyOutDTO();
		return gsSearchGenealogyOutDTO;
	}
}
