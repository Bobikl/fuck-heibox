package cn.fly.verify.common.exception;

import cn.fly.verify.as;
import com.igexin.sdk.PushConsts;
import l5.a;

/* JADX INFO: loaded from: classes6.dex */
public enum VerifyErr {
    C_UNSUPPORTED_OPERATOR(6119000, "Unsupported operator"),
    C_PHONE_INVALID(6119001, "Invalid phone"),
    C_NO_SIM(6119002, "No sim"),
    C_LACK_OF_PERMISSIONS(6119003, "Lack of necessary permissions"),
    C_CELLULAR_DISABLED(6119004, "Cellular disabled"),
    C_PRIVACY_NOT_ACCEPTED_ERROR(6119005, "privacy Not accepted error"),
    C_MISSING_REQUIRED_PARAMS(6119095, "Missing required parameters"),
    C_ILLEGAL_PARAMS(6119096, "Illegal parameters"),
    C_RESPONSE_DATA_ABNORMAL(6119097, "Response data from server abnormal"),
    C_NETWORK_ERROR(6119098, "Network error"),
    C_UNKNOWN_ERROR(6119099, "Unknown error"),
    C_Init_Server_Error(6119101, "初始化失败"),
    C_Init_No_Net(6119102, "未开启任何网络"),
    C_INIT_UNEXPECTED_ERROR(6119105, "Init unexpected error"),
    C_NOUI_SWITCH_OFF(6119107, "No UI Switch off"),
    C_Init_APPKEY_NULL(6119106, "AppKey为空"),
    C_APPID_NULL(6119108, "AppId or Secret is null"),
    C_SWITCH_CELL_FAILURE(6119109, "switch cell failure"),
    C_PREVERIFY_CATCH(6119123, "preVerify unknown exception"),
    C_PREVERIFY_TIMEOUT(6119125, "preverify timeout"),
    C_ONE_KEY_OBTAIN_CM_OPERATOR_ACCESS_CODE_ERR(6119127, "Obtain access code from cm operator error"),
    C_ONE_KEY_OBTAIN_CU_OPERATOR_ACCESS_CODE_ERR(6119128, "Obtain access code from cu operator error"),
    C_ONE_KEY_OBTAIN_CT_OPERATOR_ACCESS_CODE_ERR(6119129, "Obtain access code from ct operator error"),
    C_ONE_KEY_OBTAIN_XW_OPERATOR_ACCESS_CODE_ERR(6119130, "Obtain access code from xw operator error"),
    C_UNPREVERIFY(6119164, "Please do preVerify first"),
    C_VERIFY_CATCH(6119165, "verify unkonwn exception"),
    C_ONE_KEY_OBTAIN_XW_OPERATOR_ACCESS_TOKEN_ERR(6119166, "Obtain access token from xw operator error"),
    C_ONE_KEY_OBTAIN_CM_OPERATOR_ACCESS_TOKEN_ERR(6119167, "Obtain access token from cm operator error"),
    C_ONE_KEY_OBTAIN_CU_OPERATOR_ACCESS_TOKEN_ERR(6119168, "Obtain access token from cu operator error"),
    C_ONE_KEY_OBTAIN_CT_OPERATOR_ACCESS_TOKEN_ERR(6119169, "Obtain access token from ct operator error"),
    C_CONFIG_ERROR(6119170, "No operator configuration"),
    C_DECODE_ERROR(6119171, "Decode configuration error"),
    C_ONE_KEY_OBTAIN_OPERATOR_CONFIG_ERR(6119401, "Obtain operator config error"),
    C_ONE_KEY_LOGIN_ERR(6119402, "login error"),
    C_ONE_KEY_OBTAIN_SERVER_TOKEN_ERR(6119405, "Obtain server token error"),
    INNER_NO_INIT_NO_RETRY(91700, "no init no retry"),
    INNER_NO_INIT_RETRY(91701, "no init retry"),
    INNER_UNKNOWN_OPERATOR(90000, "unknown operator"),
    INNER_NO_OPERATOR_CONFIG(PushConsts.MIN_FEEDBACK_ACTION, "no operator config"),
    INNER_UNKNOWN_OPERATOR_TRIED(90002, "unknown operator tried"),
    INNER_TIMEOUT_ERR(91200, a.f130839h0),
    INNER_NO_CELL_ERR(91201, "no cell"),
    INNER_NO_CELL_WIFI_ERR(91202, "no cell wifi"),
    INNER_NO_CELL_WIFI_UNKNOWN_ERR(91203, "no cell wifi unknown"),
    INNER_NO_SWITCH_PERMISSION_ERR(91204, "no switch permission"),
    INNER_SWITCH_EXCEPTION_ERR(91205, "switch exception"),
    INNER_OTHER_EXCEPTION_ERR(91206, "other exception"),
    INNER_TOKEN_NULL_ERR(91207, "token null");

    private int code;
    private String message;

    VerifyErr(int i10, String str) {
        this.code = i10;
        this.message = as.a(i10, str);
    }

    public static VerifyErr valueOf(int i10) {
        if (i10 == 6119405) {
            return C_ONE_KEY_OBTAIN_SERVER_TOKEN_ERR;
        }
        switch (i10) {
            case 6119000:
                return C_UNSUPPORTED_OPERATOR;
            case 6119001:
                return C_PHONE_INVALID;
            case 6119002:
                return C_NO_SIM;
            case 6119003:
                return C_LACK_OF_PERMISSIONS;
            case 6119004:
                return C_CELLULAR_DISABLED;
            default:
                switch (i10) {
                    case 6119095:
                        return C_MISSING_REQUIRED_PARAMS;
                    case 6119096:
                        return C_ILLEGAL_PARAMS;
                    case 6119097:
                        return C_RESPONSE_DATA_ABNORMAL;
                    case 6119098:
                        return C_NETWORK_ERROR;
                    case 6119099:
                        return C_UNKNOWN_ERROR;
                    default:
                        switch (i10) {
                            case 6119401:
                                return C_ONE_KEY_OBTAIN_OPERATOR_CONFIG_ERR;
                            case 6119402:
                                return C_ONE_KEY_LOGIN_ERR;
                            default:
                                return null;
                        }
                }
        }
    }

    public int getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }
}
