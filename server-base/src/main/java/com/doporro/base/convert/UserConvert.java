package com.doporro.base.convert;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
@SuppressWarnings("unused")
public interface UserConvert {

    UserConvert INSTANCE = Mappers.getMapper(UserConvert.class);

}
