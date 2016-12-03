package com.utopia.jumpin.service;

import com.utopia.jumpin.model.Cloud;

import java.util.List;

/**
 * Created by fjoseph1313 on 11/28/2016.
 */
public interface ICloudService extends ICrudService<Cloud>{

    public Cloud create(Cloud cloud);

    public Cloud update(Long id, Cloud cloud);

    public Cloud delete(Cloud cloud);

    public List<Cloud> getAll();

    public Cloud getOne(Long id);

}
