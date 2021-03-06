package com.jotiram.foodstall.repository;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class GenericDaoImpl<E,K extends Serializable> implements GenericDao<E, K> {

	@PersistenceContext
	protected EntityManager entityManager;
	protected Class<? extends E> daoType;
	
	@SuppressWarnings({"rawtypes", "unchecked" })
	
	public GenericDaoImpl() {
		Type genericClassType =getClass().getGenericSuperclass();
		ParameterizedType parameterizedType = (ParameterizedType) genericClassType;
		daoType=(Class) parameterizedType.getActualTypeArguments()[0];
		
	}
	
	@Override
	public void save(E entity) {
		entityManager.persist(entity);
		
	}

	@Override
	public void saveOrUpdate(E entity) {
		
		entityManager.merge(entity);
		
	}

	@Override
	public E findOne(long eId) {
		return entityManager.find(daoType, eId);
	
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<E> findAll() {
		
		String query="from"+daoType.getName();
		
		return entityManager.createQuery(query).getResultList();
	}

	@Override
	public void delete(E entity) {
		entityManager.remove(entity);
		
	}

}
