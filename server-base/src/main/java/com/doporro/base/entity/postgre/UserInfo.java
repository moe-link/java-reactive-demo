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
@Table(name = "tb_user")
public class UserInfo {

    @Id
    private Long id;
    private String nickname;
    private String username;
    private String password;
    private Integer telephone;
    private LocalDateTime createTime;
    private LocalDateTime UpdateTime;

}
