/*
 * Genealogy
 * Xiao Hua Ma personal studio 2015.
 */
package com.maxiaohua.genealogy.main.db.tbl;

import com.maxiaohua.genealogy.main.db.tbl.support.M01CommonDTOSupport;

/**
 *Service DB DTO
 *
 * History
 * REV.         Updated Date           Updater              Infomation
 * -------      ---------------        ----------------     ------------------
 * 1.0          2016/02/08             TOOL                 Create
*
 */
@com.maxiaohua.genealogy.fw.core.type.Alias("M01_COMMON")
@com.maxiaohua.genealogy.fw.core.type.AliasKanJi("")
public class M01CommonDTO extends M01CommonDTOSupport implements java.io.Serializable, Comparable<M01CommonDTO> {

	private static final long serialVersionUID = 1L;

	@com.maxiaohua.genealogy.fw.core.type.Alias("CODE1")
	@com.maxiaohua.genealogy.fw.core.type.Index(0)
	@com.maxiaohua.genealogy.fw.core.type.DataType("VARCHAR")
	@com.maxiaohua.genealogy.fw.core.type.NotNull
	@com.maxiaohua.genealogy.fw.core.type.Length(min = 8, max = 8)
	@com.maxiaohua.genealogy.fw.core.type.IsPK
	private String CODE1 = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("CODE2")
	@com.maxiaohua.genealogy.fw.core.type.Index(1)
	@com.maxiaohua.genealogy.fw.core.type.DataType("VARCHAR")
	@com.maxiaohua.genealogy.fw.core.type.NotNull
	@com.maxiaohua.genealogy.fw.core.type.Length(min = 8, max = 8)
	@com.maxiaohua.genealogy.fw.core.type.IsPK
	private String CODE2 = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("CODE3")
	@com.maxiaohua.genealogy.fw.core.type.Index(2)
	@com.maxiaohua.genealogy.fw.core.type.DataType("VARCHAR")
	@com.maxiaohua.genealogy.fw.core.type.NotNull
	@com.maxiaohua.genealogy.fw.core.type.Length(min = 8, max = 8)
	@com.maxiaohua.genealogy.fw.core.type.IsPK
	private String CODE3 = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("VALUE")
	@com.maxiaohua.genealogy.fw.core.type.Index(3)
	@com.maxiaohua.genealogy.fw.core.type.DataType("VARCHAR")
	@com.maxiaohua.genealogy.fw.core.type.Length(min = 40, max = 40)
	private String VALUE = null;

	public String getCODE1() {
		return this.CODE1;
	}

	public void setCODE1(
			String CODE1) {
		this.CODE1 = CODE1;
	}

	public String getCODE2() {
		return this.CODE2;
	}

	public void setCODE2(
			String CODE2) {
		this.CODE2 = CODE2;
	}

	public String getCODE3() {
		return this.CODE3;
	}

	public void setCODE3(
			String CODE3) {
		this.CODE3 = CODE3;
	}

	public String getVALUE() {
		return this.VALUE;
	}

	public void setVALUE(
			String VALUE) {
		this.VALUE = VALUE;
	}

  	/* (non-Javadoc)
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    @Override
    public int compareTo(
			M01CommonDTO compareToDTO) {
        return this.equals(compareToDTO) ? 0 : -1;
    }
}

