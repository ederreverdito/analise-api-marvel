package com.example.client.dto;

import java.util.List;

public class ResultsDTO<T> {

    private Integer total;
    private List<T> results;

    public List<T> getResults() {
        return results;
    }
}
