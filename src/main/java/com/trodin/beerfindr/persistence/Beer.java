package com.trodin.beerfindr.persistence;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Beer {

    @Id
    @GeneratedValue
    private Integer id;

    @Column
    private Integer number;

    @Column
    private String name;

    @Column
    private Float price;

    @Column
    private Float alcoholPercentage;

    @Column
    private Float volume;

    @Temporal(TemporalType.DATE)
    @Column
    private Date dateOfIntroduction;

    @Column
    private String style;

    @Column
    private String packaging;

    @Column
    private String sealing;

    @Column
    private String origin;

    @Column
    private String originCountry;

    @Column
    private String producer;

    @Column
    private String supplier;

    @Column
    private Integer year;

    public Beer() {
    }

    public Beer(Integer number,
                String name,
                Float price,
                Float alcoholPercentage,
                Float volume,
                Date dateOfIntroduction,
                String style,
                String packaging,
                String sealing,
                String origin,
                String originCountry,
                String producer,
                String supplier,
                Integer year) {
        this.name = name;
        this.number = number;
        this.price = price;
        this.alcoholPercentage = alcoholPercentage;
        this.volume = volume;
        this.dateOfIntroduction = dateOfIntroduction;
        this.style = style;
        this.packaging = packaging;
        this.sealing = sealing;
        this.origin = origin;
        this.originCountry = originCountry;
        this.producer = producer;
        this.supplier = supplier;
        this.year = year;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer articleId) {
        this.number = articleId;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Float getAlcoholPercentage() {
        return alcoholPercentage;
    }

    public void setAlcoholPercentage(Float alcoholPercentage) {
        this.alcoholPercentage = alcoholPercentage;
    }

    public Float getVolume() {
        return volume;
    }

    public void setVolume(Float volumeInMilliliter) {
        this.volume = volumeInMilliliter;
    }

    public Date getDateOfIntroduction() {
        return dateOfIntroduction;
    }

    public void setDateOfIntroduction(Date dateOfFirstSale) {
        this.dateOfIntroduction = dateOfFirstSale;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getPackaging() {
        return packaging;
    }

    public void setPackaging(String packaging) {
        this.packaging = packaging;
    }

    public String getSealing() {
        return sealing;
    }

    public void setSealing(String sealing) {
        this.sealing = sealing;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getOriginCountry() {
        return originCountry;
    }

    public void setOriginCountry(String originCountry) {
        this.originCountry = originCountry;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }
}
