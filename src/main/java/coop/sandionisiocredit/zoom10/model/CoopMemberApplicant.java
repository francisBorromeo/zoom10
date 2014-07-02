/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package coop.sandionisiocredit.zoom10.model;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author mis
 */
@Entity
@Table(name = "coop_member_applicant")
@XmlRootElement
@NamedQueries({
	@NamedQuery(name = "CoopMemberApplicant.findAll", query = "SELECT c FROM CoopMemberApplicant c"),
	@NamedQuery(name = "CoopMemberApplicant.findByMemNo", query = "SELECT c FROM CoopMemberApplicant c WHERE c.coopMemberApplicantPK.memNo = :memNo"),
	@NamedQuery(name = "CoopMemberApplicant.findByApplicantNo", query = "SELECT c FROM CoopMemberApplicant c WHERE c.coopMemberApplicantPK.applicantNo = :applicantNo")})
public class CoopMemberApplicant implements Serializable {
	private static final long serialVersionUID = 1L;
	@EmbeddedId
	protected CoopMemberApplicantPK coopMemberApplicantPK;
	@JoinColumn(name = "mem_no", referencedColumnName = "mem_no", insertable = false, updatable = false)
    @ManyToOne(optional = false)
	private CoopMember coopMember;
	@JoinColumn(name = "applicant_no", referencedColumnName = "applicant_no", insertable = false, updatable = false)
    @ManyToOne(optional = false)
	private CoopApplicant coopApplicant;

	public CoopMemberApplicant() {
	}

	public CoopMemberApplicant(CoopMemberApplicantPK coopMemberApplicantPK) {
		this.coopMemberApplicantPK = coopMemberApplicantPK;
	}

	public CoopMemberApplicant(String memNo, int applicantNo) {
		this.coopMemberApplicantPK = new CoopMemberApplicantPK(memNo, applicantNo);
	}

	public CoopMemberApplicantPK getCoopMemberApplicantPK() {
		return coopMemberApplicantPK;
	}

	public void setCoopMemberApplicantPK(CoopMemberApplicantPK coopMemberApplicantPK) {
		this.coopMemberApplicantPK = coopMemberApplicantPK;
	}

	public CoopMember getCoopMember() {
		return coopMember;
	}

	public void setCoopMember(CoopMember coopMember) {
		this.coopMember = coopMember;
	}

	public CoopApplicant getCoopApplicant() {
		return coopApplicant;
	}

	public void setCoopApplicant(CoopApplicant coopApplicant) {
		this.coopApplicant = coopApplicant;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (coopMemberApplicantPK != null ? coopMemberApplicantPK.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof CoopMemberApplicant)) {
			return false;
		}
		CoopMemberApplicant other = (CoopMemberApplicant) object;
		if ((this.coopMemberApplicantPK == null && other.coopMemberApplicantPK != null) || (this.coopMemberApplicantPK != null && !this.coopMemberApplicantPK.equals(other.coopMemberApplicantPK))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "coop.sandionisiocredit.zoom10.model.CoopMemberApplicant[ coopMemberApplicantPK=" + coopMemberApplicantPK + " ]";
	}
	
}
