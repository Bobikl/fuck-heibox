package com.tencent.cos.xml.common;

import com.igexin.sdk.PushConsts;

/* JADX INFO: loaded from: classes4.dex */
public enum ClientErrorCode {
    UNKNOWN(-10000, "Unknown Error"),
    INVALID_ARGUMENT(10000, "InvalidArgument"),
    INVALID_CREDENTIALS(10001, "InvalidCredentials"),
    BAD_REQUEST(10002, "BadRequest"),
    SINK_SOURCE_NOT_FOUND(10003, "SinkSourceNotFound"),
    ETAG_NOT_FOUND(10004, "ETagNotFound"),
    INTERNAL_ERROR(20000, "InternalError"),
    SERVERERROR(PushConsts.SETTAG_ERROR_COUNT, "ServerError"),
    IO_ERROR(PushConsts.SETTAG_ERROR_FREQUENCY, "IOError"),
    POOR_NETWORK(20003, "NetworkError"),
    NETWORK_NOT_CONNECTED(20004, "NetworkNotConnected"),
    USER_CANCELLED(30000, "UserCancelled"),
    ALREADY_FINISHED(PushConsts.ALIAS_ERROR_FREQUENCY, "AlreadyFinished"),
    DUPLICATE_TASK(PushConsts.ALIAS_OPERATE_PARAM_ERROR, "DuplicateTask"),
    KMS_ERROR(40000, "KMSError");

    private int code;
    private String errorMsg;

    ClientErrorCode(int i10, String str) {
        this.code = i10;
        this.errorMsg = str;
    }

    public static ClientErrorCode to(int i10) {
        for (ClientErrorCode clientErrorCode : values()) {
            if (clientErrorCode.code == i10) {
                return clientErrorCode;
            }
        }
        throw new IllegalArgumentException("not error code defined");
    }

    public int getCode() {
        return this.code;
    }

    public String getErrorMsg() {
        return this.errorMsg;
    }

    public void setErrorMsg(String str) {
        this.errorMsg = str;
    }
}
