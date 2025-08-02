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

    @OneToMany
    @JoinColumn(name = "security", nullable = false)
    private Security security;

    protected Portfolio() {

    }

    public Portfolio(Security security) {
        this.security = security
    }

    public long getPortfolio_ID() {
        return portfolio_ID
    }
    public Security security() {
        return security
    }
}
