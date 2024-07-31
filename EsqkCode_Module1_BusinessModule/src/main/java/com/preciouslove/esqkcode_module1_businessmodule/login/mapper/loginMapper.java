package com.preciouslove.esqkcode_module1_businessmodule.login.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

/**
 * @PACKAGE_NAME com.preciouslove.yxpas.login.mapper
 * @Author yuanxin
 * @DATE 2024/4/18
 * @Description mybatis-plus接口
 */
@Mapper
public interface loginMapper {

    String getPassWord(Map<String, String> map);

}
