package com.example.matchessimulator;

import com.google.gson.annotations.SerializedName;

public class place {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @SerializedName("nome")
    private  String name;
    @SerializedName("imagem")
    private  String image;
}
