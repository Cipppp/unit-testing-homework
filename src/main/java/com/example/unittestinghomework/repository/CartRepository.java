package com.example.unittestinghomework.repository;

import com.example.unittestinghomework.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart, Integer> {
}
