package com.sesame.ing4b.dealboxSKW.dao;

import org.springframework.stereotype.Repository;


import com.sesame.ing4b.dealboxSKW.entities.Contact;

@Repository
public class ContactDao extends GeneriqueDao<Contact,Long> implements IContactDao {

}
