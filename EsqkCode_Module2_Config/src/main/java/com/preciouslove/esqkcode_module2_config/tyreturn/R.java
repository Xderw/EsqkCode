package com.preciouslove.esqkcode_module2_config.tyreturn;

import lombok.Data;

/**
 * @PACKAGE_NAME com.preciouslove.yxpas.commonUtil.tyreturn
 * @Author yuanxin
 * @DATE 2024/4/25
 * @Description 统一异常返回
 */
@Data
public class R<T> {

    private Integer code; //状态码

    private String msg; //提示信息

    private T data; //数据

    private long timestamp;//接口请求时间

    public R() {
        this.timestamp = System.currentTimeMillis();
    }

    public static <T> R<T> success(T data) {
        R<T> r = new R<>();
        r.setCode(ReturnCode.RC200.getCode());
        r.setMsg(ReturnCode.RC200.getMsg());
        r.setData(data);
        return r;
    }

    public static <T> R<T> error(int code, String msg) {
        R<T> r = new R<>();
        r.setCode(code);
        r.setMsg(msg);
        r.setData(null);
        return r;
    }

}
