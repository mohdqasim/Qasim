package com.example.rupeshl.qasim;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.apache.commons.lang3.builder.ToStringBuilder;


public class DataDao {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("value")
    @Expose
    private Value value;
    @SerializedName("key")
    @Expose
    private String key;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("value", value).append("key", key).toString();
    }

}