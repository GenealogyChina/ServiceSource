package com.maxiaohua.genealogy.main.biz.com.impl;

import com.maxiaohua.genealogy.fw.core.biz.AbstractDBLogic;
import com.maxiaohua.genealogy.main.biz.com.GbSystemInfo;
import com.maxiaohua.genealogy.main.biz.com.dto.AppVersionDTO;
import com.maxiaohua.genealogy.main.biz.constant.CommonConstant;
import com.maxiaohua.genealogy.main.biz.constant.CtgCodeConstant;
import com.maxiaohua.genealogy.main.biz.constant.GbMessageCode;
import com.maxiaohua.genealogy.main.db.tbl.M02SystemVersionDTO;

public class GbSystemInfoImpl extends AbstractDBLogic implements GbSystemInfo,
						GbMessageCode, CommonConstant, CtgCodeConstant {

	@Override
	public AppVersionDTO getAppVersion(String version, String channel,
			String imsi) {
		// 获得App最新版本号
		AppVersionDTO appVersion = new AppVersionDTO();
		
		M02SystemVersionDTO searchDTO = new M02SystemVersionDTO();
		searchDTO.setDelFlg(ALL_DEL_FLG.NO_DELETED.toString());
		searchDTO.setImsi(imsi);
		
		M02SystemVersionDTO versionResult = this.queryDAO.queryForObject(
				M02SystemVersionDTO.EQUAL_SEARCH, searchDTO);

		if (versionResult != null) {
			if(version.equals(versionResult.getVersion())){
				appVersion.setUpdate(false);
				appVersion.setDownloadUrl("");
				appVersion.setDescrip("");
			}
			else{
				appVersion.setUpdate(true);
				appVersion.setDownloadUrl(versionResult.getLoadPath());
				appVersion.setDescrip(versionResult.getDescrip());
				if(versionResult.getIsForce().equals(M02_SYSTEM_VERSION_IS_FORCE.TRUE.toString())){
					appVersion.setIsRequireUpdate(true);
				}
				else{
					appVersion.setIsRequireUpdate(false);
				}
			}
		}
		else{
			this.createApplicationException(M10010WS);
		}

		return appVersion;
	}

}
