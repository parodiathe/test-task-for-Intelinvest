/*
 * STRICTLY CONFIDENTIAL
 * TRADE SECRET
 * PROPRIETARY:
 *       "Intelinvest" Ltd, TIN 1655386205
 *       420107, REPUBLIC OF TATARSTAN, KAZAN CITY, SPARTAKOVSKAYA STREET, HOUSE 2, ROOM 119
 * (c) "Intelinvest" Ltd, 2019
 *
 * СТРОГО КОНФИДЕНЦИАЛЬНО
 * КОММЕРЧЕСКАЯ ТАЙНА
 * СОБСТВЕННИК:
 *       ООО "Интеллектуальные инвестиции", ИНН 1655386205
 *       420107, РЕСПУБЛИКА ТАТАРСТАН, ГОРОД КАЗАНЬ, УЛИЦА СПАРТАКОВСКАЯ, ДОМ 2, ПОМЕЩЕНИЕ 119
 * (c) ООО "Интеллектуальные инвестиции", 2019
 */

package ru.intelinvest.career.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.intelinvest.career.models.Stock;
import ru.intelinvest.career.models.StockFilter;
import ru.intelinvest.career.response.StockPageResponse;
import ru.intelinvest.career.service.MoexService;

import java.util.ArrayList;
import java.util.stream.Collectors;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/moex")
public class MoexEndpoint {

    private final MoexService moexService;

    @PostMapping("stocks")
    public ResponseEntity<StockPageResponse> processIntegration(@RequestBody StockFilter stockFilter,
                                                                @RequestParam(value = "page", defaultValue = "0") int page,
                                                                @RequestParam(value = "size", defaultValue = "10") int size) throws Exception
    {
        var stocks = moexService.getStocks();

        List<Stock> filteredStocks = stocks.stream()
                .filter(stock -> stockFilter.getListLevel() == null || stockFilter.getListLevel().contains(stock.getListLevel()))
                .filter(stock -> stockFilter.getSecId() == null || stockFilter.getSecId().contains(stock.getSecId()))
                .filter(stock -> stockFilter.getLotSize() == null || stockFilter.getLotSize().equals(stock.getLotSize()))
                .toList();


        List<Stock> paginated = filteredStocks.stream()
                .skip(page * size)
                .limit(size)
                .collect(Collectors.toList());

        StockPageResponse response = new StockPageResponse(page, size, paginated);

        return ResponseEntity.ok(response);
    }
}
