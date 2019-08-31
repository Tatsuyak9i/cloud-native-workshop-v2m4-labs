package com.redhat.cloudnative.model;

public class Order {
// {"key": "12321","total": "232.23", "creditCard": {"number": "4232454678667866","expiration": "04/22","nameOnCard": "Jane G Doe"}, "billingAddress": "123 Anystreet, Pueblo, CO 32213", "name": "Jane Doe"}

    String key = null;
    String total = null;
    CreditCard card = null;
    String billingAddress = null;
    String name = null;

    public Order(String key, String total, CreditCard card, String billingAddress, String name) {
        this.key = key;
        this.total = total;
        this.card = card;
        this.billingAddress = billingAddress;
        this.name = name;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public CreditCard getCard() {
        return card;
    }

    public void setCard(CreditCard card) {
        this.card = card;
    }

    public String getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(String billingAddress) {
        this.billingAddress = billingAddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
