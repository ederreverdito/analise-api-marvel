package com.example.model;

import com.example.client.dto.CollectionDTO;
import com.example.client.dto.ModelDTO;
import com.google.gson.annotations.SerializedName;

public class Criador extends ModelDTO {

    @SerializedName("fullName")
    private String nome;

    @SerializedName("comics")
    private CollectionDTO<Quadrinho> quadrinhos;

    @SerializedName("series")
    private CollectionDTO<Serie> series;

    @SerializedName("stories")
    private CollectionDTO<Historia> historias;
}
