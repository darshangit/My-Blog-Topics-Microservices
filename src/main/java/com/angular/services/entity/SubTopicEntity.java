package com.angular.services.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Darsh on 6/4/2017.
 */
@Entity
@Table(name = "SUB_TOPICS")
public class SubTopicEntity {

    private Integer subTopicsId;
    private String subTopicName;
    private String subTopicStatus;
    private Integer subTopicListingid;

    @Column(name="SUB_TOPIC_ID")
    public Integer getSubTopicsId() {
        return subTopicsId;
    }

    @Id
    @Column(name="SUB_TOPIC_NAME")
    public String getSubTopicName() {
        return subTopicName;
    }

    @Column(name="SUB_TOPIC_STATUS")
    public String getSubTopicStatus() {
        return subTopicStatus;
    }

    @Column(name="SUB_TOPIC_LISTING")
    public Integer getSubTopicListingid() {
        return subTopicListingid;
    }

    public void setSubTopicsId(Integer subTopicsId) {
        this.subTopicsId = subTopicsId;
    }

    public void setSubTopicName(String subTopicName) {
        this.subTopicName = subTopicName;
    }

    public void setSubTopicStatus(String subTopicStatus) {
        this.subTopicStatus = subTopicStatus;
    }

    public void setSubTopicListingid(Integer subTopicListingid) {
        this.subTopicListingid = subTopicListingid;
    }
}