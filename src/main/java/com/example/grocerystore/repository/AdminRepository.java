package com.example.grocerystore.repository;

import com.example.grocerystore.entity.GroceryItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<GroceryItem, String> {
}
