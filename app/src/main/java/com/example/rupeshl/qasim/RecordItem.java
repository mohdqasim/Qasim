package com.example.rupeshl.qasim;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RecordItem {

    @SerializedName("record")
    @Expose
    private String record;

    public String getRecord() {
        return record;
    }

    public void setRecord(String record) {
        this.record = record;
    }
}
