package com.pandie.springcloud.enity;

public enum RespCode {
    SUCCESS(0, "请求成功"),
    ERROT(-1000, "系统错误" +
            ""),
    WARN(-1, "网络异常，请稍后重试");
       private int code;
    private String msg;

    RespCode(int code, String msg) {
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }
    public String getMsg() {
        return msg;
    }
}
