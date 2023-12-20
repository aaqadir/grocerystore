package com.example.grocerystore.controller;

import com.example.grocerystore.entity.GroceryItem;
import com.example.grocerystore.servive.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private AdminService adminService;

    @GetMapping("/listall")
    public ResponseEntity<List<GroceryItem>> adminViewAllGroceryItems(){
        List<GroceryItem> users = adminService.getAllGroceryItemsAdmim();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<GroceryItem> addGroceryItem(@RequestBody GroceryItem groceryItem){
        GroceryItem saveGroceryItem = adminService.addGroceryItem(groceryItem);
        return new ResponseEntity<>(saveGroceryItem, HttpStatus.CREATED);
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<GroceryItem> updateExistingGroceryItem(@RequestBody GroceryItem groceryItem,
    @PathVariable("id") Integer groceryItemId){
        GroceryItem updateGroceryItem = adminService.updateExistingGroceryItem(groceryItem, groceryItemId);
        return new ResponseEntity<>(updateGroceryItem, HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteGroceryItemById(@PathVariable("id") Integer groceryItemId){
        adminService.deleteGroceryItemById(groceryItemId);
        return new ResponseEntity<>("Deleted Successfully", HttpStatus.OK);
    }
}
