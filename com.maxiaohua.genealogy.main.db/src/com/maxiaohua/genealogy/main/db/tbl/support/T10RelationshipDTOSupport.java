/*
 * Genealogy
 * Xiao Hua Ma personal studio 2015.
 */
package com.maxiaohua.genealogy.main.db.tbl.support;

import com.maxiaohua.genealogy.fw.core.util.StringUtil;
import com.maxiaohua.genealogy.fw.core.util.DateUtil;
import com.maxiaohua.genealogy.main.db.base.BaseTableDTO;
import com.maxiaohua.genealogy.main.db.tbl.T10RelationshipDTO;

/**
 *Service DB Support DTO
 *
 * History
 * REV.         Updated Date           Updater              Infomation
 * -------      ---------------        ----------------     ------------------
 * 1.0          2016/02/08             TOOL                 Create
*
 */
public abstract class T10RelationshipDTOSupport extends BaseTableDTO {

	public static final String INSERT = "T10_RELATIONSHIP_INSERT";

	public static final String FULL_UPDATE = "T10_RELATIONSHIP_FULL_UPDATE";

	public static final String UPDATE = "T10_RELATIONSHIP_UPDATE";

	public static final String DELETE = "T10_RELATIONSHIP_DELETE";

	public static final String FIND = "T10_RELATIONSHIP_FIND";

	public static final String FIND_FOR_UPDATE = "T10_RELATIONSHIP_FIND_FOR_UPDATE";

	public static final String EQUAL_SEARCH = "T10_RELATIONSHIP_EQUAL_SEARCH";

	public static final String EQUAL_SEARCH_OR = "T10_RELATIONSHIP_EQUAL_SEARCH_OR";

	public static final String LIKE_SEARCH = "T10_RELATIONSHIP_LIKE_SEARCH";

	public static final String LIKE_SEARCH_OR = "T10_RELATIONSHIP_LIKE_SEARCH_OR";

	public static final String SQL_SEARCH = "T10_RELATIONSHIP_SQL_SEARCH";

	public static final String COUNT = "T10_RELATIONSHIP_COUNT";

	public static final String COUNT_OR = "T10_RELATIONSHIP_COUNT_OR";

	public static final String COUNT_SEARCH = "T10_RELATIONSHIP_COUNT_SEARCH";

	public static final String COLUMN_ID = "ID";

	public static final String COLUMN_PER_NO = "PER_NO";

	public static final String COLUMN_FATHER_NO = "FATHER_NO";

	public static final String COLUMN_MOTHER_NO = "MOTHER_NO";

	public static final String COLUMN_CREATE_USER = "CREATE_USER";

	public static final String COLUMN_CREATE_DATE = "CREATE_DATE";

	public static final String COLUMN_CREATE_TIME = "CREATE_TIME";

	public static final String COLUMN_LAST_USER = "LAST_USER";

	public static final String COLUMN_LAST_DATE = "LAST_DATE";

	public static final String COLUMN_LAST_TIME = "LAST_TIME";

	public static final String TABLE = "T10_RELATIONSHIP";

	public static T10RelationshipDTO setDefaultValue() {
		T10RelationshipDTO defaultDTO = new T10RelationshipDTO();

		defaultDTO.setId(0l);

		defaultDTO.setPerNo(StringUtil.EMPTY);

		defaultDTO.setFatherNo(StringUtil.EMPTY);

		defaultDTO.setMotherNo(StringUtil.EMPTY);

		defaultDTO.setCreateUser(StringUtil.EMPTY);

		defaultDTO.setCreateDate(DateUtil.getDefaultDate());

		defaultDTO.setCreateTime(DateUtil.getDefaultTime());

		defaultDTO.setLastUser(StringUtil.EMPTY);

		defaultDTO.setLastDate(DateUtil.getDefaultDate());

		defaultDTO.setLastTime(DateUtil.getDefaultTime());

		return defaultDTO;
	}
}
