package com.example.instagram.model;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Images {

    @SerializedName("thumbnail")
    @Expose
    private Thumbnail thumbnail;
    @SerializedName("low_resolution")
    @Expose
    private LowResolution lowResolution;
    @SerializedName("standard_resolution")
    @Expose
    private StandardResolution standardResolution;

    /**
     * No args constructor for use in serialization
     *
     */
    public Images() {
    }

    /**
     *
     * @param thumbnail
     * @param standardResolution
     * @param lowResolution
     */
    public Images(Thumbnail thumbnail, LowResolution lowResolution, StandardResolution standardResolution) {
        super();
        this.thumbnail = thumbnail;
        this.lowResolution = lowResolution;
        this.standardResolution = standardResolution;
    }

    public Thumbnail getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(Thumbnail thumbnail) {
        this.thumbnail = thumbnail;
    }

    public LowResolution getLowResolution() {
        return lowResolution;
    }

    public void setLowResolution(LowResolution lowResolution) {
        this.lowResolution = lowResolution;
    }

    public StandardResolution getStandardResolution() {
        return standardResolution;
    }

    public void setStandardResolution(StandardResolution standardResolution) {
        this.standardResolution = standardResolution;
    }

}
