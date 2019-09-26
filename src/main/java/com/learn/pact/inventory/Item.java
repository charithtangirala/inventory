package com.learn.pact.inventory;

public class Item {
    private String id;
    private String name;
    private String quantity;
    private String backOrder;

    public Item(String id, String name, String quantity, String backOrder) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.backOrder = backOrder;
    }

    public Item() {}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getBackOrder() {
        return backOrder;
    }

    public void setBackOrder(String backOrder) {
        this.backOrder = backOrder;
    }
}
