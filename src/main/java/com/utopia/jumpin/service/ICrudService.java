package com.utopia.jumpin.service;

import java.util.List;

public interface ICrudService<T> {

	/**
	 * All Basic crud operation predefined for all services (Crud Facade)
	 */
	
	public T create(T t);
	
	public T update(T t);
	
	public T delete(T t);
	
	public List<T> getAll();
	
	public T getOne(Long id);
}
