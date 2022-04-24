package com.gokhan.facebook;

import java.io.Serializable;

public class Hikaye implements Serializable {
    private int id;
    private String isim;
    private String profilePhoto;
    private String storyPhoto;

    public Hikaye() {
    }

    public Hikaye(int id, String isim, String profilePhoto, String storyPhoto) {
        this.id = id;
        this.isim = isim;
        this.profilePhoto = profilePhoto;
        this.storyPhoto = storyPhoto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getProfilePhoto() {
        return profilePhoto;
    }

    public void setProfilePhoto(String profilePhoto) {
        this.profilePhoto = profilePhoto;
    }

    public String getStoryPhoto() {
        return storyPhoto;
    }

    public void setStoryPhoto(String storyPhoto) {
        this.storyPhoto = storyPhoto;
    }
}
