/*
 * Genealogy
 * Xiao Hua Ma personal studio 2015.
 */
package com.maxiaohua.genealogy.main.service.a03;

import com.maxiaohua.genealogy.fw.core.service.AbstractService;
import com.maxiaohua.genealogy.fw.core.type.Transactional;
import com.maxiaohua.genealogy.main.service.a03.dto.GsAddFeedBackInDTO;
import com.maxiaohua.genealogy.main.service.a03.dto.GsAddFeedBackOutDTO;

public class GsAddFeedBack extends AbstractService<GsAddFeedBackOutDTO, GsAddFeedBackInDTO> {

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.maxiaohua.genealogy.fw.core.service.AbstractService#execute(java.lang.Object)
	 */
	@Override
	@Transactional
	public GsAddFeedBackOutDTO execute(
			GsAddFeedBackInDTO gsAddFeedBackInDTO) {
		GsAddFeedBackOutDTO gsAddFeedBackOutDTO = new GsAddFeedBackOutDTO();
		return gsAddFeedBackOutDTO;
	}
}
