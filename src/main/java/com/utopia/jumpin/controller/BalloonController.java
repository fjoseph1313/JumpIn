package com.utopia.jumpin.controller;

import com.utopia.jumpin.model.Arrow;
import com.utopia.jumpin.model.Balloon;
import com.utopia.jumpin.service.BalloonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by fjoseph1313 on 12/2/2016.
 */
@RestController
public class BalloonController {

    @Autowired
    private BalloonService balloonService;

    @RequestMapping(value = "/balloon", method = RequestMethod.POST)
    public Balloon makeBalloon(@RequestBody Balloon balloon){
        return balloon;
    }

    @RequestMapping(value = "/balloon/{id}", method = RequestMethod.GET)
    public Balloon findBalloon(@PathVariable Long id){
        return balloonService.getOne(id);
    }

    @RequestMapping(value = "/popBalloon/{id}", method = RequestMethod.PUT)
    public Balloon popBalloon(@PathVariable Long id, @RequestBody Arrow arrow){
        return balloonService.popBalloon(id, arrow);
    }
    
}
