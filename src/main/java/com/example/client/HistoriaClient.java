package com.example.client;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import com.example.client.dto.ResponseDTO;
import com.example.model.Historia;

public class HistoriaClient extends ClientApi<Historia> {

    public HistoriaClient() throws IOException {
    }

    public ResponseDTO<Historia> buscar(String nome) throws IOException, NoSuchAlgorithmException {
        Map<String, String> params = new HashMap<>();
        params.put("title", nome);

        return super.buscar(Collections.singletonList("stories"), params);
    }
}
