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

package ru.intelinvest.career.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Date;

@Data
public class Stock {

    @JsonProperty("SECID")
    private String secId;

    @JsonProperty("BOARDID")
    private String boardId;

    @JsonProperty("SHORTNAME")
    private String shortName;

    @JsonProperty("PREVPRICE")
    private double prevPrice;

    @JsonProperty("LOTSIZE")
    private double lotSize;

    @JsonProperty("FACEVALUE")
    private double faceValue;

    @JsonProperty("STATUS")
    private String status;

    @JsonProperty("BOARDNAME")
    private String boardName;

    @JsonProperty("DECIMALS")
    private Integer decimals;

    @JsonProperty("SECNAME")
    private String secName;

    @JsonProperty("REMARKS")
    private String remarks;

    @JsonProperty("MARKETCODE")
    private String marketCode;

    @JsonProperty("INSTRID")
    private String instrId;

    @JsonProperty("SECTORID")
    private Long sectorId;

    @JsonProperty("MINSTEP")
    private double minStep;

    @JsonProperty("PREVWAPRICE")
    private double prevWaPrice;

    @JsonProperty("FACEUNIT")
    private String faceUnit;

    @JsonProperty("PREVDATE")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date prevDate;

    @JsonProperty("ISSUESIZE")
    private Long issueSize;

    @JsonProperty("ISIN")
    private String isin;

    @JsonProperty("LATNAME")
    private String latName;

    @JsonProperty("REGNUMBER")
    private String regNumber;

    @JsonProperty("PREVLEGALCLOSEPRICE")
    private double prevLegalClosePrice;

    @JsonProperty("CURRENCYID")
    private String currencyId;

    @JsonProperty("SECTYPE")
    private String secType;

    @JsonProperty("LISTLEVEL")
    private Integer listLevel;

    @JsonProperty("SETTLEDATE")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date settleDate;
}