package com.gmail.greedy0110.study.tacos.web;

import com.gmail.greedy0110.study.tacos.Ingredient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Controller
@RequestMapping("/design")
public class DesignTacoController {

    @GetMapping
    //WHAT: Model 이 뭐야?
    public String showDesignForm(Model model) {
        List<Ingredient> ingredients = Arrays.asList(
                new Ingredient("FLTO", "Flour Torilla1", Ingredient.Type.WRAP),
                new Ingredient("FLTO", "Flour Torilla2", Ingredient.Type.WRAP),
                new Ingredient("FLTO", "Flour Torilla3", Ingredient.Type.WRAP),
                new Ingredient("FLTO", "Flour Torilla4", Ingredient.Type.VEGGIES),
                new Ingredient("FLTO", "Flour Torilla5", Ingredient.Type.PROTEIN)
        );

        Ingredient.Type[] types = Ingredient.Type.values();
        for (Ingredient.Type type : types) {
            //WHAT: 인자로 받은 Model 에 어트리뷰트로 추가?
            model.addAttribute(
                    type.toString().toLowerCase(),
                    ingredients.stream()
                            .filter(x -> x.getType().equals(type))
                            .collect(Collectors.toList())
            );
        }

        return "design";
    }
}
