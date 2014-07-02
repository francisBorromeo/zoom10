/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package coop.sandionisiocredit.zoom10.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author mis
 */
@Embeddable
public class CoopMemberApplicantPK implements Serializable {
	@Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "mem_no")
	private String memNo;
	@Basic(optional = false)
    @NotNull
    @Column(name = "applicant_no")
	private int applicantNo;

	public CoopMemberApplicantPK() {
	}

	public CoopMemberApplicantPK(String memNo, int applicantNo) {
		this.memNo = memNo;
		this.applicantNo = applicantNo;
	}

	public String getMemNo() {
		return memNo;
	}

	public void setMemNo(String memNo) {
		this.memNo = memNo;
	}

	public int getApplicantNo() {
		return applicantNo;
	}

	public void setApplicantNo(int applicantNo) {
		this.applicantNo = applicantNo;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (memNo != null ? memNo.hashCode() : 0);
		hash += (int) applicantNo;
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof CoopMemberApplicantPK)) {
			return false;
		}
		CoopMemberApplicantPK other = (CoopMemberApplicantPK) object;
		if ((this.memNo == null && other.memNo != null) || (this.memNo != null && !this.memNo.equals(other.memNo))) {
			return false;
		}
		if (this.applicantNo != other.applicantNo) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "coop.sandionisiocredit.zoom10.model.CoopMemberApplicantPK[ memNo=" + memNo + ", applicantNo=" + applicantNo + " ]";
	}
	
}
