package com.utopia.jumpin.controller;

import com.utopia.jumpin.model.Jumper;
import com.utopia.jumpin.service.JumperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by fjoseph1313 on 11/28/2016.
 */
@RestController
public class JumperController {

    @Autowired
    private JumperService jumperService;

    @RequestMapping(value = "/jumper", method = RequestMethod.PUT)
    public Jumper createJumper(@RequestBody Jumper jumper){
        return jumper;
    }

    @RequestMapping(value = "/jumpers", method = RequestMethod.GET)
    public List<Jumper> getJumpers(){
        return jumperService.getAll();
    }
}
