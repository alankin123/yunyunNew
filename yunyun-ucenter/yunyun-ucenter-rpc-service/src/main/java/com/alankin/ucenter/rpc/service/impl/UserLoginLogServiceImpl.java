package com.alankin.ucenter.rpc.service.impl;

import com.alankin.common.annotation.BaseService;
import com.alankin.common.base.BaseServiceImpl;
import com.alankin.ucenter.dao.mapper.UserLoginLogMapper;
import com.alankin.ucenter.dao.model.UserLoginLog;
import com.alankin.ucenter.dao.model.UserLoginLogExample;
import com.alankin.ucenter.rpc.api.UserLoginLogService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* UserLoginLogService实现
* Created by alankin on 2018/12/7.
*/
@Service
@Transactional
@BaseService
public class UserLoginLogServiceImpl extends BaseServiceImpl<UserLoginLogMapper, UserLoginLog, UserLoginLogExample> implements UserLoginLogService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserLoginLogServiceImpl.class);

    @Autowired
    UserLoginLogMapper userLoginLogMapper;

}