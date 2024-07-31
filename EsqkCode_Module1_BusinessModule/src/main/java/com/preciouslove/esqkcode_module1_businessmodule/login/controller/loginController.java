package com.preciouslove.esqkcode_module1_businessmodule.login.controller;

import com.preciouslove.esqkcode_module1_businessmodule.login.service.loginService;
import com.preciouslove.esqkcode_module2_config.tyreturn.R;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.Map;

/**
 * @PACKAGE_NAME com.preciouslove.yxpas.login.controller
 * @Author yuanxin
 * @DATE 2024/4/16
 * @Description 用户登录控制器
 */
@RestController
@RequestMapping("/loginController")
@Slf4j
public class loginController {

    @Resource
    private loginService service;

    @PostMapping("/login")
    public String login(@RequestParam Map<String, String> params) {

        String passWord = service.getPassWord(params);
        if (!passWord.equals(params.get("password"))) {
            return "登录失败";
        }
        return "登录成功";
    }

    @GetMapping("/loginGet")
    public String loginGet() {
        Map<String,String> map = new HashMap<>();
        map.put("username", "admin");
        map.put("password", "123321");
        String passWord = service.getPassWord(map);
        return "success";
    }

}
