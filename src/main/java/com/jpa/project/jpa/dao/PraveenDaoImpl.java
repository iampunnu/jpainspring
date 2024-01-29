package com.jpa.project.jpa.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jpa.project.jpa.entity.Praveen;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
@Repository
public class PraveenDaoImpl  {
	
	@Autowired
//	EntityManagerFactory entityManagerFactory;
	//@PersistenceContext(unitName = "jdbc")
	EntityManager entityManager;


	@Transactional
	public void save(Praveen p) {
		entityManager.persist(p);
		// TODO Auto-generated method stub
		
	}
	@Transactional
    public Praveen get(int id) {
		
		 return (Praveen) entityManager.createQuery("FROM praveen u WHERE u.id = :id")
		          .setParameter("id", id)
		          .getSingleResult();		
	}
}
