/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coop.sandionisiocredit.zoom10.bean;

import coop.sandionisiocredit.zoom10.model.*;
import coop.sandionisiocredit.zoom10.service.*;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

/**
 *
 * @author mis
 */
@ManagedBean
@ViewScoped
public class MemberBean {

	//EJBs

	@EJB
	private CoopAddlAddressFacade addlAddressFacade;
	@EJB
	private CoopAddlContactInfoFacade addlContactInfoFacade;
	@EJB
	private CoopApplicantFacade applicantFacade;
	@EJB
	private CoopAwardsFacade awardsFacade;
	@EJB
	private CoopBizInfoFacade bizInfoFacade;
	@EJB
	private CoopEducInfoFacade educInfoFacade;
	@EJB
	private CoopEmplDtlFacade employmentDetailFacade;
	@EJB
	private CoopKinFacade kinFacade;
	@EJB
	private CoopKinshipFacade kinshipFacade;
	@EJB
	private CoopMemSkillFacade memSkillFacade;
	@EJB
	private CoopMemberFacade memberFacade;
	@EJB
	private CoopMemberApplicantFacade memApplicantFacade;
	@EJB
	private CoopOrgUnitFacade ouFacade;
	@EJB
	private CoopSkillFacade skillFacade;
	//basic entity variables
	private CoopAddlAddress addlAddress;
	private CoopAddlContactInfo addlContactInfo;
	private CoopApplicant applicant;
	private CoopAwards awards;
	private CoopBizInfo bizInfo;
	private CoopEducInfo educInfo;
	private CoopEmplDtl employmentDetail;
	private CoopKin relative;
	private CoopKinship relationship;
	private CoopMemSkill memberSkill;
	private CoopMember member;
	private CoopMemberApplicant memberApplicant;
	private CoopOrgUnit orgUnit;
	private CoopSkill skill;
	//selectedvariables
	private CoopApplicant selectedApplicant;
	private CoopMember selectedMember;
	//lists and models
	private List<CoopApplicant> applicantList;
	private List<CoopApplicant> filteredApplicantList;
	private DataModel<CoopApplicant> applicantModel;
	private List<CoopMember> memberList;
	private List<CoopMember> filteredMemberList;
	private DataModel<CoopMember> memberModel;
	private List<CoopOrgUnit> ouList;
	private List<CoopOrgUnit> filteredOuList;
	private DataModel<CoopOrgUnit> ouModel;

	public MemberBean() {
	}

	@PostConstruct
	public void init() {
		/*
		 addlAddress = new CoopAddlAddress();
		 addlContactInfo = new CoopAddlContactInfo();
		 applicant = new CoopApplicant();
		 awards = new CoopAwards();
		 bizInfo = new CoopBizInfo();
		 educInfo = new CoopEducInfo();
		 employmentDetail = new CoopEmplDtl();
		 relative = new CoopKin();
		 relationship = new CoopKinship();
		 memberSkill = new CoopMemSkill();
		 member = new CoopMember();
		 memberApplicant = new CoopMemberApplicant();
		 orgUnit = new CoopOrgUnit();
		 skill = new CoopSkill();
		 */
		applicantList = applicantFacade.findAll();
	}

	//getters start
	public CoopAddlAddress getAddlAddress() {
		if (addlAddress == null) {
			addlAddress = new CoopAddlAddress();
		}
		return addlAddress;
	}

	public CoopAddlContactInfo getAddlContactInfo() {
		if (addlContactInfo == null) {
			addlContactInfo = new CoopAddlContactInfo();
		}
		return addlContactInfo;
	}

	public CoopApplicant getApplicant() {
		if (applicant == null) {
			applicant = new CoopApplicant();
		}
		return applicant;
	}

	public CoopAwards getAwards() {
		if (awards == null) {
			awards = new CoopAwards();
		}
		return awards;
	}

	public CoopBizInfo getBizInfo() {
		if (bizInfo == null) {
			bizInfo = new CoopBizInfo();
		}
		return bizInfo;
	}

	public CoopEducInfo getEducInfo() {
		if (educInfo == null) {
			educInfo = new CoopEducInfo();
		}
		return educInfo;
	}

	public CoopEmplDtl getEmploymentDetail() {
		if (employmentDetail == null) {
			employmentDetail = new CoopEmplDtl();
		}
		return employmentDetail;
	}

	public CoopKin getRelative() {
		if (relative == null) {
			relative = new CoopKin();
		}
		return relative;
	}

	public CoopKinship getRelationship() {
		if (relationship == null) {
			relationship = new CoopKinship();
		}
		return relationship;
	}

