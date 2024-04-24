package org.assetnexus.common;

/**
* @Description: client特有常量类
* @Author: hf
* @Date:    2018/10/26 11:53
* @Version: 1.0
*/
public class ClientConstant {

    private ClientConstant(){
        throw new IllegalStateException("ClientConstant");
    }

    /** 编码 */
    public static final String CODE = "code";
    /** 提示信息 */
    public static final String MSG = "msg";
    /** 返回内容 */
    public static final String DATA = "data";
    /** 提示码-成功 */
    public static final int CODE_SUCCESS = 0;
    /** 提示码-错误、系统异常等 */
    public static final int CODE_SYSTEM_ERROR = -1;
    /** 提示码-访问限制，非法请求 */
    public static final int CODE_PERMISSION_DENIED = -100;
    /** 提示码-参数验证失败 */
    public static final int CODE_PARAM_VALIDATE_FAIL = -101;
    /** 提示码-设备尚未注册 */
    public static final int CODE_DEVICE_NOT_REGIST = -102;
    /** 提示码-token失效 */
    public static final int CODE_TOKEN_INVALID = -103;
    /** 提示码-sign签名验证失败 */
    public static final int CODE_SIGN_VALIDATE_FAIL = -104;
    /** 提示码-登录用户名和密码不匹配 */
    public static final int CODE_PWD_NOT_RIGHT = -105;
    /** 提示码-用户未注册 */
    public static final int CODE_USER_NOT_REGIST = -106;
    /** 提示码-用户被禁用 */
    public static final int CODE_USER_FROZEN = -107;
    /** 提示码-设备被禁用 */
    public static final int CODE_DEVICE_FROZEN = -108;
    /** 提示信息-成功 */
    public static final String MSG_SUCCESS = "操作成功";
    /** 提示信息-操作失败 */
    public static final String MSG_ERROR = "操作失败";
    /** 提示信息-访问受限*/
    public static final String MSG_PERMISSION_DENIED = "访问受限";
    /** 提示信息-错误、系统异常提示*/
    public static final String MSG_SYSTEM_ERROR = "错误，系统异常";
    /** 参数错误提示 */
    public static final String MSG_PARAM_ERROR ="参数错误";
    /** 请求头参数token */
    public static final String HEADER_TOKEN = "token";

    /** 提示码-访问限制，非法请求（管理后台未登录，返回json格式的状态码） */
    public static final int CODE_NOT_LOGIN = 402;

    /** 用户名 */
    public static final String MINI_USER_ID = "userId";
    /** 用户名 */
    public static final String MINI_COMPANY = "companyCode";
    /** 用户名 */
    public static final String MINI_OPEN_ID = "userName";

}
