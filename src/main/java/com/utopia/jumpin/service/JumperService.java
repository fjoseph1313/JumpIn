package com.utopia.jumpin.service;

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
	
	@Override
	public Jumper create(Jumper jumper) {
		return jumperRepository.save(jumper);
	}

	@Override
	public Jumper update(Jumper jumper) {
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
		return jumperRepository.findAll();
	}

	@Override
	public Jumper getOne(Long id){
		return jumperRepository.findOne(id);
	}

	@Override //This Should be moved to balloons service
	public Cloud jumpIn(Jumper jumper, Cloud cloud) {
		Set<Jumper> jumpers = cloud.getJumpers();
		jumpers.add(jumper);
		cloud.setJumpers(jumpers);
		return cloudService.update(cloud);
	}

	@Override //to be moved to Cloud service
	public void createEvent(String eventName) {
		// TODO Auto-generated method stub
		
	}

	@Override //should moved to Cloud services
	public void postComment(Arrow comment, Balloon event) {
		// TODO Auto-generated method stub
		
	}

}