	public CoopMemSkill getMemberSkill() {
		if (memberSkill == null) {
			memberSkill = new CoopMemSkill();
		}
		return memberSkill;
	}

	public CoopMember getMember() {
		if (member == null) {
			member = new CoopMember();
		}
		return member;
	}

	public CoopMemberApplicant getMemberApplicant() {
		if (memberApplicant == null) {
			memberApplicant = new CoopMemberApplicant();
		}
		return memberApplicant;
	}

	public CoopOrgUnit getOrgUnit() {
		if (orgUnit == null) {
			orgUnit = new CoopOrgUnit();
		}
		return orgUnit;
	}

	public CoopSkill getSkill() {
		if (skill == null) {
			skill = new CoopSkill();
		}
		return skill;
	}

	public CoopApplicant getSelectedApplicant() {
		if (selectedApplicant == null) {
			selectedApplicant = new CoopApplicant();
		}
		return selectedApplicant;
	}

	public CoopMember getSelectedMember() {
		if (selectedMember == null) {
			selectedMember = new CoopMember();
		}
		return selectedMember;
	}
	//getters end

	//setters start
	public void setAddlAddress(CoopAddlAddress addlAddress) {
		this.addlAddress = addlAddress;
	}

	public void setAddlContactInfo(CoopAddlContactInfo addlContactInfo) {
		this.addlContactInfo = addlContactInfo;
	}

	public void setApplicant(CoopApplicant applicant) {
		this.applicant = applicant;
	}

	public void setAwards(CoopAwards awards) {
		this.awards = awards;
	}

	public void setBizInfo(CoopBizInfo bizInfo) {
		this.bizInfo = bizInfo;
	}

	public void setEducInfo(CoopEducInfo educInfo) {
		this.educInfo = educInfo;
	}

	public void setEmploymentDetail(CoopEmplDtl employmentDetail) {
		this.employmentDetail = employmentDetail;
	}

	public void setRelative(CoopKin relative) {
		this.relative = relative;
	}

	public void setRelationship(CoopKinship relationship) {
		this.relationship = relationship;
	}

	public void setMemberSkill(CoopMemSkill memberSkill) {
		this.memberSkill = memberSkill;
	}

	public void setMember(CoopMember member) {
		this.member = member;
	}

	public void setMemberApplicant(CoopMemberApplicant memberApplicant) {
		this.memberApplicant = memberApplicant;
	}

	public void setOrgUnit(CoopOrgUnit orgUnit) {
		this.orgUnit = orgUnit;
	}

	public void setSkill(CoopSkill skill) {
		this.skill = skill;
	}

	public void setSelectedApplicant(CoopApplicant selectedApplicant) {
		this.selectedApplicant = selectedApplicant;
	}

	public void setSelectedMember(CoopMember selectedMember) {
		this.selectedMember = selectedMember;
	}
	//setters end

	//list
	public List<CoopApplicant> getapplicantList() {
		applicantList = applicantFacade.findAll();
		return applicantList;
	}

	public DataModel<CoopApplicant> getApplicantModel() {
		if (applicantModel == null) {
			applicantModel = new ListDataModel<CoopApplicant>(applicantList);
		}
		return applicantModel;
	}

	public List<CoopMember> getMemberList() {
		memberList = memberFacade.findAll();
		return memberList;
	}

	public DataModel<CoopMember> getMemberModel() {
		if (memberModel == null) {
			memberModel = new ListDataModel<CoopMember>(memberList);
		}
		return memberModel;
	}

	public List<CoopOrgUnit> getOuList() {
		ouList = ouFacade.findAll();
		return ouList;
	}

	public DataModel<CoopOrgUnit> getOuModel() {
		if (ouModel == null) {
			ouModel = new ListDataModel<CoopOrgUnit>(ouList);
		}
		return ouModel;
	}

	//filters
	public List<CoopApplicant> getFilteredApplicantList() {
		return filteredApplicantList;
	}

	public void setFilteredApplicantList(List<CoopApplicant> filteredApplicantList) {
		this.filteredApplicantList = filteredApplicantList;
	}

	public List<CoopMember> getFilteredMemberList() {
		return filteredMemberList;
	}

	public void setFilteredMemberList(List<CoopMember> filteredMemberList) {
		this.filteredMemberList = filteredMemberList;
	}

	public List<CoopOrgUnit> getFilteredOuList() {
		return filteredOuList;
	}

	public void setFilteredOuList(List<CoopOrgUnit> filteredOuList) {
		this.filteredOuList = filteredOuList;
	}

}
