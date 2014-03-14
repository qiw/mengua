package com.simnect.mengua.entities;

// Generated Mar 13, 2014 9:52:52 PM by Hibernate Tools 4.0.0

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class UserGame.
 * @see com.simnect.mengua.entities.UserGame
 * @author Hibernate Tools
 */
@Stateless
public class UserGameHome {

	private static final Log log = LogFactory.getLog(UserGameHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(UserGame transientInstance) {
		log.debug("persisting UserGame instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(UserGame persistentInstance) {
		log.debug("removing UserGame instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public UserGame merge(UserGame detachedInstance) {
		log.debug("merging UserGame instance");
		try {
			UserGame result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public UserGame findById(Long id) {
		log.debug("getting UserGame instance with id: " + id);
		try {
			UserGame instance = entityManager.find(UserGame.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
