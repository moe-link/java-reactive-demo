package com.doporro.core.eneity.postgre;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Accessors(chain = true)
@NoArgsConstructor
public class User implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private Long id;
    private String nickname;
    private String username;
    private String password;
    private Integer telephone;
    private LocalDateTime createTime;
    private LocalDateTime UpdateTime;

}
