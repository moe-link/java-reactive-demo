package com.doporro.base.service.impl;

import com.doporro.base.repository.mongo.OrderInfoRepository;
import com.doporro.base.service.intf.IOrderInfoService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@SuppressWarnings(value = "unused")
public class OrderInfoServiceImpl implements IOrderInfoService {

    @NonNull
    private OrderInfoRepository orderInfoRepository;

}
