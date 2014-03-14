package com.simnect.mengua.entities;

// Generated Mar 13, 2014 9:52:52 PM by Hibernate Tools 4.0.0

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Game.
 * @see com.simnect.mengua.entities.Game
 * @author Hibernate Tools
 */
@Stateless
public class GameHome {

	private static final Log log = LogFactory.getLog(GameHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Game transientInstance) {
		log.debug("persisting Game instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Game persistentInstance) {
		log.debug("removing Game instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Game merge(Game detachedInstance) {
		log.debug("merging Game instance");
		try {
			Game result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Game findById(Long id) {
		log.debug("getting Game instance with id: " + id);
		try {
			Game instance = entityManager.find(Game.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
