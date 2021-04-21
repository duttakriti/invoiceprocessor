package com.example;

import org.springframework.data.annotation.Id;

public class Student {

    @Id
    private Integer invoicenum;
    private String seller;
    private String buyer;

    public Student() {
    }

    public Student(Integer invoicenum, String seller, String buyer) {
        this.invoicenum = invoicenum;
        this.seller = seller;
        this.buyer = buyer;
    }

    public Integer getRegNumber() {
        return invoicenum;
    }

    public void setRegNumber(Integer invoicenum) {
        this.invoicenum = invoicenum;
    }

    public String getFirstName() {
        return seller;
    }

    public void setFirstName(String seller) {
        this.seller = seller;
    }

    public String getLastName() {
        return buyer;
    }

    public void setLastName(String buyer) {
        this.buyer = buyer;
    }

}
