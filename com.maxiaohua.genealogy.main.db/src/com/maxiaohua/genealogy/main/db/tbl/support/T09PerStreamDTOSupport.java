/*
 * Genealogy
 * Xiao Hua Ma personal studio 2015.
 */
package com.maxiaohua.genealogy.main.db.tbl.support;

import com.maxiaohua.genealogy.fw.core.util.StringUtil;
import com.maxiaohua.genealogy.fw.core.util.DateUtil;
import com.maxiaohua.genealogy.main.db.base.BaseTableDTO;
import com.maxiaohua.genealogy.main.db.tbl.T09PerStreamDTO;

/**
 *Service DB Support DTO
 *
 * History
 * REV.         Updated Date           Updater              Infomation
 * -------      ---------------        ----------------     ------------------
 * 1.0          2016/02/08             TOOL                 Create
*
 */
public abstract class T09PerStreamDTOSupport extends BaseTableDTO {

	public static final String INSERT = "T09_PER_STREAM_INSERT";

	public static final String FULL_UPDATE = "T09_PER_STREAM_FULL_UPDATE";

	public static final String UPDATE = "T09_PER_STREAM_UPDATE";

	public static final String DELETE = "T09_PER_STREAM_DELETE";

	public static final String FIND = "T09_PER_STREAM_FIND";

	public static final String FIND_FOR_UPDATE = "T09_PER_STREAM_FIND_FOR_UPDATE";

	public static final String EQUAL_SEARCH = "T09_PER_STREAM_EQUAL_SEARCH";

	public static final String EQUAL_SEARCH_OR = "T09_PER_STREAM_EQUAL_SEARCH_OR";

	public static final String LIKE_SEARCH = "T09_PER_STREAM_LIKE_SEARCH";

	public static final String LIKE_SEARCH_OR = "T09_PER_STREAM_LIKE_SEARCH_OR";

	public static final String SQL_SEARCH = "T09_PER_STREAM_SQL_SEARCH";

	public static final String COUNT = "T09_PER_STREAM_COUNT";

	public static final String COUNT_OR = "T09_PER_STREAM_COUNT_OR";

	public static final String COUNT_SEARCH = "T09_PER_STREAM_COUNT_SEARCH";

	public static final String COLUMN_ID = "ID";

	public static final String COLUMN_PER_NO = "PER_NO";

	public static final String COLUMN_TYPE = "TYPE";

	public static final String COLUMN_PATH = "PATH";

	public static final String COLUMN_REMARKS = "REMARKS";

	public static final String COLUMN_DEL_FLG = "DEL_FLG";

	public static final String COLUMN_CREATE_USER = "CREATE_USER";

	public static final String COLUMN_CREATE_DATE = "CREATE_DATE";

	public static final String COLUMN_CREATE_TIME = "CREATE_TIME";

	public static final String COLUMN_LAST_USER = "LAST_USER";

	public static final String COLUMN_LAST_DATE = "LAST_DATE";

	public static final String COLUMN_LAST_TIME = "LAST_TIME";

	public static final String TABLE = "T09_PER_STREAM";

	public static T09PerStreamDTO setDefaultValue() {
		T09PerStreamDTO defaultDTO = new T09PerStreamDTO();

		defaultDTO.setID(0l);

		defaultDTO.setPerNo(StringUtil.EMPTY);

		defaultDTO.setType(StringUtil.EMPTY);

		defaultDTO.setPath(StringUtil.EMPTY);

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
