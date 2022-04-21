package com.example.unittestinghomework.repository;

import com.example.unittestinghomework.model.Wishlist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WishlistRepository extends JpaRepository<Wishlist, Integer> {
}
