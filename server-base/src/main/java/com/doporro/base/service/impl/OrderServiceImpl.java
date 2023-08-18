package com.doporro.base.service.impl;

import com.doporro.base.repository.mongo.OrderRepository;
import com.doporro.base.service.intf.IOrderService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@SuppressWarnings(value = "unused")
public class OrderServiceImpl implements IOrderService {

    @NonNull
    private OrderRepository orderRepository;

}
