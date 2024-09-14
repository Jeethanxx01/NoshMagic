package com.nosh.service;

import com.nosh.model.IngredientCategory;
import com.nosh.model.IngredientsItem;
import com.nosh.repository.IngredientCategoryRepository;
import com.nosh.repository.IngredientItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IngredientServiceImp implements IngredientsService{

    @Autowired
    private IngredientItemRepository ingredientItemRepository;

    @Autowired
    private IngredientCategoryRepository ingredientCategoryRepository ;

    @Override
    public IngredientCategory createIngredientCategory(String name, Long restaurantId) throws Exception {
        return null;
    }

    @Override
    public IngredientCategory findIngredientCategoryById(Long id) throws Exception {
        return null;
    }

    @Override
    public List<IngredientCategory> findIngredientCategoryByRestaurantId(Long id) throws Exception {
        return List.of();
    }

    @Override
    public IngredientsItem createIngredientItem(Long restaurantId, String ingredientName, Long categoryId) throws Exception {
        return null;
    }

    @Override
    public List<IngredientsItem> findRestaurantsIngredients(Long restaurantId) {
        return List.of();
    }

    @Override
    public IngredientsItem updateStock(Long id) throws Exception {
        return null;
    }
}
