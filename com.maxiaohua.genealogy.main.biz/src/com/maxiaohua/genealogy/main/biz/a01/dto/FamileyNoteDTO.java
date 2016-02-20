/**
 * Genealogy
 * Xiao Hua Ma personal studio 2015.
 */
package com.maxiaohua.genealogy.main.biz.a01.dto;

import com.maxiaohua.genealogy.fw.core.type.Alias;
import com.maxiaohua.genealogy.main.biz.com.dto.UserInfoDTO;

/**
 * FamileyNoteDTO DTO
 *
 * History
 * REV.         Updated Date           Updater              Infomation
 * -------      ---------------        ----------------     ------------------
 * 1.0          2016/02/09             TOOL                Create
 *
 */
@com.maxiaohua.genealogy.fw.core.type.AliasKanJi("家庭节点数据")
public class FamileyNoteDTO implements java.io.Serializable, Comparable<FamileyNoteDTO> {
	/**
	 * System ID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 父亲信息  
	 */
	@Alias("父亲信息")
	private UserInfoDTO father = null;

	/**
	 * 母亲信息  
	 */
	@Alias("母亲信息")
	private UserInfoDTO mother = null;

	/**
	 * 主成员信息  
	 */
	@Alias("主成员信息")
	private UserInfoDTO masterInfo = null;

	/**
	 * 配偶信息  
	 */
	@Alias("配偶信息")
	private UserInfoDTO[] spouseArray = null;

	/**
	 * <code>父亲信息</code>返回
	 * @return <code>父亲信息</code>
	 */
	public UserInfoDTO getFather() {
		return this.father;
	}

	/**
	 * <code>father</code>设定
	 * @param father　<code>father</code>设定值
	 */
	public void setFather(
			UserInfoDTO father) {
		this.father = father;
	}

	/**
	 * <code>母亲信息</code>返回
	 * @return <code>母亲信息</code>
	 */
	public UserInfoDTO getMother() {
		return this.mother;
	}

	/**
	 * <code>mother</code>设定
	 * @param mother　<code>mother</code>设定值
	 */
	public void setMother(
			UserInfoDTO mother) {
		this.mother = mother;
	}

	/**
	 * <code>主成员信息</code>返回
	 * @return <code>主成员信息</code>
	 */
	public UserInfoDTO getMasterInfo() {
		return this.masterInfo;
	}

	/**
	 * <code>masterInfo</code>设定
	 * @param masterInfo　<code>masterInfo</code>设定值
	 */
	public void setMasterInfo(
			UserInfoDTO masterInfo) {
		this.masterInfo = masterInfo;
	}

	/**
	 * <code>配偶信息</code>返回
	 * @return <code>配偶信息</code>
	 */
	public UserInfoDTO[] getSpouseArray() {
		return this.spouseArray;
	}

	/**
	 * <code>spouseArray</code>设定
	 * @param spouseArray　<code>spouseArray</code>设定值
	 */
	public void setSpouseArray(
			UserInfoDTO[] spouseArray) {
		this.spouseArray = spouseArray;
	}

	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(FamileyNoteDTO compareToDTO) {
		return this.equals(compareToDTO) ? 0 : -1;
	}
}
