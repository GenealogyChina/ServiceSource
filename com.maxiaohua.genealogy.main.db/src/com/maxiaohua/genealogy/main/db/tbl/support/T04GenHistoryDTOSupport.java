/*
 * Genealogy
 * Xiao Hua Ma personal studio 2015.
 */
package com.maxiaohua.genealogy.main.db.tbl.support;

import com.maxiaohua.genealogy.fw.core.util.StringUtil;
import com.maxiaohua.genealogy.fw.core.util.DateUtil;
import com.maxiaohua.genealogy.main.db.base.BaseTableDTO;
import com.maxiaohua.genealogy.main.db.tbl.T04GenHistoryDTO;

/**
 *Service DB Support DTO
 *
 * History
 * REV.         Updated Date           Updater              Infomation
 * -------      ---------------        ----------------     ------------------
 * 1.0          2016/02/08             TOOL                 Create
*
 */
public abstract class T04GenHistoryDTOSupport extends BaseTableDTO {

	public static final String INSERT = "T04_GEN_HISTORY_INSERT";

	public static final String FULL_UPDATE = "T04_GEN_HISTORY_FULL_UPDATE";

	public static final String UPDATE = "T04_GEN_HISTORY_UPDATE";

	public static final String DELETE = "T04_GEN_HISTORY_DELETE";

	public static final String FIND = "T04_GEN_HISTORY_FIND";

	public static final String FIND_FOR_UPDATE = "T04_GEN_HISTORY_FIND_FOR_UPDATE";

	public static final String EQUAL_SEARCH = "T04_GEN_HISTORY_EQUAL_SEARCH";

	public static final String EQUAL_SEARCH_OR = "T04_GEN_HISTORY_EQUAL_SEARCH_OR";

	public static final String LIKE_SEARCH = "T04_GEN_HISTORY_LIKE_SEARCH";

	public static final String LIKE_SEARCH_OR = "T04_GEN_HISTORY_LIKE_SEARCH_OR";

	public static final String SQL_SEARCH = "T04_GEN_HISTORY_SQL_SEARCH";

	public static final String COUNT = "T04_GEN_HISTORY_COUNT";

	public static final String COUNT_OR = "T04_GEN_HISTORY_COUNT_OR";

	public static final String COUNT_SEARCH = "T04_GEN_HISTORY_COUNT_SEARCH";

	public static final String COLUMN_ID = "ID";

	public static final String COLUMN_NO = "NO";

	public static final String COLUMN_GEN_NO = "GEN_NO";

	public static final String COLUMN_EVENT_TYPE = "EVENT_TYPE";

	public static final String COLUMN_EVENT_DATE = "EVENT_DATE";

	public static final String COLUMN_EVENT_TIME = "EVENT_TIME";

	public static final String COLUMN_TITLE = "TITLE";

	public static final String COLUMN_COVER_IMAGE = "COVER_IMAGE";

	public static final String COLUMN_REMARKS = "REMARKS";

	public static final String COLUMN_DEL_FLG = "DEL_FLG";

	public static final String COLUMN_CREATE_USER = "CREATE_USER";

	public static final String COLUMN_CREATE_DATE = "CREATE_DATE";

	public static final String COLUMN_CREATE_TIME = "CREATE_TIME";

	public static final String COLUMN_LAST_USER = "LAST_USER";

	public static final String COLUMN_LAST_DATE = "LAST_DATE";

	public static final String COLUMN_LAST_TIME = "LAST_TIME";

	public static final String TABLE = "T04_GEN_HISTORY";

	public static T04GenHistoryDTO setDefaultValue() {
		T04GenHistoryDTO defaultDTO = new T04GenHistoryDTO();

		defaultDTO.setId(0l);

		defaultDTO.setNO(StringUtil.EMPTY);

		defaultDTO.setGenNo(StringUtil.EMPTY);

		defaultDTO.setEventType(StringUtil.EMPTY);

		defaultDTO.setEventDate(DateUtil.getDefaultDate());

		defaultDTO.setEventTime(DateUtil.getDefaultTime());

		defaultDTO.setTitle(StringUtil.EMPTY);

		defaultDTO.setCoverImage(StringUtil.EMPTY);

		defaultDTO.setRemarks(StringUtil.EMPTY);

		defaultDTO.setDelFlg(StringUtil.EMPTY);

		defaultDTO.setCreateUser(StringUtil.EMPTY);

		defaultDTO.setCreateDate(DateUtil.getDefaultDate());

		defaultDTO.setCreateTime(DateUtil.getDefaultTime());

		defaultDTO.setLastUser(StringUtil.EMPTY);

		defaultDTO.setLastDate(DateUtil.getDefaultDate());

		defaultDTO.setLastTime(DateUtil.getDefaultTime());

		return defaultDTO;
	}
}
