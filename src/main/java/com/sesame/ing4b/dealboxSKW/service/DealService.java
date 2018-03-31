package com.sesame.ing4b.dealboxSKW.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.sesame.ing4b.dealboxSKW.dao.ContratDao;
import com.sesame.ing4b.dealboxSKW.dao.DealDao;
import com.sesame.ing4b.dealboxSKW.dao.GeneriqueDao;
import com.sesame.ing4b.dealboxSKW.entities.Contrat;
import com.sesame.ing4b.dealboxSKW.entities.Deal;
@Service
public class DealService extends GenericServiceImp<Deal, Long> implements IDealService{
	
	private DealDao dealDaoimp;

	public DealService() {
		
	}
	@Autowired
	public DealService(
			@Qualifier("dealDao")GeneriqueDao<Deal, Long> generiqueDao)
	{
		super(generiqueDao);
		this.dealDaoimp = (DealDao) generiqueDao;
	}
	

}
