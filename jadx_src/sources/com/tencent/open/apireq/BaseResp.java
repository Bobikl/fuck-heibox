package com.tencent.open.apireq;

/* JADX INFO: compiled from: ProGuard */
/* JADX INFO: loaded from: classes4.dex */
public class BaseResp {
    public static final int CODE_ERROR_PARAMS = -2000;
    public static final int CODE_NOT_LOGIN = -2001;
    public static final int CODE_PERMISSION_NOT_GRANTED = -1003;
    public static final int CODE_QQ_LOW_VERSION = -1001;
    public static final int CODE_QQ_NOT_INSTALLED = -1000;
    public static final int CODE_SUCCESS = 0;
    public static final int CODE_UNSUPPORTED_BRANCH = -1002;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f101027a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f101028b = "";

    protected String a(int i10) {
        return "Api call failed.";
    }

    public int getCode() {
        return this.f101027a;
    }

    public String getErrorMsg() {
        return this.f101028b;
    }

    public boolean isSuccess() {
        return this.f101027a == 0;
    }

    public void setCode(int i10) {
        String strA;
        this.f101027a = i10;
        if (i10 == -2001) {
            strA = "Not login.";
        } else if (i10 == -2000) {
            strA = "The given params check failed.";
        } else if (i10 != 0) {
            switch (i10) {
                case -1002:
                    strA = "The QQ branch (e.g. TIM) is not supported";
                    break;
                case -1001:
                    strA = "QQ version is too low.";
                    break;
                case -1000:
                    strA = "QQ is not installed.";
                    break;
                default:
                    strA = a(i10);
                    break;
            }
        } else {
            strA = "";
        }
        setErrorMsg(strA);
    }

    public void setErrorMsg(String str) {
        this.f101028b = str;
    }

    public String toString() {
        return "BaseResp{mCode=" + this.f101027a + ", mErrorMsg='" + this.f101028b + "'}";
    }
}
