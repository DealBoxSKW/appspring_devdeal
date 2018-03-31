package com.sesame.ing4b.dealboxSKW.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.sesame.ing4b.dealboxSKW.dao.DealDao;
import com.sesame.ing4b.dealboxSKW.dao.GeneriqueDao;
import com.sesame.ing4b.dealboxSKW.dao.PartenaireDao;
import com.sesame.ing4b.dealboxSKW.entities.Deal;
import com.sesame.ing4b.dealboxSKW.entities.Partenaire;

@Service
public class PartenaireService extends GenericServiceImp<Partenaire, Long> implements IPartenaireService{

	private PartenaireDao partenaireDaoimp;

	public PartenaireService() {
		
	}
	@Autowired
	public PartenaireService(
			@Qualifier("partenaireDao")GeneriqueDao<Partenaire, Long> generiqueDao)
	{
		super(generiqueDao);
		this.partenaireDaoimp = (PartenaireDao) generiqueDao;
	}
}
