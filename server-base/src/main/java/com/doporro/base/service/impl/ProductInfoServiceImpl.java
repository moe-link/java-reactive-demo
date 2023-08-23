package com.doporro.base.service.impl;

import com.doporro.base.repository.postgres.ProductInfoRepository;
import com.doporro.base.service.intf.IProductInfoService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@SuppressWarnings(value = "unused")
public class ProductInfoServiceImpl implements IProductInfoService {

    @NonNull
    private ProductInfoRepository productInfoRepository;

}
