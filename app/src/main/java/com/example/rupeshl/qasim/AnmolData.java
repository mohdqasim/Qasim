package com.example.rupeshl.qasim;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class AnmolData {
    @SerializedName("data")
    @Expose
    private List<RecordItem> data = null;
    @SerializedName("count")
    @Expose
    private Integer count;

    public List<RecordItem> getData() {
        return data;
    }

    public void setData(List<RecordItem> data) {
        this.data = data;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

}
