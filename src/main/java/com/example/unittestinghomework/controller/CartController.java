package com.example.unittestinghomework.controller;

import com.example.unittestinghomework.model.Cart;
import com.example.unittestinghomework.service.CartService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
public class CartController {
    private final CartService cartService;

    @GetMapping("/carts")
    public List<Cart> getAllUserCarts() { return cartService.getAllCarts(); }

    @GetMapping("/carts/{id}")
    public Cart getCartById(@PathVariable Integer id) { return cartService.getCartById(id); }

    @DeleteMapping("/carts/delete/{id}")
    public void deleteCart(@PathVariable Integer id) { cartService.deleteCartById(id); }
}
