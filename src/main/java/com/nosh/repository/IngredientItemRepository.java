package com.nosh.repository;

import com.nosh.model.IngredientsItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredientItemRepository extends JpaRepository<IngredientsItem,Long> {
}
