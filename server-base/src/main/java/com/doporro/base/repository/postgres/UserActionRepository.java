package com.doporro.base.repository.postgres;

import com.doporro.base.entity.postgre.UserAction;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;

@Repository
@SuppressWarnings(value = "unused")
public interface UserActionRepository extends R2dbcRepository<UserAction, Long> {
}
