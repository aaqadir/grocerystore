package com.example.grocerystore.controller;

import com.example.grocerystore.entity.GroceryItem;
import com.example.grocerystore.servive.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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




    void removeGroceryItemUsingId(){

    }

    void updateGroceryItem(){

    }

    void manageInventory(){
        //mark expired item as unavailable
        //preorder item if available count is less than required count
    }
}
