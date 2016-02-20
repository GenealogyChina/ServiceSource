/*
 * Genealogy
 * Xiao Hua Ma personal studio 2015.
 */
package com.maxiaohua.genealogy.main.db.tbl.support;

import com.maxiaohua.genealogy.fw.core.util.StringUtil;
import com.maxiaohua.genealogy.fw.core.util.DateUtil;
import com.maxiaohua.genealogy.main.db.base.BaseTableDTO;
import com.maxiaohua.genealogy.main.db.tbl.T13GenJoinDTO;

/**
 *Service DB Support DTO
 *
 * History
 * REV.         Updated Date           Updater              Infomation
 * -------      ---------------        ----------------     ------------------
 * 1.0          2016/02/08             TOOL                 Create
*
 */
public abstract class T13GenJoinDTOSupport extends BaseTableDTO {

	public static final String INSERT = "T13_GEN_JOIN_INSERT";

	public static final String FULL_UPDATE = "T13_GEN_JOIN_FULL_UPDATE";

	public static final String UPDATE = "T13_GEN_JOIN_UPDATE";

	public static final String DELETE = "T13_GEN_JOIN_DELETE";

	public static final String FIND = "T13_GEN_JOIN_FIND";

	public static final String FIND_FOR_UPDATE = "T13_GEN_JOIN_FIND_FOR_UPDATE";

	public static final String EQUAL_SEARCH = "T13_GEN_JOIN_EQUAL_SEARCH";

	public static final String EQUAL_SEARCH_OR = "T13_GEN_JOIN_EQUAL_SEARCH_OR";

	public static final String LIKE_SEARCH = "T13_GEN_JOIN_LIKE_SEARCH";

	public static final String LIKE_SEARCH_OR = "T13_GEN_JOIN_LIKE_SEARCH_OR";

	public static final String SQL_SEARCH = "T13_GEN_JOIN_SQL_SEARCH";

	public static final String COUNT = "T13_GEN_JOIN_COUNT";

	public static final String COUNT_OR = "T13_GEN_JOIN_COUNT_OR";

	public static final String COUNT_SEARCH = "T13_GEN_JOIN_COUNT_SEARCH";

	public static final String COLUMN_ID = "ID";

	public static final String COLUMN_NO = "NO";

	public static final String COLUMN_GEN_NO = "GEN_NO";

	public static final String COLUMN_STATUS = "STATUS";

	public static final String COLUMN_APPLICATION_TEXT = "APPLICATION_TEXT";

	public static final String COLUMN_REPLY_TEXT = "REPLY_TEXT";

	public static final String COLUMN_CREATE_USER = "CREATE_USER";

	public static final String COLUMN_CREATE_DATE = "CREATE_DATE";

	public static final String COLUMN_CREATE_TIME = "CREATE_TIME";

	public static final String COLUMN_LAST_USER = "LAST_USER";

	public static final String COLUMN_LAST_DATE = "LAST_DATE";

	public static final String COLUMN_LAST_TIME = "LAST_TIME";

	public static final String TABLE = "T13_GEN_JOIN";

	public static T13GenJoinDTO setDefaultValue() {
		T13GenJoinDTO defaultDTO = new T13GenJoinDTO();

		defaultDTO.setId(0l);

		defaultDTO.setNo(StringUtil.EMPTY);

		defaultDTO.setGenNo(StringUtil.EMPTY);

		defaultDTO.setStatus(StringUtil.EMPTY);

		defaultDTO.setApplicationText(StringUtil.EMPTY);

		defaultDTO.setReplyText(StringUtil.EMPTY);

		defaultDTO.setCreateUser(StringUtil.EMPTY);

		defaultDTO.setCreateDate(DateUtil.getDefaultDate());

		defaultDTO.setCreateTime(DateUtil.getDefaultTime());

		defaultDTO.setLastUser(StringUtil.EMPTY);

		defaultDTO.setLastDate(DateUtil.getDefaultDate());

		defaultDTO.setLastTime(DateUtil.getDefaultTime());

		return defaultDTO;
	}
}
