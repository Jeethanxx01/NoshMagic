package com.nosh.controller;

import com.nosh.model.Food;
import com.nosh.model.Restaurant;
import com.nosh.model.User;
import com.nosh.repository.UserService;
import com.nosh.request.CreateFoodRequest;
import com.nosh.response.MessageResponse;
import com.nosh.service.FoodService;
import com.nosh.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/admin/food")
public class AdminFoodController {

    @Autowired
    private FoodService foodService;

    @Autowired
    private UserService userService;

    @Autowired
    private RestaurantService restaurantService;


    @PostMapping
    public ResponseEntity<Food> createFood(@RequestBody CreateFoodRequest req,
                                           @RequestHeader("Authorization") String jwt) throws Exception{

        User user = userService.findUserByJwtToken(jwt);
        Restaurant restaurant=restaurantService.findRestaurantById(req.getRestaurantId());
        Food food=foodService.createFood(req,req.getCategory(),restaurant);
        return new ResponseEntity<>(food, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<MessageResponse> deleteFood(@PathVariable Long id,
                                           @RequestHeader("Authorization") String jwt) throws Exception{

        User user = userService.findUserByJwtToken(jwt);

        foodService.deleteFood(id);
        MessageResponse res=new MessageResponse();
        res.setMessage("food deleted");

        return new ResponseEntity<>(res,HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Food> updateAvailabilityStatus(@PathVariable Long id,
                                                      @RequestHeader("Authorization") String jwt) throws Exception{

        User user = userService.findUserByJwtToken(jwt);

        Food food =foodService.updateAvailabilityStatus(id);


        return new ResponseEntity<>(food,HttpStatus.OK);
    }


}
