package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Client {

    @Id                 //marks the Primary Key
    @GeneratedValue()   //randomly generates the key
    private long client_ID; 

    @OneToOne           //entity relationship
    @JoinColumn(name = "portfolio_id", nullable = false)
    private Portfolio portfolio_ID;

    @Column(nullable = false)
    private String client_firstName;

    @Column(nullable = false)
    private String client_lastName;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private String phone;

    @Column(nullable = false)
    private String email;

    @ManyToOne
    @JoinColumn(name = "advisor_id", nullable = false)
    private Advisor advisor;

    protected Client() {

    }

    public Client(String firstName, String lastName, String address, Portfolio portfolio_ID, Advisor advisor) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.portfolio = portfolio_ID;
        this.advsior = advisor;
    }

    public long getClientID() {
        return client_ID
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Portfolio getPortfolio_ID() {
        return portfolio_ID
    }

    public Advisor getAdvisor_ID() {
        return advisor
    }

}
