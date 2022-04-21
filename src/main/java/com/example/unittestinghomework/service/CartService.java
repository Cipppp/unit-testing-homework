package com.example.unittestinghomework.service;

import com.example.unittestinghomework.model.Cart;
import com.example.unittestinghomework.repository.CartRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CartService {

    private final CartRepository cartRepository;

    public Cart getCartById(Integer id) { return cartRepository.getById(id); }

    public List<Cart> getAllCarts() { return cartRepository.findAll(); }

    public void addCart(Cart cart) { cartRepository.save(cart); }

    public void removeCart(Cart cart) {
        cartRepository.delete(cart);
    }

    public void deleteCartById(Integer id) { cartRepository.delete(getCartById(id)); }

    public void updateCart(Cart cart) { cartRepository.save(cart); }

    public Cart saveCart(Cart cart) { return cartRepository.save(cart); }
}
