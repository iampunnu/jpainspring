package com.jpa.project.jpa.dao;

import com.jpa.project.jpa.entity.Praveen;

import jakarta.persistence.EntityManager;

public interface PraveenDao {
	public void save(Praveen p);
	public Praveen get(int id);

}
