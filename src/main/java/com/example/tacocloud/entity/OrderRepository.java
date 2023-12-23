package com.example.tacocloud.entity;

import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository <Ingredient, String> {
    TacoOrder save(TacoOrder order);
}
