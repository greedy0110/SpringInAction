package com.gmail.greedy0110.study.tacos.data;

import com.gmail.greedy0110.study.tacos.Order;

public interface OrderRepository {
    Order save(Order order);
}
