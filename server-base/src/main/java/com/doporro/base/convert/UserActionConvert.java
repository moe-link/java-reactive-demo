package com.doporro.base.convert;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
@SuppressWarnings(value = "unused")
public class UserActionConvert {

    UserActionConvert INSTANCE  = Mappers.getMapper(UserActionConvert.class);

}
