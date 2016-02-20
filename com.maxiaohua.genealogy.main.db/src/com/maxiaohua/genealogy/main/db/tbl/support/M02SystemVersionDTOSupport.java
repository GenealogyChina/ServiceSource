/*
 * Genealogy
 * Xiao Hua Ma personal studio 2015.
 */
package com.maxiaohua.genealogy.main.db.tbl.support;

import com.maxiaohua.genealogy.fw.core.util.StringUtil;
import com.maxiaohua.genealogy.fw.core.util.DateUtil;
import com.maxiaohua.genealogy.main.db.base.BaseTableDTO;
import com.maxiaohua.genealogy.main.db.tbl.M02SystemVersionDTO;

/**
 *Service DB Support DTO
 *
 * History
 * REV.         Updated Date           Updater              Infomation
 * -------      ---------------        ----------------     ------------------
 * 1.0          2016/02/08             TOOL                 Create
*
 */
public abstract class M02SystemVersionDTOSupport extends BaseTableDTO {

	public static final String INSERT = "M02_SYSTEM_VERSION_INSERT";

	public static final String FULL_UPDATE = "M02_SYSTEM_VERSION_FULL_UPDATE";

	public static final String UPDATE = "M02_SYSTEM_VERSION_UPDATE";

	public static final String DELETE = "M02_SYSTEM_VERSION_DELETE";

	public static final String FIND = "M02_SYSTEM_VERSION_FIND";

	public static final String FIND_FOR_UPDATE = "M02_SYSTEM_VERSION_FIND_FOR_UPDATE";

	public static final String EQUAL_SEARCH = "M02_SYSTEM_VERSION_EQUAL_SEARCH";

	public static final String EQUAL_SEARCH_OR = "M02_SYSTEM_VERSION_EQUAL_SEARCH_OR";

	public static final String LIKE_SEARCH = "M02_SYSTEM_VERSION_LIKE_SEARCH";

	public static final String LIKE_SEARCH_OR = "M02_SYSTEM_VERSION_LIKE_SEARCH_OR";

	public static final String SQL_SEARCH = "M02_SYSTEM_VERSION_SQL_SEARCH";

	public static final String COUNT = "M02_SYSTEM_VERSION_COUNT";

	public static final String COUNT_OR = "M02_SYSTEM_VERSION_COUNT_OR";

	public static final String COUNT_SEARCH = "M02_SYSTEM_VERSION_COUNT_SEARCH";

	public static final String COLUMN_ID = "ID";

	public static final String COLUMN_IMSI = "IMSI";

	public static final String COLUMN_CHANNEL = "CHANNEL";

	public static final String COLUMN_VERSION = "VERSION";

	public static final String COLUMN_LOAD_PATH = "LOAD_PATH";

	public static final String COLUMN_DESCRIP = "DESCRIP";

	public static final String COLUMN_DEL_FLG = "DEL_FLG";

	public static final String COLUMN_IS_FORCE = "IS_FORCE";

	public static final String COLUMN_LAST_DATE = "LAST_DATE";

	public static final String COLUMN_LAST_TIME = "LAST_TIME";

	public static final String TABLE = "M02_SYSTEM_VERSION";

	public static M02SystemVersionDTO setDefaultValue() {
		M02SystemVersionDTO defaultDTO = new M02SystemVersionDTO();

		defaultDTO.setId(0);

		defaultDTO.setImsi(StringUtil.EMPTY);

		defaultDTO.setChannel(StringUtil.EMPTY);

		defaultDTO.setVersion(StringUtil.EMPTY);

		defaultDTO.setLoadPath(StringUtil.EMPTY);

		defaultDTO.setDescrip(StringUtil.EMPTY);

		defaultDTO.setDelFlg(StringUtil.EMPTY);

		defaultDTO.setIsForce(StringUtil.EMPTY);

		defaultDTO.setLastDate(DateUtil.getDefaultDate());

		defaultDTO.setLastTime(DateUtil.getDefaultTime());

		return defaultDTO;
	}
}
