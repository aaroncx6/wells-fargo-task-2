package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue()
    private long portfolio_ID;

    @ManyToOne
    private Client client;

    @Column(nullable = false)
    private String creationDate

    protected Portfolio() {

    }

    public Portfolio(Client, client, String creationDate) {
        this.client = client;
        this.creationDate = creationDate;
    }

    public long getPortfolio_ID() {
        return portfolio_ID
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    
    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

}
