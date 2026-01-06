package com.sinan.hadisimvar.data.remote.model;

import com.google.gson.annotations.SerializedName;

public class Timings {
    @SerializedName("Fajr")
    public String fajr; // İmsak

    @SerializedName("Sunrise")
    public String sunrise; // Güneş

    @SerializedName("Dhuhr")
    public String dhuhr; // Öğle

    @SerializedName("Asr")
    public String asr; // İkindi

    @SerializedName("Sunset")
    public String sunset;

    @SerializedName("Maghrib")
    public String maghrib; // Akşam

    @SerializedName("Isha")
    public String isha; // Yatsı
}
