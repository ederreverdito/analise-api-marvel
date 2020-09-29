package com.example.model;

import com.example.client.dto.CollectionDTO;
import com.example.client.dto.ModelDTO;
import com.google.gson.annotations.SerializedName;

public class Quadrinho extends ModelDTO {

    @SerializedName("title")
    private String titulo;

    @SerializedName("description")
    private String descricao;

    @SerializedName("pageCount")
    private Long totalPagina;

    @SerializedName("characters")
    private CollectionDTO<Personagem> personagens;

    @SerializedName("stories")
    private CollectionDTO<Historia> historias;

    @SerializedName("series")
    private CollectionDTO<Serie> series;
}
