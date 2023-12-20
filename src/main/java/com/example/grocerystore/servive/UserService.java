package com.example.grocerystore.servive;

import com.example.grocerystore.entity.GroceryItem;
import com.example.grocerystore.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<GroceryItem> getAllGroceryItems() {
        return userRepository.findAll();
    }

    public GroceryItem getGroceryItemsById(String id) {
        int groceryItemId = Integer.parseInt(id);
        GroceryItem groceryItem = userRepository.findById(groceryItemId).get();
        return groceryItem;
    }
}
