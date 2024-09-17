package ru.intelinvest.career.models;

import lombok.Data;

import java.util.List;
import java.util.List;

@Data
public class StockFilter {

    private List<Integer> listLevel;

    private List<String> secId;

    private Double lotSize;
}
