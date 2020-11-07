package com.example.client.dto;

import java.time.LocalDateTime;

public class ResponseDTO<T> {


    private ResultsDTO<T> data;

    public ResultsDTO<T> getData() {
        return data;
    }

  
}