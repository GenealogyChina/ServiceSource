package com.maxiaohua.genealogy.main.db.constant;

public interface SQLID {
	
	public static final String DELETE_PERSTREAM = "custom.DELETE_PERSTREAM";

//	/**
//	 * 銈傘倝銇ｃ仧銈炽兂銉囥偅銈枫儳銉炽仹妞滅储
//	 */
//	public static final String FIND_LIST_BY_GIVEN_CONDITION = "prototype.VAKIWAKU_SEARCH_FOR_GIVENCONDITION";
//
//	/**
//	 * 銈ㄣ兂銉嗐偅銉嗐偅涓汇偔銉兼湁鍔广仾銉偝銉笺儔妞滅储鐢⊿QL銈兗
//	 */
//	public static final String FIND_VALID_ONE = "prototype.TLOGONLG_FIND_FOR_VALIDONE";
//	/**
//	 * 鑱峰摗ID銇т竴鐣渶杩戙伄銉偝銉笺儔妞滅储 鐢⊿QL銈兗
//	 */
//	public static final String FIND_LAST_ONE = "prototype.TLOGONLG_FIND_FOR_LASTONE";
//
//	/**
//	 * 澶栨潵鎮ｈ�鎯呭牨銇湁鍔广仾銉偝銉笺儔妞滅储鐢⊿QL銈兗
//	 * 浜堢磩鏃ャ仺褰撴棩銇瘮杈冪祼鏋溿倰鍙栧緱銇欍倠銆�
//	 */
//	public static final String FIND_LIST_BY_YKKACD_YKDATE_GET_DATEVALUE = "prototype.DUAL_FIND_FOR_YKKACDYKDATE_YKDATEGETDATEFLAG";
//
//	/**
//	 * 澶栨潵鎮ｈ�鎯呭牨銇湁鍔广仾銉偝銉笺儔妞滅储鐢⊿QL銈兗
//	 * ykDate>=current date銇牬鍚堛�VGDRPTF銈掓绱€仚銈嬨�
//	 */
//	public static final String FIND_LIST_BY_YKKACD_YKDATE_GTE_CURRENTDATE = "prototype.VGDRPTF_SEARCH_FOR_YKKACDYKDATE_YKDATEGTECURRENTDATE";
//
//	/**
//	 * 澶栨潵鎮ｈ�鎯呭牨銇湁鍔广仾銉偝銉笺儔妞滅储鐢⊿QL銈兗
//	 * ykDate<current date銇牬鍚堛�VGDRPTF銇╒GDRPTR涓℃柟銈掓绱€仚銈嬨�
//	 */
//	public static final String FIND_LIST_BY_YKKACD_YKDATE_LT_CURRENTDATE = "prototype.VGDRPTF_VGDRPTR_SEARCH_FOR_YKKACDYKDATE_YKDATELTCURRENTDATE";
//
//	/**
//	 * 銈ㄣ兂銉嗐偅銉嗐偅鏇存柊鐢⊿QL銈兗(浜堢磩纰哄畾鐢�
//	 */
//	public static final String TWAKDB_UPDATE_BY_YOYAKU_KAKUTEI = "prototype.TWAKDB_UPDATE_FOR_YOYAKUKAKUTEI";
//
//	/**
//	 * 銈ㄣ兂銉嗐偅銉嗐偅鏇存柊鐢⊿QL銈兗(浜堢磩纰哄畾鐢�
//	 */
//	public static final String TWAKWAK_UPDATE_BY_YOYAKU_KAKUTEI = "prototype.TWAKWA_UPDATE_FOR_YOYAKUKAKUTEI";
//
//	/**
//	 * 銉偘銈€偊銉堢敤SQL銈兗
//	 */
//	public static final String LOGOUT = "prototype.TLOGONLG_UPDATE_FOR_LOGOUT";
//
//	/**
//	 * 銈ㄣ兂銉嗐偅銉嗐偅涓汇偔銉笺仹鏈夊姽銇儸銈炽兗銉夋绱㈢敤鐢⊿QL銈兗
//	 */
//	public static final String VSTAFFM_FIND_VALID_ONE = "prototype.VSTAFFM_FIND_FOR_VALIDONE";
//
//	/**
//	 * 銈裤兗銈层儍銉堟棩銇ф湁鍔广仾銉偝銉笺儔妞滅储鐢ㄧ敤SQL銈兗
//	 */
//	public static final String FIND_ONE_BY_TARGETDATE = "prototype.VSTAFFM2_FIND_FOR_TARGETDATE";
//
//	/**
//	 * 鎷呭綋鑰匢D銇т欢鏁扮当瑷堢敤SQL銈兗
//	 */
//	public static final String COUNT_BY_STAFFID = "comm.BizQuery_Td91msg-countByStaffId";
//
//	/**
//	 * 銈ㄣ兂銉嗐偅銉嗐偅銉戙偣銉兗銉夋洿鏂扮敤SQL銈兗
//	 */
//	public static final String UPDATE_PWD = "prototype.TSTAFFM_UPDATE_FOR_PASSWORD";
//
//	/**
//	 * 銈ㄣ兂銉嗐偅銉嗐偅涓汇偔銉兼绱㈢敤鐢⊿QL銈兗
//	 */
//	public static final String FIND_BY_HOSTNAME_OR_IPADDR = "prototype.TWSPROF_FIND_FOR_HOSTNAMEORIPADDR";
//
//	/**
//	 * 浜堢磩闋呯洰銉炪偣銈挎绱㈢敤SQL銈兗
//	 */
//	public static final String FIND_TYKKMST_LIST = "prototype.TYKKMST_SEARCH_FOR_LIST";
//
//	/**
//	 * 銉偘銈兂绲辫▓鎯呭牨鐧婚尣鐢⊿QL銈兗
//	 */
//	public static final String TLOGONLG_INSERT = "prototype.TLOGONLG_INSERT";
//
//	/**
//	 * 銉偘銈兂绲辫▓鎯呭牨鐧婚尣鐢⊿QL銈兗
//	 */
//	public static final String TCOMMST_FINDCOMKEY2 = "prototype.TCOMMST_FIND_FOR_COMKEY2";
//
//	/**
//	 * 绲岄亷瑕佺磩涓�Η妞滅储鐢⊿QL銈兗
//	 */
//	public static final String TEMRIDX_FETCH = "prototype.TEMRIDX_SEARCH_FOR_PROCESSSUMMARY";
//
//	/**
//	 * 绲岄亷瑕佺磩妞滅储鐢⊿QL銈兗
//	 */
//	public static final String TEMR_FETCH = "prototype.TEMR_SEARCH_FOR_PROCESSSUMMARY";
//
//	/**
//	 * 闆诲瓙銈儷銉咺NDEX杩藉姞鐢⊿QL銈兗
//	 */
//	public static final String TEMRIDX_INSERT = "prototype.TEMRIDX_INSERT";
//
//	/**
//	 * 闆诲瓙銈儷銉嗚拷鍔犵敤SQL銈兗
//	 */
//	public static final String TEMR_INSERT = "prototype.TEMR_INSERT";
//
//	/**
//	 * 闆诲瓙銈儷銉咺NDEX鏇存柊鐢⊿QL銈兗
//	 */
//	public static final String TEMRIDX_REGISTER_UPDATE = "prototype.TEMRIDX_UPDATE_FOR_REGISTER";
//
//	/**
//	 * 闆诲瓙銈儷銉咺NDEX鏇存柊鐢⊿QL銈兗
//	 */
//	public static final String TEMRIDX_CANCEL_UPDATE = "prototype.TEMRIDX_UPDATE_FOR_CANCEL";
//
//	/**
//	 * 闆诲瓙銈儷銉咺NDEX鏇存柊鐢⊿QL銈兗
//	 */
//	public static final String TEMRIDX_LATEST_UPDATE = "prototype.TEMRIDX_UPDATE_FOR_LATEST";
//
//	/**
//	 * 闆诲瓙銈儸銉炽儓绲岄亷瑕佺磩銈掑彇寰楃敤SQL銈兗
//	 */
//	public static final String TEMR_CURRENT_FETCH = "prototype.TEMR_SEARCH_FOR_CURRENT";
//
//	/**
//	 * 鐥呭悕銉炪偣銈裤兗妞滅储鐢⊿QL銈兗
//	 */
//	public static final String TBYOMEIM_QUERY = "prototype.TBYOMEIM_SEARCH_FOR_GIVENCONDITION";
//
//	/**
//	 * 鐥呭悕銉炪偣銈裤兗妞滅储鐢⊿QL銈兗
//	 */
//	public static final String TBYOMEIM_QUERY_COUNT = "prototype.TBYOMEIM_FIND_FOR_COUNT";
//	/**
//	 * 鐥呭悕銉炪偣銈裤兗妞滅储鐢⊿QL銈兗
//	 */
//	public static final String TBYOMEIM_QUERY_BYKA = "prototype.TBYOMEIM_VBYOMEIK_SEARCH_FOR_BYKA";
//
//	/**
//	 *  鏀惧皠绶氥偑銉笺儉銉奸儴浣嶇櫥閷茬敤SQL銈兗
//	 */
//	public static final String TC16BUI_INSERT = "prototype.TC16BUI_INSERT";
//	/**
//	 *  鏀惧皠绶氥偑銉笺儉銉奸儴浣嶇櫥閷茬敤SQL銈兗
//	 */
//	public static final String TEMRIDX_INSERT_RADIATION_ORDER = "prototype.TEMRIDX_INSERT_FOR_RADIATIONORDER";
//
//	/**
//	 * 銈偣銈裤優銈ゃ偤鏉′欢銇ф绱�鐢⊿QL銈兗
//	 */
//	public static final String TYKKMST_SQL_SEARCH = "prototype.TYKKMST_FIND_FOR_GIVENCONDITION";
//
//	/**
//	 * 銈偣銈裤優銈ゃ偤鏉′欢銇ф绱�鐢⊿QL銈兗
//	 */
//	public static final String TWAKWAK_SQL_SEARCH = "prototype.TWAKWAK_SEARCH_FOR_GIVENCONDITION";
//
//	/**
//	 * 銉曘儷闋呯洰銇ф洿鏂扮敤SQL銈兗
//	 */
//	public static final String TWAKWAK_FULL_UPDATE = "prototype.TWAKWAK_UPDATE_FOR_FULL";
//
//	/**
//	 * 銈偣銈裤優銈ゃ偤鏉′欢銇ф绱㈢敤SQL銈兗
//	 */
//	public static final String TWAKDB_SQL_SEARCH = "prototype.TWAKDB_FIND_FOR_GIVENCONDITION";
//
//	/**
//	 * 銉曘儷闋呯洰銇ф洿鏂扮敤SQL銈兗
//	 */
//	public static final String TWAKDB_FULL_UPDATE = "prototype.TWAKDB_UPDATE_FOR_FULL";
//
//	/**
//	 * 鍏遍�闋呯洰銉炪偣銈裤兗銇欢鏁版绱㈢敤SQL銈兗
//	 */
//	public static final String TCOMMST_QUERY_COUNT = "prototype.TCOMMST_FIND_FOR_COUNT";
//
//	/**
//	 * 鍏遍�闋呯洰銉炪偣銈裤兗銉偝銉笺儔妞滅储鐢⊿QL銈兗
//	 */
//	public static final String TCOMMST_QUERY = "prototype.TCOMMST_SEARCH_FOR_GIVENCONDITION";
//
//	/**
//	 * 瑷虹檪绉戙優銈广偪銉兼绱㈢敤SQL銈兗
//	 */
//	public static final String TKACDM_QUERY = "prototype.TKACDM_SEARCH_FOR_GIVENCONDITION";
//
//	/**
//	 * 瑷虹檪绉戙優銈广偪銉兼绱㈢敤SQL銈兗
//	 */
//	public static final String TKACDM_QUERY_COUNT = "prototype.TKACDM_FIND_FOR_COUNT";
//
//	/**
//	 * 鍏遍�銈炽兗銉夊唴瀹规绱㈢敤SQL銈兗
//	 */
//	public static final String TCOMMST_QUERY_SELECT_PATIENT = "c00m.TCOMMST_FIND";
//
//	/**
//	 * 鎰熸煋鐥囥儠銉┿偘妞滅储鐢⊿QL銈兗
//	 */
//	public static final String TPROFIL_QUERY_INFECTION = "prototype.TPROFIL_FIND_FOR_INFECTION";
//
//	/**
//	 * 鎸囩ず鍚嶆绱㈢敤SQL銈兗
//	 */
//	public static final String TEMRIDX_QUERY_COUNT_FOR_SYMPTOM = "prototype.TEMRIDX_FIND_FOR_COUNTFORSYMPTOM";
//
//	/**
//	 * 銉曘偂銈ゃ儷銉汇儉銈︺兂銉兗銉夋绱㈢敤SQL銈兗
//	 */
//	public static final String FILE_DOWNLOAD_QUERY = "prototype.FILE_FIND_FOR_DOWNLOAD";
//
//	/**
//	 * 鍏遍�銉°偨銉冦儔銆孹X鍖哄垎銇悕绉般倰杩斻仚銆嶃伄妞滅储鐢⊿QL銈兗
//	 */
//	public static final String TCOMMST_SEARCH_COMKEY2 = "prototype.TCOMMST_SEARCH_FOR_COMKEY2";
//
//	/**
//	 * 銈点優銉兗鏈綔鎴愪竴瑕ф绱�
//	 */
//	public static final String TSMRYLST_SEARCH_TNYTDR = "custom.TSMRYLST_SEARCH_WITH_TNYTDR";
//
//	/**
//	 * 銈点優銉兗鏈綔鎴愪竴瑕ф绱�
//	 */
//	public static final String TSMRYLST_SEARCH_TNYKNRI = "custom.TSMRYLST_SEARCH_WITH_TNYKNRI";
//
//	/**
//	 * 銈点優銉兗涓柇涓�Η妞滅储
//	 */
//	public static final String TSMRYLST_SEARCH_TSUMMARY = "custom.TSMRYLST_SEARCH_WITH_TSUMMARY";
//
//	/**
//	 * 闁嬪鏃ヨΗ妞滅储
//	 */
//	public static final String VEMRIDX_SEARCH_START_DATE = "custom.VEMRIDX_SEARCH_START_DATE";
//
//	/**
//	 * 浠栫渚濋牸鐘舵硜妞滅储
//	 */
//	public static final String TAKAIRAI_SEARCH = "custom.TAKAIRAI_SEARCH";
//
//	/**
//	 * 浠栫渚濋牸鐘舵硜浠舵暟妞滅储
//	 */
//	public static final String TAKAIRAI_SEARCH_WITH_COUNT = "custom.TAKAIRAI_SEARCH_WITH_COUNT";
//	
//	/**
//	 * 浠栫渚濋牸鐘舵硜妞滅储
//	 */
//	public static final String TAKAIRAI_SEARCH_WITHOUT_BYOTO_CD = "custom.TAKAIRAI_SEARCH_WITHOUT_BYOTO_CD";
//
//	/**
//	 * 浠栫渚濋牸鐘舵硜浠舵暟妞滅储
//	 */
//	public static final String TAKAIRAI_COUNT_SEARCH_WITHOUT_BYOTO_CD = "custom.TAKAIRAI_COUNT_SEARCH_WITHOUT_BYOTO_CD";
//
//	/**
//	 * 闄㈠唴銉°兗銉儶銈广儓妞滅储
//	 */
//	public static final String TSHMAIL_SEARCH = "custom.TSHMAIL_SEARCH";
//
//	/**
//	 * 闋荤敤瀹涘厛鎯呭牨妞滅储
//	 */
//	public static final String TSHMAILH_SEARCH_TSHMAILA = "custom.TSHMAILH_SEARCH_TSHMAILA";
//
//	/**
//	 *鎺＄暘
//	 */
//	public static final String FIND_NUMBER = "custom.FIND_NUMBER";
//	
//	/**
//	 * 銉°兗銉儏鍫卞彇寰�
//	 */
//	public static final String TSHMAIL_SEARCH_WITH_TSHMAILH = "custom.TSHMAIL_SEARCH_WITH_TSHMAILH";
//	
//	/**
//	 * 鍏ラ櫌鎮ｈ�鎯呭牨鍙栧緱
//	 */
//	public static final String VA21NLST_SEARCH_WITH_INPATIENTINFO = "custom.VA21NLST_SEARCH_WITH_INPATIENTINFO";
//	
//	/**
//	 * 銈点優銉兗鏈綔鎴愪竴瑕с儐銉笺儢銉绱�
//	 */
//	public static final String TSMRYLST_SEARCH = "custom.TSMRYLST_SEARCH";
//	
//	/**
//	 * 銈点優銉兗鏈綔鎴愪竴瑕с儐銉笺儢銉绱�
//	 */
//	public static final String TBYOMEI_SEARCH_WITH_VDAIKOLST = "custom.TBYOMEI_SEARCH_WITH_VDAIKOLST";
//	
//	/**
//	 * 鐥呴櫌鎯呭牨妞滅储
//	 */
//	public static final String THOSPMST_SEARCH_WITH_TESTABM = "custom.THOSPMST_SEARCH_WITH_TESTABM";
//	
//	/**
//	 * 鐥呴櫌鎯呭牨妞滅储
//	 */
//	public static final String THOSPMST_COUNT_SEARCH_WITH_TESTABM = "custom.THOSPMST_COUNT_SEARCH_WITH_TESTABM";
//	
//	/**
//	 * 妞滄熁绲愭灉銉撱儱銉兼绱�
//	 */
//	public static final String VD31KKLST_SEARCH_DISTINCT = "custom.VD31KKLST_SEARCH_DISTINCT";
//	
//	/**
//	 * 鎮ｈ�銉椼儹銉曘偅銉笺儷蹇呰銇爡鐩绱�
//	 */
//	public static final String TPROFIL_FIND_LIMIT_RECORD = "custom.TPROFIL_FIND_LIMIT_RECORD";
//	
//	/**
//	 * 闆诲瓙銈儷銉嗐偆銉炽儑銉冦偗銈规绱�
//	 */
//	public static final String TEMRIDX_SEARCH_DISTINCT = "custom.TEMRIDX_SEARCH_DISTINCT";
//
//	/**
//	 * 鎷呭綋鍖绘绱�
//	 */
//	public static final String TNYTDR_SEARCH_WITH_TSTAFFM = "custom.TNYTDR_SEARCH_WITH_TSTAFFM";
//	
//	/**
//	 * 鎷呭綋鐪嬭甯绱�
//	 */
//	public static final String TNYTNS_SEARCH_WITH_TSTAFFM = "custom.TNYTNS_SEARCH_WITH_TSTAFFM";
//	
//	/**
//	 * 銉°兗銉儏鍫便儞銉ャ兗妞滅储
//	 */
//	public static final String VSHMAIL_SEARCH = "custom.VSHMAIL_SEARCH";
//	
//	/**
//	 * delete group worker plan by conditions
//	 */
//	public static final String GROUP_WORKPLAN_DELETE_BY_CONDITIONS = "custom.GROUP_WORKPLAN_DELETE_BY_CONDITIONS";
//	
//	/**
//	 * select group worker plan between start and end date
//	 */
//	public static final String GROUP_WORKPLAN_SELECT_BETWEEN_START_END = "custom.GROUP_WORKPLAN_SELECT_BETWEEN_START_END";
//	
//	/**
//	 *  删除工作时间
//	 */
//	public static final String WORKPLAN_TIME_DELETE_BY_CONDITIONS = "custom.WORKPLAN_TIME_DELETE_BY_CONDITIONS";
	
}
