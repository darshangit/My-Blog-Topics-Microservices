package com.angular.services.service;

import com.angular.services.constants.TopicConstants;
import com.angular.services.dao.MainTopicsDao;
import com.angular.services.dao.SubListingDao;
import com.angular.services.dao.SubTopicDao;
import com.angular.services.entity.MainTopicsEntity;
import com.angular.services.entity.SubListingEntity;
import com.angular.services.entity.SubTopicEntity;
import com.angular.services.response.ListingResponse;
import com.angular.services.response.MainTopicResponse;
import com.angular.services.response.TopicsResponse;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
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

    @Autowired
    MainTopicsDao mainTopicsDao;

    public List<MainTopicResponse> getAllActiveTopics(){
        List<MainTopicsEntity> mainTopicResponses =  mainTopicsDao.findByStatusEqualsOrderByOrderNumberAsc(TopicConstants.ACTIVE_STATUS);

        final List<MainTopicResponse> responseList = new ArrayList<>();

        mainTopicResponses.stream().forEach(mainTopicsEntity -> {
            final MainTopicResponse mainTopicResponse = new MainTopicResponse();
            mainTopicResponse.setName(mainTopicsEntity.getTopicName());
            mainTopicResponse.setStatus(mainTopicsEntity.getStatus());
            mainTopicResponse.setImgSrc(mainTopicsEntity.getImgSrc());
            mainTopicResponse.setUuid(mainTopicsEntity.getUUID());
            mainTopicResponse.setSubTopicId(mainTopicsEntity.getSubTopicId());
            responseList.add(mainTopicResponse);
        });
        return responseList;
    }

    public List<TopicsResponse> getSubTopicResponse(Integer subTopicId){

        List<SubTopicEntity> listOfSubTopics = subTopicDao.findBySubTopicsIdAndSubTopicStatusEqualsOrderByOrderNumberAsc(subTopicId, TopicConstants.ACTIVE_STATUS);

        List<TopicsResponse> responseList = listOfSubTopics.stream().map(subTopicEntity ->
                new TopicsResponse(subTopicEntity.getSubTopicName(),subListingDao.findBySubListingUUIDAndSubListingStatusEqualsOrderByOrderNumberAsc(subTopicEntity.getSubTopicListingid(),TopicConstants.ACTIVE_STATUS))
        ).collect(Collectors.toList());
        return responseList;
    }

    public List<ListingResponse> getListingsDetails(String jsonPath){
        ObjectMapper objectMapper = new ObjectMapper();
        List<ListingResponse> listingResponses = null;
        objectMapper.configure(JsonParser.Feature.AUTO_CLOSE_SOURCE, true);
        try {
             listingResponses = objectMapper.readValue(TopicService.class.getResourceAsStream(jsonPath),List.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listingResponses;
    }

    public List<SubListingEntity> getAllSubListings() {
        return subListingDao.findBySubListingStatusEqualsOrderByOrderNumberAsc(TopicConstants.ACTIVE_STATUS);
    }
}
