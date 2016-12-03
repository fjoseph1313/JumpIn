package com.utopia.jumpin.service;

import com.utopia.jumpin.model.Arrow;
import com.utopia.jumpin.model.Balloon;
import com.utopia.jumpin.repository.BalloonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class BalloonService implements IBalloonService{
	
	@Autowired
	private BalloonRepository ballonRepository;

	@Override
	public Balloon create(Balloon balloon){
		return ballonRepository.save(balloon);
	}

	@Override
	public Balloon update(Long id, Balloon balloon) {
		//ballonRepo.save(balloon);
		System.out.println("Ballon Update method has been called");
		return balloon;
	}

	@Override
	public Balloon delete(Balloon balloon) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Balloon> getAll(){
		return ballonRepository.findAll();
	}

	public Balloon getOne(Long id){
		return ballonRepository.findOne(id);
	}

	public Balloon popBalloon(Long id, Arrow arrow){
		Balloon current = ballonRepository.findOne(id);
		current.getArrows().add(arrow);
		return ballonRepository.save(current);
	}
}
