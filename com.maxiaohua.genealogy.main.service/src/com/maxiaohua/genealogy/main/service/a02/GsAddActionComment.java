/*
 * Genealogy
 * Xiao Hua Ma personal studio 2015.
 */
package com.maxiaohua.genealogy.main.service.a02;

import com.maxiaohua.genealogy.fw.core.service.AbstractService;
import com.maxiaohua.genealogy.fw.core.type.Transactional;
import com.maxiaohua.genealogy.main.service.a02.dto.GsAddActionCommentInDTO;
import com.maxiaohua.genealogy.main.service.a02.dto.GsAddActionCommentOutDTO;

public class GsAddActionComment extends AbstractService<GsAddActionCommentOutDTO, GsAddActionCommentInDTO> {

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.maxiaohua.genealogy.fw.core.service.AbstractService#execute(java.lang.Object)
	 */
	@Override
	@Transactional
	public GsAddActionCommentOutDTO execute(
			GsAddActionCommentInDTO fsUploadCommentInDTO) {
		GsAddActionCommentOutDTO fsUploadCommentOutDTO = new GsAddActionCommentOutDTO();
		return fsUploadCommentOutDTO;
	}
}
