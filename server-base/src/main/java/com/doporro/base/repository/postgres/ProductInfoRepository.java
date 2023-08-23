package com.doporro.base.repository.postgres;

import com.doporro.base.entity.postgre.ProductInfo;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductInfoRepository extends R2dbcRepository<ProductInfo, Long> {
}
