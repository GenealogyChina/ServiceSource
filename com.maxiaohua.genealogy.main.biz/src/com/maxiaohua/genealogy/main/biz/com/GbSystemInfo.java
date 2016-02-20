package com.maxiaohua.genealogy.main.biz.com;

import com.maxiaohua.genealogy.main.biz.com.dto.AppVersionDTO;

public interface GbSystemInfo {
	
	/**
	 * 根据传入参数获得版本更新信息
	 * @param version 版本号
	 * @param channel 渠道号
	 * @param imsi 类型 0:Android客户端,1:Ios客户端,2:WindowsPhones客户端
	 * @return 版本更新信息
	 */
	AppVersionDTO getAppVersion(String version, String channel, String imsi);
}
