package com.sesame.ing4b.dealboxSKW.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.sesame.ing4b.dealboxSKW.dao.AdresseDao;
import com.sesame.ing4b.dealboxSKW.dao.ContratDao;
import com.sesame.ing4b.dealboxSKW.dao.GeneriqueDao;
import com.sesame.ing4b.dealboxSKW.entities.Adresse;
import com.sesame.ing4b.dealboxSKW.entities.Contrat;

@Service
public class ContratService extends GenericServiceImp<Contrat, Long> implements IContratService {

	private ContratDao contratDaoimp;

	public ContratService() {
		
	}
	@Autowired
	public ContratService(
			@Qualifier("contratDao")GeneriqueDao<Contrat, Long> generiqueDao)
	{
		super(generiqueDao);
		this.contratDaoimp = (ContratDao) generiqueDao;
	}
	

}
