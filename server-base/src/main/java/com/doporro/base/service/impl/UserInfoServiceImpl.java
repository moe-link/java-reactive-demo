package com.doporro.base.service.impl;

import com.doporro.base.repository.postgres.UserInfoRepository;
import com.doporro.base.service.intf.IUserInfoService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@SuppressWarnings("unused")
public class UserInfoServiceImpl implements IUserInfoService {

    @NonNull
    private UserInfoRepository userInfoRepository;

}
