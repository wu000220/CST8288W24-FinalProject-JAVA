/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 * JavaBean for food object.
 * @author fwu
 */
public abstract class Food {
    private String itemName;
    private int quantity;
    private boolean surplus;
    private String expireDate;
    private double price;
    private double discount;
    private boolean donate;
    private boolean sale;

    /**
     * @return the itemName
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * @param itemName the itemName to set
     */
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    /**
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * @return the expireDate
     */
    public String getExpireDate() {
        return expireDate;
    }

    /**
     * @param expireDate the expireDate to set
     */
    public void setExpireDate(String expireDate) {
        this.expireDate = expireDate;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @return the discount
     */
    public double getDiscount() {
        return discount;
    }

    /**
     * @param discount the discount to set
     */
    public void setDiscount(double discount) {
        this.discount = discount;
    }

    /**
     * @return the donate
     */
    public boolean isDonate() {
        return donate;
    }

    /**
     * @param donate the donate to set
     */
    public void setDonate(boolean donate) {
        this.donate = donate;
    }

    /**
     * @return the sale
     */
    public boolean isSale() {
        return sale;
    }

    /**
     * @param sale the sale to set
     */
    public void setSale(boolean sale) {
        this.sale = sale;
    }

    /**
     * @return the surplus
     */
    public boolean isSurplus() {
        return surplus;
    }

    /**
     * @param surplus the surplus to set
     */
    public void setSurplus(boolean surplus) {
        this.surplus = surplus;
    }
    
    
    
}
