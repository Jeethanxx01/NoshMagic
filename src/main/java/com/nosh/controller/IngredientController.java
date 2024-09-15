package com.nosh.controller;

import com.nosh.model.IngredientCategory;
import com.nosh.service.IngredientsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/admin/")
public class IngredientController {

    @Autowired
    private IngredientsService ingredientService;

    public ResponseEntity<IngredientCategory>createIngredientCategory()
}
