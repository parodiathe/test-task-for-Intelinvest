package ru.intelinvest.career.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import ru.intelinvest.career.models.Stock;

import java.util.List;

@Data
@AllArgsConstructor
public class StockPageResponse {

    private int page;

    private int size;

    private List<Stock> stocks;

}