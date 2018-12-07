package com.alankin.ucenter.rpc.api;

import com.alankin.common.base.BaseServiceMock;
import com.alankin.ucenter.dao.mapper.UserBaseMapper;
import com.alankin.ucenter.dao.model.UserBase;
import com.alankin.ucenter.dao.model.UserBaseExample;

/**
* 降级实现UserBaseService接口
* Created by alankin on 2018/12/7.
*/
public class UserBaseServiceMock extends BaseServiceMock<UserBaseMapper, UserBase, UserBaseExample> implements UserBaseService {

}
