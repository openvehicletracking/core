package com.openvehicletracking.core.alarm;


import com.google.gson.JsonObject;

import java.util.List;
import java.util.Objects;

/**
 * Created by oksuz on 01/06/2017.
 * Alarm model
 */
public class Alarm {

    private String deviceId;
    private String description;
    private List<AlarmAction> actionList;
    private long datetime;
    private JsonObject extraData;

    public Alarm(String deviceId, String description, List<AlarmAction> actionList, long datetime) {
        Objects.requireNonNull(deviceId);
        Objects.requireNonNull(description);
        Objects.requireNonNull(actionList);
        Objects.requireNonNull(datetime);

        this.deviceId = deviceId;
        this.description = description;
        this.actionList = actionList;
        this.datetime = datetime;
    }

    public Alarm(String deviceId, String description, List<AlarmAction> actionList, long datetime, JsonObject extraData) {
        this(deviceId, description, actionList, datetime);
        this.extraData = extraData;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public String getDescription() {
        return description;
    }

    public List<AlarmAction> getActions() {
        return actionList;
    }

    public long getDatetime() {
        return datetime;
    }

    public JsonObject getExtraData() {
        return extraData;
    }

    public void setExtraData(JsonObject extraData) {
        this.extraData = extraData;
    }

    @Override
    public String toString() {
        return "Alarm{" +
                "extraData=" + extraData +
                ", datetime=" + datetime +
                ", actionList=" + actionList +
                ", description='" + description + '\'' +
                ", deviceId='" + deviceId + '\'' +
                '}';
    }
}
