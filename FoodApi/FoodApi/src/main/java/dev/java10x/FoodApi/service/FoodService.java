package dev.java10x.FoodApi.service;

import java.util.List;

import org.springframework.stereotype.Service;
import dev.java10x.FoodApi.model.Food;
import dev.java10x.FoodApi.repository.FoodRepository;

@Service
public class FoodService {

    private final FoodRepository foodRepository;

    public FoodService(FoodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }

    // Listar
    public List<Food> getAll() {
        return foodRepository.findAll();
    }

    // Criar
    public Food save(Food food) {
        return foodRepository.save(food);
    }

    // Deletar
    public void delete(Long id) {
        foodRepository.deleteById(id);
    }
}