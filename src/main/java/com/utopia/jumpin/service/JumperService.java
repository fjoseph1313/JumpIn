package com.utopia.jumpin.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import com.utopia.jumpin.model.Arrow;
import com.utopia.jumpin.model.Cloud;
import com.utopia.jumpin.model.Jumper;
import com.utopia.jumpin.model.Balloon;
import com.utopia.jumpin.repository.JumperRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author fjoseph1313
 *
 */
@Service
@Transactional
public class JumperService implements IJumperService{

	@Autowired
	private CloudService cloudService;
	@Autowired
	private JumperRepository jumperRepository;

	//This mock for controller
	private static final List<Jumper> jumpers = Arrays.asList(new Jumper("testJumper", "status = 'Active?'"));
	
	@Override
	public Jumper create(Jumper jumper) {
		return jumperRepository.save(jumper);
	}

	@Override
	public Jumper update(Long id, Jumper jumper) {
		// TODO perform update
		return jumperRepository.save(jumper);
	}

	@Override
	public Jumper delete(Jumper jumper) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Jumper> getAll(){
		return jumpers;
		//return jumperRepository.findAll();
	}

	@Override
	public Jumper getOne(Long id){
		return jumperRepository.findOne(id);
	}

	@Override //This Should be moved to balloons service
	public Cloud jumpIn(Jumper jumper, Cloud cloud) {
		Long id = cloud.getId();
		Set<Jumper> jumpers = cloud.getJumpers();
		jumpers.add(jumper);
		cloud.setJumpers(jumpers);
		return cloudService.update(id, cloud);
	}

	@Override //to be moved to Cloud service
	public void createEvent(String eventName) {
		// TODO Auto-generated method stub
		
	}

}
