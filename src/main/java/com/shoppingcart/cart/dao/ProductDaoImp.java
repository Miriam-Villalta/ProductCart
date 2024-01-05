package com.shoppingcart.cart.dao;

import com.shoppingcart.cart.models.Product;
import jdk.jfr.TransitionTo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
//@Transitional
public class ProductDaoImp implements ProductDao{
    @Override
    public List<Product> getProducts() {
        return null;
    }
}
