package com.alipay.sdk.m.j;

/* JADX INFO: loaded from: classes6.dex */
public enum c {
    SUCCEEDED(9000, "处理成功"),
    FAILED(4000, "系统繁忙，请稍后再试"),
    CANCELED(6001, "用户取消"),
    NETWORK_ERROR(6002, "网络连接异常"),
    ACTIVITY_NOT_START_EXIT(6007, "支付未完成"),
    PARAMS_ERROR(4001, "参数错误"),
    DOUBLE_REQUEST(5000, "重复请求"),
    PAY_WAITTING(8000, "支付结果确认中");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f39499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f39500b;

    c(int i10, String str) {
        this.f39499a = i10;
        this.f39500b = str;
    }

    public static c b(int i10) {
        if (i10 == 4001) {
            return PARAMS_ERROR;
        }
        if (i10 == 5000) {
            return DOUBLE_REQUEST;
        }
        if (i10 == 8000) {
            return PAY_WAITTING;
        }
        if (i10 == 9000) {
            return SUCCEEDED;
        }
        if (i10 != 6001) {
            return i10 != 6002 ? FAILED : NETWORK_ERROR;
        }
        return CANCELED;
    }

    public String a() {
        return this.f39500b;
    }

    public void a(int i10) {
        this.f39499a = i10;
    }

    public void a(String str) {
        this.f39500b = str;
    }

    public int b() {
        return this.f39499a;
    }
}
