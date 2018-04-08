package com.sesame.ing4b.dealboxSKW.dao;

import org.springframework.stereotype.Repository;

import com.sesame.ing4b.dealboxSKW.entities.Deal;

@Repository
public class DealDao extends GeneriqueDao<Deal,Long> implements IDealDao {

}
