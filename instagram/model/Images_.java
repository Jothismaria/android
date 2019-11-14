package com.example.instagram.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Images_ {

    @SerializedName("thumbnail")
    @Expose
    private Thumbnail_ thumbnail;
    @SerializedName("low_resolution")
    @Expose
    private LowResolution_ lowResolution;
    @SerializedName("standard_resolution")
    @Expose
    private StandardResolution_ standardResolution;

    /**
     * No args constructor for use in serialization
     *
     */
    public Images_() {
    }

    /**
     *
     * @param thumbnail
     * @param standardResolution
     * @param lowResolution
     */
    public Images_(Thumbnail_ thumbnail, LowResolution_ lowResolution, StandardResolution_ standardResolution) {
        super();
        this.thumbnail = thumbnail;
        this.lowResolution = lowResolution;
        this.standardResolution = standardResolution;
    }

    public Thumbnail_ getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(Thumbnail_ thumbnail) {
        this.thumbnail = thumbnail;
    }

    public LowResolution_ getLowResolution() {
        return lowResolution;
    }

    public void setLowResolution(LowResolution_ lowResolution) {
        this.lowResolution = lowResolution;
    }

    public StandardResolution_ getStandardResolution() {
        return standardResolution;
    }

    public void setStandardResolution(StandardResolution_ standardResolution) {
        this.standardResolution = standardResolution;
    }

}
