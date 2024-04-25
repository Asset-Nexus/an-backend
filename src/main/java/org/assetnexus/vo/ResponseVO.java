package org.assetnexus.vo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.assetnexus.common.ClientConstant;

import java.io.Serializable;

/**
 * <p>Title: ResponseVO</p>
 * <p>Description: used for returning this type of object to client in ajax request circumstance</p>
 *
 * @author xp630
 * @date 2022年4月19日
 */
public class ResponseVO<T> implements Serializable {

    private static final long serialVersionUID = 3779231221394313342L;

    private int code;

    private String msg;

    private T data;

    public ResponseVO() {
    }

    public ResponseVO(String msg, T data) {
        this.msg = msg;
        this.data = data;
    }

    public ResponseVO(int code, String msg, T data) {
        this(msg, data);
        this.code = code;
    }

    public ResponseVO(int code, String msg) {
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

    public static <T> ResponseVO<T> newSystemError() {
        return new ResponseVO<>(ClientConstant.CODE_SYSTEM_ERROR, ClientConstant.MSG_SYSTEM_ERROR);
    }

    public static <T> ResponseVO<T> newSuccess() {
        return new ResponseVO<T>(ClientConstant.CODE_SUCCESS, ClientConstant.MSG_SUCCESS);
    }

    public static <T> ResponseVO<T> newSuccess(T data) {
        return new ResponseVO<T>(ClientConstant.CODE_SUCCESS, ClientConstant.MSG_SUCCESS, data);
    }

    public static <T> ResponseVO<T> newSuccess(String msg, T data) {
        return new ResponseVO<T>(ClientConstant.CODE_SUCCESS, msg, data);
    }

    public static <T> ResponseVO<T> newSuccessTips(String msg) {
        return new ResponseVO<T>(ClientConstant.CODE_SUCCESS, msg);
    }

    public static <T> ResponseVO<T> newSuccess(T data, String msg) {
        return new ResponseVO<T>(ClientConstant.CODE_SUCCESS, msg,data);
    }

    public static <T> ResponseVO<T> newValidateFail(String msg) {
        return new ResponseVO<T>(ClientConstant.CODE_PARAM_VALIDATE_FAIL, msg);
    }

    public static <T> ResponseVO<T> newFail(String msg) {
        return new ResponseVO<T>(ClientConstant.CODE_SYSTEM_ERROR, msg);
    }

    @JsonIgnore
    public boolean isSucess() {
        return ClientConstant.CODE_SUCCESS == this.getCode();
    }

}
