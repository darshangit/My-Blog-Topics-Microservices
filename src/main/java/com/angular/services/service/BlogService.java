package com.angular.services.service;

import com.angular.services.constants.TopicConstants;
import com.angular.services.dao.BlogsDao;
import com.angular.services.entity.BlogsEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Dash on 7/3/2017.
 */
@Service
public class BlogService {

    @Autowired
    private BlogsDao blogsDao;

    public List<BlogsEntity> getActiveBlogs(){
        return blogsDao.findByStatus(TopicConstants.ACTIVE_STATUS);
    }
}
