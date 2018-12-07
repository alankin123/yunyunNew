package com.alankin.ucenter.rpc.service.impl;

import com.alankin.common.annotation.BaseService;
import com.alankin.common.base.BaseServiceImpl;
import com.alankin.ucenter.dao.mapper.UserRegisterLogMapper;
import com.alankin.ucenter.dao.model.UserRegisterLog;
import com.alankin.ucenter.dao.model.UserRegisterLogExample;
import com.alankin.ucenter.rpc.api.UserRegisterLogService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* UserRegisterLogService实现
* Created by alankin on 2018/12/7.
*/
@Service
@Transactional
@BaseService
public class UserRegisterLogServiceImpl extends BaseServiceImpl<UserRegisterLogMapper, UserRegisterLog, UserRegisterLogExample> implements UserRegisterLogService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserRegisterLogServiceImpl.class);

    @Autowired
    UserRegisterLogMapper userRegisterLogMapper;

}