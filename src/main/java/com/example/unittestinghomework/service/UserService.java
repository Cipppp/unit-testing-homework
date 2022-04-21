package com.example.unittestinghomework.service;

import com.example.unittestinghomework.model.Cart;
import com.example.unittestinghomework.model.User;
import com.example.unittestinghomework.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public User getUserById(Integer id) { return userRepository.getById(id); }

    public List<User> getAllUsers() { return userRepository.findAll(); }

    public void addUser(User user) { userRepository.save(user); }

    public void removeUser(User user) { userRepository.delete(user); }

    public void deleteUserById(Integer id) { userRepository.delete(getUserById(id)); }

    public void updateUser(User user) { userRepository.save(user); }


}
