package com.itheima.controller;

/**
 * @author Mendy
 * @create 2023-06-29 19:40
 */
public class Result {
    private Object data;
    private Integer code;
    private String msg;


    public Result() {
    }


    public Result(Integer code, Object data) {
        this.data = data;
        this.code = code;
    }


    public Result(Object data, Integer code, String msg) {
        this.data = data;
        this.code = code;
        this.msg = msg;
    }





    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }



}
