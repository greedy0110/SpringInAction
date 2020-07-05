package com.gmail.greedy0110.study.tacos;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class Taco {
    private Long id;
    private Date createdAt;
    private String name;
    private List<String> ingredients;
}
