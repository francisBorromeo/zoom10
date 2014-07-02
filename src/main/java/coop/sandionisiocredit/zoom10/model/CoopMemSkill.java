/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package coop.sandionisiocredit.zoom10.model;

import java.io.Serializable;
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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author mis
 */
@Entity
@Table(name = "coop_mem_skill")
@XmlRootElement
@NamedQueries({
	@NamedQuery(name = "CoopMemSkill.findAll", query = "SELECT c FROM CoopMemSkill c"),
	@NamedQuery(name = "CoopMemSkill.findByMemSkillNum", query = "SELECT c FROM CoopMemSkill c WHERE c.memSkillNum = :memSkillNum")})
public class CoopMemSkill implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "mem_skill_num")
	private Integer memSkillNum;
	@JoinColumn(name = "sk_prof_code", referencedColumnName = "sk_prof_code")
    @ManyToOne(optional = false)
	private CoopSkill skProfCode;
	@JoinColumn(name = "mem_no", referencedColumnName = "mem_no")
    @ManyToOne
	private CoopMember memNo;

	public CoopMemSkill() {
	}

	public CoopMemSkill(Integer memSkillNum) {
		this.memSkillNum = memSkillNum;
	}

	public Integer getMemSkillNum() {
		return memSkillNum;
	}

	public void setMemSkillNum(Integer memSkillNum) {
		this.memSkillNum = memSkillNum;
	}

	public CoopSkill getSkProfCode() {
		return skProfCode;
	}

	public void setSkProfCode(CoopSkill skProfCode) {
		this.skProfCode = skProfCode;
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
		hash += (memSkillNum != null ? memSkillNum.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof CoopMemSkill)) {
			return false;
		}
		CoopMemSkill other = (CoopMemSkill) object;
		if ((this.memSkillNum == null && other.memSkillNum != null) || (this.memSkillNum != null && !this.memSkillNum.equals(other.memSkillNum))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "coop.sandionisiocredit.zoom10.model.CoopMemSkill[ memSkillNum=" + memSkillNum + " ]";
	}
	
}
