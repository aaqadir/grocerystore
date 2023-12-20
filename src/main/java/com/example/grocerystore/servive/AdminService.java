package com.example.grocerystore.servive;

import com.example.grocerystore.entity.GroceryItem;
import com.example.grocerystore.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {

    @Autowired
    private AdminRepository adminRepository;

    public List<GroceryItem> getAllGroceryItemsAdmim() {
        List<GroceryItem> groceryItemList = adminRepository.findAll();
        return groceryItemList;
    }
}
