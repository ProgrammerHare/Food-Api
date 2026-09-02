package dev.java10x.FoodApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.java10x.FoodApi.model.Food;

public interface FoodRepository extends JpaRepository<Food, Long> {

}