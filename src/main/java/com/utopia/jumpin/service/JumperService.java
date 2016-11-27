package com.utopia.jumpin.service;

import java.util.List;
import java.util.Set;

import com.utopia.jumpin.model.Arrow;
import com.utopia.jumpin.model.Balloon;
import com.utopia.jumpin.model.Jumper;
import com.utopia.jumpin.model.Mix;
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
	private BalloonService balloonService;
	
	@Override
	public Jumper create(Jumper jumper) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Jumper update(Jumper jumper) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Jumper delete(Jumper jumper) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Jumper> getAll(){
		// TODO Auto-generated method stub
		return null;
	}

	public Jumper getOne(Long id){
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Balloon jumpIn(Jumper jumper, Balloon balloon) {
		Set<Jumper> jumpers = balloon.getJumpers();
		jumpers.add(jumper);
		balloon.setJumpers(jumpers);
		return balloonService.update(balloon);
	}

	@Override
	public void createEvent(String eventName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void postComment(Arrow comment, Mix event) {
		// TODO Auto-generated method stub
		
	}

}
