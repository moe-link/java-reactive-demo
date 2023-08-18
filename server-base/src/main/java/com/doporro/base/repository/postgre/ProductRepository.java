package com.doporro.base.repository.postgre;

import com.doporro.base.eneity.postgre.Product;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;

@Repository
@SuppressWarnings("unused")
public interface ProductRepository extends R2dbcRepository<Product, Long> {
}
