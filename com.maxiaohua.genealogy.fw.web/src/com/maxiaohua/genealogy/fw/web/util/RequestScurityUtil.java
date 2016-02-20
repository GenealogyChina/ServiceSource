package com.maxiaohua.genealogy.fw.web.util;

public class RequestScurityUtil implements java.io.Serializable {
	
	/**
	 * SUID
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * 用户ID
	 */
	private String userID;
	
	/**
	 * 获得登录用户ID
	 * @return
	 */
	public String getUserID(){
		return this.userID;
	}
	
	/**
	 * 设定登录用户ID
	 * @param userID
	 */
	public void setUserID(String userID){
		this.userID = userID;
	}
	
	/**
	 * 访问时间
	 */
	private String timestamp;
	
	/**
	 * 获得客户端访问时间
	 * @return
	 */
	public String getTimestamp(){
		return this.timestamp;
	}
	
	/**
	 * 设定客户端访问时间
	 * @return
	 */
	public void setTimestamp(String timestamp){
		this.timestamp = timestamp;
	}

	/**
	 * 访问验证码
	 */
	private String code;
	
	/**
	 * 获得客户端访问验证码
	 * @return
	 */
	public String getCode(){
		return this.code;
	}
	
	/**
	 * 设定客户端访问验证码
	 * @param code
	 */
	public void setCode(String code){
		this.code = code;
	}
}

