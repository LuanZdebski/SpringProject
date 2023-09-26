package com.many.WebService_Hibernate_SprintBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.many.WebService_Hibernate_SprintBoot.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
}
