package com.itheima.exception;

/**
 * @author Mendy
 * @create 2023-06-30 11:51
 */
public class SystemException extends RuntimeException {

    private Integer code;


    public SystemException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public SystemException(Integer code, String message, Throwable cause) {
        super(message, cause);
        this.code = code;
    }


    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
