package com.itheima.controller;

import com.itheima.exception.BusinessException;
import com.itheima.exception.SystemException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author Mendy
 * @create 2023-06-30 11:16
 */

@RestControllerAdvice
public class ProjectExceptionAdvice {

    @ExceptionHandler(SystemException.class)
    public Result doSystemException(SystemException e){
        //record the log
        //Send a message to the Operations and Maintenance team
        //Send email to the developer, send e object to the developer
        return new Result(e.getCode(), null, e.getMessage());
    }



    @ExceptionHandler(BusinessException.class)
    public Result doBusinessException(BusinessException e){
        return new Result(e.getCode(), null, e.getMessage());
    }



    @ExceptionHandler(Exception.class)
    public Result doException(Exception e){

        //record the log
        //Send a message to the Operations and Maintenance team
        //Send email to the developer, send e object to the developer

        return new Result(Code.SYSTEM_UNKNOWN_ERR, null,"The system is busy, please try again later");
    }
}
