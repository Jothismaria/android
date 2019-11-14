
package com.example.instagram.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MediaRecent {

    @SerializedName("pagination")
    @Expose
    private Pagination pagination;
    @SerializedName("data")
    @Expose
    private List<Datum> data = null;

    //private Data data;
    @SerializedName("meta")
    @Expose
    private Meta meta;

    /**
     * No args constructor for use in serialization
     *
     */
    public MediaRecent() {
    }

    /**
     *
     * * @param pagination
     * @param data
     * @param meta
     */
    public MediaRecent(Pagination pagination, List<Datum> data, Meta meta) {
        super();
        this.pagination = pagination;
        this.data = data;
        this.meta = meta;
    }

    public Pagination getPagination() {
        return pagination;
    }
    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }
    public List<Datum> getData() {
        return data;
    }

    public void setData(List<Datum> data) {
        this.data = data;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

}
