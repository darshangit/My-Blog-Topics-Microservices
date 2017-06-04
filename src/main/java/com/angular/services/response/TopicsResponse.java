package com.angular.services.response;

import com.angular.services.entity.SubListingEntity;

import java.util.List;

/**
 * Created by Darsh on 6/4/2017.
 */

public class TopicsResponse {

     private String subTopicName;
     private List<SubListingEntity> subListings;

    public String getSubTopicName() {
        return subTopicName;
    }

    public void setSubTopicName(String subTopicName) {
        this.subTopicName = subTopicName;
    }

    public List<SubListingEntity> getSubListings() {
        return subListings;
    }

    public void setSubListings(List<SubListingEntity> subListings) {
        this.subListings = subListings;
    }
}
