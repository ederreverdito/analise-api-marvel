package com.example.model;

import com.example.client.dto.CollectionDTO;
import com.example.client.dto.ModelDTO;
import com.google.gson.annotations.SerializedName;

public class Serie extends ModelDTO {

    @SerializedName("title")
    private String titulo;

    @SerializedName("description")
    private String descricao;

    @SerializedName("startYear")
    private Integer anoComeco;

    @SerializedName("endYear")
    private Integer anoFim;

    @SerializedName("creators")
    private CollectionDTO<Criador> criadores;

    @SerializedName("characters")
    private CollectionDTO<Personagem> personagens;

    @SerializedName("stories")
    private CollectionDTO<Historia> historias;

    @SerializedName("comics")
    private CollectionDTO<Quadrinho> quadrinhos;

}
