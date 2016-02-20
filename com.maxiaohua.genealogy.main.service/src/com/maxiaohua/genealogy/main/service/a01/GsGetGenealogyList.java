/*
 * Genealogy
 * Xiao Hua Ma personal studio 2015.
 */
package com.maxiaohua.genealogy.main.service.a01;

import com.maxiaohua.genealogy.fw.core.service.AbstractService;
import com.maxiaohua.genealogy.main.service.a01.dto.GsGetGenealogyListInDTO;
import com.maxiaohua.genealogy.main.service.a01.dto.GsGetGenealogyListOutDTO;

public class GsGetGenealogyList extends AbstractService<GsGetGenealogyListOutDTO, GsGetGenealogyListInDTO> {

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.maxiaohua.genealogy.fw.core.service.AbstractService#execute(java.lang.Object)
	 */
	@Override
	public GsGetGenealogyListOutDTO execute(
			GsGetGenealogyListInDTO gsGetGenealogyListInDTO) {
		GsGetGenealogyListOutDTO gsGetGenealogyListOutDTO = new GsGetGenealogyListOutDTO();
		return gsGetGenealogyListOutDTO;
	}
}
