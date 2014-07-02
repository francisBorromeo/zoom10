/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package coop.sandionisiocredit.zoom10.model;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author mis
 */
@Entity
@Table(name = "coop_skill")
@XmlRootElement
@NamedQueries({
	@NamedQuery(name = "CoopSkill.findAll", query = "SELECT c FROM CoopSkill c"),
	@NamedQuery(name = "CoopSkill.findBySkProfCode", query = "SELECT c FROM CoopSkill c WHERE c.skProfCode = :skProfCode"),
	@NamedQuery(name = "CoopSkill.findBySkProf", query = "SELECT c FROM CoopSkill c WHERE c.skProf = :skProf")})
public class CoopSkill implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "sk_prof_code")
	private Integer skProfCode;
	@Size(max = 15)
    @Column(name = "sk_prof")
	private String skProf;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "skProfCode")
	private Collection<CoopMemSkill> coopMemSkillCollection;

	public CoopSkill() {
	}

	public CoopSkill(Integer skProfCode) {
		this.skProfCode = skProfCode;
	}

	public Integer getSkProfCode() {
		return skProfCode;
	}

	public void setSkProfCode(Integer skProfCode) {
		this.skProfCode = skProfCode;
	}

	public String getSkProf() {
		return skProf;
	}

	public void setSkProf(String skProf) {
		this.skProf = skProf;
	}

	@XmlTransient
	public Collection<CoopMemSkill> getCoopMemSkillCollection() {
		return coopMemSkillCollection;
	}

	public void setCoopMemSkillCollection(Collection<CoopMemSkill> coopMemSkillCollection) {
		this.coopMemSkillCollection = coopMemSkillCollection;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (skProfCode != null ? skProfCode.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof CoopSkill)) {
			return false;
		}
		CoopSkill other = (CoopSkill) object;
		if ((this.skProfCode == null && other.skProfCode != null) || (this.skProfCode != null && !this.skProfCode.equals(other.skProfCode))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "coop.sandionisiocredit.zoom10.model.CoopSkill[ skProfCode=" + skProfCode + " ]";
	}
	
}
