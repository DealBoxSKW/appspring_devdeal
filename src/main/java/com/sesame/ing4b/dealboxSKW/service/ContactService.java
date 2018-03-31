package com.sesame.ing4b.dealboxSKW.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.sesame.ing4b.dealboxSKW.dao.AdresseDao;
import com.sesame.ing4b.dealboxSKW.dao.ContactDao;
import com.sesame.ing4b.dealboxSKW.dao.GeneriqueDao;
import com.sesame.ing4b.dealboxSKW.entities.Adresse;
import com.sesame.ing4b.dealboxSKW.entities.Contact;

@Service
public class ContactService extends GenericServiceImp<Contact, Long> implements IContactService {
	
	
	private ContactDao contactDaoimp;

	public ContactService() {
		
	}
	@Autowired
	public ContactService(
			@Qualifier("contactDao")GeneriqueDao<Contact, Long> generiqueDao)
	{
		super(generiqueDao);
		this.contactDaoimp = (ContactDao) generiqueDao;
	}
	

}
