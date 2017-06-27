package com.angular.services.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Dash on 6/26/2017.
 */
@Entity
@Table(name="CAROUSAL")
public class CarousalEntity {

    private String carousalName;
    private String carousalLink;
    private Integer orderNumber;
    private String carousalType;
    private String carousalImage;
    private String carousalDescription;
    private String carousalStatus;

    @Id
    @Column(name="CAROUSAL_NAME")
    public String getCarousalName() {
        return carousalName;
    }

    @Column(name="CAROUSAL_LINK")
    public String getCarousalLink() {
        return carousalLink;
    }

    @Column(name="ORDER_NUMBER")
    public Integer getOrderNumber() {
        return orderNumber;
    }

    @Column(name="CAROUSAL_TYPE")
    public String getCarousalType() {
        return carousalType;
    }

    @Column(name="CAROUSAL_IMAGE")
    public String getCarousalImage() {
        return carousalImage;
    }

    @Column(name="CAROUSAL_DESCRIPTION")
    public String getCarousalDescription() {
        return carousalDescription;
    }

    @Column(name="CAROUSAL_STATUS")
    public String getCarousalStatus() {
        return carousalStatus;
    }

    public void setCarousalName(String carousalName) {
        this.carousalName = carousalName;
    }

    public void setCarousalLink(String carousalLink) {
        this.carousalLink = carousalLink;
    }

    public void setOrderNumber(Integer orderNumber) {
        this.orderNumber = orderNumber;
    }

    public void setCarousalType(String carousalType) {
        this.carousalType = carousalType;
    }

    public void setCarousalImage(String carousalImage) {
        this.carousalImage = carousalImage;
    }

    public void setCarousalDescription(String carousalDescription) {
        this.carousalDescription = carousalDescription;
    }

    public void setCarousalStatus(String carousalStatus) {
        this.carousalStatus = carousalStatus;
    }
}
