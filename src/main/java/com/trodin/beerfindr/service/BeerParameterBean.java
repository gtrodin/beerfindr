package com.trodin.beerfindr.service;

import javax.ws.rs.QueryParam;

public class BeerParameterBean {
    @QueryParam("name")
    public String name;
    @QueryParam("number")
    public Integer number;
    @QueryParam("minPrice")
    public Float minPrice;
    @QueryParam("maxPrice")
    public Float maxPrice;
    @QueryParam("minAlcoholPercentage")
    public Float minAlcoholPercentage;
    @QueryParam("maxAlcoholPercentage")
    public Float maxAlcoholPercentage;
    @QueryParam("minVolume")
    public Float minVolume;
    @QueryParam("maxVolume")
    public Float maxVolume;
    @QueryParam("minDateOfIntroduction")
    public String minDateOfIntroduction;
    @QueryParam("maxDateOfIntroduction")
    public String maxDateOfIntroduction;
    @QueryParam("style")
    public String style;
    @QueryParam("packaging")
    public String packaging;
    @QueryParam("sealing")
    public String sealing;
    @QueryParam("origin")
    public String origin;
    @QueryParam("originCountry")
    public String originCountry;
    @QueryParam("producer")
    public String producer;
    @QueryParam("supplier")
    public String supplier;
    @QueryParam("year")
    public Integer year;
}
