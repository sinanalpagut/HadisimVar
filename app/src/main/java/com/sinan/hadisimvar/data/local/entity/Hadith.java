package com.sinan.hadisimvar.data.local.entity;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.room.ColumnInfo;

@Entity(tableName = "hadiths")
public class Hadith {

    @PrimaryKey(autoGenerate = true)
    public int id;

    @ColumnInfo(name = "content")
    public String content;

    @ColumnInfo(name = "source")
    public String source;

    @ColumnInfo(name = "is_favorite")
    public boolean isFavorite;

    // Favoriye alınma tarihi (sıralama için)
    @ColumnInfo(name = "favorite_date")
    public Long favoriteDate;

    // Yeni Alanlar v2.0
    @ColumnInfo(name = "source_category")
    public String sourceCategory; // Örn: Kütüb-i Sitte, Buhari

    @ColumnInfo(name = "authenticity")
    public String authenticity; // Örn: Sahih, Hasen

    @ColumnInfo(name = "explanation")
    public String explanation; // Şerh

    @ColumnInfo(name = "topics")
    public String topics; // Virgülle ayrılmış etiketler

    @ColumnInfo(name = "user_note")
    public String userNote; // Kullanıcı notu

    public Hadith(String content, String source) {
        this.content = content;
        this.source = source;
        this.isFavorite = false;
        this.favoriteDate = null;
        // Yeni alanlar varsayılan null
        this.sourceCategory = "Genel";
        this.authenticity = "Belirtilmemiş";
        this.explanation = null;
        this.topics = null;
        this.userNote = null;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
        if (favorite) {
            this.favoriteDate = System.currentTimeMillis();
        } else {
            this.favoriteDate = null;
        }
    }
}
