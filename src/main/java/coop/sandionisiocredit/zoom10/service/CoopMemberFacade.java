/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package coop.sandionisiocredit.zoom10.service;

import coop.sandionisiocredit.zoom10.model.CoopMember;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author mis
 */
@Stateless
public class CoopMemberFacade extends AbstractFacade<CoopMember> {
	@PersistenceContext(unitName = "zoom10PU")
	private EntityManager em;

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}

	public CoopMemberFacade() {
		super(CoopMember.class);
	}
	
}
