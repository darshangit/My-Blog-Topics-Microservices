package com.angular.services.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

/**
 * Created by Dash on 7/3/2017.
 */
@Entity
@Table(name="BLOGS")
public class BlogsEntity {

    private String blogName;
    private String blogLink;
    private String status;
    private Timestamp createTimeStamp;

    @Id
    @Column(name="BLOG_NAME")
    public String getBlogName() {
        return blogName;
    }

    @Column(name="BLOG_LINK")
    public String getBlogLink() {
        return blogLink;
    }

    @Column(name="BLOG_STATUS")
    public String getStatus() {
        return status;
    }

    @Column(name="CREATE_TIMESTAMP")
    public Timestamp getCreateTimeStamp() {
        return createTimeStamp;
    }

    public void setBlogName(String blogName) {
        this.blogName = blogName;
    }

    public void setBlogLink(String blogLink) {
        this.blogLink = blogLink;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setCreateTimeStamp(Timestamp createTimeStamp) {
        this.createTimeStamp = createTimeStamp;
    }
}
