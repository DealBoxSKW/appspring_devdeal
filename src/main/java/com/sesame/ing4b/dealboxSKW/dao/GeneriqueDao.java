package com.sesame.ing4b.dealboxSKW.dao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public abstract class GeneriqueDao<E ,K extends Serializable> implements IGeneriqueDao<E,K> {

	protected Class<? extends E> daoType;

	public GeneriqueDao() {
        Type t = getClass().getGenericSuperclass();
        ParameterizedType pt = (ParameterizedType) t;
        daoType = (Class) pt.getActualTypeArguments()[0];
    }

     @Autowired
     protected SessionFactory sessionFactory;
	





	protected Session currentSession() {
		return sessionFactory.getCurrentSession();
	}






	@Override
	public void add(E entity) {
		// TODO Auto-generated method stub
		currentSession().save(entity);
		
	}






	@Override
	public void saveOrUpdate(E entity) {
		// TODO Auto-generated method stub
		currentSession().saveOrUpdate(entity);
		
	}






	@Override
	public void update(E entity) {
		// TODO Auto-generated method stub
		currentSession().saveOrUpdate(entity);
	}






	@Override
	public void remove(E entity) {
		// TODO Auto-generated method stub
		currentSession().delete(entity);
	}






	@Override
	public E find(K key) {
		// TODO Auto-generated method stub
		return (E) currentSession().get(daoType, key);
		
	}






	@Override
	public List<E> getAll() {
		// TODO Auto-generated method stub
		return currentSession().createCriteria(daoType).list();
	}

}
