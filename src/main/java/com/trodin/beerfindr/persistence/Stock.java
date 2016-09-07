package com.trodin.beerfindr.persistence;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

@Entity
public class Stock {

    @Id
    @Column
    private String storeNumber;

    @ElementCollection
    @Column
    private List<String> articles;

    public Stock() {
    }

    public Stock(String storeNumber, List<String> articles) {
        this.storeNumber = storeNumber;
        this.articles = articles;
    }

    public String getStoreNumber() {
        return storeNumber;
    }

    public void setStoreNumber(String storeNumber) {
        this.storeNumber = storeNumber;
    }

    public List<String> getArticles() {
        return articles;
    }

    public void setArticles(List<String> articles) {
        this.articles = articles;
    }
}
