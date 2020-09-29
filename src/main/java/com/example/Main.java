package com.example;

import java.time.format.DateTimeFormatter;

import com.example.client.*;
import com.example.client.dto.ResponseDTO;
import com.example.model.*;
import com.google.gson.Gson;

public class Main {

    public static void main(String[] args) {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss.SSS");
            long tempoTotal = 0;

            int totalRequisicoes = 5;
            String nomePesquisa = "hulk";

            for (int i = 0; i < totalRequisicoes; i++) {
                ResponseDTO<Personagem> resposta = new PersonagemClient().buscar(nomePesquisa);
//                ResponseDTO<Criador> resposta = new CriadorClient().buscar(nomePesquisa);
//                ResponseDTO<Historia> resposta = new HistoriaClient().buscar(nomePesquisa);
//                ResponseDTO<Quadrinho> resposta = new QuadrinhoClient().buscar(nomePesquisa);
//                ResponseDTO<Serie> resposta = new SerieClient().buscar(nomePesquisa);

                System.out.println("-------------------------------------");
                System.out.println("DADOS DA RESPOSTA:: ");
                System.out.println(new Gson().toJson(resposta.getData().getResults()));
                System.out.println("REQUISIÇÃO INICIADA EM:: " + resposta.getIniciado().format(formatter));
                System.out.println("REQUISIÇÃO FINALIZADA EM:: " + resposta.getFinalizado().format(formatter));
                System.out.println("TEMPO DE RESPOSTA:: ");
                System.out.println(new Gson().toJson(resposta.getTempoResposta()) + "ms");
                System.out.println("-------------------------------------");
                tempoTotal += resposta.getTempoResposta();
            }

            System.out.println("-------------------------------------");
            System.out.println("TEMPO TOTAL DAS " + totalRequisicoes + " REQUISIÇÕES:: ");
            System.out.println(tempoTotal + "ms");

            System.out.println("TEMPO MÉDIO DE RESPOSTA:: ");
            System.out.println(tempoTotal / totalRequisicoes + "ms");
            System.out.println("-------------------------------------");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}
