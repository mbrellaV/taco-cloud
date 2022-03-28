package com.mbrella.tacocloud.repositories;

import com.mbrella.tacocloud.Ingredient;
import org.springframework.data.repository.CrudRepository;

public interface IngredientRepository
        extends CrudRepository<Ingredient, String> {
}