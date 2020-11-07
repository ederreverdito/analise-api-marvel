package com.example;


import com.fasterxml.jackson.databind.ObjectMapper;


import javax.swing.JOptionPane;

import com.example.client.*;
import com.example.client.dto.ResponseDTO;
import com.example.model.*;
import com.google.gson.Gson;

public class Main {

    public static void main(String[] args) {
    	
    	 
        try {

            
            String nomePesquisa = JOptionPane.showInputDialog("Digite o nome do personagem");
            
            
            
            ResponseDTO<Personagem> resposta = new PersonagemClient().buscar(nomePesquisa);
            
            //JOptionPane.showMessageDialog(null, new Gson().toJson(resposta.getData().getResults()));

         System.out.println(new Gson().toJson(resposta.getData().getResults()));

            
            

        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}
