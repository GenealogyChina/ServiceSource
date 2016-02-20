/*
 * Genealogy
 * Xiao Hua Ma personal studio 2015.
 */
package com.maxiaohua.genealogy.main.service.a02;

import com.maxiaohua.genealogy.fw.core.service.AbstractService;
import com.maxiaohua.genealogy.fw.core.type.Transactional;
import com.maxiaohua.genealogy.main.service.a02.dto.GsLikeActionPraiseInDTO;
import com.maxiaohua.genealogy.main.service.a02.dto.GsLikeActionPraiseOutDTO;

public class GsLikeActionPraise extends AbstractService<GsLikeActionPraiseOutDTO, GsLikeActionPraiseInDTO> {

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.maxiaohua.genealogy.fw.core.service.AbstractService#execute(java.lang.Object)
	 */
	@Override
	@Transactional
	public GsLikeActionPraiseOutDTO execute(
			GsLikeActionPraiseInDTO gsLikeActionPraiseInDTO) {
		GsLikeActionPraiseOutDTO gsLikeActionPraiseOutDTO = new GsLikeActionPraiseOutDTO();
		return gsLikeActionPraiseOutDTO;
	}
}
