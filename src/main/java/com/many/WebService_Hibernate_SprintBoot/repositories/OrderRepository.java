package com.many.WebService_Hibernate_SprintBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.many.WebService_Hibernate_SprintBoot.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
