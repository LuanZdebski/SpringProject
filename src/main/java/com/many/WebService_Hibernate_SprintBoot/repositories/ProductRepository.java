package com.many.WebService_Hibernate_SprintBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.many.WebService_Hibernate_SprintBoot.entities.Category;
import com.many.WebService_Hibernate_SprintBoot.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
