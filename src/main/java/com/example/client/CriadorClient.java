package com.example.client;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import com.example.client.dto.ResponseDTO;
import com.example.model.Criador;

public class CriadorClient extends ClientApi<Criador> {

    public CriadorClient() throws IOException {
    }

    public ResponseDTO<Criador> buscar(String nome) throws IOException, NoSuchAlgorithmException {
        Map<String, String> params = new HashMap<>();
        params.put("firstName", nome);

        return super.buscar(Collections.singletonList("creators"), params);
    }
}
