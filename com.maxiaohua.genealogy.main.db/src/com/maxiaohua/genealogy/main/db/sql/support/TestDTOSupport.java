/*
 * Genealogy
 * Xiao Hua Ma personal studio 2015.
 */
package com.maxiaohua.genealogy.main.db.sql.support;

import com.maxiaohua.genealogy.fw.core.util.StringUtil;
import com.maxiaohua.genealogy.main.db.base.BaseTableDTO;
import com.maxiaohua.genealogy.main.db.sql.TestDTO;

/**
 *Service DB Support DTO
 *
 * History
 * REV.         Updated Date           Updater              Infomation
 * -------      ---------------        ----------------     ------------------
 * 1.0          2015/10/07             TOOL                 Create
*
 */
public abstract class TestDTOSupport extends BaseTableDTO {


	public static final String COLUMN_CODE1 = "CODE1";

	public static final String COLUMN_CODE2 = "CODE2";

	public static final String COLUMN_CODE3 = "CODE3";

	public static final String COLUMN_VALUE = "VALUE";

	public static final String SQL_NAME = "CUSTOM_READ";

	public static TestDTO setDefaultValue() {
		TestDTO defaultDTO = new TestDTO();

		defaultDTO.setCODE1(StringUtil.EMPTY);

		defaultDTO.setCODE2(StringUtil.EMPTY);

		defaultDTO.setCODE3(StringUtil.EMPTY);

		defaultDTO.setVALUE(StringUtil.EMPTY);

		return defaultDTO;
	}
}
