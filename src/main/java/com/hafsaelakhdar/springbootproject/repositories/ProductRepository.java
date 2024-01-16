package com.hafsaelakhdar.springbootproject.repositories;

import com.hafsaelakhdar.springbootproject.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
}
