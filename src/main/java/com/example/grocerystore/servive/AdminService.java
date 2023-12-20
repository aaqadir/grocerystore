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

    public GroceryItem addGroceryItem(GroceryItem groceryItem) {
        groceryItem.setPlaceOrder(groceryItem.getRequiredCount() > groceryItem.getAvailableCount());
        groceryItem.setOrderQuantity(Math.max(groceryItem.getRequiredCount() - groceryItem.getAvailableCount(), 0));
        return adminRepository.save(groceryItem);
    }

    public GroceryItem updateExistingGroceryItem(GroceryItem groceryItem, Integer groceryItemId) {
        GroceryItem existingGroceryItem = adminRepository.findById(groceryItemId).get();
        existingGroceryItem.setId(groceryItemId);
        existingGroceryItem.setName(groceryItem.getName());
        existingGroceryItem.setPrice(groceryItem.getPrice());
//        existingGroceryItem.setPackagingDate(groceryItem.getPackagingDate());
//        existingGroceryItem.setExpiryDate(groceryItem.getExpiryDate());
        //GroceryItem newGroceryItemUsingID = new GroceryItem(groceryItemId, groceryItem.getName(), groceryItem.getPrice(),
                //groceryItem.getPackagingDate(),groceryItem.getExpiryDate());
        return adminRepository.save(existingGroceryItem);
    }

    public void deleteGroceryItemById(Integer groceryItemId) {
        adminRepository.deleteById(groceryItemId);
        System.out.println("deleted Grocery Item By Id");
    }
}
