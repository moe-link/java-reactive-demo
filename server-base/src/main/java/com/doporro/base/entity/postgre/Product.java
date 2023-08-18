package com.doporro.base.entity.postgre;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Accessors(chain = true)
@NoArgsConstructor
@Table(name = "tb_product")
public class Product {

    @Id
    private Long id;
    private String description;

}
