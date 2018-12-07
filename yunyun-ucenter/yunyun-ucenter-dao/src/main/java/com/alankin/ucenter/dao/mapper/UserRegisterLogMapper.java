package com.alankin.ucenter.dao.mapper;

import com.alankin.ucenter.dao.model.UserRegisterLog;
import com.alankin.ucenter.dao.model.UserRegisterLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserRegisterLogMapper {
    long countByExample(UserRegisterLogExample example);

    int deleteByExample(UserRegisterLogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserRegisterLog record);

    int insertSelective(UserRegisterLog record);

    List<UserRegisterLog> selectByExample(UserRegisterLogExample example);

    UserRegisterLog selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UserRegisterLog record, @Param("example") UserRegisterLogExample example);

    int updateByExample(@Param("record") UserRegisterLog record, @Param("example") UserRegisterLogExample example);

    int updateByPrimaryKeySelective(UserRegisterLog record);

    int updateByPrimaryKey(UserRegisterLog record);
}