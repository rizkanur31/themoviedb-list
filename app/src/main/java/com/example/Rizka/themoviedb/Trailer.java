package com.example.Rizka.themoviedb;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Trailer {

    @SerializedName("key")
    @Expose
    private String key;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

  /*  public String getKeyThumb() {
        return "http://img.youtube.com/vi/"+key+"/0.jpg";
    }

    public void setKeyThumb(String key) {
        this.key = key;
    }*/

}
