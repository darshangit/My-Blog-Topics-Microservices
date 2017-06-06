package com.angular.services.controller;

import com.angular.services.response.MainTopicResponse;
import com.angular.services.response.TopicsResponse;
import com.angular.services.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Darsh on 6/4/2017.
 */
@RestController
public class TopicsController {

    @Autowired
    TopicService topicService;

    @GetMapping("/topics/mainTopics")
    public List<MainTopicResponse> getAllTopics(){
        return topicService.getAllActiveTopics();
    }

    @GetMapping("/api/subTopics/{subtopicId}")
    public List<TopicsResponse> getSubtopics(@PathVariable Integer subtopicId){
        return topicService.getSubTopicResponse(subtopicId);
    }

}
