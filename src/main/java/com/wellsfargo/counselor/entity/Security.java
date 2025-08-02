package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Security {

    @Id
    @GeneratedValue()
    private long security_order_id;

    @ManyToOne
    @JoinColumn(name = "security", nullable = false)
    private Portfolio portfolio;

    @Column(nullable = false)
    private String security_name;

    @Column(nullable = false)
    private String security_category;

    @Column(nullable = false)
    private String security_purchasedate;
    
    @Column(nullable = false)
    private double security_purchaseprice;

    @Column(nullable = false)
    private double security_quantity;

    protected Security() {

    }

    public Security(Portfolio portfolio, String security_name, String security_category, String security_purchasedate, double security_purchaseprice, double security_quantity ) {
        this.portfolio = portfolio
        this.security_name = security_name
        this.security_category = security_category
        this.security_purchasedate = security_purchasedate
        this.security_purchaseprice = security_purchaseprice
        this.security_quantity = security_quantity
        
    }

    public long getPortfolio_ID() {
        return portfolio
    }
    public Security security() {
        return security_order_id
    }

    public long getSecurityName() {
        return security_name
    }

    public String getSecurityCategory() {
        return security_category;
    }

    public String getSecurityPurchaseDate(){
        return security_purchasedate
    }
    
    public double getSecurityPurchasePrice() {
        return security_purchaseprice
    }

    public double getSecurityQuantity() {
        return security_quantity
    }
}
