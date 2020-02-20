package com.demo.community.exception;

public enum CustomizeErrorCode implements ICustomizeErrorCode {
    QUESTION_NOT_FOUND(2001, "你找的问题不存在，要不换个试试？"),
    TARGET_PARAM_NOT_FOUND(2002, "未选择问题或评论进行恢复"),
    NOT_LOGIN(2003, "当前操作需要登录，请登录后再试"),
    SYS_ERROR(2004, "服务异常，稍后再试"),
    TYPE_PARAM_WRONG(2005, "评论类型错误或不存在"),
    COMMENT_NOT_FOUND(2006, "回复的评论不存在，要不换个试试？"),
    CONTENT_IS_EMPTY(2007, "输入内容不能为空"),
    READ_NOTIFICATION_FAIL(2008, "不要读别人信息哦"),
    NOTIFICATION_NOT_FOUND(2009, "消息不见了");
    private String message;
    private Integer code;

    CustomizeErrorCode(Integer code, String message) {
        this.message = message;
        this.code = code;
    }


    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public Integer getCode() {
        return code;
    }
}
