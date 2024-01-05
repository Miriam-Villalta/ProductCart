package com.shoppingcart.cart.controllers;

import com.shoppingcart.cart.models.Product;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CartController {
    public static List<Product> cart = new ArrayList<>();
    @RequestMapping(value = "product/{id}")
    public Product getProduct(@PathVariable Long id){
        Product product = new Product();
        product.setId(id);
        product.setProductName("lace");
        product.setDescription("ornament for hair");
        product.setPrice(10.00);

        product.getId();
        product.getProductName();
        product.getDescription();
        product.getPrice();

        return product;
    }

    @RequestMapping(value = "products")
    public List<Product> getProducts(){
        List<Product> products = new ArrayList<>();

        Product product = new Product();
        product.setId(01l);
        product.setProductName("lace");
        product.setDescription("ornament for hair");
        product.setPrice(10.00);

        Product product2 = new Product();
        product.setId(02l);
        product.setProductName("necklace");
        product.setDescription("ornament");
        product.setPrice(13.00);

        Product product3 = new Product();
        product.setId(03l);
        product.setProductName("earrings");
        product.setDescription("ornament for ears");
        product.setPrice(12.00);

        products.add(product);
        products.add(product2);
        products.add(product3);

        return products;
    }

    @RequestMapping(value = "product3")
    public static void addProduct(Product product){
        //add the product to the end of the cart
        cart.add(cart.size(), product);
    }

    @RequestMapping(value = "product2")
    public static  void removeProduct(Product product){
        cart.remove(product);
    }

    @RequestMapping(value = "product")
    public static void viewCart(){
        //View stream
        for(Product prod : cart){
            System.out.println("Element in the cart " + prod);
        }
    }

    @RequestMapping(value = "product")
    public static double totalPrice(){
        //take all prices in cart and return sum
        int totalPrice = 0;
        for(Product product : cart){
            totalPrice += product.getPrice();
        }
        return totalPrice;
    }
}
