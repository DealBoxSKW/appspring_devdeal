package com.sesame.ing4b.dealboxSKW.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sesame.ing4b.dealboxSKW.dao.AdresseDao;
import com.sesame.ing4b.dealboxSKW.dao.DomaineDao;
import com.sesame.ing4b.dealboxSKW.entities.Adresse;
import com.sesame.ing4b.dealboxSKW.entities.Deal;
import com.sesame.ing4b.dealboxSKW.entities.Domaine;





public class Test {
	
	public static void main(String[] args) {
		testHibernateDAOSupport();
	}
	
	
	
	private static void testIOC() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationConfig_entities.xml");
		Deal deal = context.getBean("deal", Deal.class);
		

		System.out.println(deal);
	}
	
	
	private static void testHibernateDAOSupport() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_dao.xml");
		AdresseDao dao = (AdresseDao)context.getBean("adresseDao1");
		Adresse t=new Adresse(6L,"ariana","jjsvs",456,43,"gfgdhdh");
		dao.save(t);
		
		
	}

}
