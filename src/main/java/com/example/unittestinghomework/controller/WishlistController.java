package com.example.unittestinghomework.controller;

import com.example.unittestinghomework.model.Wishlist;
import com.example.unittestinghomework.service.WishlistService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class  WishlistController {
    private final WishlistService wishlistService;

    @GetMapping("/wishlist")
    public List<Wishlist> getAllWishlists() { return wishlistService.getAllWishlists(); }

    @GetMapping("/wishlist/{id}")
    public Wishlist getWishlistById(@PathVariable Integer id) { return wishlistService.getWishlistById(id); }

    @PostMapping("/wishlist/add")
    public void addNewWishlist(@RequestBody Wishlist wishlist) { wishlistService.addWishlist(wishlist); }

    @DeleteMapping("/wishlist/delete/{id}")
    public void removeWishlist(@PathVariable Integer id) { wishlistService.deleteWishlist(id); }
}
