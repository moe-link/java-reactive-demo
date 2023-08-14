package com.doporro.core.mapper;

import com.doporro.core.eneity.postgre.User;
import com.mybatisflex.core.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
@SuppressWarnings("unused")
public interface UserMapper extends BaseMapper<User> {
}
