package com.angular.services.dao;

import com.angular.services.entity.SubTopicEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Darsh on 6/4/2017.
 */
@Repository
public interface SubTopicDao extends JpaRepository<SubTopicEntity,Integer> {

    List<SubTopicEntity> findBySubTopicsIdAndSubTopicStatusEquals(Integer subTopicsId,String subTopicStatus);
}
