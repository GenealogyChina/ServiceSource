/*
 * Genealogy
 * Xiao Hua Ma personal studio 2015.
 */
package com.maxiaohua.genealogy.main.service.a03;

import com.maxiaohua.genealogy.fw.core.service.AbstractService;
import com.maxiaohua.genealogy.main.service.a03.dto.GsGetShareInformationInDTO;
import com.maxiaohua.genealogy.main.service.a03.dto.GsGetShareInformationOutDTO;

public class GsGetShareInformation extends AbstractService<GsGetShareInformationOutDTO, GsGetShareInformationInDTO> {

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.maxiaohua.genealogy.fw.core.service.AbstractService#execute(java.lang.Object)
	 */
	@Override
	public GsGetShareInformationOutDTO execute(
			GsGetShareInformationInDTO gsGetShareInformationInDTO) {
		GsGetShareInformationOutDTO gsGetShareInformationOutDTO = new GsGetShareInformationOutDTO();
		return gsGetShareInformationOutDTO;
	}
}
