package com.doporro.core.repository;

import com.doporro.core.eneity.postgre.Product;
import org.springframework.data.repository.reactive.ReactiveSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
@SuppressWarnings("unused")
public interface ProductRepository extends ReactiveSortingRepository<Product, Long> {
}
