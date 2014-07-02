/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package coop.sandionisiocredit.zoom10.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author mis
 */
@Entity
@Table(name = "coop_empl_dtl")
@XmlRootElement
@NamedQueries({
	@NamedQuery(name = "CoopEmplDtl.findAll", query = "SELECT c FROM CoopEmplDtl c"),
	@NamedQuery(name = "CoopEmplDtl.findByEmplDtlNo", query = "SELECT c FROM CoopEmplDtl c WHERE c.emplDtlNo = :emplDtlNo"),
	@NamedQuery(name = "CoopEmplDtl.findByEmploymentStat", query = "SELECT c FROM CoopEmplDtl c WHERE c.employmentStat = :employmentStat"),
	@NamedQuery(name = "CoopEmplDtl.findByRankPos", query = "SELECT c FROM CoopEmplDtl c WHERE c.rankPos = :rankPos"),
	@NamedQuery(name = "CoopEmplDtl.findByCompBracket", query = "SELECT c FROM CoopEmplDtl c WHERE c.compBracket = :compBracket"),
	@NamedQuery(name = "CoopEmplDtl.findByEmploymentDate", query = "SELECT c FROM CoopEmplDtl c WHERE c.employmentDate = :employmentDate"),
	@NamedQuery(name = "CoopEmplDtl.findByWorkplaceEmailAdd", query = "SELECT c FROM CoopEmplDtl c WHERE c.workplaceEmailAdd = :workplaceEmailAdd"),
	@NamedQuery(name = "CoopEmplDtl.findByEmplrBizName", query = "SELECT c FROM CoopEmplDtl c WHERE c.emplrBizName = :emplrBizName"),
	@NamedQuery(name = "CoopEmplDtl.findByEmplrContactNo", query = "SELECT c FROM CoopEmplDtl c WHERE c.emplrContactNo = :emplrContactNo")})
public class CoopEmplDtl implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "empl_dtl_no")
	private Integer emplDtlNo;
	@Size(max = 15)
    @Column(name = "employment_stat")
	private String employmentStat;
	@Size(max = 15)
    @Column(name = "rank_pos")
	private String rankPos;
	@Size(max = 25)
    @Column(name = "comp_bracket")
	private String compBracket;
	@Basic(optional = false)
    @NotNull
    @Column(name = "employment_date")
    @Temporal(TemporalType.DATE)
	private Date employmentDate;
	@Size(max = 35)
    @Column(name = "workplace_email_add")
	private String workplaceEmailAdd;
	@Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 35)
    @Column(name = "emplr_biz_name")
	private String emplrBizName;
	@Size(max = 12)
    @Column(name = "emplr_contact_no")
	private String emplrContactNo;
	@JoinColumn(name = "mem_no", referencedColumnName = "mem_no")
    @ManyToOne
	private CoopMember memNo;

	public CoopEmplDtl() {
	}

	public CoopEmplDtl(Integer emplDtlNo) {
		this.emplDtlNo = emplDtlNo;
	}

	public CoopEmplDtl(Integer emplDtlNo, Date employmentDate, String emplrBizName) {
		this.emplDtlNo = emplDtlNo;
		this.employmentDate = employmentDate;
		this.emplrBizName = emplrBizName;
	}

	public Integer getEmplDtlNo() {
		return emplDtlNo;
	}

	public void setEmplDtlNo(Integer emplDtlNo) {
		this.emplDtlNo = emplDtlNo;
	}

	public String getEmploymentStat() {
		return employmentStat;
	}

	public void setEmploymentStat(String employmentStat) {
		this.employmentStat = employmentStat;
	}

	public String getRankPos() {
		return rankPos;
	}

	public void setRankPos(String rankPos) {
		this.rankPos = rankPos;
	}

	public String getCompBracket() {
		return compBracket;
	}

	public void setCompBracket(String compBracket) {
		this.compBracket = compBracket;
	}

	public Date getEmploymentDate() {
		return employmentDate;
	}

	public void setEmploymentDate(Date employmentDate) {
		this.employmentDate = employmentDate;
	}

	public String getWorkplaceEmailAdd() {
		return workplaceEmailAdd;
	}

	public void setWorkplaceEmailAdd(String workplaceEmailAdd) {
		this.workplaceEmailAdd = workplaceEmailAdd;
	}

	public String getEmplrBizName() {
		return emplrBizName;
	}

	public void setEmplrBizName(String emplrBizName) {
		this.emplrBizName = emplrBizName;
	}

	public String getEmplrContactNo() {
		return emplrContactNo;
	}

	public void setEmplrContactNo(String emplrContactNo) {
		this.emplrContactNo = emplrContactNo;
	}

	public CoopMember getMemNo() {
		return memNo;
	}

	public void setMemNo(CoopMember memNo) {
		this.memNo = memNo;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (emplDtlNo != null ? emplDtlNo.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof CoopEmplDtl)) {
			return false;
		}
		CoopEmplDtl other = (CoopEmplDtl) object;
		if ((this.emplDtlNo == null && other.emplDtlNo != null) || (this.emplDtlNo != null && !this.emplDtlNo.equals(other.emplDtlNo))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "coop.sandionisiocredit.zoom10.model.CoopEmplDtl[ emplDtlNo=" + emplDtlNo + " ]";
	}
	
}
