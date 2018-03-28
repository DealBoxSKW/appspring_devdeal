package com.sesame.ing4b.dealboxSKW.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.internal.SessionFactoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.sesame.ing4b.dealboxSKW.config.AppHibernateConfig;

@Repository
public class GeneriqueDao<Type extends Serializable> implements IGeneriqueDao {

	private Class<Type> clazz;

	public void setClazz(final Class<Type> clazzToSet) {
		this.clazz = clazzToSet;
	}

     @Autowired
     protected SessionFactory sessionFactory;
	

	@Override
	public List<Type> findAll() {
			
		return sessionFactory.getCurrentSession().createQuery("from " + clazz.getName()).list();
	}

	public void save(Type t) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().persist(t);

	}

	public void update(final Type entity) {
		getCurrentSession().merge(entity);
	}

	public void delete(final Type entity) {
		getCurrentSession().delete(entity);
	}



	protected Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

}
