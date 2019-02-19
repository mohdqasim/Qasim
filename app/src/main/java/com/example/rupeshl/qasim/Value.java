package com.example.rupeshl.qasim;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.apache.commons.lang3.builder.ToStringBuilder;


public class Value {

    @SerializedName("_rev")
    @Expose
    private String rev;
    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("State_Details")
    @Expose
    private List<StateDetail> stateDetails = null;

    public String getRev() {
        return rev;
    }

    public void setRev(String rev) {
        this.rev = rev;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<StateDetail> getStateDetails() {
        return stateDetails;
    }

    public void setStateDetails(List<StateDetail> stateDetails) {
        this.stateDetails = stateDetails;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("rev", rev).append("id", id).append("type", type).append("stateDetails", stateDetails).toString();
    }

}