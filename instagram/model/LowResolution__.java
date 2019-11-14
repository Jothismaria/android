package com.example.instagram.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LowResolution__ {

    @SerializedName("width")
    @Expose
    private Integer width;
    @SerializedName("height")
    @Expose
    private Integer height;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("id")
    @Expose
    private String id;

    /**
     * No args constructor for use in serialization
     *
     */
    public LowResolution__() {
    }

    /**
     *
     * @param width
     * @param id
     * @param url
     * @param height
     */
    public LowResolution__(Integer width, Integer height, String url, String id) {
        super();
        this.width = width;
        this.height = height;
        this.url = url;
        this.id = id;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
