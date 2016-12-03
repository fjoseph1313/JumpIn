package com.utopia.jumpin.service;

import com.utopia.jumpin.model.Balloon;
import com.utopia.jumpin.model.Cloud;
import com.utopia.jumpin.repository.CloudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by fjoseph1313 on 11/28/2016.
 */
@Service
@Transactional
public class CloudService implements ICloudService{

    @Autowired
    private CloudRepository cloudRepository;

    public Cloud create(Cloud cloud){
        return cloud;
    }

    public Cloud update(Long id, Cloud cloud){
        // TODO : perform update of cloud.
        return cloud;
    }

    public Cloud delete(Cloud cloud){
        return cloud;
    }

    public List<Cloud> getAll(){
        return null;
    }

    public Cloud getOne(Long id){
        return null;
    }

    public List<Balloon> getCloudBalloons(Long id){
        return cloudRepository.findOne(id).getBalloons().stream().collect(Collectors.toList());
    }

}