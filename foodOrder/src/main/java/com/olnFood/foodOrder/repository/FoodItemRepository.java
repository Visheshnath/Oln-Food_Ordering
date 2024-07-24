package com.olnFood.foodOrder.repository;

import com.olnFood.foodOrder.model.FoodItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodItemRepository extends JpaRepository<FoodItem,Long> {

}
