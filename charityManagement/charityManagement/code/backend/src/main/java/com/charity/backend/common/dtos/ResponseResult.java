package com.charity.backend.common.dtos;

import java.io.Serializable;

public class ResponseResult<T> implements Serializable{
    private int status; // 状态码，例如：200成功，500服务器错误等
    private String message; // 返回的消息，例如："操作成功"，"操作失败"等
    private T data; // 返回的具体数据

    public ResponseResult() {
    }

    public ResponseResult(int status, String message) {
        this.status = status;
        this.message = message;
    }

    public ResponseResult(int status, String message, T data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    // 静态方法快速创建ResponseResult实例
    public static <T> ResponseResult<T> success(String message, T data) {
        return new ResponseResult<>(200, message, data);
    }

    public static <T> ResponseResult<T> success(T data) {
        return new ResponseResult<>(200, "操作成功", data);
    }

    public static <T> ResponseResult<T> error(int status, String message) {
        return new ResponseResult<>(status, message);
    }

    // Getter和Setter方法
    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}