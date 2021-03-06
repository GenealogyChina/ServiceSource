﻿/*
 * Genealogy
 * Xiao Hua Ma personal studio 2015.
 */
package com.maxiaohua.genealogy.main.db.tbl.support;

import com.maxiaohua.genealogy.fw.core.util.StringUtil;
import com.maxiaohua.genealogy.fw.core.util.DateUtil;
import com.maxiaohua.genealogy.main.db.base.BaseTableDTO;
import com.maxiaohua.genealogy.main.db.tbl.T03GenMemberDTO;

/**
 *Service DB Support DTO
 *
 * History
 * REV.         Updated Date           Updater              Infomation
 * -------      ---------------        ----------------     ------------------
 * 1.0          2016/02/08             TOOL                 Create
*
 */
public abstract class T03GenMemberDTOSupport extends BaseTableDTO {

	public static final String INSERT = "T03_GEN_MEMBER_INSERT";

	public static final String FULL_UPDATE = "T03_GEN_MEMBER_FULL_UPDATE";

	public static final String UPDATE = "T03_GEN_MEMBER_UPDATE";

	public static final String DELETE = "T03_GEN_MEMBER_DELETE";

	public static final String FIND = "T03_GEN_MEMBER_FIND";

	public static final String FIND_FOR_UPDATE = "T03_GEN_MEMBER_FIND_FOR_UPDATE";

	public static final String EQUAL_SEARCH = "T03_GEN_MEMBER_EQUAL_SEARCH";

	public static final String EQUAL_SEARCH_OR = "T03_GEN_MEMBER_EQUAL_SEARCH_OR";

	public static final String LIKE_SEARCH = "T03_GEN_MEMBER_LIKE_SEARCH";

	public static final String LIKE_SEARCH_OR = "T03_GEN_MEMBER_LIKE_SEARCH_OR";

	public static final String SQL_SEARCH = "T03_GEN_MEMBER_SQL_SEARCH";

	public static final String COUNT = "T03_GEN_MEMBER_COUNT";

	public static final String COUNT_OR = "T03_GEN_MEMBER_COUNT_OR";

	public static final String COUNT_SEARCH = "T03_GEN_MEMBER_COUNT_SEARCH";

	public static final String COLUMN_ID = "ID";

	public static final String COLUMN_GEN_NO = "GEN_NO";

	public static final String COLUMN_PER_NO = "PER_NO";

	public static final String COLUMN_IS_ONWER = "IS_ONWER";

	public static final String COLUMN_CREATE_USER = "CREATE_USER";

	public static final String COLUMN_CREATE_DATE = "CREATE_DATE";

	public static final String COLUMN_CREATE_TIME = "CREATE_TIME";

	public static final String TABLE = "T03_GEN_MEMBER";

	public static T03GenMemberDTO setDefaultValue() {
		T03GenMemberDTO defaultDTO = new T03GenMemberDTO();

		defaultDTO.setID(0l);

		defaultDTO.setGenNo(StringUtil.EMPTY);

		defaultDTO.setPerNo(StringUtil.EMPTY);

		defaultDTO.setIsOnwer(StringUtil.EMPTY);

		defaultDTO.setCreateUser(StringUtil.EMPTY);

		defaultDTO.setCreateDate(DateUtil.getDefaultDate());

		defaultDTO.setCreateTime(DateUtil.getDefaultTime());

		return defaultDTO;
	}
}
