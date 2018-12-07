package com.alankin.ucenter.rpc.api;

import com.alankin.common.base.BaseServiceMock;
import com.alankin.ucenter.dao.mapper.UserRegisterLogMapper;
import com.alankin.ucenter.dao.model.UserRegisterLog;
import com.alankin.ucenter.dao.model.UserRegisterLogExample;

/**
* 降级实现UserRegisterLogService接口
* Created by alankin on 2018/12/7.
*/
public class UserRegisterLogServiceMock extends BaseServiceMock<UserRegisterLogMapper, UserRegisterLog, UserRegisterLogExample> implements UserRegisterLogService {

}
