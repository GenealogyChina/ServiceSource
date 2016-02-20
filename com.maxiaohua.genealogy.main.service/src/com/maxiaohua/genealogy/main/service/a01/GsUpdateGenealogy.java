/*
 * Genealogy
 * Xiao Hua Ma personal studio 2015.
 */
package com.maxiaohua.genealogy.main.service.a01;

import com.maxiaohua.genealogy.fw.core.service.AbstractService;
import com.maxiaohua.genealogy.fw.core.type.Transactional;
import com.maxiaohua.genealogy.main.service.a01.dto.GsUpdateGenealogyInDTO;
import com.maxiaohua.genealogy.main.service.a01.dto.GsUpdateGenealogyOutDTO;

public class GsUpdateGenealogy extends AbstractService<GsUpdateGenealogyOutDTO, GsUpdateGenealogyInDTO> {

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.maxiaohua.genealogy.fw.core.service.AbstractService#execute(java.lang.Object)
	 */
	@Override
	@Transactional
	public GsUpdateGenealogyOutDTO execute(
			GsUpdateGenealogyInDTO gsUpdateGenealogyInDTO) {
		GsUpdateGenealogyOutDTO gsUpdateGenealogyOutDTO = new GsUpdateGenealogyOutDTO();
		return gsUpdateGenealogyOutDTO;
	}
}
