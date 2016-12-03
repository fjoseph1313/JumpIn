package com.utopia.jumpin.controller;

import com.utopia.jumpin.model.Balloon;
import com.utopia.jumpin.model.Cloud;
import com.utopia.jumpin.service.CloudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by fjoseph1313 on 11/28/2016.
 */
@RestController
public class CloudController {

    @Autowired
    private CloudService cloudService;

    @RequestMapping(value = "/cloud", method = RequestMethod.POST)
    public Cloud formCloud(@RequestBody Cloud cloud){
        return cloudService.create(cloud);
    }

    @RequestMapping(value = "/balloons/{id}", method = RequestMethod.GET)
    public List<Balloon> cloudBalloons(@PathVariable Long id){
        return cloudService.getCloudBalloons(id);
    }
}
