/*
 * Genealogy
 * Xiao Hua Ma personal studio 2015.
 */
package com.maxiaohua.genealogy.main.db.tbl.support;

import com.maxiaohua.genealogy.fw.core.util.StringUtil;
import com.maxiaohua.genealogy.fw.core.util.DateUtil;
import com.maxiaohua.genealogy.main.db.base.BaseTableDTO;
import com.maxiaohua.genealogy.main.db.tbl.T11PerSpouseDTO;

/**
 *Service DB Support DTO
 *
 * History
 * REV.         Updated Date           Updater              Infomation
 * -------      ---------------        ----------------     ------------------
 * 1.0          2016/02/08             TOOL                 Create
*
 */
public abstract class T11PerSpouseDTOSupport extends BaseTableDTO {

	public static final String INSERT = "T11_PER_SPOUSE_INSERT";

	public static final String FULL_UPDATE = "T11_PER_SPOUSE_FULL_UPDATE";

	public static final String UPDATE = "T11_PER_SPOUSE_UPDATE";

	public static final String DELETE = "T11_PER_SPOUSE_DELETE";

	public static final String FIND = "T11_PER_SPOUSE_FIND";

	public static final String FIND_FOR_UPDATE = "T11_PER_SPOUSE_FIND_FOR_UPDATE";

	public static final String EQUAL_SEARCH = "T11_PER_SPOUSE_EQUAL_SEARCH";

	public static final String EQUAL_SEARCH_OR = "T11_PER_SPOUSE_EQUAL_SEARCH_OR";

	public static final String LIKE_SEARCH = "T11_PER_SPOUSE_LIKE_SEARCH";

	public static final String LIKE_SEARCH_OR = "T11_PER_SPOUSE_LIKE_SEARCH_OR";

	public static final String SQL_SEARCH = "T11_PER_SPOUSE_SQL_SEARCH";

	public static final String COUNT = "T11_PER_SPOUSE_COUNT";

	public static final String COUNT_OR = "T11_PER_SPOUSE_COUNT_OR";

	public static final String COUNT_SEARCH = "T11_PER_SPOUSE_COUNT_SEARCH";

	public static final String COLUMN_ID = "ID";

	public static final String COLUMN_PER_NO = "PER_NO";

	public static final String COLUMN_SPOUSE_NO = "SPOUSE_NO";

	public static final String COLUMN_STATUS = "STATUS";

	public static final String COLUMN_DEL_FLG = "DEL_FLG";

	public static final String COLUMN_CREATE_USER = "CREATE_USER";

	public static final String COLUMN_CREATE_DATE = "CREATE_DATE";

	public static final String COLUMN_CREATE_TIME = "CREATE_TIME";

	public static final String COLUMN_LAST_USER = "LAST_USER";

	public static final String COLUMN_LAST_DATE = "LAST_DATE";

	public static final String COLUMN_LAST_TIME = "LAST_TIME";

	public static final String TABLE = "T11_PER_SPOUSE";

	public static T11PerSpouseDTO setDefaultValue() {
		T11PerSpouseDTO defaultDTO = new T11PerSpouseDTO();

		defaultDTO.setID(0l);

		defaultDTO.setPerNo(StringUtil.EMPTY);

		defaultDTO.setSpouseNo(StringUtil.EMPTY);

		defaultDTO.setStatus(StringUtil.EMPTY);

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
