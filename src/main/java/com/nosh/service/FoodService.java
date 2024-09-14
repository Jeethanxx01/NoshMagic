package com.nosh.service;

import com.nosh.model.Category;
import com.nosh.model.Food;
import com.nosh.model.Restaurant;
import com.nosh.request.CreateFoodRequest;

import java.util.List;

public interface FoodService {

    public Food createFood(CreateFoodRequest req, Category category, Restaurant restaurant);

    void deleteFood(Long foodId)throws  Exception;

    public List<Food>getRestaurantsFood(Long restaurantId,
                                        boolean isVegitarian,
                                        boolean isNonveg,
                                        boolean isSeasonal,
                                        String foodCategory);

    public List<Food>searchFood(String keyword);
    public Food findFoodById(Long foodId)throws Exception;

    public  Food updateAvailabilityStatus(Long foodId)throws Exception;

}
