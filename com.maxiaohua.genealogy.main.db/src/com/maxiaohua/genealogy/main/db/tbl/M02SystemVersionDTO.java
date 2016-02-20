/*
 * Genealogy
 * Xiao Hua Ma personal studio 2015.
 */
package com.maxiaohua.genealogy.main.db.tbl;

import com.maxiaohua.genealogy.main.db.tbl.support.M02SystemVersionDTOSupport;

/**
 *Service DB DTO
 *
 * History
 * REV.         Updated Date           Updater              Infomation
 * -------      ---------------        ----------------     ------------------
 * 1.0          2016/02/08             TOOL                 Create
*
 */
@com.maxiaohua.genealogy.fw.core.type.Alias("M02_SYSTEM_VERSION")
@com.maxiaohua.genealogy.fw.core.type.AliasKanJi("")
public class M02SystemVersionDTO extends M02SystemVersionDTOSupport implements java.io.Serializable, Comparable<M02SystemVersionDTO> {

	private static final long serialVersionUID = 1L;

	@com.maxiaohua.genealogy.fw.core.type.Alias("ID")
	@com.maxiaohua.genealogy.fw.core.type.Index(0)
	@com.maxiaohua.genealogy.fw.core.type.DataType("INTEGER")
	@com.maxiaohua.genealogy.fw.core.type.NotNull
	@com.maxiaohua.genealogy.fw.core.type.IsPK
	private Integer Id = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("IMSI")
	@com.maxiaohua.genealogy.fw.core.type.Index(1)
	@com.maxiaohua.genealogy.fw.core.type.DataType("CHAR")
	@com.maxiaohua.genealogy.fw.core.type.Length(min = 1, max = 1)
	private String Imsi = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("CHANNEL")
	@com.maxiaohua.genealogy.fw.core.type.Index(2)
	@com.maxiaohua.genealogy.fw.core.type.DataType("CHAR")
	@com.maxiaohua.genealogy.fw.core.type.Length(min = 1, max = 1)
	private String Channel = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("VERSION")
	@com.maxiaohua.genealogy.fw.core.type.Index(3)
	@com.maxiaohua.genealogy.fw.core.type.DataType("VARCHAR")
	@com.maxiaohua.genealogy.fw.core.type.Length(min = 10, max = 10)
	private String Version = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("LOAD_PATH")
	@com.maxiaohua.genealogy.fw.core.type.Index(4)
	@com.maxiaohua.genealogy.fw.core.type.DataType("VARCHAR")
	@com.maxiaohua.genealogy.fw.core.type.Length(min = 1000, max = 1000)
	private String LoadPath = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("DESCRIP")
	@com.maxiaohua.genealogy.fw.core.type.Index(5)
	@com.maxiaohua.genealogy.fw.core.type.DataType("VARCHAR")
	@com.maxiaohua.genealogy.fw.core.type.Length(min = 2000, max = 2000)
	private String Descrip = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("DEL_FLG")
	@com.maxiaohua.genealogy.fw.core.type.Index(6)
	@com.maxiaohua.genealogy.fw.core.type.DataType("CHAR")
	@com.maxiaohua.genealogy.fw.core.type.Length(min = 1, max = 1)
	private String DelFlg = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("IS_FORCE")
	@com.maxiaohua.genealogy.fw.core.type.Index(7)
	@com.maxiaohua.genealogy.fw.core.type.DataType("CHAR")
	@com.maxiaohua.genealogy.fw.core.type.Length(min = 1, max = 1)
	private String IsForce = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("LAST_DATE")
	@com.maxiaohua.genealogy.fw.core.type.Index(8)
	@com.maxiaohua.genealogy.fw.core.type.DataType("DATE")
	private java.sql.Date LastDate = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("LAST_TIME")
	@com.maxiaohua.genealogy.fw.core.type.Index(9)
	@com.maxiaohua.genealogy.fw.core.type.DataType("TIME")
	private java.sql.Time LastTime = null;

	public Integer getId() {
		return this.Id;
	}

	public void setId(
			Integer Id) {
		this.Id = Id;
	}

	public String getImsi() {
		return this.Imsi;
	}

	public void setImsi(
			String Imsi) {
		this.Imsi = Imsi;
	}

	public String getChannel() {
		return this.Channel;
	}

	public void setChannel(
			String Channel) {
		this.Channel = Channel;
	}

	public String getVersion() {
		return this.Version;
	}

	public void setVersion(
			String Version) {
		this.Version = Version;
	}

	public String getLoadPath() {
		return this.LoadPath;
	}

	public void setLoadPath(
			String LoadPath) {
		this.LoadPath = LoadPath;
	}

	public String getDescrip() {
		return this.Descrip;
	}

	public void setDescrip(
			String Descrip) {
		this.Descrip = Descrip;
	}

	public String getDelFlg() {
		return this.DelFlg;
	}

	public void setDelFlg(
			String DelFlg) {
		this.DelFlg = DelFlg;
	}

	public String getIsForce() {
		return this.IsForce;
	}

	public void setIsForce(
			String IsForce) {
		this.IsForce = IsForce;
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
			M02SystemVersionDTO compareToDTO) {
        return this.equals(compareToDTO) ? 0 : -1;
    }
}

