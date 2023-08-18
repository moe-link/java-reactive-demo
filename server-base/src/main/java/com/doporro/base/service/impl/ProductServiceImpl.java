package com.doporro.base.service.impl;

import com.doporro.base.repository.postgre.ProductRepository;
import com.doporro.base.service.intf.IProductService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@SuppressWarnings(value = "unused")
public class ProductServiceImpl implements IProductService {

    @NonNull
    private ProductRepository productRepository;

}
