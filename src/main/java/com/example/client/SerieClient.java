package com.example.client;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import com.example.client.dto.ResponseDTO;
import com.example.model.Serie;

public class SerieClient extends ClientApi<Serie> {

    public SerieClient() throws IOException {
    }

    public ResponseDTO<Serie> buscar(String nome) throws IOException, NoSuchAlgorithmException {
        Map<String, String> params = new HashMap<>();
        params.put("title", nome);

        return super.buscar(Collections.singletonList("series"), params);
    }
}
