package com.briup.apps.briupej.config;

import com.briup.apps.briupej.utils.Message;
import com.briup.apps.briupej.utils.MessageUtil;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 全局异常拦截器，捕获所有异常并按照 Message 指定的消息格式进行返回
 *
 * @author codingfanlt
 * @date 2019/6/13 9:53
 */
@RestControllerAdvice
public class GlobalExceptionHandler {
    /**
     * 捕获 Controller 中抛出的指定类型的异常
     *
     * @param exception
     * @param <E>
     * @return
     */
    @ExceptionHandler(value = Exception.class)
    public <E> Message handler(Exception exception) {
        exception.printStackTrace();
        return MessageUtil.error(exception.getMessage());
    }
}
