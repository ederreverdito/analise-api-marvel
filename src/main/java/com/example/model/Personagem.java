package com.example.model;

import com.example.client.dto.CollectionDTO;
import com.example.client.dto.ModelDTO;
import com.google.gson.annotations.SerializedName;

public class Personagem extends ModelDTO {

    private String id;

    @SerializedName("description")
    private String descricao;

    @SerializedName(value = "comics")
    private CollectionDTO<Quadrinho> quadrinhos;

    @SerializedName(value = "stories")
    private CollectionDTO<Historia> historias;

    @SerializedName(value = "series")
    private CollectionDTO<Serie> series;

    public String getId() {
        return id;
    }

    public String getNome() {
        return super.getName();
    }

    public String getDescricao() {
        return descricao;
    }

    public CollectionDTO<Quadrinho> getQuadrinhos() {
        return quadrinhos;
    }

    public CollectionDTO<Historia> getHistorias() {
        return historias;
    }

    public CollectionDTO<Serie> getSeries() {
        return series;
    }
}
