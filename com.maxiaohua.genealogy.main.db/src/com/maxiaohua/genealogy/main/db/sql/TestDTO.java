/*
 * Genealogy
 * Xiao Hua Ma personal studio 2015.
 */
package com.maxiaohua.genealogy.main.db.sql;

import com.maxiaohua.genealogy.main.db.sql.support.TestDTOSupport;

/**
 *Service DB DTO
 *
 * History
 * REV.         Updated Date           Updater              Infomation
 * -------      ---------------        ----------------     ------------------
 * 1.0          2015/10/07             TOOL                 Create
*
 */
@com.maxiaohua.genealogy.fw.core.type.Alias("TEST")
@com.maxiaohua.genealogy.fw.core.type.AliasKanJi("")
public class TestDTO extends TestDTOSupport implements java.io.Serializable, Comparable<TestDTO> {

	private static final long serialVersionUID = 1L;

	@com.maxiaohua.genealogy.fw.core.type.Alias("CODE1")
	@com.maxiaohua.genealogy.fw.core.type.Index(0)
	@com.maxiaohua.genealogy.fw.core.type.DataType("VARCHAR")
	@com.maxiaohua.genealogy.fw.core.type.NotNull
	@com.maxiaohua.genealogy.fw.core.type.Length(min = 8, max = 8)
	private String cODE1 = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("CODE2")
	@com.maxiaohua.genealogy.fw.core.type.Index(1)
	@com.maxiaohua.genealogy.fw.core.type.DataType("VARCHAR")
	@com.maxiaohua.genealogy.fw.core.type.NotNull
	@com.maxiaohua.genealogy.fw.core.type.Length(min = 8, max = 8)
	private String cODE2 = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("CODE3")
	@com.maxiaohua.genealogy.fw.core.type.Index(2)
	@com.maxiaohua.genealogy.fw.core.type.DataType("VARCHAR")
	@com.maxiaohua.genealogy.fw.core.type.NotNull
	@com.maxiaohua.genealogy.fw.core.type.Length(min = 8, max = 8)
	private String cODE3 = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("VALUE")
	@com.maxiaohua.genealogy.fw.core.type.Index(3)
	@com.maxiaohua.genealogy.fw.core.type.DataType("VARCHAR")
	@com.maxiaohua.genealogy.fw.core.type.Length(min = 40, max = 40)
	private String vALUE = null;

	public String getCODE1() {
		return this.cODE1;
	}

	public void setCODE1(
			String cODE1) {
		this.cODE1 = cODE1;
	}

	public String getCODE2() {
		return this.cODE2;
	}

	public void setCODE2(
			String cODE2) {
		this.cODE2 = cODE2;
	}

	public String getCODE3() {
		return this.cODE3;
	}

	public void setCODE3(
			String cODE3) {
		this.cODE3 = cODE3;
	}

	public String getVALUE() {
		return this.vALUE;
	}

	public void setVALUE(
			String vALUE) {
		this.vALUE = vALUE;
	}

  	/* (non-Javadoc)
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    @Override
    public int compareTo(
			TestDTO compareToDTO) {
        return this.equals(compareToDTO) ? 0 : -1;
    }
}

