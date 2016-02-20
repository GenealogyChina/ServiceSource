/*
 * Genealogy
 * Xiao Hua Ma personal studio 2015.
 */
package com.maxiaohua.genealogy.main.db.tbl;

import com.maxiaohua.genealogy.main.db.tbl.support.T12PerHisCommentDTOSupport;

/**
 *Service DB DTO
 *
 * History
 * REV.         Updated Date           Updater              Infomation
 * -------      ---------------        ----------------     ------------------
 * 1.0          2016/02/08             TOOL                 Create
*
 */
@com.maxiaohua.genealogy.fw.core.type.Alias("T12_PER_HIS_COMMENT")
@com.maxiaohua.genealogy.fw.core.type.AliasKanJi("")
public class T12PerHisCommentDTO extends T12PerHisCommentDTOSupport implements java.io.Serializable, Comparable<T12PerHisCommentDTO> {

	private static final long serialVersionUID = 1L;

	@com.maxiaohua.genealogy.fw.core.type.Alias("ID")
	@com.maxiaohua.genealogy.fw.core.type.Index(0)
	@com.maxiaohua.genealogy.fw.core.type.DataType("BIGINT")
	@com.maxiaohua.genealogy.fw.core.type.NotNull
	@com.maxiaohua.genealogy.fw.core.type.IsPK
	private Long ID = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("PER_HIS_NO")
	@com.maxiaohua.genealogy.fw.core.type.Index(1)
	@com.maxiaohua.genealogy.fw.core.type.DataType("VARCHAR")
	@com.maxiaohua.genealogy.fw.core.type.Length(min = 13, max = 13)
	private String PerHisNo = null;

	@com.maxiaohua.genealogy.fw.core.type.Alias("COMMENT")
	@com.maxiaohua.genealogy.fw.core.type.Index(2)
	@com.maxiaohua.genealogy.fw.core.type.DataType("VARCHAR")
	@com.maxiaohua.genealogy.fw.core.type.Length(min = 400, max = 400)
	private String Comment = null;

	public Long getID() {
		return this.ID;
	}

	public void setID(
			Long ID) {
		this.ID = ID;
	}

	public String getPerHisNo() {
		return this.PerHisNo;
	}

	public void setPerHisNo(
			String PerHisNo) {
		this.PerHisNo = PerHisNo;
	}

	public String getComment() {
		return this.Comment;
	}

	public void setComment(
			String Comment) {
		this.Comment = Comment;
	}

  	/* (non-Javadoc)
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    @Override
    public int compareTo(
			T12PerHisCommentDTO compareToDTO) {
        return this.equals(compareToDTO) ? 0 : -1;
    }
}

