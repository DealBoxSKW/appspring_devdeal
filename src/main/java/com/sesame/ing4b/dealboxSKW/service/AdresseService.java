package com.sesame.ing4b.dealboxSKW.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.sesame.ing4b.dealboxSKW.dao.AdresseDao;
import com.sesame.ing4b.dealboxSKW.dao.GeneriqueDao;
import com.sesame.ing4b.dealboxSKW.entities.Adresse;
@Service
public class AdresseService extends GenericServiceImp<Adresse, Long> implements IAdresseService {

	private AdresseDao adresseDaoimp;

	public AdresseService() {
		
	}
	@Autowired
	public AdresseService(
			@Qualifier("adresseDao")GeneriqueDao<Adresse, Long> generiqueDao)
	{
		super(generiqueDao);
		this.adresseDaoimp = (AdresseDao) generiqueDao;
	}
	
	
	
	
	
}
