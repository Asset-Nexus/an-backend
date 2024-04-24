package org.assetnexus.common;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;

/**
 * <p>Title: Result</p>
 * <p>Description: used for returning this type of object to client in ajax request circumstance</p>
 *
 * @author xp630
 * @date 2022年4月19日
 */
public class Result<T> implements Serializable {

    private static final long serialVersionUID = 3779231221394313342L;

    private int code;

    private String msg;

    private T data;

    public Result() {
    }

    public Result(String msg, T data) {
        this.msg = msg;
        this.data = data;
    }

    public Result(int code, String msg, T data) {
        this(msg, data);
        this.code = code;
    }

    public Result(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public static <T> Result<T> newSystemError() {
        return new Result<>(ClientConstant.CODE_SYSTEM_ERROR, ClientConstant.MSG_SYSTEM_ERROR);
    }

    public static <T> Result<T> newSuccess() {
        return new Result<T>(ClientConstant.CODE_SUCCESS, ClientConstant.MSG_SUCCESS);
    }

    public static <T> Result<T> newSuccess(T data) {
        return new Result<T>(ClientConstant.CODE_SUCCESS, ClientConstant.MSG_SUCCESS, data);
    }

    public static <T> Result<T> newSuccess(String msg, T data) {
        return new Result<T>(ClientConstant.CODE_SUCCESS, msg, data);
    }

    public static <T> Result<T> newSuccessTips(String msg) {
        return new Result<T>(ClientConstant.CODE_SUCCESS, msg);
    }

    public static <T> Result<T> newSuccess(T data,String msg) {
        return new Result<T>(ClientConstant.CODE_SUCCESS, msg,data);
    }

    public static <T> Result<T> newValidateFail(String msg) {
        return new Result<T>(ClientConstant.CODE_PARAM_VALIDATE_FAIL, msg);
    }

    public static <T> Result<T> newFail(String msg) {
        return new Result<T>(ClientConstant.CODE_SYSTEM_ERROR, msg);
    }

    @JsonIgnore
    public boolean isSucess() {
        return ClientConstant.CODE_SUCCESS == this.getCode();
    }

}
