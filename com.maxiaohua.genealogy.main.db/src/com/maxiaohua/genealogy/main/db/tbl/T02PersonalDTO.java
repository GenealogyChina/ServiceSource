/*
 * Genealogy
 * Xiao Hua Ma personal studio 2015.
 */
package com.maxiaohua.genealogy.main.db.tbl;

import com.maxiaohua.genealogy.main.db.tbl.support.T02PersonalDTOSupport;

/**
 *Service DB DTO
 *
 * History
 * REV.         Updated Date           Updater              Infomation
 * -------      ---------------        ----------------     ------------------
 * 1.0          2016/02/08             TOOL                 Create
*
 */
@com.maxiaohua.genealogy.fw.core.type.Alias("T02_PERSONAL")
@com.maxiaohua.genealogy.fw.core.type.AliasKanJi("")
public class T02PersonalDTO extends T02PersonalDTOSupport implements java.io.Serializable, Comparable<T02PersonalDTO> {

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
	@com.maxiaohua.genealogy.fw.core.type.Length(min = 13, max = 13)
	private String NO = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("FIRST_NAME")
	@com.maxiaohua.genealogy.fw.core.type.Index(2)
	@com.maxiaohua.genealogy.fw.core.type.DataType("VARCHAR")
	@com.maxiaohua.genealogy.fw.core.type.Length(min = 30, max = 30)
	private String FirstName = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("LAST_NAME")
	@com.maxiaohua.genealogy.fw.core.type.Index(3)
	@com.maxiaohua.genealogy.fw.core.type.DataType("VARCHAR")
	@com.maxiaohua.genealogy.fw.core.type.Length(min = 30, max = 30)
	private String LastName = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("PASSWORD")
	@com.maxiaohua.genealogy.fw.core.type.Index(4)
	@com.maxiaohua.genealogy.fw.core.type.DataType("VARCHAR")
	@com.maxiaohua.genealogy.fw.core.type.Length(min = 32, max = 32)
	private String Password = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("MOBILE")
	@com.maxiaohua.genealogy.fw.core.type.Index(5)
	@com.maxiaohua.genealogy.fw.core.type.DataType("VARCHAR")
	@com.maxiaohua.genealogy.fw.core.type.Length(min = 13, max = 13)
	private String Mobile = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("MAILE")
	@com.maxiaohua.genealogy.fw.core.type.Index(6)
	@com.maxiaohua.genealogy.fw.core.type.DataType("VARCHAR")
	@com.maxiaohua.genealogy.fw.core.type.Length(min = 100, max = 100)
	private String Maile = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("BIRTH_DATE")
	@com.maxiaohua.genealogy.fw.core.type.Index(7)
	@com.maxiaohua.genealogy.fw.core.type.DataType("DATE")
	private java.sql.Date BirthDate = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("BIRTH_TIME")
	@com.maxiaohua.genealogy.fw.core.type.Index(8)
	@com.maxiaohua.genealogy.fw.core.type.DataType("TIME")
	private java.sql.Time BirthTime = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("SEX")
	@com.maxiaohua.genealogy.fw.core.type.Index(9)
	@com.maxiaohua.genealogy.fw.core.type.DataType("CHAR")
	@com.maxiaohua.genealogy.fw.core.type.Length(min = 1, max = 1)
	private String Sex = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("COVER")
	@com.maxiaohua.genealogy.fw.core.type.Index(10)
	@com.maxiaohua.genealogy.fw.core.type.DataType("VARCHAR")
	@com.maxiaohua.genealogy.fw.core.type.Length(min = 200, max = 200)
	private String Cover = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("HEAD_PORTRAIT")
	@com.maxiaohua.genealogy.fw.core.type.Index(11)
	@com.maxiaohua.genealogy.fw.core.type.DataType("VARCHAR")
	@com.maxiaohua.genealogy.fw.core.type.Length(min = 200, max = 200)
	private String HeadPortrait = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("VIDEO")
	@com.maxiaohua.genealogy.fw.core.type.Index(12)
	@com.maxiaohua.genealogy.fw.core.type.DataType("VARCHAR")
	@com.maxiaohua.genealogy.fw.core.type.Length(min = 200, max = 200)
	private String Video = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("INFOMATION")
	@com.maxiaohua.genealogy.fw.core.type.Index(13)
	@com.maxiaohua.genealogy.fw.core.type.DataType("TEXT")
	@com.maxiaohua.genealogy.fw.core.type.Length(min = 65535, max = 65535)
	private String Infomation = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("LATITUDE")
	@com.maxiaohua.genealogy.fw.core.type.Index(14)
	@com.maxiaohua.genealogy.fw.core.type.DataType("DOUBLE")
	private Double Latitude = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("LONGITUDE")
	@com.maxiaohua.genealogy.fw.core.type.Index(15)
	@com.maxiaohua.genealogy.fw.core.type.DataType("DOUBLE")
	private Double Longitude = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("REGEDIT_DATE")
	@com.maxiaohua.genealogy.fw.core.type.Index(16)
	@com.maxiaohua.genealogy.fw.core.type.DataType("DATE")
	private java.sql.Date RegeditDate = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("REGEDIT_TIME")
	@com.maxiaohua.genealogy.fw.core.type.Index(17)
	@com.maxiaohua.genealogy.fw.core.type.DataType("TIME")
	private java.sql.Time RegeditTime = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("STATUS")
	@com.maxiaohua.genealogy.fw.core.type.Index(18)
	@com.maxiaohua.genealogy.fw.core.type.DataType("CHAR")
	@com.maxiaohua.genealogy.fw.core.type.Length(min = 1, max = 1)
	private String Status = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("DEL_FLG")
	@com.maxiaohua.genealogy.fw.core.type.Index(19)
	@com.maxiaohua.genealogy.fw.core.type.DataType("CHAR")
	@com.maxiaohua.genealogy.fw.core.type.Length(min = 1, max = 1)
	private String DelFlg = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("CREATE_USER")
	@com.maxiaohua.genealogy.fw.core.type.Index(20)
	@com.maxiaohua.genealogy.fw.core.type.DataType("VARCHAR")
	@com.maxiaohua.genealogy.fw.core.type.Length(min = 13, max = 13)
	private String CreateUser = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("CREATE_DATE")
	@com.maxiaohua.genealogy.fw.core.type.Index(21)
	@com.maxiaohua.genealogy.fw.core.type.DataType("DATE")
	private java.sql.Date CreateDate = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("CREATE_TIME")
	@com.maxiaohua.genealogy.fw.core.type.Index(22)
	@com.maxiaohua.genealogy.fw.core.type.DataType("TIME")
	private java.sql.Time CreateTime = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("LAST_USER")
	@com.maxiaohua.genealogy.fw.core.type.Index(23)
	@com.maxiaohua.genealogy.fw.core.type.DataType("VARCHAR")
	@com.maxiaohua.genealogy.fw.core.type.Length(min = 13, max = 13)
	private String LastUser = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("LAST_DATE")
	@com.maxiaohua.genealogy.fw.core.type.Index(24)
	@com.maxiaohua.genealogy.fw.core.type.DataType("DATE")
	private java.sql.Date LastDate = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("LAST_TIME")
	@com.maxiaohua.genealogy.fw.core.type.Index(25)
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

