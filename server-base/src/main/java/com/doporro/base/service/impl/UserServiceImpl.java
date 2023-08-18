package com.doporro.base.service.impl;

import com.doporro.base.repository.postgre.UserRepository;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@SuppressWarnings("unused")
public class UserServiceImpl {

    @NonNull
    private UserRepository userRepository;

}
