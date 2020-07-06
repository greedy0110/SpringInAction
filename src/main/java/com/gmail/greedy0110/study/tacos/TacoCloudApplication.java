package com.gmail.greedy0110.study.tacos;

import com.gmail.greedy0110.study.tacos.data.IngredientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import static com.gmail.greedy0110.study.tacos.Ingredient.*;

//WHAT: 스프링 부트 애플리케이션 임을 나타냄
// - @SpringBootConfiguration: 구성 클래스로 지정
// - @EnableAutoConfiguration: 자동 - 구성을 활성화, 빈들을 자동으로 구성하도록 부트에 알림
// - @ComponentScan: 컴포넌트 검색을 활성화한다. 컴포넌트를 찾아서 애플리케이션 컨텍스트에 컴포넌트로 등록한다.
@SpringBootApplication
public class TacoCloudApplication {

	public static void main(String[] args) {
		SpringApplication.run(TacoCloudApplication.class, args);
	}

	@Bean
	public CommandLineRunner dataLoader(IngredientRepository repository) {
		return args -> {
			repository.save(new Ingredient("FLTO", "Flour Tortilla", Type.WRAP));
			repository.save(new Ingredient("COTO", "Corn Tortilla", Type.WRAP));
			repository.save(new Ingredient("GRBF", "Ground Beef", Type.PROTEIN));
			repository.save(new Ingredient("CARN", "Carnitas", Type.PROTEIN));
			repository.save(new Ingredient("TMTO", "Diced Tomatoes", Type.VEGGIES));
			repository.save(new Ingredient("LETC", "Lettuce", Type.VEGGIES));
			repository.save(new Ingredient("CHED", "Cheddar", Type.CHEESE));
			repository.save(new Ingredient("JACK", "Monterrey Jack", Type.CHEESE));
			repository.save(new Ingredient("SLSA", "Salsa", Type.SAUCE));
			repository.save(new Ingredient("SRCR", "Sour Cream", Type.SAUCE));
		};
	}
}
