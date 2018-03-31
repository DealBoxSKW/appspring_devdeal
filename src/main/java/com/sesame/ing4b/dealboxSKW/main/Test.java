package com.sesame.ing4b.dealboxSKW.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sesame.ing4b.dealboxSKW.dao.AdresseDao;
import com.sesame.ing4b.dealboxSKW.dao.DomaineDao;
import com.sesame.ing4b.dealboxSKW.dao.GeneriqueDao;
import com.sesame.ing4b.dealboxSKW.entities.Adresse;
import com.sesame.ing4b.dealboxSKW.entities.Deal;
import com.sesame.ing4b.dealboxSKW.entities.Domaine;
import com.sesame.ing4b.dealboxSKW.service.AdresseService;





public class Test {
	
	public static void main(String[] args) {
		testservice();
	}
	
	
	
	private static void testIOC() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationConfig_entities.xml");
		Deal deal = context.getBean("deal", Deal.class);
		

		System.out.println(deal);
	}
	
	
	private static void testHibernateDAOSupport() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_dao.xml");
		//GeneriqueDao<Adresse> dao = (GeneriqueDao<Adresse>)context.getBean("generiqueDao");
		Adresse t=new Adresse(6L,"ariana","jjsvs",456,43,"gfgdhdh");
		//dao.save(t);
		
		
	}
	private static void testservice() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_dao.xml","applicationContext_serv.xml");
		//GeneriqueDao<Adresse> dao = (GeneriqueDao<Adresse>)context.getBean("generiqueDao");
		AdresseService adresseService=(AdresseService) context.getBean("adresseService");
		Adresse t=new Adresse(6L,"ariana","jjsvs",456,43,"gfgdhdh");
		adresseService.add(t);
		
		
	}
}
