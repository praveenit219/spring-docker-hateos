package com.pheonix.ordermanagement.repositories;

import org.springframework.stereotype.Repository;

import com.pheonix.ordermanagement.domains.Order;

@Repository
public class OrderRepository extends InMemoryRepository<Order> {

	protected void updateIfExists(Order original, Order updated) {
		original.setDescription(updated.getDescription());
		original.setCostInCents(updated.getCostInCents());
		original.setComplete(updated.isComplete());
	}

}
