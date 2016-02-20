/*
 * Genealogy
 * Xiao Hua Ma personal studio 2015.
 */
package com.maxiaohua.genealogy.main.service.a01;

import com.maxiaohua.genealogy.fw.core.service.AbstractService;
import com.maxiaohua.genealogy.fw.core.type.Transactional;
import com.maxiaohua.genealogy.main.service.a01.dto.GsApplyJoinGenealogyInDTO;
import com.maxiaohua.genealogy.main.service.a01.dto.GsApplyJoinGenealogyOutDTO;

public class GsApplyJoinGenealogy extends AbstractService<GsApplyJoinGenealogyOutDTO, GsApplyJoinGenealogyInDTO> {

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.maxiaohua.genealogy.fw.core.service.AbstractService#execute(java.lang.Object)
	 */
	@Override
	@Transactional
	public GsApplyJoinGenealogyOutDTO execute(
			GsApplyJoinGenealogyInDTO gsApplyJoinGenealogyInDTO) {
		GsApplyJoinGenealogyOutDTO gsApplyJoinGenealogyOutDTO = new GsApplyJoinGenealogyOutDTO();
		return gsApplyJoinGenealogyOutDTO;
	}
}
