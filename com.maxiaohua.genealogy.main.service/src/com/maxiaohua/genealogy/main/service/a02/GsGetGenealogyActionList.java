/*
 * Genealogy
 * Xiao Hua Ma personal studio 2015.
 */
package com.maxiaohua.genealogy.main.service.a02;

import com.maxiaohua.genealogy.fw.core.service.AbstractService;
import com.maxiaohua.genealogy.main.service.a02.dto.GsGetGenealogyActionListInDTO;
import com.maxiaohua.genealogy.main.service.a02.dto.GsGetGenealogyActionListOutDTO;

public class GsGetGenealogyActionList extends AbstractService<GsGetGenealogyActionListOutDTO, GsGetGenealogyActionListInDTO> {

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.maxiaohua.genealogy.fw.core.service.AbstractService#execute(java.lang.Object)
	 */
	@Override
	public GsGetGenealogyActionListOutDTO execute(
			GsGetGenealogyActionListInDTO gsGetGenealogyActionListInDTO) {
		GsGetGenealogyActionListOutDTO gsGetGenealogyActionListOutDTO = new GsGetGenealogyActionListOutDTO();
		return gsGetGenealogyActionListOutDTO;
	}
}
