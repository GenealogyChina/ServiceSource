/*
 * Genealogy
 * Xiao Hua Ma personal studio 2015.
 */
package com.maxiaohua.genealogy.main.service.a02;

import com.maxiaohua.genealogy.fw.core.service.AbstractService;
import com.maxiaohua.genealogy.main.service.a02.dto.GsGetActionCommentInDTO;
import com.maxiaohua.genealogy.main.service.a02.dto.GsGetActionCommentOutDTO;

public class GsGetActionComment extends AbstractService<GsGetActionCommentOutDTO, GsGetActionCommentInDTO> {

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.maxiaohua.genealogy.fw.core.service.AbstractService#execute(java.lang.Object)
	 */
	@Override
	public GsGetActionCommentOutDTO execute(
			GsGetActionCommentInDTO gsGetActionCommentInDTO) {
		GsGetActionCommentOutDTO gsGetActionCommentOutDTO = new GsGetActionCommentOutDTO();
		return gsGetActionCommentOutDTO;
	}
}
