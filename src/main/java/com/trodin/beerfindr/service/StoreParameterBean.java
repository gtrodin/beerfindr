package com.trodin.beerfindr.service;

import javax.ws.rs.QueryParam;

public class StoreParameterBean {
    @QueryParam("number")
    public String number;
    @QueryParam("type")
    public String type;
    @QueryParam("name")
    public String name;
    @QueryParam("streetAddress")
    public String streetAddress;
    @QueryParam("zip")
    public String zip;
    @QueryParam("city")
    public String city;
    @QueryParam("county")
    public String county;
    @QueryParam("searchWord")
    public String searchWord;
}
