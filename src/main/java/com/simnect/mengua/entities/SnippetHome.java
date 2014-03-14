package com.simnect.mengua.entities;

// Generated Mar 13, 2014 9:52:52 PM by Hibernate Tools 4.0.0

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Snippet.
 * @see com.simnect.mengua.entities.Snippet
 * @author Hibernate Tools
 */
@Stateless
public class SnippetHome {

	private static final Log log = LogFactory.getLog(SnippetHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Snippet transientInstance) {
		log.debug("persisting Snippet instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Snippet persistentInstance) {
		log.debug("removing Snippet instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Snippet merge(Snippet detachedInstance) {
		log.debug("merging Snippet instance");
		try {
			Snippet result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Snippet findById(Long id) {
		log.debug("getting Snippet instance with id: " + id);
		try {
			Snippet instance = entityManager.find(Snippet.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
