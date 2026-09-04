package com.alipay.deviceid.module.rpc.mrpc.core;

import com.meituan.robust.Constants;

/* JADX INFO: loaded from: classes6.dex */
public class RpcException extends RuntimeException {
    private static final long serialVersionUID = -2875437994101380406L;
    private int mCode;
    private String mMsg;
    private String mOperationType;

    public RpcException(Integer num, String str) {
        super(format(num, str));
        this.mCode = num.intValue();
        this.mMsg = str;
    }

    public RpcException(Integer num, String str, Throwable th2) {
        super(format(num, str), th2);
        this.mCode = num.intValue();
        this.mMsg = str;
    }

    public RpcException(Integer num, Throwable th2) {
        super(th2);
        this.mCode = num.intValue();
    }

    public RpcException(String str) {
        super(str);
        this.mCode = 0;
        this.mMsg = str;
    }

    protected static String format(Integer num, String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("RPCException: ");
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

    public String getOperationType() {
        return this.mOperationType;
    }

    public void setOperationType(String str) {
        this.mOperationType = str;
    }
}
