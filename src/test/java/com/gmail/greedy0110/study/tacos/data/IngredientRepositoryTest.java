package com.gmail.greedy0110.study.tacos.data;

import com.gmail.greedy0110.study.tacos.Ingredient;
import com.google.common.collect.Lists;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;

import static com.gmail.greedy0110.study.tacos.Ingredient.*;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class IngredientRepositoryTest {

    @Autowired
    private IngredientRepository ingredientRepository;

    @Test
    public void initTest() {
        ArrayList<Ingredient> initialIngredients = Lists.newArrayList(ingredientRepository.findAll());
        assertThat(initialIngredients.size()).isEqualTo(10);
    }

    @Test
    public void findAllTest() {
        assertThat(ingredientRepository.findAll()).isNotEmpty();
    }

    @Test
    public void saveTest() {
        ArrayList<Ingredient> before = Lists.newArrayList(ingredientRepository.findAll());
        ingredientRepository.save(new Ingredient("123", "123", Type.CHEESE));
        ArrayList<Ingredient> after = Lists.newArrayList(ingredientRepository.findAll());

        assertThat(after.size() - before.size()).isOne();
    }
}