package com.craigew.service;

import com.craigew.entity.BaseEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DataAccess<T extends BaseEntity> {
    private Class<T> entityClass;

    protected long add(T object){
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPAIntroduction");
        EntityManager em = factory.createEntityManager();
        em.getTransaction().begin();
        em.persist(object);
        em.getTransaction().commit();
        long id=object.getId();
        em.close();
        factory.close();
        return id;
    }

    protected void update(T object){
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPAIntroduction");
        EntityManager em = factory.createEntityManager();
        em.getTransaction().begin();
        em.merge(object);
        em.getTransaction().commit();
        em.close();
        factory.close();
    }

    protected T findByPrimaryKey(int id) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPAIntroduction");
        EntityManager em = factory.createEntityManager();
        T returnObject = em.find(getEntityClass(), id);
        em.close();
        factory.close();
        return returnObject;
    }

    protected Class<T> getEntityClass() {
        return entityClass;
    }

    protected void setEntityClass(Class<T> entityClass) {
        this.entityClass = entityClass;
    }
}
