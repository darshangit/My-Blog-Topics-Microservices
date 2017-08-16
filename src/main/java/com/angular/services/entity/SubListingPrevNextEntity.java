package com.angular.services.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Dash on 8/16/2017.
 */
@Entity
@Table(name="SUB_LISTINGS_PREV_NEXT")
public class SubListingPrevNextEntity {

    private Integer sub_listing_prev_next_id;
    private String prevName;
    private String privLink;
    private String nextName;
    private String nextLink;
    private String subListingName;

    @Id
    @Column(name="SUB_LISTING_PREV_NEXT_ID")
    public Integer getSub_listing_prev_next_id() {
        return sub_listing_prev_next_id;
    }

    @Column(name="PREV_NAME")
    public String getPrevName() {
        return prevName;
    }

    @Column(name="PREV_LINK")
    public String getPrivLink() {
        return privLink;
    }

    @Column(name="NEXT_NAME")
    public String getNextName() {
        return nextName;
    }

    @Column(name="NEXT_LINK")
    public String getNextLink() {
        return nextLink;
    }

    public void setSub_listing_prev_next_id(Integer sub_listing_prev_next_id) {
        this.sub_listing_prev_next_id = sub_listing_prev_next_id;
    }

    public void setPrevName(String prevName) {
        this.prevName = prevName;
    }

    public void setPrivLink(String privLink) {
        this.privLink = privLink;
    }

    public void setNextName(String nextName) {
        this.nextName = nextName;
    }

    public void setNextLink(String nextLink) {
        this.nextLink = nextLink;
    }
}