	public String getLastName() {
		return this.LastName;
	}

	public void setLastName(
			String LastName) {
		this.LastName = LastName;
	}

	public String getPassword() {
		return this.Password;
	}

	public void setPassword(
			String Password) {
		this.Password = Password;
	}

	public String getMobile() {
		return this.Mobile;
	}

	public void setMobile(
			String Mobile) {
		this.Mobile = Mobile;
	}

	public String getMaile() {
		return this.Maile;
	}

	public void setMaile(
			String Maile) {
		this.Maile = Maile;
	}

	public java.sql.Date getBirthDate() {
		return this.BirthDate;
	}

	public void setBirthDate(
			java.sql.Date BirthDate) {
		this.BirthDate = BirthDate;
	}

	public java.sql.Time getBirthTime() {
		return this.BirthTime;
	}

	public void setBirthTime(
			java.sql.Time BirthTime) {
		this.BirthTime = BirthTime;
	}

	public String getSex() {
		return this.Sex;
	}

	public void setSex(
			String Sex) {
		this.Sex = Sex;
	}

	public String getCover() {
		return this.Cover;
	}

	public void setCover(
			String Cover) {
		this.Cover = Cover;
	}

	public String getHeadPortrait() {
		return this.HeadPortrait;
	}

	public void setHeadPortrait(
			String HeadPortrait) {
		this.HeadPortrait = HeadPortrait;
	}

	public String getVideo() {
		return this.Video;
	}

	public void setVideo(
			String Video) {
		this.Video = Video;
	}

	public String getInfomation() {
		return this.Infomation;
	}

	public void setInfomation(
			String Infomation) {
		this.Infomation = Infomation;
	}

	public Double getLatitude() {
		return this.Latitude;
	}

	public void setLatitude(
			Double Latitude) {
		this.Latitude = Latitude;
	}

	public Double getLongitude() {
		return this.Longitude;
	}

	public void setLongitude(
			Double Longitude) {
		this.Longitude = Longitude;
	}

	public java.sql.Date getRegeditDate() {
		return this.RegeditDate;
	}

	public void setRegeditDate(
			java.sql.Date RegeditDate) {
		this.RegeditDate = RegeditDate;
	}

	public java.sql.Time getRegeditTime() {
		return this.RegeditTime;
	}

	public void setRegeditTime(
			java.sql.Time RegeditTime) {
		this.RegeditTime = RegeditTime;
	}

	public String getStatus() {
		return this.Status;
	}

	public void setStatus(
			String Status) {
		this.Status = Status;
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
			T02PersonalDTO compareToDTO) {
        return this.equals(compareToDTO) ? 0 : -1;
    }
}

