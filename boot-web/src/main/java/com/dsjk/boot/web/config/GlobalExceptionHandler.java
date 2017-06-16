package com.dsjk.boot.web.config;

import com.dsjk.boot.common.base.Result;
import com.dsjk.boot.common.base.ResultCode;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author fengcheng
 * @version 2017/4/7
 */
@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(RuntimeException.class)
    @ResponseBody
    public Result exceptionHandler() {
        return Result.of(ResultCode.EXCEPTION);
    }
}
