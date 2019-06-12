package com.briup.apps.briupej.utils;

public class MessageUtil {
    /**
     * 返回失败消息，一般用于增删改操作的结果返回
     */
    public static Message error(String msg) {
        Message message = new Message();
        message.setStatus(500);
        message.setMessage(msg);
        message.setTimestamp(System.currentTimeMillis());
        return message;
    }

    /**
     * 返回成功消息，一般用于增删改操作的结果返回
     */
    public static Message success(String msg) {
        Message message = new Message();
        message.setStatus(200);
        message.setMessage(msg);
        message.setTimestamp(System.currentTimeMillis());
        return message;
    }

    /**
     * 返回成功的消息，一般用于查询操作的结果返回
     */
    public static Message success(String msg, Object data) {
        Message message = new Message();
        message.setStatus(200);
        message.setMessage(msg);
        message.setData(data);
        message.setTimestamp(System.currentTimeMillis());
        return message;
    }

}
