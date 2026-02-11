package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.OrderItem;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Spring Data MongoDB repository for the OrderItem entity.
 */
@Repository
public interface OrderItemRepository extends MongoRepository<OrderItem, String> {}
