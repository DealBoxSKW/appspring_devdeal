package com.sesame.ing4b.dealboxSKW.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.sesame.ing4b.dealboxSKW.dao.DealDao;
import com.sesame.ing4b.dealboxSKW.dao.GeneriqueDao;
import com.sesame.ing4b.dealboxSKW.dao.ServiceDao;
import com.sesame.ing4b.dealboxSKW.entities.Deal;
import com.sesame.ing4b.dealboxSKW.entities.Service;

@org.springframework.stereotype.Service
public class ServiceService extends GenericServiceImp<Service, Long> implements IServiceService{


	private ServiceDao serviceDaoimp;

	public ServiceService() {
		
	}
	@Autowired
	public ServiceService(
			@Qualifier("serviceDao")GeneriqueDao<Service, Long> generiqueDao)
	{
		super(generiqueDao);
		this.serviceDaoimp = (ServiceDao) generiqueDao;
	}


}
