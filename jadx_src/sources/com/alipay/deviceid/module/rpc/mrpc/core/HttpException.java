package com.alipay.deviceid.module.rpc.mrpc.core;

import com.meituan.robust.Constants;

/* JADX INFO: loaded from: classes6.dex */
public class HttpException extends Exception {
    public static final int NETWORK_AUTH_ERROR = 8;
    public static final int NETWORK_CONNECTION_EXCEPTION = 3;
    public static final int NETWORK_DNS_ERROR = 9;
    public static final int NETWORK_IO_EXCEPTION = 6;
    public static final int NETWORK_SCHEDULE_ERROR = 7;
    public static final int NETWORK_SERVER_EXCEPTION = 5;
    public static final int NETWORK_SOCKET_EXCEPTION = 4;
    public static final int NETWORK_SSL_EXCEPTION = 2;
    public static final int NETWORK_UNAVAILABLE = 1;
    public static final int NETWORK_UNKNOWN_ERROR = 0;
    private static final long serialVersionUID = -6320569206365033676L;
    private int mCode;
    private String mMsg;

    public HttpException(Integer num, String str) {
        super(format(num, str));
        this.mCode = num.intValue();
        this.mMsg = str;
    }

    public HttpException(String str) {
        super(str);
        this.mCode = 0;
        this.mMsg = str;
    }

    private static String format(Integer num, String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Http Transport error");
        if (num != null) {
            sb2.append(Constants.ARRAY_TYPE);
            sb2.append(num);
            sb2.append("]");
        }
        sb2.append(" : ");
        if (str != null) {
            sb2.append(str);
        }
        return sb2.toString();
    }

    public int getCode() {
        return this.mCode;
    }

    public String getMsg() {
        return this.mMsg;
    }
}
