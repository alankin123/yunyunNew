package com.alankin.ucenter.rpc.api;

import com.alankin.common.base.BaseServiceMock;
import com.alankin.ucenter.dao.mapper.UserLoginLogMapper;
import com.alankin.ucenter.dao.model.UserLoginLog;
import com.alankin.ucenter.dao.model.UserLoginLogExample;

/**
* 降级实现UserLoginLogService接口
* Created by alankin on 2018/12/7.
*/
public class UserLoginLogServiceMock extends BaseServiceMock<UserLoginLogMapper, UserLoginLog, UserLoginLogExample> implements UserLoginLogService {

}
