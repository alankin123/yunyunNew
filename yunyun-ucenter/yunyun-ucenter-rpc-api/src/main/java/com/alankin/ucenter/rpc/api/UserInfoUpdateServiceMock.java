package com.alankin.ucenter.rpc.api;

import com.alankin.common.base.BaseServiceMock;
import com.alankin.ucenter.dao.mapper.UserInfoUpdateMapper;
import com.alankin.ucenter.dao.model.UserInfoUpdate;
import com.alankin.ucenter.dao.model.UserInfoUpdateExample;

/**
* 降级实现UserInfoUpdateService接口
* Created by alankin on 2018/12/7.
*/
public class UserInfoUpdateServiceMock extends BaseServiceMock<UserInfoUpdateMapper, UserInfoUpdate, UserInfoUpdateExample> implements UserInfoUpdateService {

}
