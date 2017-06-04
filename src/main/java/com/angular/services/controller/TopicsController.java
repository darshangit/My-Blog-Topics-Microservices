package com.angular.services.controller;

import com.angular.services.response.TopicsResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Darsh on 6/4/2017.
 */
@RestController
public class TopicsController {

    @GetMapping("/api/subTopics/{subtopicId}")
    public List<TopicsResponse> getSubtopics(@PathVariable Integer subtopicId){
        return null;
    }

}
