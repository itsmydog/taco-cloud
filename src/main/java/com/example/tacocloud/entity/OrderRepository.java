package com.example.tacocloud.entity;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrderRepository extends CrudRepository <Ingredient, String> {
    TacoOrder save(TacoOrder order);
}
