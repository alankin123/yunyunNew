package com.alankin.ucenter.dao.mapper;

import com.alankin.ucenter.dao.model.UserExtra;
import com.alankin.ucenter.dao.model.UserExtraExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserExtraMapper {
    long countByExample(UserExtraExample example);

    int deleteByExample(UserExtraExample example);

    int deleteByPrimaryKey(Long uid);

    int insert(UserExtra record);

    int insertSelective(UserExtra record);

    List<UserExtra> selectByExample(UserExtraExample example);

    UserExtra selectByPrimaryKey(Long uid);

    int updateByExampleSelective(@Param("record") UserExtra record, @Param("example") UserExtraExample example);

    int updateByExample(@Param("record") UserExtra record, @Param("example") UserExtraExample example);

    int updateByPrimaryKeySelective(UserExtra record);

    int updateByPrimaryKey(UserExtra record);
}