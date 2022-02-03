package com.topline.hub;

import com.google.gson.annotations.SerializedName;

public class Appointments {

    @SerializedName("id") private int Id;
    @SerializedName("outlet") private String outlet;
    @SerializedName("outlet_id") private String outlet_id;
    @SerializedName("date") private String date;
    @SerializedName("day") private String day;
    @SerializedName("s_name") private String s_name;
    @SerializedName("startTime") private String startTime;
    @SerializedName("endTime") private String endTime;
    @SerializedName("status") private String status;
    @SerializedName("agenda") private String agenda;
    @SerializedName("role") private String role;
    @SerializedName("latitude") private String latitude;
    @SerializedName("longitude") private String longitude;
    @SerializedName("checkin") private String checkin;

    public int getId() {
        return Id;
    }

    public String getOutlet() {
        return outlet;
    }

    public String getS_name() {
        return s_name;
    }

    public String getOutlet_id() {
        return outlet_id;
    }

    public String getDate() {
        return date;
    }

    public String getDay() {
        return day;
    }

    public String getStartTime() {
        return startTime;
    }

    public String getEndTime() { return endTime; }

    public String getStatus() {
        return status;
    }

    public String getAgenda() {
        return agenda;
    }

    public String getRole() {
        return role;
    }

    public String getLatitude() {
        return latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public String getCheckin() {
        return checkin;
    }
}
