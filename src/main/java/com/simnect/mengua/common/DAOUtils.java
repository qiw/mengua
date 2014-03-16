package com.simnect.mengua.common;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.google.common.base.Preconditions;
import com.simnect.mengua.entities.base.MenguaEntity;

public class DAOUtils {
	private static SessionFactory sessionFactory;
	private static ServiceRegistry serviceRegistry;

	static {
		Configuration configuration = new Configuration();
		configuration.configure();
		serviceRegistry = new StandardServiceRegistryBuilder().applySettings(
				configuration.getProperties()).build();
		sessionFactory = configuration.buildSessionFactory(serviceRegistry);
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public static Session openSession() {
		return sessionFactory.openSession();
	}

	public static void insert(MenguaEntity u) {
		Preconditions.checkState(u.retrievePKId() == null);
		u.syncCreatedAt();
		u.syncUpdatedAt();
		saveInternal(u);
	}

	private static void saveInternal(MenguaEntity me) {
		Session session = null;
		try {
		  session = openSession();
  		session.beginTransaction();
  		session.save(me);
  		session.getTransaction().commit();
		} catch (Throwable e) {
      throw e;
    } finally {
		  if (session != null) {
		    session.close();
		  }
		}
	}

	public static void update(MenguaEntity me) {
		Preconditions.checkNotNull(me.retrievePKId());
		me.syncUpdatedAt();
		saveInternal(me);
	}

	public static void delete(MenguaEntity me) {
	  // TODO: try finally
		Session session = openSession();
		session.beginTransaction();
		session.delete(me);
		session.getTransaction().commit();
		session.close();
	}
	
	public static Object findById(Class<? extends MenguaEntity> classz, long id) {
	  Session session = null; 
	  try {
	    session = openSession();
	    Object o = session.load(classz, id);
	    Hibernate.initialize(o);
	    return o;
	  } catch (Throwable e) {
	    throw e;
	  } finally {
	    if (session != null) {
	      session.close();
	    }
	  }
	}

	public static void close() {
		sessionFactory.close();
	}
	
}
