package com.utopia.jumpin.service;

import com.utopia.jumpin.model.Arrow;
import com.utopia.jumpin.model.Cloud;
import com.utopia.jumpin.model.Jumper;
import com.utopia.jumpin.model.Balloon;

import java.util.List;

public interface IJumperService extends ICrudService<Jumper>{

	public Jumper create(Jumper jumper);
	
	public Jumper update(Jumper jumper);
	
	public Jumper delete(Jumper jumper);

	public List<Jumper> getAll();

	public Jumper getOne(Long id);
	
	public Cloud jumpIn(Jumper jumper, Cloud cloud);
	
	public void createEvent(String eventName);
	
	public void postComment(Arrow comment, Balloon event);
}
