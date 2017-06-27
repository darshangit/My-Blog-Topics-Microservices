package com.angular.services.dao;

import com.angular.services.entity.CarousalEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Dash on 6/26/2017.
 */
@Repository
public interface CarousalDao extends JpaRepository<CarousalEntity,Long> {

    List<CarousalEntity> findByCarousalStatusOrderByOrderNumberAsc(String carousalStatus);

}
