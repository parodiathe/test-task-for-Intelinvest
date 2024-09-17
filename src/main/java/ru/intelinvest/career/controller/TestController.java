package ru.intelinvest.career.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.intelinvest.career.models.Stock;
import ru.intelinvest.career.service.MoexService;

import java.util.List;

@RestController
@RequestMapping("/stocks")
public class TestController {

    private final MoexService moexService;

    @Autowired
    public TestController(MoexService moexService) {
        this.moexService = moexService;
    }

    @GetMapping
    public List<Stock> getStocks() throws Exception {
        return moexService.getStocks();
    }
}