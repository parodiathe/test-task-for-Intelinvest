package ru.intelinvest.career.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import ru.intelinvest.career.response.GetBalanceResponse;

import java.math.BigDecimal;

@Service
@RequiredArgsConstructor
public class EthereumService {

    private final String ApiKey = "3JM4USGSUGM3K825132PYMVPH413FWBSJZ";

    public String getBalance(String address) {

        RestTemplate restTemplate = new RestTemplate();

        String url = "https://api.etherscan.io/api"
                + "?module=account"
                + "&action=balance"
                + "&address=" + address
                + "&tag=latest"
                + "&apikey=" + ApiKey;

        GetBalanceResponse response = restTemplate.getForObject(url, GetBalanceResponse.class);

        if (response != null ){
            BigDecimal balance = new BigDecimal(response.getResult());
            BigDecimal newBalance = balance.divide(BigDecimal.valueOf(1e18));
            return newBalance.toPlainString();
        }
        else {
            throw new RuntimeException("I cant see your balance, sorry");
        }

    }

}
