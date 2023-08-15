package com.doporro.core.repository;

import com.doporro.core.eneity.mongo.Order;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
@SuppressWarnings("unused")
public interface OrderRepository extends ReactiveMongoRepository<Order, Long> {
}
