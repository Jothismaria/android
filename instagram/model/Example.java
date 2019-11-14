package com.example.instagram.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Example {
    @SerializedName("data")
    private List<Data> dataList;

    public List<Data> getDataList() {
        return dataList;
    }

    public void setDataList(List<Data> dataList) {
        this.dataList = dataList;
    }
}
