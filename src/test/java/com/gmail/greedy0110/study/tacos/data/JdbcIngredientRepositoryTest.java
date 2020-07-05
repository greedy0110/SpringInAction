package com.gmail.greedy0110.study.tacos.data;

import com.gmail.greedy0110.study.tacos.Ingredient;
import com.google.common.collect.Lists;
import org.assertj.core.util.IterableUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;

import static com.gmail.greedy0110.study.tacos.Ingredient.*;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class JdbcIngredientRepositoryTest {

    @Autowired
    private JdbcIngredientRepository jdbcIngredientRepository;

    @Test
    public void findAllTest() {
        assertThat(jdbcIngredientRepository.findAll()).isNotEmpty();
    }

    @Test
    public void saveTest() {
        ArrayList<Ingredient> before = Lists.newArrayList(jdbcIngredientRepository.findAll());
        jdbcIngredientRepository.save(new Ingredient("123", "123", Type.CHEESE));
        ArrayList<Ingredient> after = Lists.newArrayList(jdbcIngredientRepository.findAll());

        assertThat(after.size() - before.size()).isOne();
    }
}