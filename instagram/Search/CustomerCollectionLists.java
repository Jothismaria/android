package com.example.instagram.Search;



public class CustomerCollectionLists {

    private String title,itemcode, qty;

    public CustomerCollectionLists(String title, String itemcode, String qty) {
        this.title = title;
        this.itemcode = itemcode;
        this.qty = qty;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getItemcode() {
        return itemcode;
    }

    public void setItemcode(String itemcode) {
        this.itemcode = itemcode;
    }

    public String getQty() {
        return qty;
    }

    public void setQty(String qty) {
        this.qty = qty;
    }
}
