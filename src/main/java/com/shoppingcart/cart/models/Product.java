package com.shoppingcart.cart.models;

import lombok.Getter;
import lombok.Setter;

public class Product {
    @Getter @Setter
    private Long id;
    @Getter @Setter
    private String productName;
    @Getter @Setter
    private String description;
    @Getter @Setter
    private double price;

}
