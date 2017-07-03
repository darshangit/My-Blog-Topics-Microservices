package com.angular.services.dao;

import com.angular.services.entity.BlogsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Dash on 7/3/2017.
 */
@Repository
public interface BlogsDao extends JpaRepository<BlogsEntity,Long>{

    List<BlogsEntity> findByStatus(String status);
}
