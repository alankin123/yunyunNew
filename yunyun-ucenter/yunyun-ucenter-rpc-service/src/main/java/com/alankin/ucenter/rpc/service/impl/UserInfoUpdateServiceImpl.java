package com.alankin.ucenter.rpc.service.impl;

import com.alankin.common.annotation.BaseService;
import com.alankin.common.base.BaseServiceImpl;
import com.alankin.ucenter.dao.mapper.UserInfoUpdateMapper;
import com.alankin.ucenter.dao.model.UserInfoUpdate;
import com.alankin.ucenter.dao.model.UserInfoUpdateExample;
import com.alankin.ucenter.rpc.api.UserInfoUpdateService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* UserInfoUpdateService实现
* Created by alankin on 2018/12/7.
*/
@Service
@Transactional
@BaseService
public class UserInfoUpdateServiceImpl extends BaseServiceImpl<UserInfoUpdateMapper, UserInfoUpdate, UserInfoUpdateExample> implements UserInfoUpdateService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserInfoUpdateServiceImpl.class);

    @Autowired
    UserInfoUpdateMapper userInfoUpdateMapper;

}