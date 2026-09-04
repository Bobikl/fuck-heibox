package com.alipay.deviceid.module.rpc.json;

/* JADX INFO: loaded from: classes6.dex */
public class JSONException extends Exception {
    private Throwable cause;

    public JSONException(String str) {
        super(str);
    }

    public JSONException(Throwable th2) {
        super(th2.getMessage());
        this.cause = th2;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }
}
