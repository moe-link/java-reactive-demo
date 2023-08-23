package com.doporro.base.entity.postgre;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;

@Table(value = "user_action")
public class UserAction {

    @Id
    private Long id;
    private Long userId;
    private String userName;
    private LocalDateTime createTime;

}
