package com.simnect.mengua.common;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.simnect.mengua.entities.base.MenguaEntity;

public class EMUtils {
  private static EntityManagerFactory emf;
  
  static {
    emf = Persistence.createEntityManagerFactory("menguajpa");
  }
  
  public static EntityManager createEM() {
    return emf.createEntityManager();
  }
  
  public static Object findById(Class<? extends MenguaEntity> classz, long id) {
    EntityManager em = createEM();
    Object o = em.createQuery("select display_name from user where user.user_id = ?1").setParameter(1, id).getSingleResult();
    em.close();
    return o;
  }
  
}
