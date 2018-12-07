package com.alankin.ucenter.rpc.api;

import com.alankin.common.base.BaseServiceMock;
import com.alankin.ucenter.dao.mapper.UserAuthMapper;
import com.alankin.ucenter.dao.model.UserAuth;
import com.alankin.ucenter.dao.model.UserAuthExample;

/**
* 降级实现UserAuthService接口
* Created by alankin on 2018/12/7.
*/
public class UserAuthServiceMock extends BaseServiceMock<UserAuthMapper, UserAuth, UserAuthExample> implements UserAuthService {

}
