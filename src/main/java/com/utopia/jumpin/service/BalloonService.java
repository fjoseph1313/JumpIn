package com.utopia.jumpin.service;

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
	private BalloonRepository ballonRepo;

	@Override
	public Balloon create(Balloon balloon){
		return null;
	}

	@Override
	public Balloon update(Balloon balloon) {
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
		return null;
	}

	public Balloon getOne(Long id){
		return null;
	}
}
