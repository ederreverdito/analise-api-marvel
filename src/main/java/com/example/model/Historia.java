package com.example.model;

import java.util.List;

import com.example.client.dto.ModelDTO;
import com.google.gson.annotations.SerializedName;

public class Historia extends ModelDTO {

    @SerializedName("title")
    private String titulo;

    @SerializedName("description")
    private String descricao;

    @SerializedName("creators")
    private List<Criador> criadores;

    @SerializedName("characters")
    private List<Personagem> personagens;

    @SerializedName("series")
    private List<Serie> series;

    @SerializedName("comics")
    private List<Quadrinho> quadrinhos;

}
