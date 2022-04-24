package com.gokhan.facebook;

import java.io.Serializable;

public class Posts implements Serializable {
    private int post_id;
    private String post_name;
    private String post_profile_image;
    private String post_text;
    private String post_detail;
    private String post_image;
    private String post_like;

    public Posts(int post_id, String post_name, String post_profile_image, String post_text, String post_detail, String post_image, String post_like) {
        this.post_id = post_id;
        this.post_name = post_name;
        this.post_profile_image = post_profile_image;
        this.post_text = post_text;
        this.post_detail = post_detail;
        this.post_image = post_image;
        this.post_like = post_like;
    }

    public Posts() {
    }

    public int getPost_id() {
        return post_id;
    }

    public void setPost_id(int post_id) {
        this.post_id = post_id;
    }

    public String getPost_name() {
        return post_name;
    }

    public void setPost_name(String post_name) {
        this.post_name = post_name;
    }

    public String getPost_profile_image() {
        return post_profile_image;
    }

    public void setPost_profile_image(String post_profile_image) {
        this.post_profile_image = post_profile_image;
    }

    public String getPost_text() {
        return post_text;
    }

    public void setPost_text(String post_text) {
        this.post_text = post_text;
    }

    public String getPost_detail() {
        return post_detail;
    }

    public void setPost_detail(String post_detail) {
        this.post_detail = post_detail;
    }

    public String getPost_image() {
        return post_image;
    }

    public void setPost_image(String post_image) {
        this.post_image = post_image;
    }

    public String getPost_like() {
        return post_like;
    }

    public void setPost_like(String post_like) {
        this.post_like = post_like;
    }
}
