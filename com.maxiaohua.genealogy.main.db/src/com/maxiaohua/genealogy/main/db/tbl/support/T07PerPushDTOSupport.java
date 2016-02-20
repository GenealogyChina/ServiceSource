/*
 * Genealogy
 * Xiao Hua Ma personal studio 2015.
 */
package com.maxiaohua.genealogy.main.db.tbl.support;

import com.maxiaohua.genealogy.fw.core.util.StringUtil;
import com.maxiaohua.genealogy.fw.core.util.DateUtil;
import com.maxiaohua.genealogy.main.db.base.BaseTableDTO;
import com.maxiaohua.genealogy.main.db.tbl.T07PerPushDTO;

/**
 *Service DB Support DTO
 *
 * History
 * REV.         Updated Date           Updater              Infomation
 * -------      ---------------        ----------------     ------------------
 * 1.0          2016/02/08             TOOL                 Create
*
 */
public abstract class T07PerPushDTOSupport extends BaseTableDTO {

	public static final String INSERT = "T07_PER_PUSH_INSERT";

	public static final String FULL_UPDATE = "T07_PER_PUSH_FULL_UPDATE";

	public static final String UPDATE = "T07_PER_PUSH_UPDATE";

	public static final String DELETE = "T07_PER_PUSH_DELETE";

	public static final String FIND = "T07_PER_PUSH_FIND";

	public static final String FIND_FOR_UPDATE = "T07_PER_PUSH_FIND_FOR_UPDATE";

	public static final String EQUAL_SEARCH = "T07_PER_PUSH_EQUAL_SEARCH";

	public static final String EQUAL_SEARCH_OR = "T07_PER_PUSH_EQUAL_SEARCH_OR";

	public static final String LIKE_SEARCH = "T07_PER_PUSH_LIKE_SEARCH";

	public static final String LIKE_SEARCH_OR = "T07_PER_PUSH_LIKE_SEARCH_OR";

	public static final String SQL_SEARCH = "T07_PER_PUSH_SQL_SEARCH";

	public static final String COUNT = "T07_PER_PUSH_COUNT";

	public static final String COUNT_OR = "T07_PER_PUSH_COUNT_OR";

	public static final String COUNT_SEARCH = "T07_PER_PUSH_COUNT_SEARCH";

	public static final String COLUMN_ID = "ID";

	public static final String COLUMN_PER_NO = "PER_NO";

	public static final String COLUMN_REGISITRATIONID = "REGISITRATIONID";

	public static final String COLUMN_IMSI = "IMSI";

	public static final String COLUMN_LAST_DATE = "LAST_DATE";

	public static final String COLUMN_LAST_TIME = "LAST_TIME";

	public static final String TABLE = "T07_PER_PUSH";

	public static T07PerPushDTO setDefaultValue() {
		T07PerPushDTO defaultDTO = new T07PerPushDTO();

		defaultDTO.setID(0l);

		defaultDTO.setPerNo(StringUtil.EMPTY);

		defaultDTO.setRegisitrationID(StringUtil.EMPTY);

		defaultDTO.setIMSI(StringUtil.EMPTY);

		defaultDTO.setLastDate(DateUtil.getDefaultDate());

		defaultDTO.setLastTime(DateUtil.getDefaultTime());

		return defaultDTO;
	}
}
