package com.doporro.base.repository.mongo;

import com.doporro.base.entity.mongo.OrderInfo;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderInfoRepository extends ReactiveMongoRepository<OrderInfo, Long> {

}
