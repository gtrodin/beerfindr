package com.trodin.beerfindr.persistence;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "BEERS")
public class Beer {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private int id;

    @Column
    private String name;

    @Column
    private int articleId;

    @Column
    private float price;

    @Column
    private String alcoholVolume;

    @Column
    private float volumeInMilliliter;

    @Temporal(TemporalType.DATE)
    @Column
    private Date dateOfFirstSale;

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
    private String year;

    public Beer() {
    }

    public Beer(String name, int articleId, float price, String alcoholVolume, float volumeInMilliliter, Date dateOfFirstSale, String style, String packaging, String sealing, String origin, String originCountry, String producer, String supplier, String year) {
        this.name = name;
        this.articleId = articleId;
        this.price = price;
        this.alcoholVolume = alcoholVolume;
        this.volumeInMilliliter = volumeInMilliliter;
        this.dateOfFirstSale = dateOfFirstSale;
        this.style = style;
        this.packaging = packaging;
        this.sealing = sealing;
        this.origin = origin;
        this.originCountry = originCountry;
        this.producer = producer;
        this.supplier = supplier;
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getArticleId() {
        return articleId;
    }

    public void setArticleId(int articleId) {
        this.articleId = articleId;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getAlcoholVolume() {
        return alcoholVolume;
    }

    public void setAlcoholVolume(String alcoholVolume) {
        this.alcoholVolume = alcoholVolume;
    }

    public float getVolumeInMilliliter() {
        return volumeInMilliliter;
    }

    public void setVolumeInMilliliter(float volumeInMilliliter) {
        this.volumeInMilliliter = volumeInMilliliter;
    }

    public Date getDateOfFirstSale() {
        return dateOfFirstSale;
    }

    public void setDateOfFirstSale(Date dateOfFirstSale) {
        this.dateOfFirstSale = dateOfFirstSale;
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

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

}
