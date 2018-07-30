package com.yueer.demo.dao;

import com.yueer.demo.model.SmUser;
import com.yueer.demo.model.SmUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SmUserMapper {
    long countByExample(SmUserExample example);

    int insert(SmUser record);

    int insertSelective(SmUser record);

    List<SmUser> selectByExample(SmUserExample example);

    int updateByExampleSelective(@Param("record") SmUser record, @Param("example") SmUserExample example);

    int updateByExample(@Param("record") SmUser record, @Param("example") SmUserExample example);
}