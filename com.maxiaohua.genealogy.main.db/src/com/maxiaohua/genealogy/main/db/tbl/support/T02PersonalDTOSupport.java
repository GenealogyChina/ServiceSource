/*
 * Genealogy
 * Xiao Hua Ma personal studio 2015.
 */
package com.maxiaohua.genealogy.main.db.tbl.support;

import com.maxiaohua.genealogy.fw.core.util.StringUtil;
import com.maxiaohua.genealogy.fw.core.util.DateUtil;
import com.maxiaohua.genealogy.main.db.base.BaseTableDTO;
import com.maxiaohua.genealogy.main.db.tbl.T02PersonalDTO;

/**
 *Service DB Support DTO
 *
 * History
 * REV.         Updated Date           Updater              Infomation
 * -------      ---------------        ----------------     ------------------
 * 1.0          2016/02/08             TOOL                 Create
*
 */
public abstract class T02PersonalDTOSupport extends BaseTableDTO {

	public static final String INSERT = "T02_PERSONAL_INSERT";

	public static final String FULL_UPDATE = "T02_PERSONAL_FULL_UPDATE";

	public static final String UPDATE = "T02_PERSONAL_UPDATE";

	public static final String DELETE = "T02_PERSONAL_DELETE";

	public static final String FIND = "T02_PERSONAL_FIND";

	public static final String FIND_FOR_UPDATE = "T02_PERSONAL_FIND_FOR_UPDATE";

	public static final String EQUAL_SEARCH = "T02_PERSONAL_EQUAL_SEARCH";

	public static final String EQUAL_SEARCH_OR = "T02_PERSONAL_EQUAL_SEARCH_OR";

	public static final String LIKE_SEARCH = "T02_PERSONAL_LIKE_SEARCH";

	public static final String LIKE_SEARCH_OR = "T02_PERSONAL_LIKE_SEARCH_OR";

	public static final String SQL_SEARCH = "T02_PERSONAL_SQL_SEARCH";

	public static final String COUNT = "T02_PERSONAL_COUNT";

	public static final String COUNT_OR = "T02_PERSONAL_COUNT_OR";

	public static final String COUNT_SEARCH = "T02_PERSONAL_COUNT_SEARCH";

	public static final String COLUMN_ID = "ID";

	public static final String COLUMN_NO = "NO";

	public static final String COLUMN_FIRST_NAME = "FIRST_NAME";

	public static final String COLUMN_LAST_NAME = "LAST_NAME";

	public static final String COLUMN_PASSWORD = "PASSWORD";

	public static final String COLUMN_MOBILE = "MOBILE";

	public static final String COLUMN_MAILE = "MAILE";

	public static final String COLUMN_BIRTH_DATE = "BIRTH_DATE";

	public static final String COLUMN_BIRTH_TIME = "BIRTH_TIME";

	public static final String COLUMN_SEX = "SEX";

	public static final String COLUMN_COVER = "COVER";

	public static final String COLUMN_HEAD_PORTRAIT = "HEAD_PORTRAIT";

	public static final String COLUMN_VIDEO = "VIDEO";

	public static final String COLUMN_INFOMATION = "INFOMATION";

	public static final String COLUMN_LATITUDE = "LATITUDE";

	public static final String COLUMN_LONGITUDE = "LONGITUDE";

	public static final String COLUMN_REGEDIT_DATE = "REGEDIT_DATE";

	public static final String COLUMN_REGEDIT_TIME = "REGEDIT_TIME";

	public static final String COLUMN_STATUS = "STATUS";

	public static final String COLUMN_DEL_FLG = "DEL_FLG";

	public static final String COLUMN_CREATE_USER = "CREATE_USER";

	public static final String COLUMN_CREATE_DATE = "CREATE_DATE";

	public static final String COLUMN_CREATE_TIME = "CREATE_TIME";

	public static final String COLUMN_LAST_USER = "LAST_USER";

	public static final String COLUMN_LAST_DATE = "LAST_DATE";

	public static final String COLUMN_LAST_TIME = "LAST_TIME";

	public static final String TABLE = "T02_PERSONAL";

	public static T02PersonalDTO setDefaultValue() {
		T02PersonalDTO defaultDTO = new T02PersonalDTO();

		defaultDTO.setID(0l);

		defaultDTO.setNO(StringUtil.EMPTY);

		defaultDTO.setFirstName(StringUtil.EMPTY);

		defaultDTO.setLastName(StringUtil.EMPTY);

		defaultDTO.setPassword(StringUtil.EMPTY);

		defaultDTO.setMobile(StringUtil.EMPTY);

		defaultDTO.setMaile(StringUtil.EMPTY);

		defaultDTO.setBirthDate(DateUtil.getDefaultDate());

		defaultDTO.setBirthTime(DateUtil.getDefaultTime());

		defaultDTO.setSex(StringUtil.EMPTY);

		defaultDTO.setCover(StringUtil.EMPTY);

		defaultDTO.setHeadPortrait(StringUtil.EMPTY);

		defaultDTO.setVideo(StringUtil.EMPTY);

		defaultDTO.setInfomation(StringUtil.EMPTY);

		defaultDTO.setLatitude(0.0);

		defaultDTO.setLongitude(0.0);

		defaultDTO.setRegeditDate(DateUtil.getDefaultDate());

		defaultDTO.setRegeditTime(DateUtil.getDefaultTime());

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
