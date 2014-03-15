package com.simnect.mengua.entities;

// Generated Mar 13, 2014 11:06:35 PM by Hibernate Tools 4.0.0

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Like.
 * @see com.simnect.mengua.entities.Like
 * @author Hibernate Tools
 */
@Stateless
public class LikeHome {

	private static final Log log = LogFactory.getLog(LikeHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Like transientInstance) {
		log.debug("persisting Like instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Like persistentInstance) {
		log.debug("removing Like instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Like merge(Like detachedInstance) {
		log.debug("merging Like instance");
		try {
			Like result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Like findById(Long id) {
		log.debug("getting Like instance with id: " + id);
		try {
			Like instance = entityManager.find(Like.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
