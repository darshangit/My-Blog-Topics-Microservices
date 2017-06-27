package com.angular.services.service;

import com.angular.services.constants.TopicConstants;
import com.angular.services.dao.CarousalDao;
import com.angular.services.entity.CarousalEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Dash on 6/26/2017.
 */
@Service
public class CarousalService {

    @Autowired
    private CarousalDao carousalDao;

    public List<CarousalEntity> getAllActiveACarousals(){
        return carousalDao.findByCarousalStatusOrderByOrderNumberAsc(TopicConstants.ACTIVE_STATUS);
    }
}
