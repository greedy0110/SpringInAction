package com.gmail.greedy0110.study.tacos.data;

import com.gmail.greedy0110.study.tacos.Ingredient;

public interface IngredientRepository {
    Iterable<Ingredient> findAll();
    Ingredient findById(String id);
    Ingredient save(Ingredient ingredient);
}
