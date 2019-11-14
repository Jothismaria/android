package com.example.instagram.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Likes {

    @SerializedName("count")
    @Expose
    private Integer count;

    /**
     * No args constructor for use in serialization
     *
     */
    public Likes() {
    }

    /**
     *
     * @param count
     */
    public Likes(Integer count) {
        super();
        this.count = count;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

}