package com.doporro.base.repository.mongo;

import com.doporro.base.eneity.mongo.Order;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
@SuppressWarnings("unused")
public interface OrderRepository extends ReactiveMongoRepository<Order, Long> {
}
