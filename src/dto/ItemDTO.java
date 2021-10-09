/*
 * ----------------------------------------------------------------------------------------
 * Copyright (c)  Thogakade. All rights reserved.
 * License under the  SriLanka.See License but in the project root for license information.
 * ----------------------------------------------------------------------------------------
 */

/**
 * @autor shiran sandaruwan <sadaruwanshiran101@gmail.com>
 * @since 10/09/2021
 */
package dto;

public class ItemDTO {
    private String itemId;
    private String name;
    private String qty;
    private double price;

    public Item() {
    }

    public Item(String itemId, String name, String qty, double price) {
        this.itemId = itemId;
        this.name = name;
        this.qty = qty;
        this.price = price;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQty() {
        return qty;
    }

    public void setQty(String qty) {
        this.qty = qty;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemId='" + itemId + '\'' +
                ", name='" + name + '\'' +
                ", qty='" + qty + '\'' +
                ", price=" + price +
                '}';
    }
}
