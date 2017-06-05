package com.angular.services.service;

import com.angular.services.constants.TopicConstants;
import com.angular.services.dao.SubListingDao;
import com.angular.services.dao.SubTopicDao;
import com.angular.services.entity.SubTopicEntity;
import com.angular.services.response.TopicsResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Darsh on 6/4/2017.
 */
@Service
public class TopicService {

    @Autowired
    SubListingDao subListingDao;

    @Autowired
    SubTopicDao subTopicDao;

    public List<TopicsResponse> getSubTopicResponse(Integer subTopicId){

        List<SubTopicEntity> listOfSubTopics = subTopicDao.findBySubTopicsIdAndSubTopicStatusEquals(subTopicId, TopicConstants.ACTIVE_STATUS);

        List<TopicsResponse> responseList = listOfSubTopics.stream().map(subTopicEntity ->
                new TopicsResponse(subTopicEntity.getSubTopicName(),subListingDao.findBySubListingUUIDAndSubListingStatusEquals(subTopicEntity.getSubTopicListingid(),TopicConstants.ACTIVE_STATUS))
        ).collect(Collectors.toList());
        return responseList;
    }
}
