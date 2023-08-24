package com.doporro.base.service.impl;

import com.doporro.base.repository.postgres.UserActionRepository;
import com.doporro.base.service.intf.IUserActionService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserActionServiceImpl implements IUserActionService {

    @NonNull
    private UserActionRepository userActionRepository;
}
