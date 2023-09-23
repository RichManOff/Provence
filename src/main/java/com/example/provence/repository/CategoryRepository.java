package com.example.provence.repository;

import com.example.provence.model.Category;
import com.example.provence.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository  extends JpaRepository<Category, Long> {
    List<Category> findByNameContainingIgnoreCase(String name);
    Category findCategoryByNameContainingIgnoreCase(String name);

}
