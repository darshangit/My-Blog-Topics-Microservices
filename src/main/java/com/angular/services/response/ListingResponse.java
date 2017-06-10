package com.angular.services.response;

import java.util.ArrayList;

/**
 * Created by Darsh on 6/10/2017.
 */
public class ListingResponse {
    private String title;
    private ArrayList<String> preDescription;
    private ArrayList<String> note;
    private ArrayList<String> mainDescription;
    private String imagePath;
    private ArrayList<String> code;
    private ArrayList<String> postDescription;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<String> getPreDescription() {
        return preDescription;
    }

    public void setPreDescription(ArrayList<String> preDescription) {
        this.preDescription = preDescription;
    }

    public ArrayList<String> getNote() {
        return note;
    }

    public void setNote(ArrayList<String> note) {
        this.note = note;
    }

    public ArrayList<String> getMainDescription() {
        return mainDescription;
    }

    public void setMainDescription(ArrayList<String> mainDescription) {
        this.mainDescription = mainDescription;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public ArrayList<String> getCode() {
        return code;
    }

    public void setCode(ArrayList<String> code) {
        this.code = code;
    }

    public ArrayList<String> getPostDescription() {
        return postDescription;
    }

    public void setPostDescription(ArrayList<String> postDescription) {
        this.postDescription = postDescription;
    }
}
