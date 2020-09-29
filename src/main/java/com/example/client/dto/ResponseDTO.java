package com.example.client.dto;

import java.time.LocalDateTime;

public class ResponseDTO<T> {

    private long tempoResposta;
    private LocalDateTime iniciado;
    private LocalDateTime finalizado;

    private String code;
    private String status;
    private ResultsDTO<T> data;

    public ResultsDTO<T> getData() {
        return data;
    }

    public long getTempoResposta() {
        return tempoResposta;
    }

    public void setTempoResposta(long tempoResposta) {
        this.tempoResposta = tempoResposta;
    }

    public LocalDateTime getIniciado() {
        return iniciado;
    }

    public void setIniciado(LocalDateTime iniciado) {
        this.iniciado = iniciado;
    }

    public LocalDateTime getFinalizado() {
        return finalizado;
    }

    public void setFinalizado(LocalDateTime finalizado) {
        this.finalizado = finalizado;
    }
}
