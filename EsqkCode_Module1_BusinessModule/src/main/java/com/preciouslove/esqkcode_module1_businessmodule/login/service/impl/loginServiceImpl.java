package com.preciouslove.esqkcode_module1_businessmodule.login.service.impl;

import com.preciouslove.esqkcode_module1_businessmodule.login.mapper.loginMapper;
import com.preciouslove.esqkcode_module1_businessmodule.login.service.loginService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @PACKAGE_NAME com.preciouslove.yxpas.login.service.impl
 * @Author yuanxin
 * @DATE 2024/4/18
 * @Description 登录实现类
 */
@Service
public class loginServiceImpl implements loginService {

    @Resource
    private loginMapper loginDao;

    @Override
    public String getPassWord(Map<String, String> map) {
        return loginDao.getPassWord(map);
    }
}
