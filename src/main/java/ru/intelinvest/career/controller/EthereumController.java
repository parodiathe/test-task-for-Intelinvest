package ru.intelinvest.career.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.intelinvest.career.service.EthereumService;

@RestController
@RequiredArgsConstructor
public class EthereumController {
    private EthereumService ethereumService;

    @Autowired
    public EthereumController(EthereumService ethereumService) {
        this.ethereumService = ethereumService;
    }

    @GetMapping("/balance")
    public String getEthereumBalance(@RequestParam String address) {
        return ethereumService.getBalance(address);
    }


}
