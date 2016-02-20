/*
 * Genealogy
 * Xiao Hua Ma personal studio 2015.
 */
package com.maxiaohua.genealogy.main.db.tbl;

import com.maxiaohua.genealogy.main.db.tbl.support.T01GenealogyDTOSupport;

/**
 *Service DB DTO
 *
 * History
 * REV.         Updated Date           Updater              Infomation
 * -------      ---------------        ----------------     ------------------
 * 1.0          2016/02/08             TOOL                 Create
*
 */
@com.maxiaohua.genealogy.fw.core.type.Alias("T01_GENEALOGY")
@com.maxiaohua.genealogy.fw.core.type.AliasKanJi("")
public class T01GenealogyDTO extends T01GenealogyDTOSupport implements java.io.Serializable, Comparable<T01GenealogyDTO> {

	private static final long serialVersionUID = 1L;

	@com.maxiaohua.genealogy.fw.core.type.Alias("ID")
	@com.maxiaohua.genealogy.fw.core.type.Index(0)
	@com.maxiaohua.genealogy.fw.core.type.DataType("BIGINT")
	@com.maxiaohua.genealogy.fw.core.type.NotNull
	@com.maxiaohua.genealogy.fw.core.type.IsPK
	private Long ID = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("NO")
	@com.maxiaohua.genealogy.fw.core.type.Index(1)
	@com.maxiaohua.genealogy.fw.core.type.DataType("VARCHAR")
	@com.maxiaohua.genealogy.fw.core.type.NotNull
	@com.maxiaohua.genealogy.fw.core.type.Length(min = 13, max = 13)
	private String NO = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("FIRST_NAME")
	@com.maxiaohua.genealogy.fw.core.type.Index(2)
	@com.maxiaohua.genealogy.fw.core.type.DataType("VARCHAR")
	@com.maxiaohua.genealogy.fw.core.type.NotNull
	@com.maxiaohua.genealogy.fw.core.type.Length(min = 30, max = 30)
	private String FirstName = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("ARMS")
	@com.maxiaohua.genealogy.fw.core.type.Index(3)
	@com.maxiaohua.genealogy.fw.core.type.DataType("VARCHAR")
	@com.maxiaohua.genealogy.fw.core.type.Length(min = 200, max = 200)
	private String Arms = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("INFOMATION")
	@com.maxiaohua.genealogy.fw.core.type.Index(4)
	@com.maxiaohua.genealogy.fw.core.type.DataType("TEXT")
	@com.maxiaohua.genealogy.fw.core.type.Length(min = 65535, max = 65535)
	private String Infomation = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("DEL_FLG")
	@com.maxiaohua.genealogy.fw.core.type.Index(5)
	@com.maxiaohua.genealogy.fw.core.type.DataType("CHAR")
	@com.maxiaohua.genealogy.fw.core.type.Length(min = 1, max = 1)
	private String DelFlg = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("CREATE_USER")
	@com.maxiaohua.genealogy.fw.core.type.Index(6)
	@com.maxiaohua.genealogy.fw.core.type.DataType("VARCHAR")
	@com.maxiaohua.genealogy.fw.core.type.NotNull
	@com.maxiaohua.genealogy.fw.core.type.Length(min = 13, max = 13)
	private String CreateUser = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("CREATE_DATE")
	@com.maxiaohua.genealogy.fw.core.type.Index(7)
	@com.maxiaohua.genealogy.fw.core.type.DataType("DATE")
	@com.maxiaohua.genealogy.fw.core.type.NotNull
	private java.sql.Date CreateDate = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("CREATE_TIME")
	@com.maxiaohua.genealogy.fw.core.type.Index(8)
	@com.maxiaohua.genealogy.fw.core.type.DataType("TIME")
	@com.maxiaohua.genealogy.fw.core.type.NotNull
	private java.sql.Time CreateTime = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("LAST_USER")
	@com.maxiaohua.genealogy.fw.core.type.Index(9)
	@com.maxiaohua.genealogy.fw.core.type.DataType("VARCHAR")
	@com.maxiaohua.genealogy.fw.core.type.Length(min = 13, max = 13)
	private String LastUser = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("LAST_DATE")
	@com.maxiaohua.genealogy.fw.core.type.Index(10)
	@com.maxiaohua.genealogy.fw.core.type.DataType("DATE")
	private java.sql.Date LastDate = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("LAST_TIME")
	@com.maxiaohua.genealogy.fw.core.type.Index(11)
	@com.maxiaohua.genealogy.fw.core.type.DataType("TIME")
	private java.sql.Time LastTime = null;

	public Long getID() {
		return this.ID;
	}

	public void setID(
			Long ID) {
		this.ID = ID;
	}

	public String getNO() {
		return this.NO;
	}

	public void setNO(
			String NO) {
		this.NO = NO;
	}

	public String getFirstName() {
		return this.FirstName;
	}

	public void setFirstName(
			String FirstName) {
		this.FirstName = FirstName;
	}

	public String getArms() {
		return this.Arms;
	}

	public void setArms(
			String Arms) {
		this.Arms = Arms;
	}

	public String getInfomation() {
		return this.Infomation;
	}

	public void setInfomation(
			String Infomation) {
		this.Infomation = Infomation;
	}

	public String getDelFlg() {
		return this.DelFlg;
	}

	public void setDelFlg(
			String DelFlg) {
		this.DelFlg = DelFlg;
	}

	public String getCreateUser() {
		return this.CreateUser;
	}

	public void setCreateUser(
			String CreateUser) {
		this.CreateUser = CreateUser;
	}

	public java.sql.Date getCreateDate() {
		return this.CreateDate;
	}

	public void setCreateDate(
			java.sql.Date CreateDate) {
		this.CreateDate = CreateDate;
	}

	public java.sql.Time getCreateTime() {
		return this.CreateTime;
	}

	public void setCreateTime(
			java.sql.Time CreateTime) {
		this.CreateTime = CreateTime;
	}

	public String getLastUser() {
		return this.LastUser;
	}

	public void setLastUser(
			String LastUser) {
		this.LastUser = LastUser;
	}

	public java.sql.Date getLastDate() {
		return this.LastDate;
	}

	public void setLastDate(
			java.sql.Date LastDate) {
		this.LastDate = LastDate;
	}

	public java.sql.Time getLastTime() {
		return this.LastTime;
	}

	public void setLastTime(
			java.sql.Time LastTime) {
		this.LastTime = LastTime;
	}

  	/* (non-Javadoc)
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    @Override
    public int compareTo(
			T01GenealogyDTO compareToDTO) {
        return this.equals(compareToDTO) ? 0 : -1;
    }
}

