
package com.example.rupeshl.qasim;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.apache.commons.lang3.builder.ToStringBuilder;


public class StateDetail {

    @SerializedName("state_name")
    @Expose
    private String stateName;
    @SerializedName("state_id")
    @Expose
    private Integer stateId;
    @SerializedName("state_code")
    @Expose
    private String stateCode;

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public Integer getStateId() {
        return stateId;
    }

    public void setStateId(Integer stateId) {
        this.stateId = stateId;
    }

    public String getStateCode() {
        return stateCode;
    }

    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("stateName", stateName).append("stateId", stateId).append("stateCode", stateCode).toString();
    }

}