package com.sesame.ing4b.dealboxSKW.dao;

import java.util.List;

public interface IGeneriqueDao<Type> {
	
	
	List<Type> findAll();
	void save(Type t);
	void update(Type t);
	

}
