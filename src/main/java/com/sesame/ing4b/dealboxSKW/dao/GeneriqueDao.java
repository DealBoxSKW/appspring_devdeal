package com.sesame.ing4b.dealboxSKW.dao;

import java.util.List;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;


public class GeneriqueDao<Type> extends HibernateDaoSupport implements IGeneriqueDao {

	@Override
	public List findAll() {

		return getHibernateTemplate().loadAll(Object.class);
	}

	@Override
	public void save(Object t) {
		getHibernateTemplate().saveOrUpdate(t);

	}

	@Override
	public void update(Object t) {
		// TODO Auto-generated method stub
		getHibernateTemplate().update(t);

	}

}
