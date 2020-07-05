package com.gmail.greedy0110.study.tacos.web;

import com.gmail.greedy0110.study.tacos.Ingredient;
import com.gmail.greedy0110.study.tacos.Taco;
import com.gmail.greedy0110.study.tacos.data.IngredientRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static com.gmail.greedy0110.study.tacos.Ingredient.*;

@Slf4j
@Controller
@RequestMapping("/design")
public class DesignTacoController {

    private final IngredientRepository ingredientRepository;

    public DesignTacoController(IngredientRepository ingredientRepository) {
        this.ingredientRepository = ingredientRepository;
    }

    @GetMapping
    //WHAT: Model 이 뭐야?
    public String showDesignForm(Model model) {
        List<Ingredient> ingredients = new ArrayList<>();
        ingredientRepository.findAll().forEach(ingredients::add);

        Type[] types = Type.values();
        for (Type type : types) {
            //WHAT: 인자로 받은 Model 에 어트리뷰트로 추가?
            model.addAttribute(
                    type.toString().toLowerCase(),
                    ingredients.stream()
                            .filter(x -> x.getType().equals(type))
                            .collect(Collectors.toList())
            );
        }

        model.addAttribute("taco", new Taco());

        return "design";
    }

    @PostMapping
    public String processDesign(Taco design) {
        log.info("Processing design: " + design);

        return "redirect:/orders/current";
    }
}
