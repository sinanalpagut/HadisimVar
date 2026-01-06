package com.sinan.hadisimvar.data.remote.model;

import com.google.gson.annotations.SerializedName;

public class PrayerTimesResponse {
    @SerializedName("code")
    public int code;

    @SerializedName("status")
    public String status;

    @SerializedName("data")
    public PrayerData data;
}
