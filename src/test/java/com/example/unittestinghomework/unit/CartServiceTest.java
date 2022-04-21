package com.example.unittestinghomework.unit;

import com.example.unittestinghomework.model.Cart;
import com.example.unittestinghomework.model.Product;
import com.example.unittestinghomework.service.CartService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class CartServiceTest {

    @Autowired
    private CartService cartService;

    @Test
    public void checkOrder_thenReturnSomething() {
        Cart cart = new Cart();
        cart.setId(1);
        cart.setPrice(100);
        cart.setNumberOfProducts(20);
        List<Product> productList = new ArrayList<Product>();
        productList.add(new Product("milk", 4, 100));
        cart.setProductsList(productList);
        Assertions.assertNotNull(cart.getProductsList() );
    }
}
