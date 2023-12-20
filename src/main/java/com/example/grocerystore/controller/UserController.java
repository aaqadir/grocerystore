package com.example.grocerystore.controller;

import com.example.grocerystore.entity.GroceryItem;
import com.example.grocerystore.repository.UserRepository;
import com.example.grocerystore.servive.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/listall")
    public ResponseEntity<List<GroceryItem>> viewAllGroceryItems(){
        List<GroceryItem> groceryItem = userService.getAllGroceryItems();
        return new ResponseEntity<>(groceryItem, HttpStatus.OK);
    }

    void bookMultipleItems(){

    }
}
