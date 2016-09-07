package com.trodin.beerfindr.persistence;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Store {

    @Id
    @Column
    private String number;

    @Column
    private String type;

    @Column
    private String name;

    @Column
    private String streetAddress;

    @Column
    private String zip;

    @Column
    private String city;

    @Column
    private String county;

    @Column
    private String phoneNumber;

    @Column
    private String searchWord;

    @ElementCollection
    @Column
    private List<String> openHours = new ArrayList<String>();

    @Column
    private String rt90x;

    @Column
    private String rt90y;

    public Store() {
    }

    public Store(String number,
                 String type,
                 String name,
                 String streetAddress,
                 String zip,
                 String city,
                 String county,
                 String phoneNumber,
                 String searchWord,
                 List<String> openHours,
                 String rt90x,
                 String rt90y) {
        this.number = number;
        this.type = type;
        this.name = name;
        this.streetAddress = streetAddress;
        this.zip = zip;
        this.city = city;
        this.county = county;
        this.phoneNumber = phoneNumber;
        this.searchWord = searchWord;
        this.openHours = openHours;
        this.rt90x = rt90x;
        this.rt90y = rt90y;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String agentNumber) {
        this.number = agentNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAdress) {
        this.streetAddress = streetAdress;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getSearchWord() {
        return searchWord;
    }

    public void setSearchWord(String searchWord) {
        this.searchWord = searchWord;
    }

    public List<String> getOpenHours() {
        return openHours;
    }

    public void setOpenHours(List<String> openHours) {
        this.openHours = openHours;
    }

    public String getRt90x() {
        return rt90x;
    }

    public void setRt90x(String rt90x) {
        this.rt90x = rt90x;
    }

    public String getRt90y() {
        return rt90y;
    }

    public void setRt90y(String rt90y) {
        this.rt90y = rt90y;
    }

}
