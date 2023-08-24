package com.doporro.base.entity.postgre;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;

@Data
@Accessors(chain = true)
@NoArgsConstructor
@Table(value = "tb_user_action")
public class UserAction {

    @Id
    private Long id;
    private Long userId;
    private String userName;
    private LocalDateTime createTime;

}
