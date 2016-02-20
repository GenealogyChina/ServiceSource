/*
 * Genealogy
 * Xiao Hua Ma personal studio 2015.
 */
package com.maxiaohua.genealogy.main.service.a01;

import com.maxiaohua.genealogy.fw.core.service.AbstractService;
import com.maxiaohua.genealogy.main.service.a01.dto.GsGetGenealogyApprovalInfoInDTO;
import com.maxiaohua.genealogy.main.service.a01.dto.GsGetGenealogyApprovalInfoOutDTO;

public class GsGetGenealogyApprovalInfo extends AbstractService<GsGetGenealogyApprovalInfoOutDTO, GsGetGenealogyApprovalInfoInDTO> {

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.maxiaohua.genealogy.fw.core.service.AbstractService#execute(java.lang.Object)
	 */
	@Override
	public GsGetGenealogyApprovalInfoOutDTO execute(
			GsGetGenealogyApprovalInfoInDTO gsGetGenealogyApprovalInfoInDTO) {
		GsGetGenealogyApprovalInfoOutDTO gsGetGenealogyApprovalInfoOutDTO = new GsGetGenealogyApprovalInfoOutDTO();
		return gsGetGenealogyApprovalInfoOutDTO;
	}
}
