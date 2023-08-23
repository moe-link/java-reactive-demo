package com.doporro.base.repository.postgres;

import com.doporro.base.entity.postgre.UserInfo;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserInfoRepository extends R2dbcRepository<UserInfo, Long> {
}
