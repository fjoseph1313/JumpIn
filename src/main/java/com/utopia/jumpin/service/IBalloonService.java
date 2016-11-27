package com.utopia.jumpin.service;

import com.utopia.jumpin.model.Balloon;

import java.util.List;

public interface IBalloonService extends ICrudService<Balloon>{

	/**
	 * All The group functionalities definition
	 */

	public Balloon create(Balloon balloon);
	
	public Balloon update(Balloon balloon);
	
	public Balloon delete(Balloon balloon);

	public List<Balloon> getAll();

	public Balloon getOne(Long id);
}
