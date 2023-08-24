package com.doporro.base.convert;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
@SuppressWarnings(value = "unused")
public interface ProductInfoConvert {

    ProductInfoConvert INSTANCE = Mappers.getMapper(ProductInfoConvert.class);

}
