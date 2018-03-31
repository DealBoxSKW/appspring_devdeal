package com.sesame.ing4b.dealboxSKW.service;

import java.io.Serializable;
import java.util.List;

public interface IGenericService<E,K> {
	
	public void saveOrUpdate(E entity);
    public List<E> getAll();
    public E get(K id);
    public void add(E entity);
    public void update(E entity);
    public void remove(E entity);

}
