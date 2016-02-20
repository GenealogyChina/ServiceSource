/*
 * Genealogy
 * Xiao Hua Ma personal studio 2015.
 */
package com.maxiaohua.genealogy.main.service.a01;

import com.maxiaohua.genealogy.fw.core.service.AbstractService;
import com.maxiaohua.genealogy.main.service.a01.dto.GsGetGenealogyApprovalListInDTO;
import com.maxiaohua.genealogy.main.service.a01.dto.GsGetGenealogyApprovalListOutDTO;

public class GsGetGenealogyApprovalList extends AbstractService<GsGetGenealogyApprovalListOutDTO, GsGetGenealogyApprovalListInDTO> {

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.maxiaohua.genealogy.fw.core.service.AbstractService#execute(java.lang.Object)
	 */
	@Override
	public GsGetGenealogyApprovalListOutDTO execute(
			GsGetGenealogyApprovalListInDTO gsGetGenealogyApprovalListInDTO) {
		GsGetGenealogyApprovalListOutDTO gsGetGenealogyApprovalListOutDTO = new GsGetGenealogyApprovalListOutDTO();
		return gsGetGenealogyApprovalListOutDTO;
	}
}
