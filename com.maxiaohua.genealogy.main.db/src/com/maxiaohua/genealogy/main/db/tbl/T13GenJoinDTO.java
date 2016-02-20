/*
 * Genealogy
 * Xiao Hua Ma personal studio 2015.
 */
package com.maxiaohua.genealogy.main.db.tbl;

import com.maxiaohua.genealogy.main.db.tbl.support.T13GenJoinDTOSupport;

/**
 *Service DB DTO
 *
 * History
 * REV.         Updated Date           Updater              Infomation
 * -------      ---------------        ----------------     ------------------
 * 1.0          2016/02/08             TOOL                 Create
*
 */
@com.maxiaohua.genealogy.fw.core.type.Alias("T13_GEN_JOIN")
@com.maxiaohua.genealogy.fw.core.type.AliasKanJi("")
public class T13GenJoinDTO extends T13GenJoinDTOSupport implements java.io.Serializable, Comparable<T13GenJoinDTO> {

	private static final long serialVersionUID = 1L;

	@com.maxiaohua.genealogy.fw.core.type.Alias("ID")
	@com.maxiaohua.genealogy.fw.core.type.Index(0)
	@com.maxiaohua.genealogy.fw.core.type.DataType("BIGINT")
	@com.maxiaohua.genealogy.fw.core.type.NotNull
	@com.maxiaohua.genealogy.fw.core.type.IsPK
	private Long Id = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("NO")
	@com.maxiaohua.genealogy.fw.core.type.Index(1)
	@com.maxiaohua.genealogy.fw.core.type.DataType("VARCHAR")
	@com.maxiaohua.genealogy.fw.core.type.Length(min = 13, max = 13)
	private String No = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("GEN_NO")
	@com.maxiaohua.genealogy.fw.core.type.Index(2)
	@com.maxiaohua.genealogy.fw.core.type.DataType("VARCHAR")
	@com.maxiaohua.genealogy.fw.core.type.Length(min = 13, max = 13)
	private String GenNo = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("STATUS")
	@com.maxiaohua.genealogy.fw.core.type.Index(3)
	@com.maxiaohua.genealogy.fw.core.type.DataType("CHAR")
	@com.maxiaohua.genealogy.fw.core.type.Length(min = 1, max = 1)
	private String Status = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("APPLICATION_TEXT")
	@com.maxiaohua.genealogy.fw.core.type.Index(4)
	@com.maxiaohua.genealogy.fw.core.type.DataType("VARCHAR")
	@com.maxiaohua.genealogy.fw.core.type.Length(min = 400, max = 400)
	private String ApplicationText = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("REPLY_TEXT")
	@com.maxiaohua.genealogy.fw.core.type.Index(5)
	@com.maxiaohua.genealogy.fw.core.type.DataType("VARCHAR")
	@com.maxiaohua.genealogy.fw.core.type.Length(min = 400, max = 400)
	private String ReplyText = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("CREATE_USER")
	@com.maxiaohua.genealogy.fw.core.type.Index(6)
	@com.maxiaohua.genealogy.fw.core.type.DataType("VARCHAR")
	@com.maxiaohua.genealogy.fw.core.type.Length(min = 13, max = 13)
	private String CreateUser = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("CREATE_DATE")
	@com.maxiaohua.genealogy.fw.core.type.Index(7)
	@com.maxiaohua.genealogy.fw.core.type.DataType("DATE")
	private java.sql.Date CreateDate = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("CREATE_TIME")
	@com.maxiaohua.genealogy.fw.core.type.Index(8)
	@com.maxiaohua.genealogy.fw.core.type.DataType("TIME")
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

	public Long getId() {
		return this.Id;
	}

	public void setId(
			Long Id) {
		this.Id = Id;
	}

	public String getNo() {
		return this.No;
	}

	public void setNo(
			String No) {
		this.No = No;
	}

	public String getGenNo() {
		return this.GenNo;
	}

	public void setGenNo(
			String GenNo) {
		this.GenNo = GenNo;
	}

	public String getStatus() {
		return this.Status;
	}

	public void setStatus(
			String Status) {
		this.Status = Status;
	}

	public String getApplicationText() {
		return this.ApplicationText;
	}

	public void setApplicationText(
			String ApplicationText) {
		this.ApplicationText = ApplicationText;
	}

	public String getReplyText() {
		return this.ReplyText;
	}

	public void setReplyText(
			String ReplyText) {
		this.ReplyText = ReplyText;
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
			T13GenJoinDTO compareToDTO) {
        return this.equals(compareToDTO) ? 0 : -1;
    }
}

