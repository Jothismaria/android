package com.example.instagram.model;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Videos{

    @SerializedName("standard_resolution")
    @Expose
    private StandardResolution__ standardResolution;
    @SerializedName("low_resolution")
    @Expose
    private LowResolution__ lowResolution;
    @SerializedName("low_bandwidth")
    @Expose
    private LowBandwidth lowBandwidth;

    /**
     * No args constructor for use in serialization
     *
     */
    public Videos() {
    }

    /**
     *
     * @param standardResolution
     * @param lowBandwidth
     * @param lowResolution
     */
    public Videos(StandardResolution__ standardResolution, LowResolution__ lowResolution, LowBandwidth lowBandwidth) {
        super();
        this.standardResolution = standardResolution;
        this.lowResolution = lowResolution;
        this.lowBandwidth = lowBandwidth;
    }

    public StandardResolution__ getStandardResolution() {
        return standardResolution;
    }

    public void setStandardResolution(StandardResolution__ standardResolution) {
        this.standardResolution = standardResolution;
    }

    public LowResolution__ getLowResolution() {
        return lowResolution;
    }

    public void setLowResolution(LowResolution__ lowResolution) {
        this.lowResolution = lowResolution;
    }

    public LowBandwidth getLowBandwidth() {
        return lowBandwidth;
    }

    public void setLowBandwidth(LowBandwidth lowBandwidth) {
        this.lowBandwidth = lowBandwidth;
    }

}