package com.sesame.ing4b.dealboxSKW.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.sesame.ing4b.dealboxSKW.dao.DealDao;
import com.sesame.ing4b.dealboxSKW.dao.DomaineDao;
import com.sesame.ing4b.dealboxSKW.dao.GeneriqueDao;
import com.sesame.ing4b.dealboxSKW.entities.Deal;
import com.sesame.ing4b.dealboxSKW.entities.Domaine;
@Service
public class DomaineService extends GenericServiceImp<Domaine, Long> implements IDomaineService{

	private DomaineDao domaineDaoimp;

	public DomaineService() {
		
	}
	@Autowired
	public DomaineService(
			@Qualifier("domaineDao")GeneriqueDao<Domaine, Long> generiqueDao)
	{
		super(generiqueDao);
		this.domaineDaoimp = (DomaineDao) generiqueDao;
	}
	
}
