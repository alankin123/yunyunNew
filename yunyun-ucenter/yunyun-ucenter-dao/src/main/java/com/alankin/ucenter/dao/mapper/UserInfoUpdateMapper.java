package com.alankin.ucenter.dao.mapper;

import com.alankin.ucenter.dao.model.UserInfoUpdate;
import com.alankin.ucenter.dao.model.UserInfoUpdateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserInfoUpdateMapper {
    long countByExample(UserInfoUpdateExample example);

    int deleteByExample(UserInfoUpdateExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserInfoUpdate record);

    int insertSelective(UserInfoUpdate record);

    List<UserInfoUpdate> selectByExample(UserInfoUpdateExample example);

    UserInfoUpdate selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UserInfoUpdate record, @Param("example") UserInfoUpdateExample example);

    int updateByExample(@Param("record") UserInfoUpdate record, @Param("example") UserInfoUpdateExample example);

    int updateByPrimaryKeySelective(UserInfoUpdate record);

    int updateByPrimaryKey(UserInfoUpdate record);
}