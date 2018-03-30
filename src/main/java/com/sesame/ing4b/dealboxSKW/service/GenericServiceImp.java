package com.sesame.ing4b.dealboxSKW.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.sesame.ing4b.dealboxSKW.dao.GeneriqueDao;

@Service
public abstract class GenericServiceImp<E,K extends Serializable> implements IGenericService<E, K> {

	
	private GeneriqueDao<E,K > generiqueDao;

	
	public GenericServiceImp(GeneriqueDao<E, K> generiqueDao) {
		this.generiqueDao = generiqueDao;
	}
	

	public GenericServiceImp() {
		
	}


	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public void saveOrUpdate(E entity) {
		// TODO Auto-generated method stub
		generiqueDao.saveOrUpdate(entity);
		
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED, readOnly= true)
	public List<E> getAll() {
		// TODO Auto-generated method stub
		return generiqueDao.getAll();
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED, readOnly= true)
	public E get(K id) {
		// TODO Auto-generated method stub
		return generiqueDao.find(id);
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public void add(E entity) {
		// TODO Auto-generated method stub
		generiqueDao.add(entity);
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public void update(E entity) {
		// TODO Auto-generated method stub
		
		generiqueDao.update(entity);
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public void remove(E entity) {
		// TODO Auto-generated method stub
		generiqueDao.remove(entity);
	}
}
