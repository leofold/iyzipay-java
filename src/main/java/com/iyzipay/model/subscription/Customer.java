package com.iyzipay.model.subscription;

import com.iyzipay.ToStringRequestBuilder;
import com.iyzipay.model.Address;

public class Customer {

    private String email;
    private String name;
    private String surname;
    private String identityNumber;
    private String gsmNumber;
    private Address billingAddress;
    private Address shippingAddress;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getIdentityNumber() {
        return identityNumber;
    }

    public void setIdentityNumber(String identityNumber) {
        this.identityNumber = identityNumber;
    }

    public String getGsmNumber() {
        return gsmNumber;
    }

    public void setGsmNumber(String gsmNumber) {
        this.gsmNumber = gsmNumber;
    }

    public Address getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }

    public Address getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    @Override
    public String toString() {
        return new ToStringRequestBuilder(this)
                .append("name", name)
                .append("surname", surname)
                .append("identityNumber", identityNumber)
                .append("email", email)
                .append("gsmNumber", gsmNumber)
                .append("billingAddress", billingAddress)
                .append("shippingAddress", shippingAddress)
                .toString();
    }
}