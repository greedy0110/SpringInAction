package com.gmail.greedy0110.study.tacos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//WHAT: 스프링 부트 애플리케이션 임을 나타냄
// - @SpringBootConfiguration: 구성 클래스로 지정
// - @EnableAutoConfiguration: 자동 - 구성을 활성화, 빈들을 자동으로 구성하도록 부트에 알림
// - @ComponentScan: 컴포넌트 검색을 활성화한다. 컴포넌트를 찾아서 애플리케이션 컨텍스트에 컴포넌트로 등록한다.
@SpringBootApplication
public class TacoCloudApplication {

	public static void main(String[] args) {
		SpringApplication.run(TacoCloudApplication.class, args);
	}

}
