/*
 * Genealogy
 * Xiao Hua Ma personal studio 2015.
 */
package com.maxiaohua.genealogy.main.db.tbl;

import com.maxiaohua.genealogy.main.db.tbl.support.T06PerHistoryDTOSupport;

/**
 *Service DB DTO
 *
 * History
 * REV.         Updated Date           Updater              Infomation
 * -------      ---------------        ----------------     ------------------
 * 1.0          2016/02/08             TOOL                 Create
*
 */
@com.maxiaohua.genealogy.fw.core.type.Alias("T06_PER_HISTORY")
@com.maxiaohua.genealogy.fw.core.type.AliasKanJi("")
public class T06PerHistoryDTO extends T06PerHistoryDTOSupport implements java.io.Serializable, Comparable<T06PerHistoryDTO> {

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
	private String No = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("PER_NO")
	@com.maxiaohua.genealogy.fw.core.type.Index(2)
	@com.maxiaohua.genealogy.fw.core.type.DataType("VARCHAR")
	@com.maxiaohua.genealogy.fw.core.type.NotNull
	@com.maxiaohua.genealogy.fw.core.type.Length(min = 13, max = 13)
	private String PerNo = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("EVENT_TYPE")
	@com.maxiaohua.genealogy.fw.core.type.Index(3)
	@com.maxiaohua.genealogy.fw.core.type.DataType("CHAR")
	@com.maxiaohua.genealogy.fw.core.type.NotNull
	@com.maxiaohua.genealogy.fw.core.type.Length(min = 8, max = 8)
	private String EventType = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("EVENT_DATE")
	@com.maxiaohua.genealogy.fw.core.type.Index(4)
	@com.maxiaohua.genealogy.fw.core.type.DataType("DATE")
	@com.maxiaohua.genealogy.fw.core.type.NotNull
	private java.sql.Date EventDate = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("EVENT_TIME")
	@com.maxiaohua.genealogy.fw.core.type.Index(5)
	@com.maxiaohua.genealogy.fw.core.type.DataType("TIME")
	@com.maxiaohua.genealogy.fw.core.type.NotNull
	private java.sql.Time EventTime = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("LATITUDE")
	@com.maxiaohua.genealogy.fw.core.type.Index(6)
	@com.maxiaohua.genealogy.fw.core.type.DataType("DOUBLE")
	private Double Latitude = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("LONGITUDE")
	@com.maxiaohua.genealogy.fw.core.type.Index(7)
	@com.maxiaohua.genealogy.fw.core.type.DataType("DOUBLE")
	private Double Longitude = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("TITLE")
	@com.maxiaohua.genealogy.fw.core.type.Index(8)
	@com.maxiaohua.genealogy.fw.core.type.DataType("VARCHAR")
	@com.maxiaohua.genealogy.fw.core.type.NotNull
	@com.maxiaohua.genealogy.fw.core.type.Length(min = 200, max = 200)
	private String Title = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("COVER_IMAGE")
	@com.maxiaohua.genealogy.fw.core.type.Index(9)
	@com.maxiaohua.genealogy.fw.core.type.DataType("VARCHAR")
	@com.maxiaohua.genealogy.fw.core.type.Length(min = 200, max = 200)
	private String CoverImage = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("PRAISE")
	@com.maxiaohua.genealogy.fw.core.type.Index(10)
	@com.maxiaohua.genealogy.fw.core.type.DataType("CHAR")
	@com.maxiaohua.genealogy.fw.core.type.Length(min = 1, max = 1)
	private String Praise = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("IS_PUBLIC")
	@com.maxiaohua.genealogy.fw.core.type.Index(11)
	@com.maxiaohua.genealogy.fw.core.type.DataType("CHAR")
	@com.maxiaohua.genealogy.fw.core.type.NotNull
	@com.maxiaohua.genealogy.fw.core.type.Length(min = 1, max = 1)
	private String IsPublic = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("REMARKS")
	@com.maxiaohua.genealogy.fw.core.type.Index(12)
	@com.maxiaohua.genealogy.fw.core.type.DataType("VARCHAR")
	@com.maxiaohua.genealogy.fw.core.type.Length(min = 4000, max = 4000)
	private String Remarks = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("DEL_FLG")
	@com.maxiaohua.genealogy.fw.core.type.Index(13)
	@com.maxiaohua.genealogy.fw.core.type.DataType("CHAR")
	@com.maxiaohua.genealogy.fw.core.type.Length(min = 1, max = 1)
	private String DelFlg = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("CREATE_USER")
	@com.maxiaohua.genealogy.fw.core.type.Index(14)
	@com.maxiaohua.genealogy.fw.core.type.DataType("VARCHAR")
	@com.maxiaohua.genealogy.fw.core.type.NotNull
	@com.maxiaohua.genealogy.fw.core.type.Length(min = 13, max = 13)
	private String CreateUser = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("CREATE_DATE")
	@com.maxiaohua.genealogy.fw.core.type.Index(15)
	@com.maxiaohua.genealogy.fw.core.type.DataType("DATE")
	@com.maxiaohua.genealogy.fw.core.type.NotNull
	private java.sql.Date CreateDate = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("CREATE_TIME")
	@com.maxiaohua.genealogy.fw.core.type.Index(16)
	@com.maxiaohua.genealogy.fw.core.type.DataType("TIME")
	@com.maxiaohua.genealogy.fw.core.type.NotNull
	private java.sql.Time CreateTime = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("LAST_USER")
	@com.maxiaohua.genealogy.fw.core.type.Index(17)
	@com.maxiaohua.genealogy.fw.core.type.DataType("VARCHAR")
	@com.maxiaohua.genealogy.fw.core.type.Length(min = 13, max = 13)
	private String LastUser = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("LAST_DATE")
	@com.maxiaohua.genealogy.fw.core.type.Index(18)
	@com.maxiaohua.genealogy.fw.core.type.DataType("DATE")
	private java.sql.Date LastDate = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("LAST_TIME")
	@com.maxiaohua.genealogy.fw.core.type.Index(19)
	@com.maxiaohua.genealogy.fw.core.type.DataType("TIME")
	private java.sql.Time LastTime = null;

	public Long getID() {
		return this.ID;
	}

	public void setID(
			Long ID) {
		this.ID = ID;
	}

	public String getNo() {
		return this.No;
	}

	public void setNo(
			String No) {
		this.No = No;
	}

	public String getPerNo() {
		return this.PerNo;
	}

	public void setPerNo(
			String PerNo) {
		this.PerNo = PerNo;
	}

	public String getEventType() {
		return this.EventType;
	}

	public void setEventType(
			String EventType) {
		this.EventType = EventType;
	}

	public java.sql.Date getEventDate() {
		return this.EventDate;
	}

	public void setEventDate(
			java.sql.Date EventDate) {
		this.EventDate = EventDate;
	}

	public java.sql.Time getEventTime() {
		return this.EventTime;
	}

	public void setEventTime(
			java.sql.Time EventTime) {
		this.EventTime = EventTime;
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

	public String getTitle() {
		return this.Title;
	}

	public void setTitle(
			String Title) {
		this.Title = Title;
	}

	public String getCoverImage() {
		return this.CoverImage;
	}

	public void setCoverImage(
			String CoverImage) {
		this.CoverImage = CoverImage;
	}

	public String getPraise() {
		return this.Praise;
	}

	public void setPraise(
			String Praise) {
		this.Praise = Praise;
	}

	public String getIsPublic() {
		return this.IsPublic;
	}

	public void setIsPublic(
			String IsPublic) {
		this.IsPublic = IsPublic;
	}

	public String getRemarks() {
		return this.Remarks;
	}

	public void setRemarks(
			String Remarks) {
		this.Remarks = Remarks;
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
			T06PerHistoryDTO compareToDTO) {
        return this.equals(compareToDTO) ? 0 : -1;
    }
}

